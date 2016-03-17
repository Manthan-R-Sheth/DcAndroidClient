package org.mdg.dcforandroi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by manthan on 18/3/16.
 */
@Module
public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public App provideApplication() {
        return app;
    }
}
