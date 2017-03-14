package com.ocean.adapterwork;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends Activity {
Button getStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_splash_screen);
       // ActionBar actionBar = getActionBar();
        //actionBar.hide();
    getStarted=(Button)findViewById(R.id.getstartedbutton);
        getStarted.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    getStarted.setBackgroundColor(Color.WHITE);
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    getStarted.setBackgroundColor(Color.WHITE);
                }
                return false;
            }
        });
    getStarted.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
    });
    }
}
