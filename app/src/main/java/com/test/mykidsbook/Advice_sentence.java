package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Locale;

public class Advice_sentence extends AppCompatActivity {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private Button t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_advice_sentence);

        //initial id

        back=findViewById(R.id.advice_backID);
        t1=findViewById(R.id.advice_sen1);
        t2=findViewById(R.id.advice_sen2);
        t3=findViewById(R.id.advice_sen3);
        t4=findViewById(R.id.advice_sen4);
        t5=findViewById(R.id.advice_sen5);
        t6=findViewById(R.id.advice_sen6);
        t7=findViewById(R.id.advice_sen7);
        t8=findViewById(R.id.advice_sen8);
        t9=findViewById(R.id.advice_sen9);
        t10=findViewById(R.id.advice_sen10);
        t11=findViewById(R.id.advice_sen11);
        t12=findViewById(R.id.advice_sen12);
        t13=findViewById(R.id.advice_sen13);
        t14=findViewById(R.id.advice_sen14);
        t15=findViewById(R.id.advice_sen15);
        t16=findViewById(R.id.advice_sen16);
        t17=findViewById(R.id.advice_sen17);
        t18=findViewById(R.id.advice_sen18);
        t19=findViewById(R.id.advice_sen19);
        t20=findViewById(R.id.advice_sen20);


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


        //on click listener start here

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অসৎ সঙ্গ ত্যাগ করঅ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আলস্য দারিদ্রের লক্ষন।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইচ্ছা থাকিলে উপায় হয়।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঈদের খুশি সবার ঘরে।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("উগ্র স্বভাব ভাল নয়।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঊর্ধমুখে পথ চলিও না।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঋন করা ভাল নয়।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একতাই সুখের মূল।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঐশ্বর্য রক্ষা করা কঠিন।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওজন করঅ সঠিক ভাবে।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঔদার্য অতি মহৎ গুন।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কটু কথা বলিও না।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("খলের কথা বিশ্বাস করিও না।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গর্ব করা ভাল নয়।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঘনাগমে প্রবল বৃষ্টি হয়।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চন্দ্র কিরণ অতি মনোরম।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছলচাতুরি ভাল নয়।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জন্মভূমি মায়ের মত।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঝগড়া করা উচিত নয়।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("টাকার বড়াই ভাল নয়।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });



        // on click listener end here
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