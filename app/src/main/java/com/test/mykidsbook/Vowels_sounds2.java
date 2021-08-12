package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class Vowels_sounds2 extends AppCompatActivity {
    ImageView back;
    Button v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11;
    TextToSpeech textToSpeech;
    TextView refresh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_vowels_sounds2);

        //initialisation button

        back=findViewById(R.id.back1_sounds);
        v1=findViewById(R.id.vowel1);
        v2=findViewById(R.id.vowel2);
        v3=findViewById(R.id.vowel3);
        v4=findViewById(R.id.vowel4);
        v5=findViewById(R.id.vowel5);
        v6=findViewById(R.id.vowel6);
        v7=findViewById(R.id.vowel7);
        v8=findViewById(R.id.vowel8);
        v9=findViewById(R.id.vowel9);
        v10=findViewById(R.id.vowel10);
        v11=findViewById(R.id.vowel11);

        refresh=findViewById(R.id.refresh_vowels);

        //textToSpeech Coding

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
                        textToSpeech.speak("সরে য়। সরায় য়া। হ্রস্ব ই। দীর্ঘ ঈ। হ্রস্ব ওয়ু। দীর্ঘ ওয়ু। রি । এয়। অই। ওয়ু। অও।",TextToSpeech.QUEUE_FLUSH,null);

                    }
                }else{
                    Log.e("TTS","Initialization failed.");}
            }
        });


        //on click listener start

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সরে য়। সরায় য়া। হ্রস্ব ই। দীর্ঘ ঈ। হ্রস্ব ওয়ু। দীর্ঘ ওয়ু। রি । এয়। অই। ওয়ু। অও।",TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সরে য়",TextToSpeech.QUEUE_FLUSH,null);


            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সরায় য়া",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হ্রস্ব ই",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দীর্ঘ ঈ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হ্রস্ব ওয়ু",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দীর্ঘ ওয়ু",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রি",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এয়",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        v9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অই",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওয়ু",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        v11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অও",TextToSpeech.QUEUE_FLUSH,null);

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

}