package demo.grs.com.androidmvp.injection;

import android.support.annotation.NonNull;

import demo.grs.com.androidmvp.view.Main2View;
import demo.grs.com.androidmvp.interactor.Main2Interactor;
import demo.grs.com.androidmvp.interactor.impl.Main2InteractorImpl;
import demo.grs.com.androidmvp.presenter.Main2Presenter;
import demo.grs.com.androidmvp.presenter.impl.Main2PresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public final class Main2ViewModule {
    /**
     * Stored view
     */
    private final Main2View mView;

    public Main2ViewModule(@NonNull Main2View view) {
        mView = view;
    }

    @Provides
    public Main2View provideView() {
        return mView;
    }

    @Provides
    public Main2Interactor provideInteractor() {
        return new Main2InteractorImpl();
    }

    @Provides
    public Main2Presenter providePresenter(@NonNull Main2View view, @NonNull Main2Interactor interactor) {
        return new Main2PresenterImpl(view, interactor);
    }
}
