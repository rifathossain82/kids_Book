package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class Biramchinnoh extends AppCompatActivity {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private Button t1,t2,t3,t4,t5,t6,t7,t8,t9;
    private TextView q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,
            a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_biramchinnoh);

        //initial all id

        back=findViewById(R.id.b_sign_backID);
        t1=findViewById(R.id.b_sign1);
        t2=findViewById(R.id.b_sign2);
        t3=findViewById(R.id.b_sign3);
        t4=findViewById(R.id.b_sign4);
        t5=findViewById(R.id.b_sign5);
        t6=findViewById(R.id.b_sign6);
        t7=findViewById(R.id.b_sign7);
        t8=findViewById(R.id.b_sign8);
        t9=findViewById(R.id.b_sign9);

        q1=findViewById(R.id.qus_1);
        q2=findViewById(R.id.qus_2);
        q3=findViewById(R.id.qus_3);
        q4=findViewById(R.id.qus_4);
        q5=findViewById(R.id.qus_5);
        q6=findViewById(R.id.qus_6);
        q7=findViewById(R.id.qus_7);
        q8=findViewById(R.id.qus_8);
        q9=findViewById(R.id.qus_9);
        q10=findViewById(R.id.qus_10);
        q11=findViewById(R.id.qus_11);
        q12=findViewById(R.id.qus_12);
        q13=findViewById(R.id.qus_13);
        q14=findViewById(R.id.qus_14);
        q15=findViewById(R.id.qus_15);

        //Tanjina Akter Tabassum
        //Tamanna Akter Riya

        a1=findViewById(R.id.ans_1);
        a2=findViewById(R.id.ans_2);
        a3=findViewById(R.id.ans_3);
        a4=findViewById(R.id.ans_4);
        a5=findViewById(R.id.ans_5);
        a6=findViewById(R.id.ans_6);
        a7=findViewById(R.id.ans_7);
        a8=findViewById(R.id.ans_8);
        a9=findViewById(R.id.ans_9);
        a10=findViewById(R.id.ans_10);
        a11=findViewById(R.id.ans_11);
        a12=findViewById(R.id.ans_12);
        a13=findViewById(R.id.ans_13);
        a14=findViewById(R.id.ans_14);
        a15=findViewById(R.id.ans_15);


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
                textToSpeech.speak("দাড়ি ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কমা বা পাদচ্ছেদ ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইনভার্ট কমা ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কোলন । ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সেমিকোলন । ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("হাইফেন। ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ড্যাশ। ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("প্রশ্নবোধক। ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আশ্চর্য বা বিস্ময়বোধক ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আমাদের দেশের নাম কী?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশে মোট কয়টি জেলা?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের আয়তন কত?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের জনসংখ্যা কত?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের রাজধানীর নাম কী?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঢাকা কোথায় অবস্থিত?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের প্রথম প্রধানমন্তী কে? ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের প্রথম রাষ্ট্রপতি কে? ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের বিজয় দিবস কবে?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের স্বাধীনতা দিবস কবে?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের জাতীয় শহীদ দিবস কবে?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের সর্বোচ্চ আদালত কোনটি?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের বৃহত্তর সেতু কোনটি?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের বৃহত্তর বন কোনটি?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        q15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাংলাদেশের বৃহত্তর সমুদ্রবন্দর কোনটি?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("গণপ্রজাতন্ত্রী বাংলাদেশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("৬৪ টি।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("১,৪৭,৫৭০ বর্গ কিলোমিটার", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("১৬ কোটি ২২ লক্ষ ১৬ হাজার (প্রায়)। ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঢাকা।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঢাকা বুড়িগঙ্গা নদীর তীরে অবস্থিতঅ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তাজউদ্দিন আহাম্মেদ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বঙ্গবন্ধু শেখ মজিবুর রহমান।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("১৬ ডিসেম্বর।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("২৬ মার্চ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("২১ ফেব্রুয়ারি।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সুপ্রিমকোর্ট, ঢাকা।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বঙ্গবন্ধু বহুমুখী যমুনা সেতু।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সুন্দরবন, খুলনা।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        a15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চট্টগ্রাম সমুদ্রবন্দর।", TextToSpeech.QUEUE_FLUSH, null);
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