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

public class MouhamadListeActivity extends Activity {

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
						.getResources().getString(R.string.mouhamad1)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad2)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad3)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad4)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad5)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad6)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad7)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad8)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad9)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad10)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad11)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad12)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad13)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad14)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad15)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad16)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad17)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad18)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad19)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad20)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad21)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad22)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad23)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad24)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad25)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad26)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad27)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad28)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad29)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad30)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad31)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad32)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad33)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad34)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad35)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad36)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad37)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad38)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.mouhamad39)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_mbindumsbi_mouhamad_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						MouhamadListeActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;
				switch (position) {
				case 1:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_1.mp3";
					titre = getResources().getString(R.string.mouhamad1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 2:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_2.mp3";
					titre = getResources().getString(R.string.mouhamad2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_3.mp3";
					titre = getResources().getString(R.string.mouhamad3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 4:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_4.mp3";
					titre = getResources().getString(R.string.mouhamad4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_5.mp3";
					titre = getResources().getString(R.string.mouhamad5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_6.mp3";
					titre = getResources().getString(R.string.mouhamad6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_7.mp3";
					titre = getResources().getString(R.string.mouhamad7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 8:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_8.mp3";
					titre = getResources().getString(R.string.mouhamad8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_9.mp3";
					titre = getResources().getString(R.string.mouhamad9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_10.mp3";
					titre = getResources().getString(R.string.mouhamad10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_11.mp3";
					titre = getResources().getString(R.string.mouhamad11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_12.mp3";
					titre = getResources().getString(R.string.mouhamad12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_13.mp3";
					titre = getResources().getString(R.string.mouhamad13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_14.mp3";
					titre = getResources().getString(R.string.mouhamad14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_15.mp3";
					titre = getResources().getString(R.string.mouhamad15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_16.mp3";
					titre = getResources().getString(R.string.mouhamad16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_17.mp3";
					titre = getResources().getString(R.string.mouhamad17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_18.mp3";
					titre = getResources().getString(R.string.mouhamad18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_19.mp3";
					titre = getResources().getString(R.string.mouhamad19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_20.mp3";
					titre = getResources().getString(R.string.mouhamad20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_21.mp3";
					titre = getResources().getString(R.string.mouhamad21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_22.mp3";
					titre = getResources().getString(R.string.mouhamad22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_23.mp3";
					titre = getResources().getString(R.string.mouhamad23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_24.mp3";
					titre = getResources().getString(R.string.mouhamad24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_25.mp3";
					titre = getResources().getString(R.string.mouhamad25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_26.mp3";
					titre = getResources().getString(R.string.mouhamad26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_27.mp3";
					titre = getResources().getString(R.string.mouhamad27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 28:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_28.mp3";
					titre = getResources().getString(R.string.mouhamad28);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 29:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_29.mp3";
					titre = getResources().getString(R.string.mouhamad29);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 30:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_30.mp3";
					titre = getResources().getString(R.string.mouhamad30);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 31:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_31.mp3";
					titre = getResources().getString(R.string.mouhamad31);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 32:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_32.mp3";
					titre = getResources().getString(R.string.mouhamad32);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 33:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_33.mp3";
					titre = getResources().getString(R.string.mouhamad33);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 34:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_34.mp3";
					titre = getResources().getString(R.string.mouhamad34);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 35:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_35.mp3";
					titre = getResources().getString(R.string.mouhamad35);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 36:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_36.mp3";
					titre = getResources().getString(R.string.mouhamad36);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 37:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_37.mp3";
					titre = getResources().getString(R.string.mouhamad37);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 38:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_38.mp3";
					titre = getResources().getString(R.string.mouhamad38);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 39:
					url = "http://annassihatou.org/audios/MOUHAMADUN_RASSOULULLAHI/MUHAMADUN_RASULULAH_39.mp3";
					titre = getResources().getString(R.string.mouhamad39);
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
