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

public class SilkuListeActivity extends Activity {

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
						.getResources().getString(R.string.silku1)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku2)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku3)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku4)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku5)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku6)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku7)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku8)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku9)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku10)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku11)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku12)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku13)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku14)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku15)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku16)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku17)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku18)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku19)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku20)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku21)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku22)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku23)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku24)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku25)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku26)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku27)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku28)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku29)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku30)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku31)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku32)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku33)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku34)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku35)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku36)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku37)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku38)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku39)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku40)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku41)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku42)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku43)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku44)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku45)),
				new Weather(R.drawable.btn_mbindumsbi, getApplicationContext()
						.getResources().getString(R.string.silku46)), };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_mbindumsbi_silku_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						SilkuListeActivity.this);
				adb.setTitle("Oeuvre selectionnée");
				Intent i = new Intent(getApplicationContext(),
						LecteurStreaming.class);
				String url;
				String titre;
				switch (position) {
				case 1:
					url = "http://annassihatou.org/audios/silkul_jawaahir/001.mp3";
					titre = getResources().getString(R.string.silku1);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 2:
					url = "http://annassihatou.org/audios/silkul_jawaahir/002.mp3";
					titre = getResources().getString(R.string.silku2);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 3:
					url = "http://annassihatou.org/audios/silkul_jawaahir/003.mp3";
					titre = getResources().getString(R.string.silku3);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 4:
					url = "http://annassihatou.org/audios/silkul_jawaahir/004.mp3";
					titre = getResources().getString(R.string.silku4);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 5:
					url = "http://annassihatou.org/audios/silkul_jawaahir/005.mp3";
					titre = getResources().getString(R.string.silku5);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 6:
					url = "http://annassihatou.org/audios/silkul_jawaahir/006.mp3";
					titre = getResources().getString(R.string.silku6);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 7:
					url = "http://annassihatou.org/audios/silkul_jawaahir/007.mp3";
					titre = getResources().getString(R.string.silku7);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 8:
					url = "http://annassihatou.org/audios/silkul_jawaahir/008.mp3";
					titre = getResources().getString(R.string.silku8);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 9:
					url = "http://annassihatou.org/audios/silkul_jawaahir/009.mp3";
					titre = getResources().getString(R.string.silku9);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 10:
					url = "http://annassihatou.org/audios/silkul_jawaahir/010.mp3";
					titre = getResources().getString(R.string.silku10);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 11:
					url = "http://annassihatou.org/audios/silkul_jawaahir/011.mp3";
					titre = getResources().getString(R.string.silku11);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 12:
					url = "http://annassihatou.org/audios/silkul_jawaahir/012.mp3";
					titre = getResources().getString(R.string.silku12);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 13:
					url = "http://annassihatou.org/audios/silkul_jawaahir/013.mp3";
					titre = getResources().getString(R.string.silku13);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 14:
					url = "http://annassihatou.org/audios/silkul_jawaahir/014.mp3";
					titre = getResources().getString(R.string.silku14);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 15:
					url = "http://annassihatou.org/audios/silkul_jawaahir/015.mp3";
					titre = getResources().getString(R.string.silku15);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 16:
					url = "http://annassihatou.org/audios/silkul_jawaahir/016.mp3";
					titre = getResources().getString(R.string.silku16);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 17:
					url = "http://annassihatou.org/audios/silkul_jawaahir/017.mp3";
					titre = getResources().getString(R.string.silku17);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 18:
					url = "http://annassihatou.org/audios/silkul_jawaahir/018.mp3";
					titre = getResources().getString(R.string.silku18);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 19:
					url = "http://annassihatou.org/audios/silkul_jawaahir/019.mp3";
					titre = getResources().getString(R.string.silku19);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 20:
					url = "http://annassihatou.org/audios/silkul_jawaahir/020.mp3";
					titre = getResources().getString(R.string.silku20);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 21:
					url = "http://annassihatou.org/audios/silkul_jawaahir/021.mp3";
					titre = getResources().getString(R.string.silku21);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 22:
					url = "http://annassihatou.org/audios/silkul_jawaahir/022.mp3";
					titre = getResources().getString(R.string.silku22);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 23:
					url = "http://annassihatou.org/audios/silkul_jawaahir/023.mp3";
					titre = getResources().getString(R.string.silku23);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 24:
					url = "http://annassihatou.org/audios/silkul_jawaahir/024.mp3";
					titre = getResources().getString(R.string.silku24);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 25:
					url = "http://annassihatou.org/audios/silkul_jawaahir/025.mp3";
					titre = getResources().getString(R.string.silku25);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 26:
					url = "http://annassihatou.org/audios/silkul_jawaahir/026.mp3";
					titre = getResources().getString(R.string.silku26);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 27:
					url = "http://annassihatou.org/audios/silkul_jawaahir/027.mp3";
					titre = getResources().getString(R.string.silku27);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 28:
					url = "http://annassihatou.org/audios/silkul_jawaahir/028.mp3";
					titre = getResources().getString(R.string.silku28);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 29:
					url = "http://annassihatou.org/audios/silkul_jawaahir/029.mp3";
					titre = getResources().getString(R.string.silku29);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 30:
					url = "http://annassihatou.org/audios/silkul_jawaahir/030.mp3";
					titre = getResources().getString(R.string.silku30);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 31:
					url = "http://annassihatou.org/audios/silkul_jawaahir/031.mp3";
					titre = getResources().getString(R.string.silku31);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 32:
					url = "http://annassihatou.org/audios/silkul_jawaahir/032.mp3";
					titre = getResources().getString(R.string.silku32);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 33:
					url = "http://annassihatou.org/audios/silkul_jawaahir/033.mp3";
					titre = getResources().getString(R.string.silku33);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 34:
					url = "http://annassihatou.org/audios/silkul_jawaahir/034.mp3";
					titre = getResources().getString(R.string.silku34);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 35:
					url = "http://annassihatou.org/audios/silkul_jawaahir/035.mp3";
					titre = getResources().getString(R.string.silku35);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 36:
					url = "http://annassihatou.org/audios/silkul_jawaahir/036.mp3";
					titre = getResources().getString(R.string.silku36);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 37:
					url = "http://annassihatou.org/audios/silkul_jawaahir/037.mp3";
					titre = getResources().getString(R.string.silku37);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 38:
					url = "http://annassihatou.org/audios/silkul_jawaahir/038.mp3";
					titre = getResources().getString(R.string.silku38);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 39:
					url = "http://annassihatou.org/audios/silkul_jawaahir/039.mp3";
					titre = getResources().getString(R.string.silku39);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 40:
					url = "http://annassihatou.org/audios/silkul_jawaahir/040.mp3";
					titre = getResources().getString(R.string.silku40);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 41:
					url = "http://annassihatou.org/audios/silkul_jawaahir/041.mp3";
					titre = getResources().getString(R.string.silku41);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 42:
					url = "http://annassihatou.org/audios/silkul_jawaahir/042.mp3";
					titre = getResources().getString(R.string.silku42);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 43:
					url = "http://annassihatou.org/audios/silkul_jawaahir/043.mp3";
					titre = getResources().getString(R.string.silku43);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 44:
					url = "http://annassihatou.org/audios/silkul_jawaahir/044.mp3";
					titre = getResources().getString(R.string.silku44);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 45:
					url = "http://annassihatou.org/audios/silkul_jawaahir/045.mp3";
					titre = getResources().getString(R.string.silku45);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;
				case 46:
					url = "http://annassihatou.org/audios/silkul_jawaahir/046.mp3";
					titre = getResources().getString(R.string.silku46);
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
