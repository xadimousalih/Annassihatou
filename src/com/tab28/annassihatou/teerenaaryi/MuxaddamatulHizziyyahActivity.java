package com.tab28.annassihatou.teerenaaryi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.tab28.annassihatou.LecteurStreaming;
import com.tab28.annassihatou.R;
import com.tab28.annassihatou.Weather;
import com.tab28.annassihatou.WeatherAdapter;

public class MuxaddamatulHizziyyahActivity extends Activity {

	private ListView listView1;
	protected int key;
	String nafila = "";

	@SuppressLint("UseSparseArrays")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		/*
		 * if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) { View
		 * title = getWindow().findViewById(android.R.id.title); View titleBar =
		 * (View) title.getParent(); titleBar.setBackgroundColor(Color.BLACK);
		 * setTitleColor(Color.WHITE); TextView titre = (TextView) title;
		 * titre.setGravity(Gravity.CENTER); }
		 */
		Map<Integer, String> testMap = new HashMap<Integer, String>();
		testMap.put(1, "Oeuvre 1");
		testMap.put(20, "Oeuvre 2");
		testMap.put(30, "Oeuvre 3");
		testMap.put(40, "Oeuvre 4");
		for (Entry<Integer, String> entry : testMap.entrySet()) {
			if (entry.getValue().equals("c")) {
				System.out.println(entry.getKey());
			}
		}

		Weather weather_data[] = new Weather[] {
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy1)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy2)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy3)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy4)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy5)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy6)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy7)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy8)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy9)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy10)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy11)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy12)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy13)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy14)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy15)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy16)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy17)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy18)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy19)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy20)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy21)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy22)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy23)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy24)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy25)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy26)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy27)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_hizya_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						MuxaddamatulHizziyyahActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;

				switch (position) {
				case 1:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_1.mp3";
					titre = getResources().getString(R.string.haririy1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 2:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_2.mp3";
					titre = getResources().getString(R.string.haririy2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_3.mp3";
					titre = getResources().getString(R.string.haririy3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 4:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_4.mp3";
					titre = getResources().getString(R.string.haririy4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_5.mp3";
					titre = getResources().getString(R.string.haririy5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_6.mp3";
					titre = getResources().getString(R.string.haririy6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_7.mp3";
					titre = getResources().getString(R.string.haririy7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 8:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_8.mp3";
					titre = getResources().getString(R.string.haririy8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_9.mp3";
					titre = getResources().getString(R.string.haririy9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_10.mp3";
					titre = getResources().getString(R.string.haririy10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_11.mp3";
					titre = getResources().getString(R.string.haririy11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_12.mp3";
					titre = getResources().getString(R.string.haririy12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_13.mp3";
					titre = getResources().getString(R.string.haririy13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_14.mp3";
					titre = getResources().getString(R.string.haririy14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_15.mp3";
					titre = getResources().getString(R.string.haririy15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_16.mp3";
					titre = getResources().getString(R.string.haririy16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_17.mp3";
					titre = getResources().getString(R.string.haririy17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_18.mp3";
					titre = getResources().getString(R.string.haririy18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_19.mp3";
					titre = getResources().getString(R.string.haririy19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_20.mp3";
					titre = getResources().getString(R.string.haririy20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_21.mp3";
					titre = getResources().getString(R.string.haririy21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_22.mp3";
					titre = getResources().getString(R.string.haririy22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_23.mp3";
					titre = getResources().getString(R.string.haririy23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_24.mp3";
					titre = getResources().getString(R.string.haririy24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_25.mp3";
					titre = getResources().getString(R.string.haririy25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_26.mp3";
					titre = getResources().getString(R.string.haririy26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://annassihatou.org/audios/-savants_arabes-/Hizziyyah/Hizziyyah_27.mp3";
					titre = getResources().getString(R.string.haririy27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				default:
					break;
				}
			}
		});

	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
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
}
