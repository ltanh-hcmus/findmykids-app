package com.thesis.findmykidsparents.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.thesis.findmykidsparents.utils.ApiResponse;
import com.thesis.findmykidsparents.utils.Repository;

import io.reactivex.disposables.CompositeDisposable;

public class MainViewModel extends ViewModel {
    private final CompositeDisposable disposables = new CompositeDisposable();
    private final MutableLiveData<ApiResponse> responseLiveData = new MutableLiveData<>();
    private Repository repository;

    public MainViewModel(Repository repository) {
        this.repository = repository;
    }

    public MutableLiveData<ApiResponse> loginResponse() {
        return responseLiveData;
    }

    public void hitMainApi() {
//        disposables.add(repository.executeLogin(mobileNumber, password)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnSubscribe((d) -> responseLiveData.setValue(ApiResponse.loading()))
//                .subscribe(
//                        result -> responseLiveData.setValue(ApiResponse.success(result)),
//                        throwable -> responseLiveData.setValue(ApiResponse.error(throwable))
//                ));
    }

    @Override
    protected void onCleared() {
        disposables.clear();
    }
}
