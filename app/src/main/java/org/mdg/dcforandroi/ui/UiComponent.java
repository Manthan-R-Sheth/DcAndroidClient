package org.mdg.dcforandroi.ui;

import org.mdg.dcforandroi.AppModule;
import org.mdg.dcforandroi.data.DataModule;
import org.mdg.dcforandroi.data.api.ApiModule;
import org.mdg.dcforandroi.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by manthan on 18/3/16.
 */
@Singleton
@Component(
        modules = {UiModule.class,
                DataModule.class,
                ApiModule.class},
        dependencies = AppModule.class
)
public interface UiComponent {

        void inject(MainActivity mainActivity);
}
