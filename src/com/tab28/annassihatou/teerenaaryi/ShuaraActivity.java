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

public class ShuaraActivity extends Activity {

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
						.getResources().getString(R.string.shuara1)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara2)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara3)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara4)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara5)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara6)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara7)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara8)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara9)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara10)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara11)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara12)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara13)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara14)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara15)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara16)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara17)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara18)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara19)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara20)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara21)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara22)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara23)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara24)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara25)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara26)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara27)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara28)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara29)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara30)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara31)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara32)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara33)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara34)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara35)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara36)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara37)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara38)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara39)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara40)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara41)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara42)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara43)),
				new Weather(R.drawable.btn_tny, getApplicationContext()
						.getResources().getString(R.string.shuara44)),

		};

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_shuara_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						ShuaraActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;

				switch (position) {
				case 1:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_01.mp3";
					titre = getResources().getString(R.string.shuara1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 2:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_02.mp3";
					titre = getResources().getString(R.string.shuara2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_03.mp3";
					titre = getResources().getString(R.string.shuara3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 4:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_04.mp3";
					titre = getResources().getString(R.string.shuara4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_05.mp3";
					titre = getResources().getString(R.string.shuara5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_06.mp3";
					titre = getResources().getString(R.string.shuara6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_07.mp3";
					titre = getResources().getString(R.string.shuara7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 8:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_08.mp3";
					titre = getResources().getString(R.string.shuara8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_09.mp3";
					titre = getResources().getString(R.string.shuara9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_10.mp3";
					titre = getResources().getString(R.string.shuara10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_11.mp3";
					titre = getResources().getString(R.string.shuara11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_12.mp3";
					titre = getResources().getString(R.string.shuara12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_13.mp3";
					titre = getResources().getString(R.string.shuara13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_14.mp3";
					titre = getResources().getString(R.string.shuara14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_15.mp3";
					titre = getResources().getString(R.string.shuara15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_16.mp3";
					titre = getResources().getString(R.string.shuara16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_17.mp3";
					titre = getResources().getString(R.string.shuara17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_18.mp3";
					titre = getResources().getString(R.string.shuara18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_19.mp3";
					titre = getResources().getString(R.string.shuara19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_20.mp3";
					titre = getResources().getString(R.string.shuara20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_21.mp3";
					titre = getResources().getString(R.string.shuara21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_22.mp3";
					titre = getResources().getString(R.string.shuara22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_23.mp3";
					titre = getResources().getString(R.string.shuara23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_24.mp3";
					titre = getResources().getString(R.string.shuara24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_25.mp3";
					titre = getResources().getString(R.string.shuara25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_26.mp3";
					titre = getResources().getString(R.string.shuara26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_27.mp3";
					titre = getResources().getString(R.string.shuara27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 28:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_28.mp3";
					titre = getResources().getString(R.string.shuara28);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 29:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_29.mp3";
					titre = getResources().getString(R.string.shuara29);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 30:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_30.mp3";
					titre = getResources().getString(R.string.shuara30);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 31:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_31.mp3";
					titre = getResources().getString(R.string.shuara31);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 32:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_32.mp3";
					titre = getResources().getString(R.string.shuara32);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 33:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_33.mp3";
					titre = getResources().getString(R.string.shuara33);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 34:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_34.mp3";
					titre = getResources().getString(R.string.shuara34);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 35:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_35.mp3";
					titre = getResources().getString(R.string.shuara35);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 36:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_36.mp3";
					titre = getResources().getString(R.string.shuara36);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 37:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_37.mp3";
					titre = getResources().getString(R.string.shuara37);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 38:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_38.mp3";
					titre = getResources().getString(R.string.shuara38);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 39:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_39.mp3";
					titre = getResources().getString(R.string.shuara39);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 40:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_40.mp3";
					titre = getResources().getString(R.string.shuara40);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 41:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_41.mp3";
					titre = getResources().getString(R.string.shuara41);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 42:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_42.mp3";
					titre = getResources().getString(R.string.shuara42);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 43:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_43.mp3";
					titre = getResources().getString(R.string.shuara43);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 44:
					url = "http://www.annassihatou.org/audios/-savants_arabes-/shuhara_u/SHUARU_44.mp3";
					titre = getResources().getString(R.string.shuara44);
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
