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

public class Consonent_sounds extends AppCompatActivity {
    ImageView back;
    Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40;
    TextToSpeech textToSpeech;
    TextView refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_consonent_sounds);

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

        refresh=findViewById(R.id.consonent_sounds_refresh);

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
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("কঅ। খঅ। গঅ। ঘঅ। ওঅ। চঅ। ।।" +
                                " ছঅ। বর্গীয় জঅ। ঝঅ। ঞঅ। টঅ। ঠঅ। ডঅ। ঢহঅ। ।।" +
                                " মূর্ধন্য ণঅ। তঅ। থঅ। দঅ। ধঅ। নঅ। পঅ। ।।" +
                                " ফঅ। বঅ। ভঅ। মঅ। যঅ। " +
                                "রঅ। লঅ। শঅ। ষঅ। সঅ। হঅ। ক্ষঅ। ড়অ। ঢ়অ।  ।। " +
                                "অন্তস্তিয়। খন্ড তঅ। অনেষ্বর। বিশজ্ঞঅ। চন্দ্র বিন্দু চাঁদ ।",TextToSpeech.QUEUE_FLUSH,null);
                    }
                }else{
                    Log.e("TTS","Initialization failed.");}
            }
        });

        //on click listener start

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কঅ। খঅ। গঅ।   ঘঅ। ওঅ। চঅ। ।।" +
                        " ছঅ। বর্গীয় জঅ। ঝঅ।   ঞঅ। টঅ। ঠঅ। ডঅ। ঢহঅ। ।।" +
                        " মূর্ধন্য ণঅ। তঅ।   থঅ। দঅ। ধঅ। নঅ। পঅ। ।।" +
                        " ফঅ। বঅ। ভঅ। মঅ। যঅ। " +
                        "রঅ। লঅ। শঅ। ষঅ।  সঅ। হঅ। ক্ষঅ। ড়অ। ঢ়অ।  ।। " +
                        "অন্তস্তিয়। খন্ড তঅ।  অনেষ্বর। বিশজ্ঞঅ। চন্দ্র বিন্দু চাঁদ ।",TextToSpeech.QUEUE_FLUSH,null);

            }
        });

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
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("খঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঘঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বর্গীয় জঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঝঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঞঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("টঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঠঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঢহঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মূর্ধন্য ণঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("থঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ধঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("নঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ভঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("যঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("শঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ষঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ক্ষঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ড়অ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঢ়অ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অন্তস্তিয়",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("খন্ড তঅ",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অনেষ্বর",TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        c39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বিশজ্ঞঅ",TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        c40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চন্দ্র বিন্দু",TextToSpeech.QUEUE_FLUSH,null);

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