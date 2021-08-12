package com.test.mykidsbook;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Locale;

public class Month_Fragment extends Fragment {
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30
            ,t31,t32,t33,t34,t35,t36;
    private TextToSpeech textToSpeech;
    private TextToSpeech textToSpeech2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_month_, container, false);

        //initial id

        t1=view.findViewById(R.id.bm_day1);
        t2=view.findViewById(R.id.bm_day2);
        t3=view.findViewById(R.id.bm_day3);
        t4=view.findViewById(R.id.bm_day4);
        t5=view.findViewById(R.id.bm_day5);
        t6=view.findViewById(R.id.bm_day6);
        t7=view.findViewById(R.id.bm_day7);
        t8=view.findViewById(R.id.bm_day8);
        t9=view.findViewById(R.id.bm_day9);
        t10=view.findViewById(R.id.bm_day10);
        t11=view.findViewById(R.id.bm_day11);
        t12=view.findViewById(R.id.bm_day12);
        t13=view.findViewById(R.id.em_day1);
        t14=view.findViewById(R.id.em_day2);
        t15=view.findViewById(R.id.em_day3);
        t16=view.findViewById(R.id.em_day4);
        t17=view.findViewById(R.id.em_day5);
        t18=view.findViewById(R.id.em_day6);
        t19=view.findViewById(R.id.em_day7);
        t20=view.findViewById(R.id.em_day8);
        t21=view.findViewById(R.id.em_day9);
        t22=view.findViewById(R.id.em_day10);
        t23=view.findViewById(R.id.em_day11);
        t24=view.findViewById(R.id.em_day12);
        t25=view.findViewById(R.id.am_day1);
        t26=view.findViewById(R.id.am_day2);
        t27=view.findViewById(R.id.am_day3);
        t28=view.findViewById(R.id.am_day4);
        t29=view.findViewById(R.id.am_day5);
        t30=view.findViewById(R.id.am_day6);
        t31=view.findViewById(R.id.am_day7);
        t32=view.findViewById(R.id.am_day8);
        t33=view.findViewById(R.id.am_day9);
        t34=view.findViewById(R.id.am_day10);
        t35=view.findViewById(R.id.am_day11);
        t36=view.findViewById(R.id.am_day12);


        //textToSpeech Coding
        textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
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

        textToSpeech2 = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = textToSpeech2.setLanguage(Locale.ENGLISH);

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

        //start on click listener

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বৈশাখ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জ্যৈষ্ট", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আষাঢ়", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("শ্রাবণ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ভাদ্র", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আশ্বিন", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কার্তিক", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("অগ্রহায়ণ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পৌষ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মাঘ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });


        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ফাল্গুন", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চৈত্র", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("January", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("February", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("March", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("April", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("May", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("June", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("July", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("August", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("September", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("October", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("November", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("December", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মুহররম", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সফর", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রবিউল আউয়াল", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রবিউল সানি", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জমাদিউল আউয়াল", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জামাদিউল সানি", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রজব", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("শা'বান", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রমজান", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("শাওয়াল", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জ্বিলকদ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জ্বিলহজ্জ", TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        return view;
    }
}