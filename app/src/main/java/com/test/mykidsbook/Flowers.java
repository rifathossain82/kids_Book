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

public class Flowers extends AppCompatActivity implements View.OnClickListener {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_flowers);

        //find id
        back=findViewById(R.id.flower_backID);
        t1=findViewById(R.id.flower1);
        t2=findViewById(R.id.flower2);
        t3=findViewById(R.id.flower3);
        t4=findViewById(R.id.flower4);
        t5=findViewById(R.id.flower5);
        t6=findViewById(R.id.flower6);
        t7=findViewById(R.id.flower7);
        t8=findViewById(R.id.flower8);
        t9=findViewById(R.id.flower9);
        t10=findViewById(R.id.flower10);

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
            case R.id.flower_backID:
                onBackPressed();
                break;
            case R.id.flower1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Water Lily অর্থ শাপলা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.flower2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("টিউলিপ অর্থ টিউলিপ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.flower3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Tube rose অর্থ রজনীগন্ধা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.flower4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Rose অর্থ গোলাপ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.flower5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Marigold অর্থ গাঁদাফুল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.flower6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Hibiscus অর্থ জবা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.flower7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Gardenia অর্থ গন্ধরাজ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.flower8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডায়লিয়া অর্থ ডালিয়া", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.flower9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sunflower অর্থ সূর্যমুখী", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.flower10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Lotus অর্থ পদ্মফুল", TextToSpeech.QUEUE_FLUSH, null);
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