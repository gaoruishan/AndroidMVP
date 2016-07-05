package demo.grs.com.androidmvp.injection;

import android.support.annotation.NonNull;

import demo.grs.com.androidmvp.view.MainView;
import demo.grs.com.androidmvp.interactor.MainInteractor;
import demo.grs.com.androidmvp.interactor.impl.MainInteractorImpl;
import demo.grs.com.androidmvp.presenter.MainPresenter;
import demo.grs.com.androidmvp.presenter.impl.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public final class MainViewModule {
    /**
     * Stored view
     */
    private final MainView mView;

    public MainViewModule(@NonNull MainView view) {
        mView = view;
    }

    @Provides
    public MainView provideView() {
        return mView;
    }

    @Provides
    public MainInteractor provideInteractor() {
        return new MainInteractorImpl();
    }

    @Provides
    public MainPresenter providePresenter(@NonNull MainView view, @NonNull MainInteractor interactor) {
        return new MainPresenterImpl(view, interactor);
    }
}
