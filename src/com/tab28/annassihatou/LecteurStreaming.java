package com.tab28.annassihatou;

import java.io.IOException;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class LecteurStreaming extends Activity {

	MediaPlayer mediaPlayer;
	String urlAudio = "#";
	String titreAudio = null;
	String stitre = null;
	ImageButton btStart = null;
	ImageButton btStop = null;
	ImageButton btPause = null;
	TextView texthaut = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		try {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.player);
			mediaPlayer = new MediaPlayer();
			Bundle extras = getIntent().getExtras();
			if (extras != null) {
				urlAudio = extras.getString("url");
				titreAudio = extras.getString("titre");
			}

			if (isOnline())
				new MyNewTask().execute(urlAudio);
			else {
				Toast.makeText(
						getApplicationContext(),
						getApplicationContext().getResources().getString(
								R.string.connect_no)
								+ " "
								+ getApplicationContext().getResources()
										.getString(R.string.no_connection),
						Toast.LENGTH_LONG).show();
				Intent i = new Intent(getApplicationContext(),
						HomeActivity.class);
				startActivity(i);
			}
		} catch (Exception ex) {
			final TextView texthaut = (TextView) findViewById(R.id.text);
			texthaut.setText(ex.getMessage());
		}
	}

	public boolean isOnline() {
		ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo netInfo = cm.getActiveNetworkInfo();
		if (netInfo != null && netInfo.isConnected()) {
			return true;
		}
		return false;
	}

	private class MyNewTask extends AsyncTask<String, Integer, String> {
		@Override
		protected void onPreExecute() {
			btStart = (ImageButton) findViewById(R.id.start);
			btStop = (ImageButton) findViewById(R.id.stop);
			btPause = (ImageButton) findViewById(R.id.pause);
			texthaut = (TextView) findViewById(R.id.text);
			stitre = titreAudio;
			texthaut.setText(stitre);
			mediaPlayer.start();
			dialog = new ProgressDialog(LecteurStreaming.this);
			dialog.setIndeterminate(true);
			dialog.setIndeterminateDrawable(getResources().getDrawable(
					R.anim.progress_dialog_anim));
			dialog.setCancelable(false);
			dialog.setMessage(getApplicationContext().getResources().getString(
					R.string.patient));
			dialog.show();

		}

		@Override
		protected String doInBackground(String... params) {
			try {
				mediaPlayer.setDataSource(urlAudio);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
			try {
				mediaPlayer.prepare();
				btStart.setOnClickListener(new Button.OnClickListener() {
					public void onClick(View v) {
						try {
							// calcul de la durer du morceau
							int iduration = mediaPlayer.getDuration();
							int minute = iduration / 60000;
							int intreste = iduration - minute * 60000;
							int iseconde = intreste / 1000;
							String sMetminutezero = "";
							String sMetminuteseconde = "";
							if (minute < 10)
								sMetminutezero = "0";
							if (iseconde < 10)
								sMetminuteseconde = "0";
							// j'affiche le titre suivi du temp de la chanson
							if (stitre == null) {
								stitre = stitre + " " + sMetminutezero + minute
										+ ":" + sMetminuteseconde + iseconde;
								texthaut.setText(stitre);
							}
							mediaPlayer.start();
						} catch (Exception e) {
							texthaut.setText("erreur " + e.getMessage());
						}

					}
				});

				btStop.setOnClickListener(new Button.OnClickListener() {
					public void onClick(View v) {
						try {
							mediaPlayer.stop();
							mediaPlayer.prepare();
						} catch (Exception e) {
							texthaut.setText("erreur " + e.getMessage());
						}

					}
				});

				btPause.setOnClickListener(new Button.OnClickListener() {
					public void onClick(View v) {
						try {
							mediaPlayer.pause();
						} catch (Exception e) {
							texthaut.setText("erreur " + e.getMessage());
						}

					}
				});

			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return "Réussi!";
		}

		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
			Log.i("result", "" + result);
			Toast.makeText(
					getApplicationContext(),
					getApplicationContext().getResources().getString(
							R.string.telechargement), Toast.LENGTH_LONG).show();
			if (result != null)
				dialog.dismiss();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 0, 0, R.string.app_about);
		menu.add(0, 1, 1, R.string.str_exit);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onOptionsItemSelected(item);

		switch (item.getItemId()) {
		case 0:
			openOptionsDialog();
			break;
		case 1:
			exitOptionsDialog();
			break;
		}
		return true;
	}

	private void exitOptionsDialog() {
		new AlertDialog.Builder(this)
				.setTitle(R.string.app_exit)
				.setMessage(R.string.app_exit_message)
				.setNegativeButton(R.string.str_no,
						new DialogInterface.OnClickListener() {
							public void onClick(
									DialogInterface dialoginterface, int i) {
							}
						})
				.setPositiveButton(R.string.str_ok,
						new DialogInterface.OnClickListener() {
							public void onClick(
									DialogInterface dialoginterface, int i) {
								finish();
							}
						}).show();
	}

	private void openOptionsDialog() {
		Toast.makeText(getApplicationContext(),
				"TAB28: Oeuvrer pour Cheikh Ahmadou Bamba KHADIMOU RASSOUL",
				Toast.LENGTH_LONG).show();
	}

	ProgressDialog dialog;
}