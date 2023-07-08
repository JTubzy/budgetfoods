package com.example.budgetfoods;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerView1Adapter extends RecyclerView.Adapter {
    String data1[],data2[];
    int images[];
    Context context;

    public RecyclerView1Adapter(Context ct, String[] s1, String s2[], int[] img){
        context=ct;
        data1=s1;
        data2=s2;
        images=img;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view;
    LayoutInflater inflater=LayoutInflater.from(context);
    view=inflater.inflate(R.layout.activity_homefoods,parent,false);
    return new ViewHolderClass(view);
//        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_home_details,parent,false);
//        ViewHolderClass viewHolderClass=new ViewHolderClass(view);
//        return new ViewHolderClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderClass viewHolderClass = (ViewHolderClass) holder;
        viewHolderClass.imageView.setImageResource(Data.images[position]);
        viewHolderClass.Price.setText(data1[position]);
        viewHolderClass.description.setText(data2[position]);
//        viewHolderClass.Add.setOnClickListener();
    }
////        viewHolderClass.itemView.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Intent intent=new Intent(context,DOCTORS.class);
////                intent.putExtra("data1",data1[position]);
////                intent.putExtra("myImage",images[position]);
////                context.startActivity(intent);
//
//            }
//        });
//    }

    @Override
    public int getItemCount() {
        return images.length;
    }
    public  class ViewHolderClass extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView Price;
        TextView description;
        Button Add;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_food);
            description=itemView.findViewById(R.id.descp);
            Price=itemView.findViewById(R.id.prices);
            Add=itemView.findViewById(R.id.addfood);
        }
    }
}
