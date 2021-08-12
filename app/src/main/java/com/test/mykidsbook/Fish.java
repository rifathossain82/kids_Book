package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Locale;

public class Fish extends AppCompatActivity implements View.OnClickListener {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fish);

        //find id
        back=findViewById(R.id.fish_backID);
        t1=findViewById(R.id.fish1);
        t2=findViewById(R.id.fish2);
        t3=findViewById(R.id.fish3);
        t4=findViewById(R.id.fish4);
        t5=findViewById(R.id.fish5);
        t6=findViewById(R.id.fish6);
        t7=findViewById(R.id.fish7);
        t8=findViewById(R.id.fish8);
        t9=findViewById(R.id.fish9);
        t10=findViewById(R.id.fish10);

        //set onclick listener
        back.setOnClickListener(this);
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        t5.setOnClickListener(this);
        t6.setOnClickListener(this);
        t7.setOnClickListener(this);
        t8.setOnClickListener(this);
        t9.setOnClickListener(this);
        t10.setOnClickListener(this);

        //textToSpeech Coding
        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = textToSpeech.setLanguage(new Locale("bn_IN"));

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported.");
                    } else {

                    }
                } else {
                    Log.e("TTS", "Initialization failed.");
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fish_backID:
                onBackPressed();
                break;
            case R.id.fish1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ক্যাটফিশ অর্থ মাগুর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fish2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গ্রাসকার্প অর্থ গ্রাসকার্প ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fish3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ক্লাওন নাইফ অর্থ চিতল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fish4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("স্নেকহেড অর্থ টাকি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fish5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হিলসা অর্থ ইলিশ ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fish6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কাতলা অর্থ কাতলা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fish7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ক্লাইম্বিং পের্চ অর্থ কই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fish8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মেনোডা ক্যাটফিশ অর্থ টেংরা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fish9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("প্রাওন অর্থ চিংড়ি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fish10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তেলাপিয়া অর্থ তেলাপিয়া", TextToSpeech.QUEUE_FLUSH, null);
                break;
        }
    }
    @Override
    protected void onDestroy() {
        if(textToSpeech != null){
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }


}