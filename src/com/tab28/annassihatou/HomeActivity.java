package com.tab28.annassihatou;

/**
 * @author xadimouSALIH
 * http://www.tab28.com
 */
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tab28.annassihatou.histoire.HistoireListeActivity;
import com.tab28.annassihatou.mbindumserignebi.MbindumSBiListeActivity;
import com.tab28.annassihatou.serigneabdourahmane.SerigneAbdouRahmaneListeActivity;
import com.tab28.annassihatou.teerenaaryi.TeereNarYiListeActivity;

public class HomeActivity extends DashBoardActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Creating alert Dialog with one Button
		setContentView(R.layout.main);
		setHeader(getString(R.string.HomeActivityTitle), false, true);
		Button btnHis = (Button) findViewById(R.id.main_btn_histoire);
		btnHis.setText(Html.fromHtml("Histoire de<br/>Daroul Moukhty"));
		Button btnMsbi = (Button) findViewById(R.id.main_btn_mbindumsbi);
		btnMsbi.setText(Html.fromHtml("Mbindoum<br/>Serigne Bi"));
		Button btnTny = (Button) findViewById(R.id.main_btn_tny);
		btnTny.setText(Html.fromHtml("Tééré<br/>Naar Yi"));
		Button btnSar = (Button) findViewById(R.id.main_btn_sar);
		btnSar.setText(Html.fromHtml("Serigne Abdou<br/>Rahmane Mbacké"));
		AlertDialog alertDialog1 = new AlertDialog.Builder(this).create();
		// Setting Dialog Title
		alertDialog1.setTitle("ASSALAMOUHALEYKOUM!");
		// Setting Dialog Message
		alertDialog1
				.setMessage(Html
						.fromHtml("<center>NOTRE OBJECTIF: Oeuvrer pour Cheikh Ahmadou Bamba Khadimou Rassoul. <br/>Nous demandons à toute personne utilisant ce logiciel de prier pour SERIGNE SALIOU MBACKE</center>"));
		// Setting Icon to Dialog
		alertDialog1.setIcon(R.drawable.ss);
		// Setting OK Button
		alertDialog1.setButton("OK", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {
				// Write your code here to execute after dialog closed
				Toast.makeText(getApplicationContext(), "DIEUREDIEUF!",
						Toast.LENGTH_SHORT).show();
			}
		});

		// Showing Alert Message
		alertDialog1.show();

	}

	/**
	 * Button click handler on Main activity
	 * 
	 * @param v
	 */
	public void onButtonClicker(View v) {
		Intent intent;

		switch (v.getId()) {
		case R.id.main_btn_histoire:
			intent = new Intent(this, HistoireListeActivity.class);
			startActivity(intent);
			break;

		case R.id.main_btn_mbindumsbi:
			intent = new Intent(this, MbindumSBiListeActivity.class);
			startActivity(intent);
			break;

		case R.id.main_btn_tny:
			intent = new Intent(this, TeereNarYiListeActivity.class);
			startActivity(intent);
			break;

		case R.id.main_btn_sar:
			intent = new Intent(this, SerigneAbdouRahmaneListeActivity.class);
			startActivity(intent);
			break;
		default:
			break;
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
