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

public class Arbi_numbers extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_arbi_numbers);

        //find id
        imageView=findViewById(R.id.arbin_backID);
        t1=findViewById(R.id.arbin1);
        t2=findViewById(R.id.arbin2);
        t3=findViewById(R.id.arbin3);
        t4=findViewById(R.id.arbin4);
        t5=findViewById(R.id.arbin5);
        t6=findViewById(R.id.arbin6);
        t7=findViewById(R.id.arbin7);
        t8=findViewById(R.id.arbin8);
        t9=findViewById(R.id.arbin9);
        t10=findViewById(R.id.arbin10);

        //set onclick listener
        imageView.setOnClickListener(this);
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
            case R.id.arbin_backID:
               onBackPressed();
                break;
            case R.id.arbin1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওয়াহেদ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.arbin2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইছনান", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.arbin3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছালাছা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.arbin4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আরবা'আ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.arbin5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("খামছা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.arbin6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সিত্তা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.arbin7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছাব'আ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.arbin8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছামানিয়া", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.arbin9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তিছ'আ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.arbin10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আ'শারা", TextToSpeech.QUEUE_FLUSH, null);
                break;
        }
    }
}