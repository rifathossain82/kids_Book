package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Locale;

public class Vowels extends AppCompatActivity {
    ImageView back;
    Button v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_vowels);

        //initialisation button

        back=findViewById(R.id.back1);
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
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সরে য়",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",41);
                startActivity(it);
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সরায় য়া",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",42);
                startActivity(it);
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হ্রস্ব ই",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",43);
                startActivity(it);
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দীর্ঘ ঈ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",44);
                startActivity(it);
            }
        });
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হ্রস্ব ওয়ু",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",45);
                startActivity(it);
            }
        });
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দীর্ঘ ওয়ু",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",46);
                startActivity(it);
            }
        });
        v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রি",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",47);
                startActivity(it);
            }
        });
        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এয়",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",48);
                startActivity(it);
            }
        });
        v9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অই",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",49);
                startActivity(it);
            }
        });
        v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওয়ু",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",50);
                startActivity(it);
            }
        });
        v11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অও",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",51);
                startActivity(it);
            }
        });

        //on click listener end
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