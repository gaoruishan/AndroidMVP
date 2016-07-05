package demo.grs.com.androidmvp.presenter.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import demo.grs.com.androidmvp.interactor.Main2Interactor;
import demo.grs.com.androidmvp.presenter.Main2Presenter;
import demo.grs.com.androidmvp.view.Main2View;

public final class Main2PresenterImpl implements Main2Presenter {
    /**
     * The view
     */
    @NonNull
    private final Main2View mView;
    /**
     * The interactor
     */
    @NonNull
    private final Main2Interactor mInteractor;

    @Inject
    public Main2PresenterImpl(@NonNull Main2View view, @NonNull Main2Interactor interactor) {
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