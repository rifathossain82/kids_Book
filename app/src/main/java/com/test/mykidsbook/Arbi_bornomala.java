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

public class Arbi_bornomala extends AppCompatActivity {
    ImageView imageView;

    Animation top_animation,bottom_animation;
    Button arbi_ani1,arbi_ani2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_arbi_bornomala);

        arbi_ani1=findViewById(R.id.arbi_aniid1);
        arbi_ani2=findViewById(R.id.arbi_aniid2);

        //set animation

        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        arbi_ani1.setAnimation(top_animation);
        arbi_ani2.setAnimation(bottom_animation);

        imageView=findViewById(R.id.arbi_bornomala_backID);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              onBackPressed();
            }
        });
    }

    public void arbi_bornomal_method(View view) {
        Intent te=new Intent(getApplicationContext(),Horof.class);
        startActivity(te);
    }

    public void arbi_number_method(View view) {
       Intent te=new Intent(getApplicationContext(),Arbi_numbers.class);
      startActivity(te);
    }


}