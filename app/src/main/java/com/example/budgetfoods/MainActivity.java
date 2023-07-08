package com.example.budgetfoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH=5000;
    //variables
    Animation top,bottom;
    ImageView image;
    TextView text;
    TextView motto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        top = AnimationUtils.loadAnimation(this, R.anim.top_animat);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom_animat);
        image = findViewById(R.id.logo);




        image.setAnimation(top);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Authentication.class);
                startActivity(intent);
                finish();
            }
        },SPLASH);
    }

}

