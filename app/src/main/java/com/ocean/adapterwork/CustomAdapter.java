package com.ocean.adapterwork;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.progress;
import static android.R.attr.value;
import static android.support.v4.content.ContextCompat.startActivity;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private static RecyclerView.Adapter adapter;
    private String[] dataSet;
private String[] name;


    private static CardView cardview;




    public static class MyViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;
        TextView textViewVersion;
        Context context;

        public MyViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   Log.d("RecyclerView", "onClick：" + getPosition());
                     Intent intent = null;
                            intent =  new Intent(context, ProgramNames.class);
                    intent.putExtra("pos",getPosition());
                    context.startActivity(intent);
                }
            });

            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.recyclerView=(RecyclerView)itemView.findViewById(R.id.my_recycler_view);

    }
    }


    public CustomAdapter(String[] data) {
        this.dataSet = data;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_card_view,parent,false);

        view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
        //recyclerView = (RecyclerView)holder.findView(R.id.recycler);
      /*holder.recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "Recycle Click" + listPosition, Toast.LENGTH_SHORT).show();
            }
        });*/
        TextView textViewVersion = holder.textViewVersion;
        textViewVersion.setText(dataSet[listPosition].toString());
    }

    @Override
    public int getItemCount() {
        return dataSet.length;
    }
}