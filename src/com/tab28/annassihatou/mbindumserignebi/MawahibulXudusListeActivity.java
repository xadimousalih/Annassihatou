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

public class MawahibulXudusListeActivity extends Activity {

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
						.getResources().getString(R.string.maxud1)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud2)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud3)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud4)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud5)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud6)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud7)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud8)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud9)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud10)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud11)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud12)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud13)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud14)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud15)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud16)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud17)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.maxud18)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_mbindumsbi_maxud_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						MawahibulXudusListeActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;
				switch (position) {
				case 1:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/01_Tarjuman.mp3";
					titre = getResources().getString(R.string.tasih1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 2:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/02_Mukhadimatun%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/03_Babun%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 4:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/04_Faslun_fil_uluhiya%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/05_Faslun_fi_mutahalaqi%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/06_Faslun_fil_xususi%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/07_Faslun_fi_addadi%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 8:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/08_Faslun_fil_jaaizi%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/09_Faslun_fil_barahin%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/10_Faslun_fir_rusli%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/11_Faslun_fi_ma_bayna%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/12_Faslun_fil_jaaizi%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/13_Faslun%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/14_Faslun_suite%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/15_Faslun_suite%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/16_Faslun_suite%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/17_Faslun_suite%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://annassihatou.org/audios/Mawahibul_Xudus/18_Faslun_fin%E2%80%8B.mp3";
					titre = getResources().getString(R.string.tasih18);
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
