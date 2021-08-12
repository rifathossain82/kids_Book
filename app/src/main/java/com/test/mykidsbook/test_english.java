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
import android.widget.TextView;

import java.util.Locale;

public class test_english extends AppCompatActivity {
    ImageView back,image;
    TextView textView1,textView2,textView3,textView4;
    LinearLayout linearLayout;
    int x=0;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_test_english);

        //initialisation id
        back=findViewById(R.id.eng_test_back);
        image=findViewById(R.id.eng_test_imageID);
        textView1=findViewById(R.id.eng_test_TextID1);
        textView2=findViewById(R.id.eng_test_TextID2);
        textView3=findViewById(R.id.eng_test_TextID3);
        textView4=findViewById(R.id.eng_test_TextID4);
        linearLayout=findViewById(R.id.eng_test_LinerID);


        //set onclick listener start

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        int q=getIntent().getIntExtra("letter",0);


        if(q==1){
            int i=getIntent().getIntExtra("data",0);
            switch (i) {
                case 1:
                    image.setImageResource(R.drawable.antpp);
                    textView1.setText("a -");
                    textView2.setText("তে ant\n(এ্যান্ট)\nপিঁপড়া");
                    textView3.setText("ant ");
                    textView4.setText(" চলে ছয় পায়");
                    x = 1;
                    break;
                case 2:
                    image.setImageResource(R.drawable.bus2);
                    textView1.setText("b -");
                    textView2.setText("তে bus\n(বাস)\nযাত্রীবাহী গাড়ি");
                    textView3.setText("bus ");
                    textView4.setText(" এ চড়ে বাড়ি যাই");
                    x = 2;
                    break;
                case 3:
                    image.setImageResource(R.drawable.catp);
                    textView1.setText("c -");
                    textView2.setText("তে cat\n(ক্যাট)\nবিড়াল");
                    textView3.setText("cat ");
                    textView4.setText(" আমাদের পোষা প্রাণী");
                    x = 3;
                    break;
                case 4:
                    image.setImageResource(R.drawable.dogp);
                    textView1.setText("d -");
                    textView2.setText("তে dog\n(ডগ)\nকুকুর");
                    textView3.setText("dog ");
                    textView4.setText(" প্রভুভক্ত প্রাণী");
                    x = 4;
                    break;
                case 5:
                    image.setImageResource(R.drawable.elephant);
                    textView1.setText("e -");
                    textView2.setText("তে elephant\n(এলিফ্যান্ট)\nহাতি");
                    textView3.setText("elephant ");
                    textView4.setText(" চলে হেলে দুলে");
                    x = 5;
                    break;
                case 6:
                    image.setImageResource(R.drawable.frog);
                    textView1.setText("f -");
                    textView2.setText("তে frog\n(ফ্রগ)\nব্যাঙ");
                    textView3.setText("frog ");
                    textView4.setText(" থাকে নদীর কোণে");
                    x = 6;
                    break;
                case 7:
                    image.setImageResource(R.drawable.gunp);
                    textView1.setText("g -");
                    textView2.setText("তে gun\n(গান)\nবন্দুক");
                    textView3.setText("gun ");
                    textView4.setText(" নিয়ে শিকার করে");
                    x = 7;
                    break;
                case 8:
                    image.setImageResource(R.drawable.henp);
                    textView1.setText("h -");
                    textView2.setText("তে hen\n(হ্যান)\nমুরগী");
                    textView3.setText("hen ");
                    textView4.setText(" বসে ডিম পাড়ে");
                    x = 8;
                    break;
                case 9:
                    image.setImageResource(R.drawable.ice_creamp);
                    textView1.setText("i -");
                    textView2.setText("তে ice-cream\n(আইসক্রিম)\nআইসক্রিম");
                    textView3.setText("ice-cream ");
                    textView4.setText(" ঠান্ডা অতি");
                    x = 9;
                    break;
                case 10:
                    image.setImageResource(R.drawable.jelly);
                    textView1.setText("j -");
                    textView2.setText("তে jelly\n(জেলী)\nজেলি");
                    textView3.setText("jelly ");
                    textView4.setText(" খেঁলে নাইকো ক্ষতি");
                    x = 10;
                    break;
                case 11:
                    image.setImageResource(R.drawable.keyp);
                    textView1.setText("k -");
                    textView2.setText("তে key\n(কি)\nচাবি");
                    textView3.setText("key ");
                    textView4.setText(" রাখ সাবধানে");
                    x = 11;
                    break;
                case 12:
                    image.setImageResource(R.drawable.lionp);
                    textView1.setText("l -");
                    textView2.setText("তে lion\n(লায়ন)\nসিংহ");
                    textView3.setText("lion ");
                    textView4.setText(" থাকে গভীর বনে");
                    x = 12;
                    break;
                case 13:
                    image.setImageResource(R.drawable.mango);
                    textView1.setText("m -");
                    textView2.setText("তে mango\n(ম্যাংগো)\nআম");
                    textView3.setText("mango ");
                    textView4.setText(" খেতে মজা ভারি");
                    x = 13;
                    break;
                case 14:
                    image.setImageResource(R.drawable.net);
                    textView1.setText("n -");
                    textView2.setText("তে net\n(নেট)\nজাল");
                    textView3.setText("net ");
                    textView4.setText(" দিয়ে মাছ ধরি");
                    x = 14;
                    break;
                case 15:
                    image.setImageResource(R.drawable.oxp);
                    textView1.setText("o -");
                    textView2.setText("তে ox\n(অক্স)\nষাঁড়");
                    textView3.setText("ox ");
                    textView4.setText(" দেখে লাগে ভয়");
                    x = 15;
                    break;
                case 16:
                    image.setImageResource(R.drawable.penp);
                    textView1.setText("p -");
                    textView2.setText("তে pen\n(পেন)\nকলম");
                    textView3.setText("pen ");
                    textView4.setText(" দিয়ে লিখতে হয়");
                    x = 16;
                    break;
                case 17:
                    image.setImageResource(R.drawable.queen);
                    textView1.setText("q -");
                    textView2.setText("তে queen\n(কুইন)\nরাণী");
                    textView3.setText("queen ");
                    textView4.setText(" আছে মুকুট পরে");
                    x = 17;
                    break;
                case 18:
                    image.setImageResource(R.drawable.rabbitp);
                    textView1.setText("r -");
                    textView2.setText("তে rabbit\n(র‍্যাবিট)\nখরগোস");
                    textView3.setText("rabbit ");
                    textView4.setText(" টি খেলা করে");
                    x = 18;
                    break;
                case 19:
                    image.setImageResource(R.drawable.sun3);
                    textView1.setText("s -");
                    textView2.setText("তে sun\n(সান)\nসূর্য");
                    textView3.setText("sun ");
                    textView4.setText(" উঠে পূর্ব আকাশে");
                    x = 19;
                    break;
                case 20:
                    image.setImageResource(R.drawable.tigerp);
                    textView1.setText("t -");
                    textView2.setText("তে tiger\n(টাইগার)\nবাগ");
                    textView3.setText("tiger ");
                    textView4.setText(" টি তেড়ে আসে");
                    x = 20;
                    break;
                case 21:
                    image.setImageResource(R.drawable.umbrellap);
                    textView1.setText("u -");
                    textView2.setText("তে umbrella\n(আমব্রেলা)\nছাতা");
                    textView3.setText("umbrella ");
                    textView4.setText(" নাও বৃষ্টি হলে");
                    x = 21;
                    break;
                case 22:
                    image.setImageResource(R.drawable.vlelinp);
                    textView1.setText("v -");
                    textView2.setText("তে violin\n(ভায়োলিন)\nবেহালা");
                    textView3.setText("violin ");
                    textView4.setText(" এ সুর তোলে");
                    x = 22;
                    break;
                case 23:
                    image.setImageResource(R.drawable.watch);
                    textView1.setText("w -");
                    textView2.setText("তে watch\n(ওয়াচ)\nহাত ঘড়ি");
                    textView3.setText("watch ");
                    textView4.setText(" দেখে সময় বল");
                    x = 23;
                    break;
                case 24:
                    image.setImageResource(R.drawable.xlophonep);
                    textView1.setText("x -");
                    textView2.setText("তে xylophone\n(জায়লোফোন)\nবাদ্যযন্ত্র");
                    textView3.setText("xylophone ");
                    textView4.setText(" এ সুর তোল");
                    x = 24;
                    break;
                case 25:
                    image.setImageResource(R.drawable.yak2);
                    textView1.setText("y -");
                    textView2.setText("তে yak\n(ইয়্যাক)\nচমরী গাই");
                    textView3.setText("yak ");
                    textView4.setText(" টি দাঁড়িয়ে আছে");
                    x = 25;
                    break;
                case 26:
                    image.setImageResource(R.drawable.zebrap);
                    textView1.setText("z -");
                    textView2.setText("তে zebra\n(জেব্রা)\nজেব্রা");
                    textView3.setText("zebra ");
                    textView4.setText(" থাকে বনের কাছে");
                    x = 26;
                    break;
            }
        }
        else if(q==2){
            int ii=getIntent().getIntExtra("data",0);
            switch (ii) {
                case 1:
                    image.setImageResource(R.drawable.antpp);
                    textView1.setText("A -");
                    textView2.setText("তে Ant\n(এ্যান্ট)\nপিঁপড়া");
                    textView3.setText("Ant ");
                    textView4.setText(" চলে ছয় পায়");
                    x = 1;
                    break;
                case 2:
                    image.setImageResource(R.drawable.bus2);
                    textView1.setText("B -");
                    textView2.setText("তে Bus\n(বাস)\nযাত্রীবাহী গাড়ি");
                    textView3.setText("Bus ");
                    textView4.setText(" এ চড়ে বাড়ি যাই");
                    x = 2;
                    break;
                case 3:
                    image.setImageResource(R.drawable.catp);
                    textView1.setText("C -");
                    textView2.setText("তে Cat\n(ক্যাট)\nবিড়াল");
                    textView3.setText("Cat ");
                    textView4.setText(" আমাদের পোষা প্রাণী");
                    x = 3;
                    break;
                case 4:
                    image.setImageResource(R.drawable.dogp);
                    textView1.setText("D -");
                    textView2.setText("তে Dog\n(ডগ)\nকুকুর");
                    textView3.setText("Dog ");
                    textView4.setText(" প্রভুভক্ত প্রাণী");
                    x = 4;
                    break;
                case 5:
                    image.setImageResource(R.drawable.elephant);
                    textView1.setText("E -");
                    textView2.setText("তে Elephant\n(এলিফ্যান্ট)\nহাতি");
                    textView3.setText("Elephant ");
                    textView4.setText(" চলে হেলে দুলে");
                    x = 5;
                    break;
                case 6:
                    image.setImageResource(R.drawable.frog);
                    textView1.setText("F -");
                    textView2.setText("তে Frog\n(ফ্রগ)\nব্যাঙ");
                    textView3.setText("Frog ");
                    textView4.setText(" থাকে নদীর কোণে");
                    x = 6;
                    break;
                case 7:
                    image.setImageResource(R.drawable.gunp);
                    textView1.setText("G -");
                    textView2.setText("তে Gun\n(গান)\nবন্দুক");
                    textView3.setText("Gun ");
                    textView4.setText(" নিয়ে শিকার করে");
                    x = 7;
                    break;
                case 8:
                    image.setImageResource(R.drawable.henp);
                    textView1.setText("H -");
                    textView2.setText("তে Hen\n(হ্যান)\nমুরগী");
                    textView3.setText("Hen ");
                    textView4.setText(" বসে ডিম পাড়ে");
                    x = 8;
                    break;
                case 9:
                    image.setImageResource(R.drawable.ice_creamp);
                    textView1.setText("I -");
                    textView2.setText("তে Ice-cream\n(আইসক্রিম)\nআইসক্রিম");
                    textView3.setText("Ice-cream ");
                    textView4.setText(" ঠান্ডা অতি");
                    x = 9;
                    break;
                case 10:
                    image.setImageResource(R.drawable.jelly);
                    textView1.setText("J -");
                    textView2.setText("তে Jelly\n(জেলী)\nজেলি");
                    textView3.setText("Jelly ");
                    textView4.setText(" খেঁলে নাইকো ক্ষতি");
                    x = 10;
                    break;
                case 11:
                    image.setImageResource(R.drawable.keyp);
                    textView1.setText("K -");
                    textView2.setText("তে Key\n(কি)\nচাবি");
                    textView3.setText("Key ");
                    textView4.setText(" রাখ সাবধানে");
                    x = 11;
                    break;
                case 12:
                    image.setImageResource(R.drawable.lionp);
                    textView1.setText("L -");
                    textView2.setText("তে Lion\n(লায়ন)\nসিংহ");
                    textView3.setText("Lion ");
                    textView4.setText(" থাকে গভীর বনে");
                    x = 12;
                    break;
                case 13:
                    image.setImageResource(R.drawable.mango);
                    textView1.setText("M -");
                    textView2.setText("তে Mango\n(ম্যাংগো)\nআম");
                    textView3.setText("Mango ");
                    textView4.setText(" খেতে মজা ভারি");
                    x = 13;
                    break;
                case 14:
                    image.setImageResource(R.drawable.net);
                    textView1.setText("N -");
                    textView2.setText("তে Net\n(নেট)\nজাল");
                    textView3.setText("Net ");
                    textView4.setText(" দিয়ে মাছ ধরি");
                    x = 14;
                    break;
                case 15:
                    image.setImageResource(R.drawable.oxp);
                    textView1.setText("O -");
                    textView2.setText("তে Ox\n(অক্স)\nষাঁড়");
                    textView3.setText("Ox ");
                    textView4.setText(" দেখে লাগে ভয়");
                    x = 15;
                    break;
                case 16:
                    image.setImageResource(R.drawable.penp);
                    textView1.setText("P -");
                    textView2.setText("তে Pen\n(পেন)\nকলম");
                    textView3.setText("Pen ");
                    textView4.setText(" দিয়ে লিখতে হয়");
                    x = 16;
                    break;
                case 17:
                    image.setImageResource(R.drawable.queen);
                    textView1.setText("Q -");
                    textView2.setText("তে Queen\n(কুইন)\nরাণী");
                    textView3.setText("Queen ");
                    textView4.setText(" আছে মুকুট পরে");
                    x = 17;
                    break;
                case 18:
                    image.setImageResource(R.drawable.rabbitp);
                    textView1.setText("R -");
                    textView2.setText("তে Rabbit\n(র‍্যাবিট)\nখরগোস");
                    textView3.setText("Rabbit ");
                    textView4.setText(" টি খেলা করে");
                    x = 18;
                    break;
                case 19:
                    image.setImageResource(R.drawable.sun3);
                    textView1.setText("S -");
                    textView2.setText("তে Sun\n(সান)\nসূর্য");
                    textView3.setText("Sun ");
                    textView4.setText(" উঠে পূর্ব আকাশে");
                    x = 19;
                    break;
                case 20:
                    image.setImageResource(R.drawable.tigerp);
                    textView1.setText("T -");
                    textView2.setText("তে Tiger\n(টাইগার)\nবাগ");
                    textView3.setText("Tiger ");
                    textView4.setText(" টি তেড়ে আসে");
                    x = 20;
                    break;
                case 21:
                    image.setImageResource(R.drawable.umbrellap);
                    textView1.setText("U -");
                    textView2.setText("তে Umbrella\n(আমব্রেলা)\nছাতা");
                    textView3.setText("Umbrella ");
                    textView4.setText(" নাও বৃষ্টি হলে");
                    x = 21;
                    break;
                case 22:
                    image.setImageResource(R.drawable.vlelinp);
                    textView1.setText("V -");
                    textView2.setText("তে Violin\n(ভায়োলিন)\nবেহালা");
                    textView3.setText("Violin ");
                    textView4.setText(" এ সুর তোলে");
                    x = 22;
                    break;
                case 23:
                    image.setImageResource(R.drawable.watch);
                    textView1.setText("W -");
                    textView2.setText("তে Watch\n(ওয়াচ)\nহাত ঘড়ি");
                    textView3.setText("Watch ");
                    textView4.setText(" দেখে সময় বল");
                    x = 23;
                    break;
                case 24:
                    image.setImageResource(R.drawable.xlophonep);
                    textView1.setText("X -");
                    textView2.setText("তে Xylophone\n(জায়লোফোন)\nবাদ্যযন্ত্র");
                    textView3.setText("Xylophone ");
                    textView4.setText(" এ সুর তোল");
                    x = 24;
                    break;
                case 25:
                    image.setImageResource(R.drawable.yak2);
                    textView1.setText("Y -");
                    textView2.setText("তে Yak\n(ইয়্যাক)\nচমরী গাই");
                    textView3.setText("Yak ");
                    textView4.setText(" টি দাঁড়িয়ে আছে");
                    x = 25;
                    break;
                case 26:
                    image.setImageResource(R.drawable.zebrap);
                    textView1.setText("Z -");
                    textView2.setText("তে Zebra\n(জেব্রা)\nজেব্রা");
                    textView3.setText("Zebra ");
                    textView4.setText(" থাকে বনের কাছে");
                    x = 26;
                    break;
            }

        }
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

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (x) {
                    case 1:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("এয় তে এ্যান্ট। এ্যান্ট চলে ছয় পায়।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("বি তে বাস। বাসে চড়ে বাড়ি যাই।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("সি তে ক্যাট। ক্যাট আমাদের পোষা প্রাণী", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ডি তে ডগ। ডগ প্রভুভক্ত প্রাণী।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ই তে এলিফ্যান্ট। এলিফ্যান্ট চলে হেলে দুলে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("এফ তে ফ্রগ। ফ্রগ থাকে নদীর কোণে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("জি তে গান। গান নিয়ে শিকার করে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("এইচ তে হ্যান। হ্যান বসে ডিম পাড়ে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("আই তে আইসক্রিম। আইসক্রিম ঠান্ডা অতি।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 10:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("জে তে জেলি। জেলি খেলে নাইকো ক্ষতি।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 11:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("কে তে কি। কি রাখ সাবধানে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 12:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("এল তে লায়ন। লায়ন থাকে গভীর বনে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 13:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("এম তে ম্যাংগো। ম্যাংগো খেতে মজা ভারি।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 14:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("এন তে নেট। নেট দিয়ে মাছ ধরি।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 15:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ওু তে অক্স। অক্স দেখে লাগে ভয়।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 16:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("পি তে পেন। পেন দিয়ে লিখতে হয়।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 17:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("কিউ তে কুইন। কুইন আছে মুকুট পরে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 18:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("আর তে র‍্যাবিট। র‍্যাবিট টি খেলা করে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 19:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("এস তে সান। সান উঠে পূর্ব আকাশে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 20:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("টি তে টাইগার। টাইগার টি তেরে আসে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 21:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ইউ তে আমব্রেলা। আমব্রেলা নাও বৃষ্টি হলে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 22:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ভি তে ভায়োলিন। ভায়োলিন ও সুর তোলে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 23:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ডব্লিও তে ওয়াচ। ওয়াচ দেখে সময় বলঅ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 24:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("এক্স তে জায়লোফোন। জায়লোফোন এ সুর তোলঅ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 25:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ওয়াই তে ইয়্যাক। ইয়্যাক টি দাঁড়িয়ে আছে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 26:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("জেড তে জেব্রা। জেব্রা থাকে বনের কাছে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;

                }
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