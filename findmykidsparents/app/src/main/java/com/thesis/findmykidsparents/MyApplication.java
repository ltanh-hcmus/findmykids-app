package com.thesis.findmykidsparents;

import android.app.Application;
import android.content.Context;

import com.thesis.findmykidsparents.di.AppComponent;
import com.thesis.findmykidsparents.di.AppModule;
import com.thesis.findmykidsparents.di.DaggerAppComponent;
import com.thesis.findmykidsparents.di.UtilsModule;

public class MyApplication extends Application {
    AppComponent appComponent;
    Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).utilsModule(new UtilsModule()).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
