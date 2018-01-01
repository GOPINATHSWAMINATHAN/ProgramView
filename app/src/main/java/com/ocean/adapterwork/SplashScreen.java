package com.ocean.adapterwork;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.MobileAds;

public class SplashScreen extends Activity {
Button getStarted;
TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_splash_screen);


 //
       // ActionBar actionBar = getActionBar();
        //actionBar.hide();
    getStarted=(Button)findViewById(R.id.getstartedbutton);
tt=(TextView)findViewById(R.id.steve);
        Typeface regular=Typeface.createFromAsset(getApplicationContext().getAssets(),"ziperhead.TTF");
        getStarted.setTypeface(regular);
        //tt.setTypeface(regular);
    getStarted.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
    });
    }
}
