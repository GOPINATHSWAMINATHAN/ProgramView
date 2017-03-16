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
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.webkit.WebSettings;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.ZoomControls;

import com.ablanco.zoomy.Zoomy;
import com.ablanco.zoomy.ZoomyConfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.HightlightJs;

public class Programs extends AppCompatActivity {
    ZoomControls image_zoom;
    Matrix m=new Matrix();
    ScrollView sv;
    HorizontalScrollView hsv;
    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerView;
    ImageView program_image;
    ImageView program_output;
    int w=800;
    int h=400;
    ScrollView scrollView;
    HorizontalScrollView horizontalScrollView;
    GestureDetector gestureDetector;
    ScaleGestureDetector scaleGestureDetector;
    private float scale = 1f;
    private float mScale = 1f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);


        int row = MyData.pos;
        Intent intent = getIntent();
        int col = intent.getExtras().getInt("pos");
        ImageView img=(ImageView)findViewById(R.id.output);

        img.setImageResource(MyData.programoutput[row][col]);

        final CodeView cv = (CodeView) findViewById(R.id.code_view);
        cv.getSettings().setBuiltInZoomControls(true);
        cv.getSettings().setDisplayZoomControls(false);
        //cv.getSettings().setSupportZoom(true);
//        cv.getSettings().setUseWideViewPort(false);
//    //   double l= cv.getScale();
//        cv.setInitialScale((int)(100*cv.getScale()));
//        cv.getSettings().setDefaultZoom(WebSettings.ZoomDensity.CLOSE);
//        cv.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
//        cv.canZoomOut();
       // cv.getSettings().setTextZoom((int)l);
       // cv.getSettings().setLoadWithOverviewMode(true);

//Zoomy.Builder builder=new Zoomy.Builder(this).target(cv);
//        builder.register();
//
//        ZoomyConfig config=new ZoomyConfig();
//        config.setZoomAnimationEnabled(true);
//        config.setImmersiveModeEnabled(true);
//        Zoomy.setDefaultConfig(config);


//     cv.getSettings().setBuiltInZoomControls(true);
//        cv.getSettings().setDisplayZoomControls(false);
//       cv.getSettings().setSupportZoom(true);
//        cv.setInitialScale((int)(100 * cv.getScale()));
//      // cv.getSettings().setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
//        cv.getSettings().setTextZoom(100);

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

            cv.canZoomOut();
        } catch (IOException e) {
            e.printStackTrace();
        }



//        gestureDetector = new GestureDetector(this, new GestureListener());
//
//        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleGestureDetector.SimpleOnScaleGestureListener() {
//            @Override
//            public boolean onScale(ScaleGestureDetector detector) {
//                float scale = 1 - detector.getScaleFactor();
//
//
//                float prevScale = mScale;
//                mScale += scale;
//
//                if (mScale < 0.1f) // Minimum scale condition:
//                    mScale = 4.0f;
//
//                if (mScale > 10f) // Maximum scale condition:
//                    mScale = 8f;
//                ScaleAnimation scaleAnimation = new ScaleAnimation(1f / prevScale, 1f / mScale, 1f / prevScale, 1f / mScale, detector.getFocusX(), detector.getFocusY());
//                scaleAnimation.setDuration(0);
//                scaleAnimation.setFillAfter(true);
//                cv.startAnimation(scaleAnimation);
////                program_image.setMaxHeight(13);
//                // scrollView.startAnimation(scaleAnimation);
////                scrollView.requestDisallowInterceptTouchEvent(true);
//                //   horizontalScrollView.startAnimation(scaleAnimation);
//                return true;
//            }
//        });

    }














//
//
//
//program_image=(ImageView)findViewById(R.id.hellimage);
////        scrollView = (ScrollView) findViewById(R.id.sv);
////        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.hsv);
////

//
//        int row=MyData.pos;
//        Intent intent = getIntent();
//        int col = intent.getExtras().getInt("pos");
//
//
//
//
//
////        String prgImg=MyData.programs[row][col].replaceAll(" ","");
//        Log.e("path:",String.valueOf(row));
//        Log.e("Col:",String.valueOf(col));
//       program_image=(ImageView) findViewById(R.id.hellimage);
//
//        sv=(ScrollView) findViewById(R.id.sv);
//        hsv=(HorizontalScrollView) findViewById(R.id.hsv);
//        int x = (int) hsv.getScaleX();
//        int y = (int) sv.getScaleY();
//        program_image.setImageResource(MyData.sourceprograms[row][col]);
//        final Bitmap bt = BitmapFactory.decodeResource(getResources(),MyData.sourceprograms[row][col]);
//
//        Bitmap nbt = Bitmap.createScaledBitmap(bt , bt.getWidth() , bt.getHeight()  , true);
//        //program_image.setMaxHeight(bt.getHeight());
//        program_image.setImageBitmap(nbt);
//
//       /* Display display = getWindowManager().getDefaultDisplay();
//        Point size = new Point();
//        display.getSize(size);
//        int width = size.x;
//        int height = size.y;
//
//        program_image.setMinimumWidth(width);
//        program_image.setMinimumHeight(height);
//
//        program_image.setMaxWidth(width);
//        program_image.setMaxHeight(height);
//        program_image.setScaleType(ImageView.ScaleType.FIT_XY);*/
//
//        image_zoom=(ZoomControls)findViewById(R.id.zoomit);
//        image_zoom.setOnZoomInClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                //float x = program_image.getScaleX();
//                // float y =program_image.getScaleY();
//               /* float x1 = x;
//                float y1 = y;*/
//                w+=20;
//                h+=40;
//                Bitmap nbt = Bitmap.createScaledBitmap(bt , w, h  , true);
//                program_image.setImageBitmap(nbt);
//                //AbsoluteLayout.LayoutParams param = new AbsoluteLayout.LayoutParams(x+2, y+2, 0.0f, 0.0f);
//                //program_image.setScaleX((float) (x + 0.3));
//                //program_image.setScaleY((float) (y + 0.3));
//                //program_image.setLayoutParams(param);
//
//
//            }
//        });
//
//        image_zoom.setOnZoomOutClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int x =program_image.getWidth();
//                int y = program_image.getHeight();
//                w-=20;
//                h-=40;
//                if ((x==800)&&(y==400))
//                    return;
//                Bitmap nbt = Bitmap.createScaledBitmap(bt , w, h  , true);
//                program_image.setImageBitmap(nbt);
//
//                /*program_image.setScaleX((float) (x - 0.3));
//                program_image.setScaleY((float) (y - 0.3));*/
//            }
//        });
//    }
//    @Override
//    public boolean dispatchTouchEvent(MotionEvent event) {
//        super.dispatchTouchEvent(event);
//        scaleGestureDetector.onTouchEvent(event);
//        gestureDetector.onTouchEvent(event);
//        return gestureDetector.onTouchEvent(event);
//    }
//
//
//    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
//        @Override
//        public boolean onDown(MotionEvent e) {
//            return true;
//        }
//        // event when double tap occurs
//        @Override
//        public boolean onDoubleTap(MotionEvent e) {
//            // double tap fired.
//            return true;
//        }
//    }




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
    }
