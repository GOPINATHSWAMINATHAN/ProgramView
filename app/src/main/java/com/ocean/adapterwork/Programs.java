package com.ocean.adapterwork;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.webkit.WebSettings;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ZoomControls;

import com.ablanco.zoomy.Zoomy;
import com.ablanco.zoomy.ZoomyConfig;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.HightlightJs;
import br.tiagohm.codeview.SyntaxHighlighter;

public class Programs extends AppCompatActivity {
    ZoomControls image_zoom;
    Matrix m = new Matrix();
    ScrollView sv;
    HorizontalScrollView hsv;
    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    ImageView program_image;
    ImageView program_output;
    int w = 800;
    int h = 400;
    ScrollView scrollView;
    HorizontalScrollView horizontalScrollView;
    GestureDetector gestureDetector;
    ScaleGestureDetector scaleGestureDetector;
    private float scale = 1f;
    private float mScale = 1f;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);

        MobileAds.initialize(this,"ca-app-pub-5466017327223057~8087757714");

        mAdView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        int row = MyData.pos;
        Intent intent = getIntent();
        int col = intent.getExtras().getInt("pos");
        ImageView img = (ImageView) findViewById(R.id.output);

        img.setImageResource(MyData.programoutput[row][col]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //getActionBar().setHomeButtonEnabled(true);
        final CodeView cv = (CodeView) findViewById(R.id.code_view);


        TextView programdescription = (TextView) findViewById(R.id.program_description);
        programdescription.setText(MyData.programDescription[row][col]);


        try {
            String programs = getPrograms(this, MyData.sourceprograms[row][col]);
            Log.e("programs", "" + programs);
            cv.setSyntaxHighlighter(new HightlightJs())
                    .setCode(programs)
                    //HightlightJs.Languages.AUTO is slow!!!
                    .setLanguage(HightlightJs.Languages.JAVA)
                    .setTheme(HightlightJs.Themes.AGATE)//AGATE
                    .setShowLineNumber(true)
                    .setTextSize(18)
                    .apply();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private static String getPrograms(Activity activity, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(activity.getAssets().open(str)));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                String stringBuffer2 = stringBuffer.toString();
                bufferedReader.close();
                return stringBuffer2;
            }
            stringBuffer.append((char) read);
        }
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menus,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.my_home_btn:
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    }
