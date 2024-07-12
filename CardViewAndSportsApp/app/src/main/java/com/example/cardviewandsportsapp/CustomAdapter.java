package com.example.cardviewandsportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewholder>{
    private List<CardModelClass>sportlst;

    public ClickListener clickListener;
    public void setClickListener(ClickListener clickListener){
            this.clickListener=clickListener;
    }



    public CustomAdapter(List<CardModelClass> sportlst) {
        this.sportlst = sportlst;
    }




    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,parent,false);
        return new viewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        CardModelClass card=sportlst.get(position);
        holder.image.setImageResource(card.getImage());
        holder.text.setText(card.getTitle());

    }

    @Override
    public int getItemCount() {
        return sportlst.size();
    }




    public class viewholder extends  RecyclerView.ViewHolder  implements View.OnClickListener{
                ImageView image;
                TextView text;


        public viewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.Image);
            text=itemView.findViewById(R.id.text);
            itemView.setOnClickListener(this);


        }
        public void onClick(View view) {
            if(clickListener!=null){
                clickListener.onClick(view,getAdapterPosition());
            }
        }

    }


}
