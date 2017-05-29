package com.ocean.adapterwork;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;



import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ProgramNames extends AppCompatActivity  {
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] dataSet;
    private static RecyclerView recyclerView;
    private static ArrayList<String> data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        int position = intent.getExtras().getInt("pos");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        myOnClickListener = new MyOnClickListener(this);
        MyData.pos=position;
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        //recyclerView.setHasFixedSize(true);
        Log.e("val",String.valueOf(position));
        this.setTitle(MyData.nameArray[position]);
        layoutManager = new LinearLayoutManager(this);
        //  layoutManager.setMeasuredDimension(200,300);
        recyclerView.setLayoutManager(layoutManager);
        // recyclerView.setItemAnimator(new DefaultItemAnimator());
        //recyclerView.addOnItemTouchListener(new RecyclerItemListener());



        adapter = new CusAdapter(MyData.programs[position]);
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
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        super.onCreateOptionsMenu(menu);
//        //getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        super.onOptionsItemSelected(item);
////        if (item.getItemId() == R.id.add_item) {
////            //check if any items to add
////            if (removedItems.size() != 0) {
////                addRemovedItemToList();
////            } else {
////                Toast.makeText(this, "Nothing to add", Toast.LENGTH_SHORT).show();
////            }
////        }
//        return true;
//    }

//    public static class MyViewHolder extends RecyclerView.ViewHolder {
//
//        RecyclerView recyclerView;
//        ImageView viewprogramoutput;
//        Context context;
//        TextView getDescription;
//
//
//        public MyViewHolder(View itemView) {
//            super(itemView);
//            context = itemView.getContext();
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                      Log.d("RecyclerViews", "onClicks：" + getPosition());
//                    Intent intent = null;
//                    intent =  new Intent(context, Programs.class);
//                    intent.putExtra("pos",getPosition());
//                    context.startActivity(intent);
//                }
//            });
//
//            this.viewprogramoutput=(ImageView)itemView.findViewById(R.id.output);
//            this.getDescription=(TextView)itemView.findViewById(R.id.program_description);
//            this.recyclerView=(RecyclerView)itemView.findViewById(R.id.my_recycler_view);
//
//        }
//    }


}

