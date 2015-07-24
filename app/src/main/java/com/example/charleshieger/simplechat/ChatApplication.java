package com.example.charleshieger.simplechat;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ChatApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "38gxBWoTm8MgBdaLaoBSAlH5b2GXn3lTOeDJP6zJ";
    public static final String YOUR_CLIENT_KEY = "9MQ8Dumly4WNM0wWTRHHixc9Ga0G2DJoZzxtmN1L";

    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        // register your parse models here
        ParseObject.registerSubclass(Message.class);
        // Existing initialization happens after all classes are registered
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }
}
