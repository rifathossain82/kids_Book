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

public class Bird extends AppCompatActivity implements View.OnClickListener {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bird);

        //find id
        back=findViewById(R.id.bird_backID);
        t1=findViewById(R.id.bird1);
        t2=findViewById(R.id.bird2);
        t3=findViewById(R.id.bird3);
        t4=findViewById(R.id.bird4);
        t5=findViewById(R.id.bird5);
        t6=findViewById(R.id.bird6);
        t7=findViewById(R.id.bird7);
        t8=findViewById(R.id.bird8);
        t9=findViewById(R.id.bird9);
        t10=findViewById(R.id.bird10);
        t11=findViewById(R.id.bird11);
        t12=findViewById(R.id.bird12);
        t13=findViewById(R.id.bird13);
        t14=findViewById(R.id.bird14);
        t15=findViewById(R.id.bird15);
        t16=findViewById(R.id.bird16);
        t17=findViewById(R.id.bird17);
        t18=findViewById(R.id.bird18);

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
        t15.setOnClickListener(this);
        t16.setOnClickListener(this);
        t17.setOnClickListener(this);
        t18.setOnClickListener(this);

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
            case R.id.bird_backID:
                onBackPressed();
                break;
            case R.id.bird1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("????????????????????? ???????????? ???????????? ???????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("?????????????????? ???????????? ???????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("????????????????????? ???????????? ????????????????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("?????????????????? ???????????? ???????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("???????????? ???????????? ??????????????? ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("?????????????????? ???????????? ????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("??????????????? ???????????? ??????????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("???????????? ???????????? ????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("??????????????? ???????????? ???????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("???????????? ???????????? ?????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird11:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("??????????????? ???????????? ???????????? ???????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird12:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("???????????????????????? ???????????? ???????????????????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird13:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("????????? ???????????? ????????????????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird14:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("????????? ???????????? ????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird15:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("???????????? ???????????? ?????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird16:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("?????? ???????????? ???????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird17:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("????????? ???????????? ???????????????", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bird18:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("????????? ???????????? ???????????????", TextToSpeech.QUEUE_FLUSH, null);
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