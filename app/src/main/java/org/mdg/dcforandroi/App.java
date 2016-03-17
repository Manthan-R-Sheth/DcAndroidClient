package org.mdg.dcforandroi;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import org.mdg.dcforandroi.ui.DaggerUiComponent;
import org.mdg.dcforandroi.ui.UiComponent;
import org.mdg.dcforandroi.ui.UiModule;

import timber.log.Timber;

/**
 * Created by manthan on 18/3/16.
 */
public class App extends Application {

    UiComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        LeakCanary.install(this);

        AppModule appModule = new AppModule(this);
        UiModule uiModule = new UiModule();

        DaggerAppComponent.builder()
                .appModule(appModule)
                .build().link(this);

        mComponent = DaggerUiComponent.builder()
                .appModule(appModule)
                .uiModule(uiModule)
                .build();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    public UiComponent getComponent() {
        return mComponent;
    }
}
