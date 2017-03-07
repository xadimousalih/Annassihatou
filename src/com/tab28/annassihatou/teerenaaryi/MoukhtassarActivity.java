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

public class MoukhtassarActivity extends Activity {

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
						.getResources().getString(R.string.haririy60)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_moukhtassar_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						MoukhtassarActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;

				switch (position) {
				case 1:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_39.mp3";
					titre = getResources().getString(R.string.haririy1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 2:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_40.mp3";
					titre = getResources().getString(R.string.haririy2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_41.mp3";
					titre = getResources().getString(R.string.haririy3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 4:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_42.mp3";
					titre = getResources().getString(R.string.haririy4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_43.mp3";
					titre = getResources().getString(R.string.haririy5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_44.mp3";
					titre = getResources().getString(R.string.haririy6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_45.mp3";
					titre = getResources().getString(R.string.haririy7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 8:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_46.mp3";
					titre = getResources().getString(R.string.haririy8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_47.mp3";
					titre = getResources().getString(R.string.haririy9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_48.mp3";
					titre = getResources().getString(R.string.haririy10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_49.mp3";
					titre = getResources().getString(R.string.haririy11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_50.mp3";
					titre = getResources().getString(R.string.haririy12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_51.mp3";
					titre = getResources().getString(R.string.haririy13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_52.mp3";
					titre = getResources().getString(R.string.haririy14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_53.mp3";
					titre = getResources().getString(R.string.haririy15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_54.mp3";
					titre = getResources().getString(R.string.haririy16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_55.mp3";
					titre = getResources().getString(R.string.haririy17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_56.mp3";
					titre = getResources().getString(R.string.haririy18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_57.mp3";
					titre = getResources().getString(R.string.haririy19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_58.mp3";
					titre = getResources().getString(R.string.haririy20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_59.mp3";
					titre = getResources().getString(R.string.haririy21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_60.mp3";
					titre = getResources().getString(R.string.haririy22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_61.mp3";
					titre = getResources().getString(R.string.haririy23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_62.mp3";
					titre = getResources().getString(R.string.haririy24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_63.mp3";
					titre = getResources().getString(R.string.haririy25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_64.mp3";
					titre = getResources().getString(R.string.haririy26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_65.mp3";
					titre = getResources().getString(R.string.haririy27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 28:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_66.mp3";
					titre = getResources().getString(R.string.haririy28);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 29:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_67.mp3";
					titre = getResources().getString(R.string.haririy29);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 30:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_68.mp3";
					titre = getResources().getString(R.string.haririy30);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 31:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_69.mp3";
					titre = getResources().getString(R.string.haririy31);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 32:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_70.mp3";
					titre = getResources().getString(R.string.haririy32);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 33:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_71.mp3";
					titre = getResources().getString(R.string.haririy33);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 34:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_72.mp3";
					titre = getResources().getString(R.string.haririy34);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 35:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_73.mp3";
					titre = getResources().getString(R.string.haririy35);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 36:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_74.mp3";
					titre = getResources().getString(R.string.haririy36);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 37:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_75.mp3";
					titre = getResources().getString(R.string.haririy37);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 38:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_76.mp3";
					titre = getResources().getString(R.string.haririy38);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 39:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_77.mp3";
					titre = getResources().getString(R.string.haririy39);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 40:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_78.mp3";
					titre = getResources().getString(R.string.haririy40);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 41:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_79.mp3";
					titre = getResources().getString(R.string.haririy41);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 42:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_80.mp3";
					titre = getResources().getString(R.string.haririy42);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 43:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_81.mp3";
					titre = getResources().getString(R.string.haririy43);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 44:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_82.mp3";
					titre = getResources().getString(R.string.haririy44);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 45:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_83.mp3";
					titre = getResources().getString(R.string.haririy45);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 46:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_84.mp3";
					titre = getResources().getString(R.string.haririy46);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 47:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_85.mp3";
					titre = getResources().getString(R.string.haririy47);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 48:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_86.mp3";
					titre = getResources().getString(R.string.haririy48);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 49:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_87.mp3";
					titre = getResources().getString(R.string.haririy49);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 50:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_88.mp3";
					titre = getResources().getString(R.string.haririy50);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 51:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_89.mp3";
					titre = getResources().getString(R.string.haririy51);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 52:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_90.mp3";
					titre = getResources().getString(R.string.haririy52);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 53:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_91.mp3";
					titre = getResources().getString(R.string.haririy53);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 54:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_92.mp3";
					titre = getResources().getString(R.string.haririy54);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 55:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_93.mp3";
					titre = getResources().getString(R.string.haririy55);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 56:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_94.mp3";
					titre = getResources().getString(R.string.haririy56);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 57:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_95.mp3";
					titre = getResources().getString(R.string.haririy57);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 58:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_96.mp3";
					titre = getResources().getString(R.string.haririy58);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 59:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_97.mp3";
					titre = getResources().getString(R.string.haririy59);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 60:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/KHALIL_JUZU_I/KHALIL_JUZU_I_98.mp3";
					titre = getResources().getString(R.string.haririy60);
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
