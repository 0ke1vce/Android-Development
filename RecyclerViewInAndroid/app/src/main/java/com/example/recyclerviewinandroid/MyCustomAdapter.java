package com.example.recyclerviewinandroid;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.viewholder> {
            private List<ItemModelClass> itemList;


            public ItemClickListener clickListener;
            public void setOnClickListener(ItemClickListener myclickListener){
                this.clickListener=myclickListener;
            }





    public MyCustomAdapter(List<ItemModelClass> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//         Responsible for creating new vieholder for your items

        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
//        LAyoutInflator class is used to create a view hierarchy from XML layout
//        It's essential part of building UI components allowing you to convert XML layout definitions into actual view objects that can be displayed on the screen.

        return new viewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
//        Binds the data from your dataset tp the views within the viewholder
// Called by recycle view when an item is about to be displayed on the screen.
//      This method was created and returned by onCreateViewHolder() method.
// You use this holder to access and manipulate the views within item layout.
// Its called when new item is scrolled onto the screen or when the contents of an item need to be updated
        ItemModelClass item=itemList.get(position);
        holder.txt.setText(item.getItemName());
        holder.txtdesc.setText(item.getItemDescription());
        holder.img.setImageResource(item.getItemImage());

    }

    @Override
    public int getItemCount() {
//        Returns total number of item in dataset

        return itemList.size();

    }


    public  class viewholder  extends RecyclerView.ViewHolder implements View.OnClickListener{

        //           Holds reference to the views within item layout
        ImageView img;
        TextView txt;
        TextView txtdesc;


       public viewholder(@NonNull View itemView) {
           super(itemView);
           img=itemView.findViewById(R.id.Imageview);
           txt=itemView.findViewById(R.id.titletext);
           txtdesc=itemView.findViewById(R.id.descriptiontext);

           itemView.setOnClickListener(this);
       }

        @Override
        public void onClick(View view) {  // It is commonly use to handle click events on various UI element
            if(clickListener!=null){
                clickListener.onClick(view,getAdapterPosition());
            }
        }
    }

}
