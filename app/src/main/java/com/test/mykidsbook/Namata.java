package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class Namata extends AppCompatActivity {
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
    private TextToSpeech textToSpeech;
    private FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_namata);

        //initial id
        floatingActionButton=findViewById(R.id.namata_backID);
        t1=findViewById(R.id.namta1);
        t2=findViewById(R.id.namta2);
        t3=findViewById(R.id.namta3);
        t4=findViewById(R.id.namta4);
        t5=findViewById(R.id.namta5);
        t6=findViewById(R.id.namta6);
        t7=findViewById(R.id.namta7);
        t8=findViewById(R.id.namta8);
        t9=findViewById(R.id.namta9);
        t10=findViewById(R.id.namta10);
        t11=findViewById(R.id.namta11);
        t12=findViewById(R.id.namta12);
        t13=findViewById(R.id.namta13);
        t14=findViewById(R.id.namta14);
        t15=findViewById(R.id.namta15);
        t16=findViewById(R.id.namta16);
        t17=findViewById(R.id.namta17);
        t18=findViewById(R.id.namta18);
        t19=findViewById(R.id.namta19);
        t20=findViewById(R.id.namta20);

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

        //on click listener start
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
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
                textToSpeech.speak("এক -এর নামতা। এক একে এক। দুই একে দুই। তিন একে তিন। চার একে চার। পাচ একে পাচ, ছয় একে ছয়। সাত একে সাত। আট একে আট। নয় একে নয়। দশ একে দশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দুই -এর নামতা। দুই একে দুই। দুই দুগুনে চার। তিন দুগুনে ছয়। চার দুগুনে আট। পাঁচ দুগুনে দশ। ছয় দুগুনে বারো। সাত দুগুনে চোদ্দ। আট দুগুনে ষোল। নয় দুগুনে আঠারো। দশ দুগুনে বিশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তিন -এর নামতা। তিন একে তিন। তিন দুগুনে ছয়। তিন ত্রিক্কে নয়। তিন চারে বারো। তিন পাচে পনেরো। তিন ছয় আঠারো। তিন সাতে একুশ। তিন আটে চব্বিশ। তিন নয়ে সাতাশ। তিন দশে ত্রিশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চার -এর নামতা। চার একে চার। চার দুগুনে আট। তিন চারে বারো। চার চারে ষোল। চার পাচে বিশ। চার ছয় এ চব্বিশ। চার সাতে আটাশ। চার আটে বত্রিশ। চার নয়ে ছত্রিশ। চার দশে চল্লিশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পাঁচ -এর নামতা। পাচ একে পাচ। পাচ দুগুনে দশ। তিন পাচে পনেরো। চার পাচে বিশ। পাচ পাচে পচিশ। পাচ ছয় এ ত্রিশ। পাচ সাতে পয়ত্রিশ। পাচ আটে চল্লিশ। পাচ নয়ে পয়তাল্লিশ। পাচ দশে পঞ্চাশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছয় -এর নামতা। ছয় একে ছয়। ছয় দুগুনে বারো। তিন ছয় এ আঠারো। চার ছয় এ চব্বিশ। পাচ ছয় এ ত্রিশ। ছয় ছয় এ ছত্রিশ। ছয় সাতে বিয়াল্লিশ। ছয় আটে আটচল্লিশ। ছয় নয়ে চুয়ান্ন। ছয় দশে ষাট।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাত -এর নামতা। সাত একে সাত। সাত দুগুনে চোদ্দ। তিন সাতে একুশ। চার সাতে আটাশ। পাচ সাতে পয়ত্রিশ। ছয় সাতে বিয়াল্লিশ। সাত সাতে ঊনপঞ্চাশ। সাত আটে ছাপ্পান্ন। সাত নয়ে তেষট্টি। সাত দশে সত্তর।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আট -এর নামতা। আট একে আট। আট দুগুনে ষোল। তিন আটে চব্বিশ। চার আটে বত্রিশ। পাচ আটে চল্লিশ। ছয় আটে আটচল্লিশ। সাত আটে ছাপ্পান্ন। আট আটে চৌষট্টি। আট নয়ে বাহাত্তর। আট দশে আশি।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("নয় -এর নামতা। নয় একে নয়। নয় দুগুনে আঠারো। তিন নয়ে সাতাশ। চার নয়ে ছত্রিশ। পাচ নয়ে পয়তাল্লিশ। ছয় নয়ে চুয়ান্ন। সাত নয়ে তেষট্টি। আট নয়ে বাহাত্তর। নয় নয়ে একাশি। নয় দশে নব্বই।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দশ -এর নামতা। দশ একে দশ। দশ দুগুনে বিশ। তিন দশে ত্রিশ। চার দশে চল্লিশ। পাচ দশে পঞ্চাশ। ছয় দশে ষাট। সাত দশে সত্তর। আট দশে আশি। নয় দশে নব্বই। দশ দশে একশ'।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এগারো -এর নামতা। এগারো একে এগারো। এগারো দুগুনে বাইশ। তিন এগারো তেত্রিশ। চার এগারো চুয়াল্লিশ। পাচ এগারো পঞ্চান্ন। ছয় এগারো ছেষট্টি। সাত এগারো সাতাত্তর। আট এগারো আটাশি। নয় এগারো নিরানব্বই। দশ এগারো একশ দশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বারো -এর নামতা। বারো একে বারো। বারো দুগুনে চব্বিশ। তিন বারো ছত্রিশ। চার বারো আটচল্লিশ। পাচ বারো ষাট। ছয় বারো বাহাত্তর। সাত বারো চৌরাশি। আট বারো ছিয়ানব্বই। নয় বারো একশ আট। ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তেরো -এর নামতা। তেরো একে তেরো। তেরো দুগুনে ছাব্বিশ। তিন তেরো ঊনচল্লিশ। চার তেরো বাহান্ন। পাচ তেরো পয়ষট্টি। ছয় তেরো আটাত্তর। সাত তেরো একানব্বই। আট তেরো একশ চার। নয় তেরো একশ সতেরো। দশ তেরো একশ ত্রিশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চৌদ্দ -এর নামতা। চৌদ্দ একে চৌদ্দ। চৌদ্দ দুগুনে আটাশ। তিন চৌদ্দ বিয়াল্লিশ। চার চৌদ্দ ছাপ্পান্ন। পাচ চৌদ্দ সত্তর। ছয় চৌদ্দ চৌরাশি। সাত চৌদ্দ আটানব্বই। আট চৌদ্দ একশ বারো। নয় চৌদ্দ একশ ছাব্বিশ। দশ চৌদ্দ একশ চল্লিশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পনেরো -এর নামতা। পনেরো একে পনেরো। পনেরো দুগুনে ত্রিশ। তিন পনেরো পয়তাল্লিশ। চার পনেরো ষাট। পাচ পনেরো পচাত্তর। ছয় পনেরো নব্বই। সাত পনেরো একশ পাচ। আট পনেরো একশ বিশ। নয় পনেরো একশ পয়ত্রিশ। দশ পনেরো একশ পঞ্চাশ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ষোল -এর নামতা। ষোল একে ষোল। ষোল দুগুনে বত্রিশ। তিন ষোল আটচল্লিশ। চার ষোল চৌষট্টি। পাচ ষোল আশি। ছয় ষোল ছিয়ানব্বই। সাত ষোল একশ বারো। আট ষোল একশ আটাশ। নয় ষোল একশ চুয়াল্লিশ। দশ ষোল একশ ষাট।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সতেরো -এর নামতা। সতেরো একে সতেরো। সতেরো দুগুনে চৌত্রিশ। তিন সতেরো একান্ন। চার সতেরো আট ষট্টি। পাচ সতেরো পচাশি। ছয় সতেরো একশ দুই। সাত সতেরো একশ ঊনিশ। আট সতেরো একশ ছয়ত্রিশ। নয় সতেরো একশ তিপ্পান্ন। দশ সতেরো একশ সত্তর।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আঠারো -এর নামতা। আঠারো একে আঠারো। আঠারো দুগুনে ছত্রিশ। তিন আঠারো চুয়ান্ন। চার আঠারো বাহাত্তর। পাচ আঠারো নব্বই। ছয় আঠারো একশ আট। সাত আঠারো একশ ছাব্বিশ। আট আঠারো একশ চুয়াল্লিশ। নয় আঠারো একশ বাষট্টি। দশ আঠারো একশ আশি।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("উনিশ -এর নামতা। উনিশ একে উনিশ। উনিশ দুগুনে আটত্রিশ। তিন উনিশ সাতান্ন। চার উনিশ সাতাত্তর। পাচ উনিশ পচানব্বই। ছয় উনিশ একশ চৌদ্দ। সাত উনিশ একশ তেত্রিশ। আট উনিশ একশ বাহান্ন। নয় উনিশ একশ একাত্তর। দশ উনিশ একশ নব্বই।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বিশ -এর নামতা। বিশ একে বিশ। বিশ দুগুনে চল্লিশ। তিন বিশ ষাট। চার বিশ আশি। পাচ বিশ একশ। ছয় বিশ একশ বিশ। সাত বিশ একশ চল্লিলশ। আট বিশ একশ ষাট। নয় বিশ একশ আশি। দশ বিশ দুইশ'।", TextToSpeech.QUEUE_FLUSH, null);
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