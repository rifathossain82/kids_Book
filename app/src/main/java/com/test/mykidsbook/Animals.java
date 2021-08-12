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

public class Animals extends AppCompatActivity implements View.OnClickListener {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animals);

        //find id
        back=findViewById(R.id.animals_backID);
        t1=findViewById(R.id.animals1);
        t2=findViewById(R.id.animals2);
        t3=findViewById(R.id.animals3);
        t4=findViewById(R.id.animals4);
        t5=findViewById(R.id.animals5);
        t6=findViewById(R.id.animals6);
        t7=findViewById(R.id.animals7);
        t8=findViewById(R.id.animals8);
        t9=findViewById(R.id.animals9);
        t10=findViewById(R.id.animals10);
        t11=findViewById(R.id.animals11);
        t12=findViewById(R.id.animals12);
        t13=findViewById(R.id.animals13);
        t14=findViewById(R.id.animals14);
        t15=findViewById(R.id.animals15);
        t16=findViewById(R.id.animals16);
        t17=findViewById(R.id.animals17);
        t18=findViewById(R.id.animals18);

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
            case R.id.animals_backID:
                onBackPressed();
                break;
            case R.id.animals1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ক্যাট অর্থ বিড়াল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এলিফ্যান্ট অর্থ হাতি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জেব্রা অর্থ জেব্রা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("র‍্যাবিট অর্থ খরগোশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জিরাফ অর্থ জিরাফ ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লায়ন অর্থ সিংহ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডগ অর্থ কুকুর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইয়াক অর্থ চমরীগাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফক্স অর্থ শিয়াল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কর্কডাইল অর্থ কুমির", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals11:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মনকি' অর্থ বানর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals12:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("টাইগার অর্থ বাগ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals13:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হর্জ অর্থ ঘোড়া", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals14:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লেপার্ড অর্থ চিতাবাগ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals15:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("টর্টোইস অর্থ কচ্ছপ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals16:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গট অর্থ ছাগল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals17:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কাউ অর্থ গরু", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.animals18:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডিয়ার অর্থ হরিন", TextToSpeech.QUEUE_FLUSH, null);
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