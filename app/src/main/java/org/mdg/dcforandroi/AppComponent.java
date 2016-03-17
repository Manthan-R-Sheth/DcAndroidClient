package org.mdg.dcforandroi;

/**
 * Created by manthan on 18/3/16.
 */

import org.mdg.dcforandroi.data.DataModule;
import org.mdg.dcforandroi.ui.UiModule;
import org.mdg.dcforandroi.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                DataModule.class,
                UiModule.class
        }
)
public interface AppComponent {

    void link(App app);

}
