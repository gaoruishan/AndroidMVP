package demo.grs.com.androidmvp.view.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import demo.grs.com.androidmvp.R;
import demo.grs.com.androidmvp.injection.AppComponent;
import demo.grs.com.androidmvp.injection.DaggerMainViewComponent;
import demo.grs.com.androidmvp.injection.MainViewModule;
import demo.grs.com.androidmvp.presenter.BasePresenter;
import demo.grs.com.androidmvp.presenter.MainPresenter;
import demo.grs.com.androidmvp.view.MainView;

public final class MainActivity extends BaseActivity implements MainView {
    @Inject
    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void setupComponent(@NonNull AppComponent parentComponent) {
        DaggerMainViewComponent.builder()
                .appComponent(parentComponent)
                .mainViewModule(new MainViewModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected BasePresenter getBasePresenter() {
        return mPresenter;
    }
}
