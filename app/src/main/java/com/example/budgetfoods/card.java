
package com.example.budgetfoods;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class card extends AppCompatActivity {
    //for strings on the recycler view
    String s1[], s2[];
    //insert the image ids
    RecyclerView recyclerView;
    int images[]={R.drawable.burgers,R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,R.drawable.food7,R.drawable.food8,R.drawable.food9,R.drawable.food10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        recyclerView = findViewById(R.id.recyclerview11);
        s2= getResources().getStringArray(R.array.orders);
        s1 = getResources().getStringArray(R.array.description);

        RecyclerView1Adapter recyclerView1Adapter= new RecyclerView1Adapter(this,s1,s2,images);
        recyclerView.setAdapter(recyclerView1Adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

    }
}

//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment

//        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getActivity());
//        //recyclerView.setLayoutManager(new LinearLayoutManager(getActivity());
//        recyclerView.setAdapter(myadapter);
//        recyclerView.setLayoutManager(linearLayoutManager);
//
//        return view;
//    }
//RecyclerView myrv1=(RecyclerView) findViewById(R.id.recyclerview1);
//    RecyclerView1Adapter myadapter = new RecyclerView1Adapter(home.this, s1, images);
//    GridLayoutManager layoutManager=new GridLayoutManager(this,2);
//        myrv1.setLayoutManager(new GridLayoutManager(this,2));
//                myrv1.setAdapter(myadapter);
//}