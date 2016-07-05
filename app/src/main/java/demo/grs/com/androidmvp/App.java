package demo.grs.com.androidmvp;

import android.app.Application;
import android.support.annotation.NonNull;

import demo.grs.com.androidmvp.injection.AppComponent;
import demo.grs.com.androidmvp.injection.AppModule;
import demo.grs.com.androidmvp.injection.DaggerAppComponent;

public final class App extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @NonNull
    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}