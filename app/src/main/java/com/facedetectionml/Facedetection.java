package com.facedetectionml;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class Facedetection extends Application {

  public static final String RESULT_TEXT = "RESULT_TEXT";
  public static final String RESULT_DIALOG = "RESULT_DIALOG";


    @Override
    public void onCreate() {
        FirebaseApp.initializeApp(this);
        super.onCreate();
    }
}
