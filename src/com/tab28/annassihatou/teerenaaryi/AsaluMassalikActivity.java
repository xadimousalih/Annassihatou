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

public class AsaluMassalikActivity extends Activity {

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
						.getResources().getString(R.string.assalou1)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou2)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou3)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou4)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou5)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou6)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou7)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou8)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou9)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou10)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou11)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou12)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou13)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou14)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou15)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou16)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou17)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou18)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou19)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou20)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou21)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou22)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou23)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou24)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou25)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou26)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou27)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou28)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou29)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou30)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou31)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou32)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.assalou33)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_asalou_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						AsaluMassalikActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;

				switch (position) {
				case 1:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/01-Bismillahi.mp3";
					titre = getResources().getString(R.string.assalou1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 2:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/02-Babu_Oussouloudini.mp3";
					titre = getResources().getString(R.string.assalou2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/03-Akhsamil_miahi.mp3";
					titre = getResources().getString(R.string.assalou3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 4:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/04-Izalati_Nadiassaty.mp3";
					titre = getResources().getString(R.string.assalou4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/05-Tayamoumy.mp3";
					titre = getResources().getString(R.string.assalou5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/06-Charaitissalaty.mp3";
					titre = getResources().getString(R.string.assalou6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/07-Khadail_Fawaity.mp3";
					titre = getResources().getString(R.string.assalou7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 8:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/08-Salatil_Djamahaty.mp3";
					titre = getResources().getString(R.string.assalou8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/09-Khasry_Wal_diamhi.mp3";
					titre = getResources().getString(R.string.assalou9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/09-Zakatil_Machyaty.mp3";
					titre = getResources().getString(R.string.assalou10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/10-Ihtikaf.mp3";
					titre = getResources().getString(R.string.assalou11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/11-Babouzakaty_wassaidy.mp3";
					titre = getResources().getString(R.string.assalou12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/12-Babou_laymani_Wanouzoury.mp3";
					titre = getResources().getString(R.string.assalou13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/13-Nikahi_Wama_Yatahallaxou.mp3";
					titre = getResources().getString(R.string.assalou14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/14-Babu_khyari_Zawdiayni.mp3";
					titre = getResources().getString(R.string.assalou15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/15-Babul_Ilay.mp3";
					titre = getResources().getString(R.string.assalou16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/16-Mafkhoudy.mp3";
					titre = getResources().getString(R.string.assalou17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/17-Bayhi.mp3";
					titre = getResources().getString(R.string.assalou18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/18-Salamy.mp3";
					titre = getResources().getString(R.string.assalou19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/19-Hadjry.mp3";
					titre = getResources().getString(R.string.assalou20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/20-Khassabi.mp3";
					titre = getResources().getString(R.string.assalou21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/21-Babou_choufhaty.mp3";
					titre = getResources().getString(R.string.assalou22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/22-Loukhataty.mp3";
					titre = getResources().getString(R.string.assalou23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/23-Djinayaty.mp3";
					titre = getResources().getString(R.string.assalou24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/24-Chourbil_Khamry.mp3";
					titre = getResources().getString(R.string.assalou25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/25-Haddy.mp3";
					titre = getResources().getString(R.string.assalou26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/26-Djoumalin_Minal_Faraidy.mp3";
					titre = getResources().getString(R.string.assalou27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 28:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/27-Matnourrahbya.mp3";
					titre = getResources().getString(R.string.assalou28);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 29:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/28-Ashabiroubouhi.mp3";
					titre = getResources().getString(R.string.assalou29);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 30:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/29-Tahsiby.mp3";
					titre = getResources().getString(R.string.assalou30);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 31:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/30-Akdaryaty.mp3";
					titre = getResources().getString(R.string.assalou31);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 32:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/31-Hissaby.mp3";
					titre = getResources().getString(R.string.assalou32);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 33:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/AS_ALUL_MASSALIK/32_Babul_Mounassakhaty.mp3";
					titre = getResources().getString(R.string.assalou33);
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
