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

public class Poem extends AppCompatActivity {
    ImageView imageView;
    Button bd_poem,eng_poem;
    Animation top_animation,bottom_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_poem);

        //initial all id

        bd_poem=findViewById(R.id.bd_poemID);
        eng_poem=findViewById(R.id.eng_poemID);

        //set animation

        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        bd_poem.setAnimation(top_animation);
        eng_poem.setAnimation(bottom_animation);

        imageView=findViewById(R.id.poem_backID);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });
    }

    public void bangla_poem(View view) {
        Intent it=new Intent(getApplicationContext(),Bangla_poem.class);
        startActivity(it);
    }

    public void english_poem(View view) {
     Intent it=new Intent(getApplicationContext(),English_poem.class);
     startActivity(it);

    }

}