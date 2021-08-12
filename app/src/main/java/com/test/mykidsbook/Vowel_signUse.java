package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.Locale;

public class Vowel_signUse extends AppCompatActivity {
    ImageView imageView;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_vowel_sign_use);
        imageView=findViewById(R.id.vowel_signBack);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
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

    public void akar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("সরায় য়া তে আ কার।",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void roshikar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("হ্রস্ব ই তে রশি কার।",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void dhirgikar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("দীর্ঘ ঈ তে দীর্ঘী কার।",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void rosukar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("হ্রস্ব ও তে হ্রস্বু কার।",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void dhirgukar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("দীর্ঘ ও তে দীর্ঘু কার।",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void rrikar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("রি তে রি কার।",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void ekar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("এয় তে এয় কার।",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void oikar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("অই তে অই কার।",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void ookar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("ওয়ু তে ওয়ু কার।",TextToSpeech.QUEUE_FLUSH,null);
    }

    public void owkar(View view) {
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("অও তে অও কার।",TextToSpeech.QUEUE_FLUSH,null);
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