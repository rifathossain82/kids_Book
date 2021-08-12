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

public class Bangla_poem extends AppCompatActivity{
    private ImageView back;
    TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bangla_poem);
        back=findViewById(R.id.bangla_poem_backID);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });

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

        t1=findViewById(R.id.bangla_poem1);
        t2=findViewById(R.id.bangla_poem2);
        t3=findViewById(R.id.bangla_poem3);
        t4=findViewById(R.id.bangla_poem4);
        t5=findViewById(R.id.bangla_poem5);
        t6=findViewById(R.id.bangla_poem6);
        t7=findViewById(R.id.bangla_poem7);
        t8=findViewById(R.id.bangla_poem8);
        t9=findViewById(R.id.bangla_poem9);
        t10=findViewById(R.id.bangla_poem10);
        t11=findViewById(R.id.bangla_poem11);
        t12=findViewById(R.id.bangla_poem12);
        t13=findViewById(R.id.bangla_poem13);
        t14=findViewById(R.id.bangla_poem14);
        t15=findViewById(R.id.bangla_poem15);
        t16=findViewById(R.id.bangla_poem16);
        t17=findViewById(R.id.bangla_poem17);
        t18=findViewById(R.id.bangla_poem18);
        t19=findViewById(R.id.bangla_poem19);
        t20=findViewById(R.id.bangla_poem20);

        //on click start
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম হাট্টিমা টিম টিম। হাট্টিমা টিম টিম , তারা মাঠে পারে ডিম, তাদের খাড়া দুটো শিং, তারা হাট্টিমা টিম টিম।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম আয় রে আয় টিয়ে। আয় রে আয় টিয়ে, নায়ে ভরা দিয়ে, না নিয়ে গেল বোয়াল মাছে, তাই না দেখে ভোঁদড় নাচে, ওরে ভোঁদড় ফিরে চা, খোকার নাচন দেখে যা।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম আয় আয় চাঁদ মামা। আয় আয় চাঁদ মামা, টিপ দিয়ে যা, চাঁদের কপালে চাঁদ, টিপ দিয়ে যা।, ধান ভানলে কুঁড়ো দেবঅ, মাছ কাটলে মুড়ো দেবঅ, কাল গাইয়ের দুধ দেবঅ, " +
                        "দুধ খাবার বাটি দেবঅ, চাঁদের কপালে চাঁদ, টিপ দিয়ে যা।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম নোটন নোটন পায়রাগুলি। নোটন নোটন পায়রাগুলি, ঝোটন বেঁধেছে, ওপারেতে ছেলেমেয়ে, নাইতে নেমেছে।, দুই ধারে দুই রুই কাতলা, ভেসে উঠেছে, কে দেখেছে কে দেখেছে, দাদা দেখেছে, " +
                        "দাদার হাতে কলম ছিল, ছুঁড়ে মেরেছে, উঃ বড্ড লেগেছে।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম ঘুম পাড়ানী মাসি পিসি । লিখেছেন রবীন্দ্রনাথ ঠাকুর। ঘুম পাড়ানি মাসি পিসি, মোদের বাড়ি এসো, খাট নাই পালং নাই, পাটি পেতে বসো। বাটা ভরে পান দিবো, গাল ভরে খেয়ো, খোকার চোখে ঘুম নাই ঘুম দিয়ে যেয়ো।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম বাবুরাম সাপুড়ে। কবির নাম সুকুমার রায়। বাবুরাম সাপুড়ে, কোথা যাস বাপুরে? আয় বাবা দেখে যা, দুটো সাপ রেখে যা! যে সাপের চোখ নেই, শিং নেই নোখ নেই, ছোট নাকি হাঁটে না, " +
                        " কাউকে যে কাটে না, করে নাকো ফোঁস ফাঁস, মারে নাকো ঢুঁশ ঢাঁশ, নেই কোন উৎপাত, খায় শুধু দুধভাত-- সেই সাপ জ্যান্ত গোটা দুই আনত? তেড়ে মেরে ডান্ডা করে দেই ঠান্ডা।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম বাক বাক কুম পায়রা। লিখেছেন রোকনুজ্জামান খান। বাক বাক কুম পায়রা, মাথায় দিয়া টায়রা, বউ সাজবে কাল কি, চড়বে সোনার পালকি।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম পড়ালেখা করে যেই। কবির নাম মদনমোহন তর্কালষ্কার। লেখা পড়া করে যেই, গাড়ী ঘোড়া চড়ে সেই। লেখা পড়া যেই জানে, সব লোকে তারে মানে। কটু ভাষী নাহি হবে, মিছা কথা নাহি কবে। " +
                        "পর ধন নাহি লবে, চিরদিন সুখে রবে। পিতামাতা গুরুজনে, সেবা কর কায় মনে।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম কানা বগীর ছা। লিখেছেন খান মুহাম্মাদ মইনুদ্দীন। ঐ দেখা যায় তাল গাছ, ঐ আমাদের গাঁ। ঐ খানেতে বাস করে, কানা বগীর ছা। " +
                        "ও বগী তুই খাস কি? পানতা ভাত চাস কি? পানতা আমি খাই না, পুঁটি মাছ পাই না, একটা যদি পাই, অমনি ধরে গাপুস গুপুস খাই।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কবিতার নাম প্রভাতী। লিখেছেন কাজী নজরুল ইসলাম। ভোর হলো, দোর খোলো, খুকুমণি ওঠ রে! ঐ ডাকে, জুঁই শাখে, ফুল খুকী ছোট রে! রবি মামা, দেয় হামা, গায়ে রাঙা জামা ঐ, " +
                        "দারোয়ান, গায় গান, শোনো ঐ,'রামা হৈ!' ত্যাজি নীড়, করে ভিড়, ওড়ে পাখী আকাশে, এন্তার, গান তার, ভাসে ভোর বাতাসে! চুল বুল, বুল বুল, শিস দেয় পুস্পে, " +
                        "এইবার, এইবার, খুকুমনি উঠবে! খুলি হাল, তুলি পাল, ঐ তরী চল লো, এইবার, এইবার, খুকু চোখ খুললো! আলসে, নয় সে, ওঠে রোজ সকালে, রোজ তাই, চাঁদা ভাই, টিপ দেয় কপালে। " +
                        "উঠল, ছুটল, ঐ খোকাখুকী সব, 'উঠেছে, আগে কে', ঐ শোনো কলরব। নাই রাত, মুখ হাত, ধোও খুকু জাগো রে! জয়গানে, ভগবানে, তুমি বর মাগো রে!", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম মামার বাড়ি। লিখেছেন জসীম উদ্দীন। আয় ছেলেরা আয় মেয়েরা, ফুল তুলিতে যাই, ফুলের মালা গলায় দিয়ে, মামার বাড়ি যাই। " +
                        "ঝড়ের দিনে মামার দেশে, আম কুড়াতে সুখ, পাকা জামের শাখায় উঠে, রঙিন করি মুখ।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম ছুটি। লিখেছেন রবীন্দ্রনাথ ঠাকুর। মেঘের কোলে রোদ হেসেছে, বাদল গেছে টুটি, আজ আমাদের ছুটি ওভাই, আজ আমাদের ছুটি। " +
                        "কী করি আজ ভেবে না পাই, পথ হারিয়ে কোন বনে যাই, কোন মাঠে যে ছুটে বেড়াই, সকল ছেলে জুটি, আজ আমাদের ছুটি ওভাই, আজ আমাদের ছুটি।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম ছোটন ঘুমায়। লিখেছেন সুফিয়া কামাল। গোল করো না গোল করো না, ছোটন ঘুমায় খাটে। এই ঘুমকে কিনতে হল, নওয়াব বাড়ির হাটে।" +
                        "সোনা নয় রুপা নয়, দিলাম মোতির মালা, তাইতো ছোটন ঘুমিয়ে আছে, ঘর করে উজালা।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কবিতার নাম ঝুমকো জবা। লিখেছেন ফররুখ আহমদ। ঝুমকো জবা বনের দুল, উঠল ফুটে বনের ফুল। সবুজ পাতা ঘোমটা খোলে, " +
                        "ঝুমকো জবা হাওয়ায় দোলে। সেই দুলুনির তালে তালে, মন উড়ে যায় ডালে ডালে।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কবিতার নাম খোকার সাধ। লিখেছেন কাজী নজরুল ইসলাম। আমি হব সকাল বেলার পাখি, সবার আগে কুসুম বাগে উঠব আমি ডাকি! সূয্যিমামা জাগার আগে উঠব আমি জেগে " +
                        ",হয়নি সকাল, ঘুমো এখন, মা বলবেন রেগে। বলব আমি আলসে মেয়ে, ঘুমিয়ে তুমি থাকঅ, হয়নি সকাল তাই বলে কি, সকাল হবে না কঅ! আমরা যদি না জাগি মা, কেমনে সকাল হবে? তোমার ছেলে উঠলে গো মা " +
                        "রাত পোহাবে তবে!", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম হনহন পনপন। লিখেছেন সুকুমার রায়। চলে হনহন, ছোটে পনপন, ঘোরে বনবন, কাজে ঠনঠন, বায়ু শনশন, শীতে কনকন, কাশি খনখন, ফোঁড়া টনটন, মাছি ভনভন, থালা ঝন ঝন।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম তোতা পাখি। লিখেছেন খান মুহাম্মাদ মইনুদ্দীন। আতা গাছে তোতা পাখি, ডালিম গাছে মউ, এত ডাকি তবু কথা, কও না কেন বউ?", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কবিতার নাম বৃষ্টি পড়ে টাপুর টুপুর। বৃষ্টি পড়ে টাপুর টুপুর নদে এলঅ বান, শিব ঠাকুরের বিয়ে হবে তিন কন্যা দান। এক কন্যা রাঁধেন বাড়েন এক কন্যা খান, আরেক কন্যে গোস্বা করে বাপের বাড়ি যান।", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছড়ার নাম ইতল বিতল। লিখেছেন সুফিয়া কামাল। ইতল বিতল গাছের পাতা, গাছের তলায় ব্যাঙের মাথা। বৃষ্টি পড়ে ভাঙ্গে ছাতা, ডোবায় ডুবে ব্যাঙ্গের মাথা।", TextToSpeech.QUEUE_FLUSH, null);
                textToSpeech.getDefaultEngine();
            }
        });
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.getDefaultEngine();
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কবিতার নাম ইচ্ছা। লিখেছেন আহসান হাবীব। মনারে মনা কোথায় যাস? বিলের ধারে কাটবঅ ঘাস। ঘাস কি হবে? বেচবঅ কাল, চিকন সুতোর কিনব জাল। জাল কি হবে? নদীর বাঁকে, মাছ ধরব ঝাঁকে ঝাঁকে। " +
                        "মাছ কি হবে? বেচবঅ হাটে, কিনবঅ শাড়ি পাটে পাটে। বোনকে দেবঅ পাটের শাড়ি, মাকে দেবঅ রঙ্গিন হাঁড়ি।", TextToSpeech.QUEUE_FLUSH, null);

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