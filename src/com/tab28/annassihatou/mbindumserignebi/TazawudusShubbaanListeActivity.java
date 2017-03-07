package com.tab28.annassihatou.mbindumserignebi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
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

public class TazawudusShubbaanListeActivity extends Activity {

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

				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub1)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub2)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub3)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub4)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub5)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub6)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub7)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub8)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub9)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub10)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub11)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub12)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub13)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub14)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub15)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub16)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub17)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub18)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub19)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub20)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub21)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub22)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub23)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub24)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub25)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub26)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub27)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub28)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub29)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub30)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub31)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub32)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub33)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub34)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub35)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub36)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub37)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub38)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasub39)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_mbindumsbi_tasub_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						TazawudusShubbaanListeActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;
				switch (position) {
				case 1:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/1-AVANT-PROPOS.mp3";
					titre = getResources().getString(R.string.tasub1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 2:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/2-PREAMBULE.mp3";
					titre = getResources().getString(R.string.tasub2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/3-SECTION-1-LES-PARTIES-DE-LA-RELIGION.mp3";
					titre = getResources().getString(R.string.tasub3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/4-PROFESSION-DE-FOI-EN-DIEU.mp3";
					titre = getResources().getString(R.string.tasub4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 4:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/5-LES-ANGES.mp3";
					titre = getResources().getString(R.string.tasub5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/6-LA-FOI-A-PROFESSER-A-L-ENDROIT-DES-LIVRES-REVELES.mp3";
					titre = getResources().getString(R.string.tasub6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/7-LA-FOI-LA-PROFESSER-LA-L-ENDROIT-DES-ENVOYES-PSE.mp3";
					titre = getResources().getString(R.string.tasub7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 8:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/8-LE-JOUR-ULTIME.mp3";
					titre = getResources().getString(R.string.tasub8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/9-CROYANCE-AU-DECRET-DIVIN.mp3";
					titre = getResources().getString(R.string.tasub9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/10-SECTION-2-LES-PARTIES-DE-LA-RELIGION-DE-CELUI-QUI-TRANSCENDE-TOUTE-CHOSE-OU-CHAPITRE-SUR-L-INTELLIGENCE-DE-LA-JURISPRUDENCE-QUI-PERMET-D-ETRE-SUR-SES-GARDES.mp3";
					titre = getResources().getString(R.string.tasub10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/11-LA-PURIFICATION.mp3";
					titre = getResources().getString(R.string.tasub11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/12-LES-CINQ-PRIERES.mp3";
					titre = getResources().getString(R.string.tasub12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/13-EXHORTATION-QUI-AIDE-A-DISCERNER-LES-ACTES-BLIGATOIRES.mp3";
					titre = getResources().getString(R.string.tasub13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/14-LES-ACTES-OBLIGATOIRES-DE-L-ABLUTION.mp3";
					titre = getResources().getString(R.string.tasub14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/15-LES-ACTES-TRADITIONNELS-DE-L-ABLUTION.mp3";
					titre = getResources().getString(R.string.tasub15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/16-LES-ACTES-OBLIGATOIRES-DE-LA-PURIFICATION-MAJEURE.mp3";
					titre = getResources().getString(R.string.tasub16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/17-LES-ACTES-TRADITIONNELS-DE-LA-PURIFICATION-MAJEURE.mp3";
					titre = getResources().getString(R.string.tasub17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/18-GLOSE-DE-CERTAINES-EXPRESSIONS.mp3";
					titre = getResources().getString(R.string.tasub18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/19-COMPLEMENT.mp3";
					titre = getResources().getString(R.string.tasub19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/20-LES-ACTES-OBLIGATOIRES-DE-LA-LUSTRATION-PULVERALE.mp3";
					titre = getResources().getString(R.string.tasub20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/20-LES-ACTES.mp3";
					titre = getResources().getString(R.string.tasub21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/22-LE-JEUNE.mp3";
					titre = getResources().getString(R.string.tasub22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/21-LES-ACTES-TRADITIONNELS-DE-LA-LUSTRATION-PULVERALE.mp3";
					titre = getResources().getString(R.string.tasub23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/22-LES-FACTEURS-D-ANNULATION-DE-L-ABLUTION.mp3";
					titre = getResources().getString(R.string.tasub24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/23-LES-CONDITIONS-NECESSAIRES-A-L-OFFICE-DE-LA-PRIERE-RITUELLE.mp3";
					titre = getResources().getString(R.string.tasub25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/24-L-APPEL-A-LA-PRIERE-ET-L-APPEL-RENOUVELE.mp3";
					titre = getResources().getString(R.string.tasub26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/25-LES-ACTES-OBLIGATOIRES-%20DE-LA-PRIERES.mp3";
					titre = getResources().getString(R.string.tasub27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 28:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/26-LES-ACTES-TRADITIONNELS-DE-LA-PRIERE.mp3";
					titre = getResources().getString(R.string.tasub28);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 29:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/27-LES-HEURES-DE-PRIERE-ET-LE-RAPPEL-DES-PRIERES-MANQUEES.mp3";
					titre = getResources().getString(R.string.tasub29);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 30:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/28-LES-PRIERES-SUREROGATOIRES.mp3";
					titre = getResources().getString(R.string.tasub30);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 31:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/29-LE-JEUNE.mp3";
					titre = getResources().getString(R.string.tasub31);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 32:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/30-L-AUMONE-LEGALE.mp3";
					titre = getResources().getString(R.string.tasub32);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 33:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/31-LE-PELERINAGE.mp3";
					titre = getResources().getString(R.string.tasub33);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 34:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/32-LES-ACTES-TRADITIONNELS.mp3";
					titre = getResources().getString(R.string.tasub34);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 35:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/33-EPILOGUE.mp3";
					titre = getResources().getString(R.string.tasub35);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 36:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/34-SECTION-3-LES-PARTIES-DE-LA-RELIGION-DE-CELUI-QUI-RESSUSCITE-OU-CHAPITRE-SUR-LE-SOUFISME-QUI-MENE-A-LA-CONNAISSANCE-GNOSTIQUE.mp3";
					titre = getResources().getString(R.string.tasub36);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 37:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/35-PREAMBULE.mp3";
					titre = getResources().getString(R.string.tasub37);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 38:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/37-LES-MEMBRES%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasub38);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 39:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/35-PREAMBULE%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasub39);
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
