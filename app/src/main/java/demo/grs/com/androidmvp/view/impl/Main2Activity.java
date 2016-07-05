package demo.grs.com.androidmvp.view.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import demo.grs.com.androidmvp.R;
import demo.grs.com.androidmvp.injection.AppComponent;
import demo.grs.com.androidmvp.injection.DaggerMain2ViewComponent;
import demo.grs.com.androidmvp.injection.Main2ViewModule;
import demo.grs.com.androidmvp.presenter.BasePresenter;
import demo.grs.com.androidmvp.presenter.Main2Presenter;
import demo.grs.com.androidmvp.view.Main2View;

public final class Main2Activity extends BaseActivity implements Main2View {
    @Inject
    Main2Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void setupComponent(@NonNull AppComponent parentComponent) {
        DaggerMain2ViewComponent.builder()
                .appComponent(parentComponent)
                .main2ViewModule(new Main2ViewModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected BasePresenter getBasePresenter() {
        return mPresenter;
    }
}
