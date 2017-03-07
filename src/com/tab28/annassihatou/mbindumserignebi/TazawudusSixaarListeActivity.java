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

public class TazawudusSixaarListeActivity extends Activity {

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
						.getResources().getString(R.string.tasih1)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih2)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih3)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih4)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih5)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih6)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih7)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih8)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih9)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih10)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih11)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih12)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih13)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih14)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih15)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih16)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih17)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih18)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih19)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih20)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih21)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih22)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih23)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih24)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih25)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih26)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih27)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih28)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.tasih29)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_mbindumsbi_tasih_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						TazawudusSixaarListeActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;
				switch (position) {
				case 1:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/1-AVANT-PROPOS.mp3";
					titre = getResources().getString(R.string.tasih1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 2:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/2-Preambule.mp3";
					titre = getResources().getString(R.string.tasih2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/1-LES-ACTES-TRADITIONNELS-DE-L-ABLUTION.mp3";
					titre = getResources().getString(R.string.tasih3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 4:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/3B-CHAPITRE-I-LA-PROFESSION-DE-FOI-MUSULMANE-Al-Iman.mp3";
					titre = getResources().getString(R.string.tasih4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/4-LES-ANGES.mp3";
					titre = getResources().getString(R.string.tasih5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/5-LES-LIVRES-CELESTES.mp3";
					titre = getResources().getString(R.string.tasih6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/6-LES-ENVOYES.mp3";
					titre = getResources().getString(R.string.tasih7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 8:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/7-LE-JOUR-ULTIME.mp3";
					titre = getResources().getString(R.string.tasih8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/8-LA-CROYANCE-AU-DECRET-DIVIN.mp3";
					titre = getResources().getString(R.string.tasih9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/9-CHAPITRE-II-LES-PRATIQUES-CULTUELLES-Islam.mp3";
					titre = getResources().getString(R.string.tasih10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/10-LA-MENTION-DU-NOM-DE-DIEU-Dhikr.mp3";
					titre = getResources().getString(R.string.tasih11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/11-LES-CINQ-PRIERES.mp3";
					titre = getResources().getString(R.string.tasih12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/12-%20LA-PURETE-LEGALE.mp3";
					titre = getResources().getString(R.string.tasih13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/13-EXHORTATION-QUI-AIDE-A-DISCERNER-LES-ACTES.mp3";
					titre = getResources().getString(R.string.tasih14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/14-LES-ACTES-OBLIGATOIRES-DE-LA-PRIERE.mp3";
					titre = getResources().getString(R.string.tasih15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/15-LES-ACTES-TRADITIONNELS-DE-LA-PRIERE.mp3";
					titre = getResources().getString(R.string.tasih16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/16-LES-ACTES-OBLIGATOIRES-DE-L-ABLUTION.mp3";
					titre = getResources().getString(R.string.tasih17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/18-LES-ACTES-OBLIGATOIRES-DE-LA-PURIFICATION-MAJEURE.mp3";
					titre = getResources().getString(R.string.tasih18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/19-LES-ACTES-TRADITIONNELS-DE-LA-PURIFICATION-MAJEUR.mp3";
					titre = getResources().getString(R.string.tasih19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/20-LES-ACTES-OBLIGATOIRES-DE-LA-LUSTRATION-PULVERALE.mp3";
					titre = getResources().getString(R.string.tasih20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/21-LES-ACTES-TRADITIONNELS-DE-LA-LUSTRATION-PULVERALE.mp3";
					titre = getResources().getString(R.string.tasih21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/22-LE-JEUNE.mp3";
					titre = getResources().getString(R.string.tasih22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/23-L-AUMONE-LEGALE.mp3";
					titre = getResources().getString(R.string.tasih23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/24-LE-PELERINAGE.mp3";
					titre = getResources().getString(R.string.tasih24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/25-LES-ACTES-TRADITIONNELS-DU-PELERINAGE.mp3";
					titre = getResources().getString(R.string.tasih25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/26-L-EPILOGUE.mp3";
					titre = getResources().getString(R.string.tasih26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/27-SUR-LES-MODALITES-DU-RAPPEL-DE-CE-QU-ON-A-MANQUE.mp3";
					titre = getResources().getString(R.string.tasih27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 28:
					url = "http://annassihatou.org/audios/tazawudus-sixaar/1-AVANT-PROPOS.mp3";
					titre = getResources().getString(R.string.tasih28);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 29:
					url = "http://annassihatou.org/audios/tazawudush-chubbaan/27-LES-HEURES-DE-PRIERE-ET-LE-RAPPEL-DES-PRIERES-MANQUEES.mp3";
					titre = getResources().getString(R.string.tasih29);
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
