package com.ocean.adapterwork;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<String> data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myOnClickListener = new MyOnClickListener(this);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        //recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
      //  layoutManager.setMeasuredDimension(200,300);
        recyclerView.setLayoutManager(layoutManager);
       // recyclerView.setItemAnimator(new DefaultItemAnimator());

//recyclerView.addOnItemTouchListener(new RecyclerItemListener());



        adapter = new CustomAdapter(MyData.nameArray);
        recyclerView.setAdapter(adapter);
    }


    private static class MyOnClickListener implements View.OnClickListener {

        private final Context context;

        private MyOnClickListener(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            //removeItem(v);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
//        if (item.getItemId() == R.id.add_item) {
//            //check if any items to add
//            if (removedItems.size() != 0) {
//                addRemovedItemToList();
//            } else {
//                Toast.makeText(this, "Nothing to add", Toast.LENGTH_SHORT).show();
//            }
//        }
        return true;
    }



}
