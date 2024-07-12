package com.example.basicsofadapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;   //Refers to the object that provide access to various resources and service within the application environment .
    //It act as a bridge between application code and Android OS allowing you to interact with system, access resources and perfrom various task.
    private String[] items;

    public CustomAdapter( Context context,String[] items) {
        this.items = items;
        this.context = context;
    }


    @Override
    public int getCount() {   // Returns the number of items in our data source
        return items.length;
    }

    @Override
    public Object getItem(int i) {  //Return the data item at a specific position within your data. It's use for getting data for particular view
        return items[i];
    }

    @Override
    public long getItemId(int i) {  //Return a unique Identifier for the item at given position. it just need to be unique
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {   //Display the data at a position in data set
        ViewHolder holder = null;
        if(view==null){
//            view: it is a recyled view that you can reuse to improve the performance of your list
            view= LayoutInflater.from(context).inflate(R.layout.my_list_view,viewGroup,false);
            holder = new ViewHolder();
            holder.textView = view.findViewById(R.id.textView);
            view.setTag(holder);

        }
        else{
//            Reusing the view
            holder=(ViewHolder) view.getTag();
            holder.textView.setText(items[i]);
        }

//        Setting data to the view
       holder.textView.setText(items[i]);

//        Binding data to the view within view
//        Displays the data at a position in data set
                return view;
    }





    static class ViewHolder{   //Holds reference to teh views within an item layout
//   Recyclibilty and reusabilty of code and optimized scrolling operations
        TextView textView;

    }



}
