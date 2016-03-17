package org.mdg.dcforandroi.commons;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.mdg.dcforandroi.App;
import org.mdg.dcforandroi.ui.UiComponent;

/**
 * Created by manthan on 18/3/16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent();
    }

    protected abstract void setupComponent();

    protected UiComponent initialiseComponent() {
        return ((App) getApplication()).getComponent();
    }
}
