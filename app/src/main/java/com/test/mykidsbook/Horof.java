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

public class Horof extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_horof);

        //find id
        imageView=findViewById(R.id.an_backID);
        t1=findViewById(R.id.an1);
        t2=findViewById(R.id.an2);
        t3=findViewById(R.id.an3);
        t4=findViewById(R.id.an4);
        t5=findViewById(R.id.an5);
        t6=findViewById(R.id.an6);
        t7=findViewById(R.id.an7);
        t8=findViewById(R.id.an8);
        t9=findViewById(R.id.an9);
        t10=findViewById(R.id.an10);
        t11=findViewById(R.id.an11);
        t12=findViewById(R.id.an12);
        t13=findViewById(R.id.an13);
        t14=findViewById(R.id.an14);
        t15=findViewById(R.id.an15);
        t16=findViewById(R.id.an16);
        t17=findViewById(R.id.an17);
        t18=findViewById(R.id.an18);
        t19=findViewById(R.id.an19);
        t20=findViewById(R.id.an20);
        t21=findViewById(R.id.an21);
        t22=findViewById(R.id.an22);
        t23=findViewById(R.id.an23);
        t24=findViewById(R.id.an24);
        t25=findViewById(R.id.an25);
        t26=findViewById(R.id.an26);
        t27=findViewById(R.id.an27);
        t28=findViewById(R.id.an28);
        t29=findViewById(R.id.an29);

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
        t11.setOnClickListener(this);
        t12.setOnClickListener(this);
        t13.setOnClickListener(this);
        t14.setOnClickListener(this);
        t15.setOnClickListener(this);
        t16.setOnClickListener(this);
        t17.setOnClickListener(this);
        t18.setOnClickListener(this);
        t19.setOnClickListener(this);
        t20.setOnClickListener(this);
        t21.setOnClickListener(this);
        t22.setOnClickListener(this);
        t23.setOnClickListener(this);
        t24.setOnClickListener(this);
        t25.setOnClickListener(this);
        t26.setOnClickListener(this);
        t27.setOnClickListener(this);
        t28.setOnClickListener(this);
        t29.setOnClickListener(this);


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
            case R.id.an_backID:
             onBackPressed();
                break;
            case R.id.an1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আলিফ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বা'", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তা'", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছা'", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জীম", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হা'", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("খা'", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দাল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("যাল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রা'", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an11:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("যা'", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an12:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সিন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an13:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("শিন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an14:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছোয়াদ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an15:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দোয়াদ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an16:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ত্বোয়া", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an17:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("যোয়া", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an18:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আঈন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an19:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গাঈন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an20:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an21:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ক্বফ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an22:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কাফ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an23:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লাম", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an24:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মীম", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an25:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("নূন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an26:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওয়াও", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an27:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an28:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হামযা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.an29:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইয়া", TextToSpeech.QUEUE_FLUSH, null);
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