package com.tab28.annassihatou.serigneabdourahmane;

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
import com.tab28.annassihatou.mbindumserignebi.MajnuListeActivity;
import com.tab28.annassihatou.mbindumserignebi.MouhamadListeActivity;

public class SerigneAbdouRahmaneListeActivity extends Activity {

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
				new Weather(R.drawable.btn_sar, getApplicationContext()
						.getResources().getString(R.string.sar0)),
				new Weather(R.drawable.btn_sar, getApplicationContext()
						.getResources().getString(R.string.sar1)),
				new Weather(R.drawable.btn_sar, getApplicationContext()
						.getResources().getString(R.string.sar2)),
				new Weather(R.drawable.btn_sar, getApplicationContext()
						.getResources().getString(R.string.sar3)),
				new Weather(R.drawable.btn_sar, getApplicationContext()
						.getResources().getString(R.string.sar4)),
				new Weather(R.drawable.btn_sar, getApplicationContext()
						.getResources().getString(R.string.sar5)),
				new Weather(R.drawable.btn_sar, getApplicationContext()
						.getResources().getString(R.string.sar6)),
				new Weather(R.drawable.btn_sar, getApplicationContext()
						.getResources().getString(R.string.sar7)),
				new Weather(R.drawable.btn_sar, getApplicationContext()
						.getResources().getString(R.string.sar8)),
				 };

		WeatherAdapter adapter = new WeatherAdapter(this,
				R.layout.listview_item_row, weather_data);

		listView1 = (ListView) findViewById(R.id.listView1);

		View header = (View) getLayoutInflater().inflate(
				R.layout.listview_header_sar_row, null);
		listView1.addHeaderView(header);

		listView1.setAdapter(adapter);
		setupActionBar();

		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				AlertDialog.Builder adb = new AlertDialog.Builder(
						SerigneAbdouRahmaneListeActivity.this);
				adb.setTitle("Oeuvre selectionn�e");
				Intent i = null;

				switch (position) {
				case 1:
					i = new Intent(getApplicationContext(),
							XassidatouWadaahActivity.class);
					startActivity(i);
					break;

				case 2:
					i = new Intent(getApplicationContext(),
							MouhamadListeActivity.class);
					startActivity(i);
					break;
				case 3:
					i = new Intent(getApplicationContext(),
							AsilatounActivity.class);
					startActivity(i);
					break;
				case 4:
					i = new Intent(getApplicationContext(),
							LecteurStreaming.class);

					String url = "http://annassihatou.org/audios/Magal_Darou_Serigne_Abdou_RAHMANE_MBACKE.mp3";
					String titre = getResources().getString(R.string.ndenk);
					i.putExtra("url", url);
					i.putExtra("titre", titre);
					startActivity(i);
					break;

				case 5:
					i = new Intent(getApplicationContext(),
							WaxtaanSAKMActivity.class);
					startActivity(i);
					break;
				case 6:
					i = new Intent(getApplicationContext(),
							MawaqifActivity.class);
					startActivity(i);
					break;
				case 7:
					i = new Intent(getApplicationContext(),
							XamSayFarataActivity.class);
					startActivity(i);
					break;

				case 8:

					break;
				case 9:
					i = new Intent(getApplicationContext(),
							NassihatouActivity.class);
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
