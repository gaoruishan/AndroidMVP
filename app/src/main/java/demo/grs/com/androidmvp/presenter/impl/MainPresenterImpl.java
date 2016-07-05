package demo.grs.com.androidmvp.presenter.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import demo.grs.com.androidmvp.interactor.MainInteractor;
import demo.grs.com.androidmvp.presenter.MainPresenter;
import demo.grs.com.androidmvp.view.MainView;

public final class MainPresenterImpl implements MainPresenter {
    /**
     * The view
     */
    @NonNull
    private final MainView mView;
    /**
     * The interactor
     */
    @NonNull
    private final MainInteractor mInteractor;

    @Inject
    public MainPresenterImpl(@NonNull MainView view, @NonNull MainInteractor interactor) {
        mView = view;
        mInteractor = interactor;
    }

    @Override
    public void onRestoreState(@NonNull Bundle savedInstanceState) {

    }

    @Override
    public void onStart(boolean firstStart) {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {

    }
}