package com.fernandez.dave;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

public class MyService extends IntentService {
    public MyService(){
        super("MyService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4ITF", "service is running...");
    }


}