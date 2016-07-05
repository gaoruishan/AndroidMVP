package demo.grs.com.androidmvp.injection;

import demo.grs.com.androidmvp.view.impl.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MainViewModule.class)
public interface MainViewComponent {
    void inject(MainActivity activity);
}