package com.example.planetappmasteringlistviewsandadapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyCustomAdapter  extends ArrayAdapter<PlanetModelClass> {

//Using Custom Layout-----> My custom adapter
//    Using Custom objects----> extends ArrayAdapter<PlanetModalClass>

    private ArrayList<PlanetModelClass> planetArrayList;
    Context context;

//    Constructor
    public MyCustomAdapter( ArrayList<PlanetModelClass> planetArrayList, Context context) {
        super(context, R.layout.customlistview,planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }

// View Holder Class-:  USed to cache reference to the views within an item layout so that they don't need to be repeatedly looked up during scrolling
    private  static class MyViewHolder{
        TextView planet;
        TextView moon;
        ImageView planetImages;
}

// getView()-: use to create and return a view for a specific item in a list. part of ArrayAdapter class
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//      1-   Get the Planet object for current position
        PlanetModelClass PLANET=getItem(position);
//        PLANET object contains the data that need to be displayed in the view

//        2-INFLATE the layout
        MyViewHolder holder;
        final View result;


        if(convertView==null){
            holder =new MyViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.customlistview,parent,false);
//             The three parameters indicate 1- Custom layout 2-Parent Layout 3- false indicate do not attach to root right away

//          Finding the views
            holder.planet=(TextView) convertView.findViewById(R.id.PlanetName);
            holder.moon=(TextView) convertView.findViewById(R.id.NumberOfMoon);
            holder.planetImages=(ImageView) convertView.findViewById(R.id.Img);
            result=convertView;

            convertView.setTag(holder);
//            Set teg method use to attach any arbitary object to the view object

        }
        else{  // case for recycling or reusing the view
//            When the view is recycled, you can retrieve the associcated view holder using gettag method
            holder=(MyViewHolder) convertView.getTag();
            result =convertView;
//            GetTag() is use to retrieve an object that was previously set as a tag using setTag() on view object
        }

//        Getting Data from Model Class
        holder.planet.setText(PLANET.getPlanet());
        holder.moon.setText(PLANET.getMoon());
        holder.planetImages.setImageResource(PLANET.getPlanetImage());

        return  result;

    }
}
