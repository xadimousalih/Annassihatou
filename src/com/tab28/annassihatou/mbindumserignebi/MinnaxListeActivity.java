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

public class MinnaxListeActivity extends Activity {

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
						.getResources().getString(R.string.minnax1)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax2)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax3)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax4)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax5)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax6)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax7)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax8)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax9)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax10)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax11)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax12)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax13)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax14)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax15)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax16)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax17)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax18)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax19)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax20)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax21)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax22)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax23)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax24)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax25)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax26)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax27)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax28)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax29)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax30)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax31)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax32)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax33)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax34)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax35)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax36)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax37)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax38)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax39)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax40)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax41)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax42)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax43)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax44)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax45)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.minnax46)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_mbindumsbi_minnax_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						MinnaxListeActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;
				switch (position) {
				case 1:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_1.mp3";
					titre = getResources().getString(R.string.minnax1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 2:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_2.mp3";
					titre = getResources().getString(R.string.minnax2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_3.mp3";
					titre = getResources().getString(R.string.minnax3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 4:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_4.mp3";
					titre = getResources().getString(R.string.minnax4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_5.mp3";
					titre = getResources().getString(R.string.minnax5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_6.mp3";
					titre = getResources().getString(R.string.minnax6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_7.mp3";
					titre = getResources().getString(R.string.minnax7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 8:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_8.mp3";
					titre = getResources().getString(R.string.minnax8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_9.mp3";
					titre = getResources().getString(R.string.minnax9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_10.mp3";
					titre = getResources().getString(R.string.minnax10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_11.mp3";
					titre = getResources().getString(R.string.minnax11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_12.mp3";
					titre = getResources().getString(R.string.minnax12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_13.mp3";
					titre = getResources().getString(R.string.minnax13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_14.mp3";
					titre = getResources().getString(R.string.minnax14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_15.mp3";
					titre = getResources().getString(R.string.minnax15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_16.mp3";
					titre = getResources().getString(R.string.minnax16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_17.mp3";
					titre = getResources().getString(R.string.minnax17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_18.mp3";
					titre = getResources().getString(R.string.minnax18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_19.mp3";
					titre = getResources().getString(R.string.minnax19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_20.mp3";
					titre = getResources().getString(R.string.minnax20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_21.mp3";
					titre = getResources().getString(R.string.minnax21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_22.mp3";
					titre = getResources().getString(R.string.minnax22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_23.mp3";
					titre = getResources().getString(R.string.minnax23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_24.mp3";
					titre = getResources().getString(R.string.minnax24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_25.mp3";
					titre = getResources().getString(R.string.minnax25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_26.mp3";
					titre = getResources().getString(R.string.minnax26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_27.mp3";
					titre = getResources().getString(R.string.minnax27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 28:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_28.mp3";
					titre = getResources().getString(R.string.minnax28);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 29:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_29.mp3";
					titre = getResources().getString(R.string.minnax29);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 30:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_30.mp3";
					titre = getResources().getString(R.string.minnax30);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 31:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_31.mp3";
					titre = getResources().getString(R.string.minnax31);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 32:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_32.mp3";
					titre = getResources().getString(R.string.minnax32);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 33:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_33.mp3";
					titre = getResources().getString(R.string.minnax33);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 34:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_34.mp3";
					titre = getResources().getString(R.string.minnax34);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 35:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_35.mp3";
					titre = getResources().getString(R.string.minnax35);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 36:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_36.mp3";
					titre = getResources().getString(R.string.minnax36);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 37:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_37.mp3";
					titre = getResources().getString(R.string.minnax37);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 38:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_38.mp3";
					titre = getResources().getString(R.string.minnax38);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 39:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_39.mp3";
					titre = getResources().getString(R.string.minnax39);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 40:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_40.mp3";
					titre = getResources().getString(R.string.minnax40);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 41:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_41.mp3";
					titre = getResources().getString(R.string.minnax41);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 42:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_42.mp3";
					titre = getResources().getString(R.string.minnax42);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 43:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_43.mp3";
					titre = getResources().getString(R.string.minnax43);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 44:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_44.mp3";
					titre = getResources().getString(R.string.minnax44);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 45:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_45.mp3";
					titre = getResources().getString(R.string.minnax45);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 46:
					url = "http://www.annassihatou.org/audios/Min_axwaalil_xaddym/Min_axwaalil_xaddym_46.mp3";
					titre = getResources().getString(R.string.minnax46);
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
