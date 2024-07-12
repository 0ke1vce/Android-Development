/*

package com.example.planetappmasteringlistviewsandadapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapters extends BaseAdapter {

   private String []PlanetName;
   private String[]img;
   private String []PlanetMoons;
    private Context context;

    public CustomAdapters(String[] planetName, String[] img, String[] planetMoons, Context context) {
        PlanetName = planetName;
        this.img = img;
        PlanetMoons = planetMoons;
        this.context = context;
    }

    @Override
    public int getCount() {
        return PlanetName.length;
    }

    @Override
    public Object getItem(int i) {
        return PlanetName[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        viewholder holder;
        if(view==null) {
            view = LayoutInflater.from(context).inflate(R.layout.customlistview, viewGroup, false);
            holder = new viewholder();

            holder.planetName = view.findViewById(R.id.PlanetName);
            holder.NumberOfMoonText = view.findViewById(R.id.NumberOfMoon);
            holder.image = view.findViewById(R.id.Img);

            view.setTag(holder);
        }
         else{
            holder=(viewholder) view.getTag();
            holder.planetName.setText(PlanetName[i]);
            holder.NumberOfMoonText.setText(PlanetMoons[i]);
            holder.image= (ImageView) view.findViewById(R.id.Img);

        }
        holder.planetName.setText(PlanetName[i]);
        holder.NumberOfMoonText.setText(PlanetMoons[i]);
        holder.image= (ImageView) view.findViewById(R.id.Img);

        return view;
        }

    static class viewholder{
        TextView planetName;
        ImageView image;
        TextView NumberOfMoonText;


    }

    }




*/


