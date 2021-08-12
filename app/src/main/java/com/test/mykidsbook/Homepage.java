package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.test.mykidsbook.watch_video.Video_list;
import com.test.mykidsbook.watch_video.WatchVideo;

import java.util.Locale;

public class Homepage extends AppCompatActivity {
    TextToSpeech textToSpeech;
    Animation top_animation,bottom_animation;
    Button read,see_vedio;
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_homepage);

        //initial id

        read=findViewById(R.id.readid);
        see_vedio=findViewById(R.id.see_vedioid);

        floatingActionButton=findViewById(R.id.exit_app);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });


        //set animation

        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        read.setAnimation(top_animation);
        see_vedio.setAnimation(bottom_animation);


        textToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==TextToSpeech.SUCCESS){
                    int result=textToSpeech.setLanguage(new Locale("bn_IN"));

                    if(result==TextToSpeech.LANG_MISSING_DATA
                            || result==TextToSpeech.LANG_NOT_SUPPORTED){
                        Log.e("TTS","Language not supported.");
                    }
                    else{

                    }
                }else{
                    Log.e("TTS","Initialization failed.");}
            }
        });

    }
    @Override
    protected void onDestroy() {
        if(textToSpeech != null){
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();

    }

    public void see_video(View view) {
        Intent intent=new Intent(Homepage.this, Video_list.class);
        startActivity(intent);
    }

    public void play_game(View view) {
        Intent intent=new Intent(Homepage.this, Game_Home.class);
        startActivity(intent);
    }

    public void read(View view) {
        Intent intent=new Intent(Homepage.this,Read_activity.class);
        startActivity(intent);
    }
}