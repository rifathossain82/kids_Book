package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Locale;

public class consonents extends AppCompatActivity {
    ImageView back;
    Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_consonents);

        //initialisation all id

        back=findViewById(R.id.back3);
        c1=findViewById(R.id.consonent1);
        c2=findViewById(R.id.consonent2);
        c3=findViewById(R.id.consonent3);
        c4=findViewById(R.id.consonent4);
        c5=findViewById(R.id.consonent5);
        c6=findViewById(R.id.consonent6);
        c7=findViewById(R.id.consonent7);
        c8=findViewById(R.id.consonent8);
        c9=findViewById(R.id.consonent9);
        c10=findViewById(R.id.consonent10);
        c11=findViewById(R.id.consonent11);
        c12=findViewById(R.id.consonent12);
        c13=findViewById(R.id.consonent13);
        c14=findViewById(R.id.consonent14);
        c15=findViewById(R.id.consonent15);
        c16=findViewById(R.id.consonent16);
        c17=findViewById(R.id.consonent17);
        c18=findViewById(R.id.consonent18);
        c19=findViewById(R.id.consonent19);
        c20=findViewById(R.id.consonent20);
        c21=findViewById(R.id.consonent21);
        c22=findViewById(R.id.consonent22);
        c23=findViewById(R.id.consonent23);
        c24=findViewById(R.id.consonent24);
        c25=findViewById(R.id.consonent25);
        c26=findViewById(R.id.consonent26);
        c27=findViewById(R.id.consonent27);
        c28=findViewById(R.id.consonent28);
        c29=findViewById(R.id.consonent29);
        c30=findViewById(R.id.consonent30);
        c31=findViewById(R.id.consonent31);
        c32=findViewById(R.id.consonent32);
        c33=findViewById(R.id.consonent33);
        c34=findViewById(R.id.consonent34);
        c35=findViewById(R.id.consonent35);
        c36=findViewById(R.id.consonent36);
        c37=findViewById(R.id.consonent37);
        c38=findViewById(R.id.consonent38);
        c39=findViewById(R.id.consonent39);
        c40=findViewById(R.id.consonent40);

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
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",1);
                startActivity(it);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("খঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",2);
                startActivity(it);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",3);
                startActivity(it);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঘঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",4);
                startActivity(it);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",5);
                startActivity(it);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",6);
                startActivity(it);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",7);
                startActivity(it);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বর্গীয় জঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",8);
                startActivity(it);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঝঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",9);
                startActivity(it);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঞঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",10);
                startActivity(it);
            }
        });
       c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("টঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",11);
                startActivity(it);
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঠঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",12);
                startActivity(it);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",13);
                startActivity(it);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঢহঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",14);
                startActivity(it);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মূর্ধন্য ণঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",15);
                startActivity(it);
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",16);
                startActivity(it);
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("থঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",17);
                startActivity(it);
            }
        });
        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",18);
                startActivity(it);
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ধঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",19);
                startActivity(it);
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("নঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",20);
                startActivity(it);
            }
        });
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",21);
                startActivity(it);
            }
        });
        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",22);
                startActivity(it);
            }
        });
        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",23);
                startActivity(it);
            }
        });
        c24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ভঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",24);
                startActivity(it);
            }
        });
        c25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",25);
                startActivity(it);
            }
        });
        c26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("যঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",26);
                startActivity(it);
            }
        });
        c27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",27);
                startActivity(it);
            }
        });
        c28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",28);
                startActivity(it);
            }
        });
        c29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("শঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",29);
                startActivity(it);
            }
        });
        c30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ষঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",30);
                startActivity(it);
            }
        });
        c31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",31);
                startActivity(it);
            }
        });
        c32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",32);
                startActivity(it);
            }
        });
        c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ক্ষঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",33);
                startActivity(it);
            }
        });
        c34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ড়অ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",34);
                startActivity(it);
            }
        });
        c35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঢ়অ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",35);
                startActivity(it);
            }
        });
        c36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অন্তস্তিয়",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",36);
                startActivity(it);
            }
        });
        c37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("খন্ড তঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",37);
                startActivity(it);
            }
        });
        c38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অনেষ্বর",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",38);
                startActivity(it);
            }
        });
        c39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বিশজ্ঞঅ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",39);
                startActivity(it);
            }
        });
        c40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চন্দ্র বিন্দু",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test11.class);
                it.putExtra("value",40);
                startActivity(it);
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