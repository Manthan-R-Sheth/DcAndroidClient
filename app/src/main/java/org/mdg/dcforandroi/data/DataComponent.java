package org.mdg.dcforandroi.data;

import org.mdg.dcforandroi.AppModule;
import org.mdg.dcforandroi.data.api.ApiModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by manthan on 18/3/16.
 */
@Singleton
@Component(
        modules = {DataModule.class,
                ApiModule.class},
        dependencies = AppModule.class
)
public interface DataComponent {
}
