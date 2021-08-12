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

public class Some_national_sub extends AppCompatActivity implements View.OnClickListener {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_some_national_sub);

        //find id
        back=findViewById(R.id.national_sub_backID);
        t1=findViewById(R.id.national_sub1);
        t2=findViewById(R.id.national_sub2);
        t3=findViewById(R.id.national_sub3);
        t4=findViewById(R.id.national_sub4);
        t5=findViewById(R.id.national_sub5);
        t6=findViewById(R.id.national_sub6);
        t7=findViewById(R.id.national_sub7);
        t8=findViewById(R.id.national_sub8);
        t9=findViewById(R.id.national_sub9);
        t10=findViewById(R.id.national_sub10);
        t11=findViewById(R.id.national_sub11);
        t12=findViewById(R.id.national_sub12);
        t13=findViewById(R.id.national_sub13);
        t14=findViewById(R.id.national_sub14);

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
        t11.setOnClickListener(this);
        t12.setOnClickListener(this);
        t13.setOnClickListener(this);
        t14.setOnClickListener(this);

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
            case R.id.national_sub_backID:
                onBackPressed();
                break;
            case R.id.national_sub1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বিশ্ব কবি রবীন্দ্রনাথ ঠাকুর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় কবি কাজী নজরুল ইসলাম", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের মানচিত্রঅ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় সংসদ ভবন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় জাদুঘর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় স্মৃতিসৌধ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় মসজিদ বায়তুল মোকাররম ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় ফুল শাপলা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় ফল কাঠাল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় পাখি দোয়েল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub11:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় মাছ ইলিশ ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub12:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় পশু রয়েল বেঙ্গল টাইগার", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub13:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাতীয় পতাকা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.national_sub14:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কেন্দীয় শহীদ মিনার", TextToSpeech.QUEUE_FLUSH, null);
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