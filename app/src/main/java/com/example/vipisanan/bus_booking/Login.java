package com.example.vipisanan.bus_booking;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;

class Login extends Activity {

  @Override
  protected void onCreate( @Nullable Bundle savedInstanceState ) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.login_popup);

    DisplayMetrics dm =new  DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(dm);

    int width = dm.widthPixels;
    int height = dm.heightPixels;

    getWindow().setLayout((int)(width*.9) ,(int)(height*.8) );

  }
}
