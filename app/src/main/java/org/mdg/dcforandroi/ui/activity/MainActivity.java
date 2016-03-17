package org.mdg.dcforandroi.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.mdg.dcforandroi.R;
import org.mdg.dcforandroi.commons.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void setupComponent() {
        initialiseComponent().inject(this);
    }
}
