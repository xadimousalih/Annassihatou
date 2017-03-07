package com.tab28.annassihatou.serigneabdourahmane;

/**
 * @author xadimouSALIH
 * http://www.tab28.com
 */
import android.os.Bundle;

import com.tab28.annassihatou.DashBoardActivity;
import com.tab28.annassihatou.R;

public class Activity_SerigneAbdouRahmane extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serigneabdourahmane);
        setHeader(getString(R.string.SerigneAbdouahmane), true, true);
        
    }
}
