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

public class NahwulActivity extends Activity {

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
						.getResources().getString(R.string.nahwul1)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul2)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul3)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul4)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul5)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul6)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul7)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul8)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul9)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul10)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul11)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul12)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul13)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul14)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul15)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.nahwul16)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_nahwul_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						NahwulActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;

				switch (position) {
				case 1:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/01_Al_jumlatul_mufidatu.mp3";
					titre = getResources().getString(R.string.nahwul1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 2:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/02_Ajzaul_jumlati.mp3";
					titre = getResources().getString(R.string.nahwul2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/03_Taksimul_fihli.mp3";
					titre = getResources().getString(R.string.nahwul3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 4:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/04_Al_fahilu.mp3";
					titre = getResources().getString(R.string.nahwul4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/05_Al_mafhulu_bihi.mp3";
					titre = getResources().getString(R.string.nahwul5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/06_Al_muwazanatu_bayna.mp3";
					titre = getResources().getString(R.string.nahwul6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/07_Al_mubtada_wal_khabar.mp3";
					titre = getResources().getString(R.string.nahwul7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 8:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/08_Al_jumlatul_fihliyatu.mp3";
					titre = getResources().getString(R.string.nahwul8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/09_Al_jumlatul_ismiyatu.mp3";
					titre = getResources().getString(R.string.nahwul9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/10_Nasbul_fihli.mp3";
					titre = getResources().getString(R.string.nahwul10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/11_Jazmul_fihli.mp3";
					titre = getResources().getString(R.string.nahwul11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/12_Rafhul_fihli.mp3";
					titre = getResources().getString(R.string.nahwul12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/13_Kana_wa_akhawatuha.mp3";
					titre = getResources().getString(R.string.nahwul13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/14_Ina_wa_akhawatouha.mp3";
					titre = getResources().getString(R.string.nahwul14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/15_Jarul_ismi.mp3";
					titre = getResources().getString(R.string.nahwul15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/nahwul_waadih/16_An_nahtu.mp3";
					titre = getResources().getString(R.string.nahwul16);
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
