package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import com.test.mykidsbook.game.Level1;
import com.test.mykidsbook.game.Voice_game1;

public class Game_Home extends AppCompatActivity {
  private LinearLayout lin1,lin2;
  private Animation top_animation,bottom_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game__home);

        //initial id

        lin1=findViewById(R.id.game_home_lin1);
        lin2=findViewById(R.id.game_home_lin2);

        //set animation

        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        lin1.setAnimation(top_animation);
        lin2.setAnimation(bottom_animation);

        //set on click listener

        lin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Game_Home.this, Level1.class);
                startActivity(it);
            }
        });
        lin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Game_Home.this, Voice_game1.class);
                startActivity(it);
            }
        });

    }
}