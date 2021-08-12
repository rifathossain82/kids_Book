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

public class Animals_intruduce extends AppCompatActivity {
    ImageView imageView;
    Animation top_animation,bottom_animation;
    Button animal_ani,fish_ani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animals_intruduce);


        animal_ani=findViewById(R.id.animals_aniID);
        fish_ani=findViewById(R.id.fish_aniID);

        //set animation

        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        animal_ani.setAnimation(top_animation);
        fish_ani.setAnimation(bottom_animation);

        imageView=findViewById(R.id.ani_intro_backID);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void jibjontu(View view) {
        Intent it=new Intent(getApplicationContext(),Animals.class);
        startActivity(it);
    }

    public void bird_method(View view) {
        Intent it=new Intent(getApplicationContext(),Bird.class);
        startActivity(it);
    }

    public void fish_method(View view) {
        Intent it=new Intent(getApplicationContext(),Fish.class);
        startActivity(it);
    }

}