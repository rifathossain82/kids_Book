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

public class DayFragment extends Fragment {
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21;
    private TextToSpeech textToSpeech;
    private TextToSpeech textToSpeech2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_day, container, false);

        t1=view.findViewById(R.id.b_day1);
        t2=view.findViewById(R.id.b_day2);
        t3=view.findViewById(R.id.b_day3);
        t4=view.findViewById(R.id.b_day4);
        t5=view.findViewById(R.id.b_day5);
        t6=view.findViewById(R.id.b_day6);
        t7=view.findViewById(R.id.b_day7);
        t8=view.findViewById(R.id.e_day1);
        t9=view.findViewById(R.id.e_day2);
        t10=view.findViewById(R.id.e_day3);
        t11=view.findViewById(R.id.e_day4);
        t12=view.findViewById(R.id.e_day5);
        t13=view.findViewById(R.id.e_day6);
        t14=view.findViewById(R.id.e_day7);
        t15=view.findViewById(R.id.a_day1);
        t16=view.findViewById(R.id.a_day2);
        t17=view.findViewById(R.id.a_day3);
        t18=view.findViewById(R.id.a_day4);
        t19=view.findViewById(R.id.a_day5);
        t20=view.findViewById(R.id.a_day6);
        t21=view.findViewById(R.id.a_day7);


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
                textToSpeech.speak("শনিবার", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("রবিবার", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সোমবার", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("মঙ্গলবার", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বুধবার", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বৃহস্পতিবার", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("শুক্রবার", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("Saturday", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("Sunday", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("Monday", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("Tuesday", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("Wednesday", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("Thursday", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech2.setPitch(1f);
                textToSpeech2.setSpeechRate(0.9f);
                textToSpeech2.speak("Friday", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইয়াওমুস সাবাতি", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইয়াওমুল আহাদি", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইয়াওমুল ইছানা নি", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইয়াওমুছ ছুলাছা ই", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইয়াওমুল আরবাআ ই", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইয়াওমুল খামিসি", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইয়াওমুল জুমাআতি", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        return view;
    }
}