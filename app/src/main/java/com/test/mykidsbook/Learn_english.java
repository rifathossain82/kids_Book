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

import java.util.Locale;

public class Learn_english extends AppCompatActivity implements View.OnClickListener {
    private TextToSpeech textToSpeech;
    private ImageView back;
    private Button t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30
            ,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_learn_english);

        //initialisation id

        back=findViewById(R.id.learn_eng_Back);
        t1=findViewById(R.id.le1);
        t2=findViewById(R.id.le2);
        t3=findViewById(R.id.le3);
        t4=findViewById(R.id.le4);
        t5=findViewById(R.id.le5);
        t6=findViewById(R.id.le6);
        t7=findViewById(R.id.le7);
        t8=findViewById(R.id.le8);
        t9=findViewById(R.id.le9);
        t10=findViewById(R.id.le10);
        t11=findViewById(R.id.le11);
        t12=findViewById(R.id.le12);
        t13=findViewById(R.id.le13);
        t14=findViewById(R.id.le14);
        t15=findViewById(R.id.le15);
        t16=findViewById(R.id.le16);
        t17=findViewById(R.id.le17);
        t18=findViewById(R.id.le18);
        t19=findViewById(R.id.le19);
        t20=findViewById(R.id.le20);
        t21=findViewById(R.id.le21);
        t22=findViewById(R.id.le22);
        t23=findViewById(R.id.le23);
        t24=findViewById(R.id.le24);
        t25=findViewById(R.id.le25);
        t26=findViewById(R.id.le26);
        t27=findViewById(R.id.le27);
        t28=findViewById(R.id.le28);
        t29=findViewById(R.id.le29);
        t30=findViewById(R.id.le30);
        t31=findViewById(R.id.le31);
        t32=findViewById(R.id.le32);
        t33=findViewById(R.id.le33);
        t34=findViewById(R.id.le34);
        t35=findViewById(R.id.le35);
        t36=findViewById(R.id.le36);
        t37=findViewById(R.id.le37);
        t38=findViewById(R.id.le38);
        t39=findViewById(R.id.le39);
        t40=findViewById(R.id.le40);
        t41=findViewById(R.id.le41);
        t42=findViewById(R.id.le42);
        t43=findViewById(R.id.le43);
        t44=findViewById(R.id.le44);
        t45=findViewById(R.id.le45);
        t46=findViewById(R.id.le46);
        t47=findViewById(R.id.le47);
        t48=findViewById(R.id.le48);
        t49=findViewById(R.id.le49);
        t50=findViewById(R.id.le50);
        t51=findViewById(R.id.le51);
        t52=findViewById(R.id.le52);
        t53=findViewById(R.id.le53);
        t54=findViewById(R.id.le54);
        t55=findViewById(R.id.le55);
        t56=findViewById(R.id.le56);
        t57=findViewById(R.id.le57);
        t58=findViewById(R.id.le58);
        t59=findViewById(R.id.le59);
        t60=findViewById(R.id.le60);

        //on click listener start
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });

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
        t30.setOnClickListener(this);
        t31.setOnClickListener(this);
        t32.setOnClickListener(this);
        t33.setOnClickListener(this);
        t34.setOnClickListener(this);
        t35.setOnClickListener(this);
        t36.setOnClickListener(this);
        t37.setOnClickListener(this);
        t38.setOnClickListener(this);
        t39.setOnClickListener(this);
        t40.setOnClickListener(this);
        t41.setOnClickListener(this);
        t42.setOnClickListener(this);
        t43.setOnClickListener(this);
        t44.setOnClickListener(this);
        t45.setOnClickListener(this);
        t46.setOnClickListener(this);
        t47.setOnClickListener(this);
        t48.setOnClickListener(this);
        t49.setOnClickListener(this);
        t50.setOnClickListener(this);
        t51.setOnClickListener(this);
        t52.setOnClickListener(this);
        t53.setOnClickListener(this);
        t54.setOnClickListener(this);
        t55.setOnClickListener(this);
        t56.setOnClickListener(this);
        t57.setOnClickListener(this);
        t58.setOnClickListener(this);
        t59.setOnClickListener(this);
        t60.setOnClickListener(this);


        //on click listener end

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
            case R.id.le1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এয়", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বে", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le3:
            case R.id.le9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কে", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডে", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফে", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গে", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হে", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জে", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লে", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le11:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le12:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le13:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le14:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le15:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le16:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জি,গি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le17:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le18:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le19:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le20:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le21:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le22:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le23:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le24:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le25:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le26:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গাই,গি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le27:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le28:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le29:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le30:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le31:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওু", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le32:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le33:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le34:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le35:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le36:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le37:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le38:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le39:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le40:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le41:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইউ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le42:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বিউ,বা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le43:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কিউ,কা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le44:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডিউ,ডা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le45:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফিউ,ফা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le46:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গিউ,গা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le47:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হিউ,হা", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le48:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জিউ,জো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le49:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কিউ,কো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le50:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লিউ,লো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le51:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওয়াই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le52:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le53:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাই,কাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le54:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le55:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le56:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le57:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le58:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le59:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.le60:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("লাই", TextToSpeech.QUEUE_FLUSH, null);
                break;
        }
    }
}