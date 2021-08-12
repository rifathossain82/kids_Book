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

public class Fruit extends AppCompatActivity implements View.OnClickListener {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fruit);

        //find id
        back=findViewById(R.id.fruit_backID);
        t1=findViewById(R.id.fruit1);
        t2=findViewById(R.id.fruit2);
        t3=findViewById(R.id.fruit3);
        t4=findViewById(R.id.fruit4);
        t5=findViewById(R.id.fruit5);
        t6=findViewById(R.id.fruit6);
        t7=findViewById(R.id.fruit7);
        t8=findViewById(R.id.fruit8);
        t9=findViewById(R.id.fruit9);
        t10=findViewById(R.id.fruit10);

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
            case R.id.fruit_backID:
                onBackPressed();
                break;
            case R.id.fruit1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("apple অর্থ আপেল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fruit2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Banana অর্থ কলা ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fruit3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পাইনেপল অর্থ আনারস", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fruit4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গ্রেইপ অর্থ আঙুর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fruit5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Jack Fruit অর্থ কাঠাল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fruit6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Litchi অর্থ লিচু", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fruit7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Mango অর্থ আম", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fruit8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Orange অর্থ কমলা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fruit9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Star Fruit অর্থ কামরাঙা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.fruit10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Watermalon অর্থ তরমুজ", TextToSpeech.QUEUE_FLUSH, null);
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