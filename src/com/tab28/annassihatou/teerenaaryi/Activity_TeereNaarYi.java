package com.tab28.annassihatou.teerenaaryi;

/**
 * @author xadimouSALIH
 * http://www.tab28.com
 */

import android.os.Bundle;

import com.tab28.annassihatou.DashBoardActivity;
import com.tab28.annassihatou.R;

public class Activity_TeereNaarYi extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teereyaaryi);
        setHeader(getString(R.string.TeereNaarYi), true, true);
        
    }
}
