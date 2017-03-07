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

public class HaririyActivity extends Activity {

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
						.getResources().getString(R.string.haririy27)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy28)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy29)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy30)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy31)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy32)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy33)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy34)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy35)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy36)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy37)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy38)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy39)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy40)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy41)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy42)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy43)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy44)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy45)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy46)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy47)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy48)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy49)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy50)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy51)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy52)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy53)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy54)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy55)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy56)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy57)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy58)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy59)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy60)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy61)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy62)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy63)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy64)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy65)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy66)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy67)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy68)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy69)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.haririy70)),

		};

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_haririy_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						HaririyActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;

				switch (position) {
				case 1:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_1A.mp3";
					titre = getResources().getString(R.string.haririy1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 2:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_1B.mp3";
					titre = getResources().getString(R.string.haririy2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_2A.mp3";
					titre = getResources().getString(R.string.haririy3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 4:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_2B.mp3";
					titre = getResources().getString(R.string.haririy4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_3A.mp3";
					titre = getResources().getString(R.string.haririy5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_3B.mp3";
					titre = getResources().getString(R.string.haririy6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_4A.mp3";
					titre = getResources().getString(R.string.haririy7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 8:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_4B.mp3";
					titre = getResources().getString(R.string.haririy8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_5A.mp3";
					titre = getResources().getString(R.string.haririy9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_5A.mp3";
					titre = getResources().getString(R.string.haririy10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_6B.mp3";
					titre = getResources().getString(R.string.haririy11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_6A.mp3";
					titre = getResources().getString(R.string.haririy12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_7B.mp3";
					titre = getResources().getString(R.string.haririy13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_7A.mp3";
					titre = getResources().getString(R.string.haririy14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_8B.mp3";
					titre = getResources().getString(R.string.haririy15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_8A.mp3";
					titre = getResources().getString(R.string.haririy16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_9B.mp3";
					titre = getResources().getString(R.string.haririy17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_9A.mp3";
					titre = getResources().getString(R.string.haririy18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_10A.mp3";
					titre = getResources().getString(R.string.haririy19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_10B.mp3";
					titre = getResources().getString(R.string.haririy20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_11A.mp3";
					titre = getResources().getString(R.string.haririy21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_11B.mp3";
					titre = getResources().getString(R.string.haririy22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_12A.mp3";
					titre = getResources().getString(R.string.haririy23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_12B.mp3";
					titre = getResources().getString(R.string.haririy24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_13A.mp3";
					titre = getResources().getString(R.string.haririy25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_13B.mp3";
					titre = getResources().getString(R.string.haririy26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_14A.mp3";
					titre = getResources().getString(R.string.haririy27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 28:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_14A.mp3";
					titre = getResources().getString(R.string.haririy28);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 29:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_15B.mp3";
					titre = getResources().getString(R.string.haririy29);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 30:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_15A.mp3";
					titre = getResources().getString(R.string.haririy30);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 31:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_16B.mp3";
					titre = getResources().getString(R.string.haririy31);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 32:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_16A.mp3";
					titre = getResources().getString(R.string.haririy32);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 33:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_17B.mp3";
					titre = getResources().getString(R.string.haririy33);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 34:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_17A.mp3";
					titre = getResources().getString(R.string.haririy34);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 35:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_18B.mp3";
					titre = getResources().getString(R.string.haririy35);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 36:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_18A.mp3";
					titre = getResources().getString(R.string.haririy36);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 37:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_19A.mp3";
					titre = getResources().getString(R.string.haririy37);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 38:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_19B.mp3";
					titre = getResources().getString(R.string.haririy38);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 39:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_20A.mp3";
					titre = getResources().getString(R.string.haririy39);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 40:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_20B.mp3";
					titre = getResources().getString(R.string.haririy40);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 41:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_21A.mp3";
					titre = getResources().getString(R.string.haririy41);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 42:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_21B.mp3";
					titre = getResources().getString(R.string.haririy42);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 43:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_22A.mp3";
					titre = getResources().getString(R.string.haririy43);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 44:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_22B.mp3";
					titre = getResources().getString(R.string.haririy44);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 45:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_23A.mp3";
					titre = getResources().getString(R.string.haririy45);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 46:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_23A.mp3";
					titre = getResources().getString(R.string.haririy46);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 47:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_24B.mp3";
					titre = getResources().getString(R.string.haririy47);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 48:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_24A.mp3";
					titre = getResources().getString(R.string.haririy48);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 49:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_25B.mp3";
					titre = getResources().getString(R.string.haririy49);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 50:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_25A.mp3";
					titre = getResources().getString(R.string.haririy50);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 51:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_26B.mp3";
					titre = getResources().getString(R.string.haririy51);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 52:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_26A.mp3";
					titre = getResources().getString(R.string.haririy52);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 53:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_27B.mp3";
					titre = getResources().getString(R.string.haririy53);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 54:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_27A.mp3";
					titre = getResources().getString(R.string.haririy54);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 55:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_28A.mp3";
					titre = getResources().getString(R.string.haririy55);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 56:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_28B.mp3";
					titre = getResources().getString(R.string.haririy56);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 57:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_29A.mp3";
					titre = getResources().getString(R.string.haririy57);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 58:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_29B.mp3";
					titre = getResources().getString(R.string.haririy58);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 59:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_30A.mp3";
					titre = getResources().getString(R.string.haririy59);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 60:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_30B.mp3";
					titre = getResources().getString(R.string.haririy60);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 61:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_31A.mp3";
					titre = getResources().getString(R.string.haririy61);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 62:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_31B.mp3";
					titre = getResources().getString(R.string.haririy62);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 63:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_32A.mp3";
					titre = getResources().getString(R.string.haririy63);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 64:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_32A.mp3";
					titre = getResources().getString(R.string.haririy64);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 65:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_33B.mp3";
					titre = getResources().getString(R.string.haririy65);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 66:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_33A.mp3";
					titre = getResources().getString(R.string.haririy66);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 67:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_34B.mp3";
					titre = getResources().getString(R.string.haririy67);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 68:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_34A.mp3";
					titre = getResources().getString(R.string.haririy68);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 69:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_35B.mp3";
					titre = getResources().getString(R.string.haririy69);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 70:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_35A.mp3";
					titre = getResources().getString(R.string.haririy70);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 71:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/MAKHAMAATOUL_HARIRIYI/MAKHAMAATOUL_HARIRIYI_36B.mp3";
					titre = getResources().getString(R.string.haririy71);
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
