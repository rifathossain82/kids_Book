package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Fourits_introduce extends AppCompatActivity {
    ImageView imageView;
    Animation top_animation,bottom_animation;
    Button flowerAni,vegAni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fourits_introduce);

        flowerAni=findViewById(R.id.flower_aniID);
        vegAni=findViewById(R.id.veg_aniID);

        //set animation

        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        flowerAni.setAnimation(top_animation);
        vegAni.setAnimation(bottom_animation);

        imageView=findViewById(R.id.fruit_intro_backID);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void fruit(View view) {
        Intent it=new Intent(getApplicationContext(),Fruit.class);
        startActivity(it);
    }

    public void flower(View view) {
        Intent it=new Intent(getApplicationContext(),Flowers.class);
       startActivity(it);
    }

    public void vegetables(View view) {
        Intent it=new Intent(getApplicationContext(),vegetables.class);
        startActivity(it);
    }


}