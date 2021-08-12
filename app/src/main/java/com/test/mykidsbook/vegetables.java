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

public class vegetables extends AppCompatActivity implements View.OnClickListener {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_vegetables);

        //find id
        back=findViewById(R.id.vege_backID);
        t1=findViewById(R.id.vege1);
        t2=findViewById(R.id.vege2);
        t3=findViewById(R.id.vege3);
        t4=findViewById(R.id.vege4);
        t5=findViewById(R.id.vege5);
        t6=findViewById(R.id.vege6);
        t7=findViewById(R.id.vege7);
        t8=findViewById(R.id.vege8);
        t9=findViewById(R.id.vege9);
        t10=findViewById(R.id.vege10);

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
            case R.id.vege_backID:
               onBackPressed();
                break;
            case R.id.vege1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Bitter gourd অর্থ করলা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.vege2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Bottol gourd অর্থ লাউ ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.vege3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Cauliflower অর্থ ফুলকপি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.vege4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কিউকাম্বার অর্থ শশা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.vege5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eggplant অর্থ বেগুন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.vege6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Hyacinth bean অর্থ শিম", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.vege7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ladys finger অর্থ ঢেঁ ড়শ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.vege8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Pumkin অর্থ কুমড়া ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.vege9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Waxgourd অর্থ চালকুমড়া", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.vege10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Carrot অর্থ গাঁজর", TextToSpeech.QUEUE_FLUSH, null);
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