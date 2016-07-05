package demo.grs.com.androidmvp.injection;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import demo.grs.com.androidmvp.App;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getAppContext();

    App getApp();
}