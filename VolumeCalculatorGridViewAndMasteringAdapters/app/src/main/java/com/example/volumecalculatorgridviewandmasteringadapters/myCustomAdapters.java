package com.example.volumecalculatorgridviewandmasteringadapters;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myCustomAdapters extends ArrayAdapter<ModelClass> {
        private ArrayList<ModelClass> shapes;
        Context context;

    public myCustomAdapters(ArrayList<ModelClass> shapes, Context context) {
        super(context, R.layout.my_grid_view,shapes);
        this.shapes = shapes;
        this.context = context;
    }

private static class viewholder{
        ImageView image;
        TextView text;
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                ModelClass SHAPES=getItem(position);
                viewholder holder;

                if(convertView==null){

                        holder=new viewholder();
                    LayoutInflater inflater=LayoutInflater.from(getContext());
                    convertView=inflater.inflate(R.layout.my_grid_view,parent,false);


                    holder.text=(TextView)convertView.findViewById(R.id.Text);
                    holder.image=(ImageView) convertView.findViewById(R.id.Image);


                    convertView.setTag(holder);
                }
                else{
//                     Reusing the view
                    holder=(viewholder)convertView.getTag();

                }

//                Getting data from model class
                holder.text.setText(SHAPES.getShapename());
                holder.image.setImageResource(SHAPES.getShapeimage());

                return convertView;

    }
}
