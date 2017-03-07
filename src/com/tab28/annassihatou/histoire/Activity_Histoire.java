package com.tab28.annassihatou.histoire;

/**
 * @author xadimouSALIH
 * http://www.tab28.com
 */

import android.os.Bundle;

import com.tab28.annassihatou.DashBoardActivity;
import com.tab28.annassihatou.R;

public class Activity_Histoire extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histoire);
        setHeader(getString(R.string.MbindoumSerigneBi), true, true);
        
    }
}
