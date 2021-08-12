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

public class test11 extends AppCompatActivity {
    ImageView back,image;
    TextView textView1,textView2,textView3,textView4,title;
    LinearLayout linearLayout;
    int x=0;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_test11);

        //initialisation all id

        back=findViewById(R.id.back4);
        image=findViewById(R.id.myimageID);
        textView1=findViewById(R.id.myTextID1);
        textView2=findViewById(R.id.MyTextID2);
        textView3=findViewById(R.id.MyTextID3);
        textView4=findViewById(R.id.MyTextID4);
        linearLayout=findViewById(R.id.myLinerID);
        title=findViewById(R.id.showtitle);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent it=new Intent(getApplicationContext(),consonents.class);
                //startActivity(it);
               onBackPressed();
            }
        });

        int i=getIntent().getIntExtra("value",0);
        switch (i){
            case 1:
                image.setImageResource(R.drawable.quran2);
                textView1.setText("ক -");
                textView2.setText("তে কোরআন");
                textView3.setText("কোরআন ");
                textView4.setText(" পড়ি অজু করে");
                x=1;
                break;
            case 2:
                image.setImageResource(R.drawable.eating);
                textView1.setText("খ -");
                textView2.setText("তে খাওয়া");
                textView3.setText("খাওয়ার ");
                textView4.setText(" আগে বিসমিল্লাহ বলি");
                x=2;
                break;
            case 3:
                image.setImageResource(R.drawable.pap2);
                textView1.setText("গ -");
                textView2.setText("তে গুনাহ");
                textView3.setText("গুনাহর ");
                textView4.setText(" কাজ না কর");
                x=3;
                break;
            case 4:
                image.setImageResource(R.drawable.sleep);
                textView1.setText("ঘ -");
                textView2.setText("তে ঘুম");
                textView3.setText("ঘুমের ");
                textView4.setText(" আগে দোয়া পড়");
                x=4;
                break;
            case 5:
                image.setImageResource(R.drawable.colors);
                textView1.setText("ঙ -");
                textView2.setText("তে রঙ");
                textView3.setText("রঙ ");
                textView4.setText(" দিয়ে ছবি আঁকি");
                x=5;
                break;
            case 6:
                image.setImageResource(R.drawable.moon2);
                textView1.setText("চ -");
                textView2.setText("তে চাঁদ");
                textView3.setText("চাঁদ ");
                textView4.setText(" দেখে রোজা রাখি");
                x=6;
                break;
            case 7:
                image.setImageResource(R.drawable.boy);
                textView1.setText("ছ -");
                textView2.setText("তে ছল");
                textView3.setText("ছল ");
                textView4.setText(" চাতুরি ভাল নয়");
                x=7;
                break;
            case 8:
                image.setImageResource(R.drawable.namaj_jamat);
                textView1.setText("জ -");
                textView2.setText("তে জামাত");
                textView3.setText("জামাতে ");
                textView4.setText(" নামাজ পড়তে হয়");
                x=8;
                break;
            case 9:
                image.setImageResource(R.drawable.jhorna);
                textView1.setText("ঝ -");
                textView2.setText("তে ঝর্ণা");
                textView3.setText("ঝর্না ");
                textView4.setText(" আল্লাহর মহা দান");
                x=9;
                break;
            case 10:
                image.setImageResource(R.drawable.ibadat2);
                textView1.setText("ঞ -");
                textView2.setText("তে মিঞা");
                textView3.setText("মিঞা ");
                textView4.setText(" পড়ে আল-কোরআন");
                x=10;
                break;
            case 11:
                image.setImageResource(R.drawable.taka);
                textView1.setText("ট -");
                textView2.setText("তে টাকা");
                textView3.setText("টাকার ");
                textView4.setText(" চেয়ে ঈমান বড়");
                x=11;
                break;
            case 12:
                image.setImageResource(R.drawable.ibadat);
                textView1.setText("ঠ -");
                textView2.setText("তে ঠিক");
                textView3.setText("ঠিকমত ");
                textView4.setText(" এবাদাত কর");
                x=12;
                break;
            case 13:
                image.setImageResource(R.drawable.eating);
                textView1.setText("ড -");
                textView2.setText("তে ডান");
                textView3.setText("ডান ");
                textView4.setText(" হাতে খাব জানি");
                x=13;
                break;
            case 14:
                image.setImageResource(R.drawable.dhaka);
                textView1.setText("ঢ -");
                textView2.setText("তে ঢাকা");
                textView3.setText("ঢাকা ");
                textView4.setText(" আমাদের রাজধানী");
                x=14;
                break;
            case 15:
                image.setImageResource(R.drawable.har_kipta);
                textView1.setText("ণ -");
                textView2.setText("তে কৃপণ");
                textView3.setText("কৃপণের ");
                textView4.setText(" সঙ্গ ত্যাগ কর");
                x=15;
                break;
            case 16:
                image.setImageResource(R.drawable.tosbi_pora);
                textView1.setText("ত -");
                textView2.setText("তে তসবিহ");
                textView3.setText("তসবিহ ");
                textView4.setText(" পড় সকাল - বিকাল");
                x=16;
                break;
            case 17:
                image.setImageResource(R.drawable.thutu_fela);
                textView1.setText("থ -");
                textView2.setText("তে থুতু");
                textView3.setText("থুতু ");
                textView4.setText(" ফেলনা যেথায় সেথায়");
                x=17;
                break;
            case 18:
                image.setImageResource(R.drawable.doyakor2);
                textView1.setText("দ -");
                textView2.setText("তে দয়া");
                textView3.setText("দয়া ");
                textView4.setText(" কর যারা অসহায়");
                x=18;
                break;
            case 19:
                image.setImageResource(R.drawable.dhoni_gorib);
                textView1.setText("ধ -");
                textView2.setText("তে ধনী");
                textView3.setText("ধনী ");
                textView4.setText(" গরিবে ভেদাভেদ নাই");
                x=19;
                break;
            case 20:
                image.setImageResource(R.drawable.namaj2);
                textView1.setText("ন -");
                textView2.setText("তে নামাজ");
                textView3.setText("নামাজ ");
                textView4.setText(" পড় সময় হলে");
                x=20;
                break;
            case 21:
                image.setImageResource(R.drawable.pap2);
                textView1.setText("প -");
                textView2.setText("তে পাপ");
                textView3.setText("পাপ ");
                textView4.setText(" করিলে তওবা কর");
                x=21;
                break;
            case 22:
                image.setImageResource(R.drawable.ful);
                textView1.setText("ফ -");
                textView2.setText("তে ফুল");
                textView3.setText("ফুলের ");
                textView4.setText(" মত জীবন গড়");
                x=22;
                break;
            case 23:
                image.setImageResource(R.drawable.boi);
                textView1.setText("ব -");
                textView2.setText("তে বই");
                textView3.setText("বই ");
                textView4.setText(" হলো জ্ঞানের আলো");
                x=23;
                break;
            case 24:
                image.setImageResource(R.drawable.eid2);
                textView1.setText("ভ -");
                textView2.setText("তে ভালো");
                textView3.setText("ভালো ");
                textView4.setText(" লোকের সঙ্গে চল");
                x=24;
                break;
            case 25:
                image.setImageResource(R.drawable.mokka);
                textView1.setText("ম -");
                textView2.setText("তে মক্কা");
                textView3.setText("মক্কায় ");
                textView4.setText(" গিয়ে হজ কর");
                x=25;
                break;
            case 26:
                image.setImageResource(R.drawable.zakat);
                textView1.setText("য -");
                textView2.setText("তে যাকাত");
                textView3.setText("যাকাত ");
                textView4.setText(" ফেতরা আদায় কর");
                x=26;
                break;
            case 27:
                image.setImageResource(R.drawable.romjan2);
                textView1.setText("র -");
                textView2.setText("তে রমজান");
                textView3.setText("রমজান ");
                textView4.setText(" মাসে রোজা রাখ");
                x=27;
                break;
            case 28:
                image.setImageResource(R.drawable.lorai);
                textView1.setText("ল -");
                textView2.setText("তে লড়াই");
                textView3.setText("লড়াই ");
                textView4.setText(" হতে বিরত থাক");
                x=28;
                break;
            case 29:
                image.setImageResource(R.drawable.shapla);
                textView1.setText("শ -");
                textView2.setText("তে শাপলা");
                textView3.setText("শাপলা ");
                textView4.setText(" আমাদের জাতীয় ফুল");
                x=29;
                break;
            case 30:
                image.setImageResource(R.drawable.krishok);
                textView1.setText("ষ -");
                textView2.setText("তে কৃষক");
                textView3.setText("কৃষক ");
                textView4.setText(" বাঁচায় দেশ কূল");
                x=30;
                break;
            case 31:
                image.setImageResource(R.drawable.sotota);
                textView1.setText("স -");
                textView2.setText("তে সততা");
                textView3.setText("সততার ");
                textView4.setText(" উপর কিছুই নাই");
                x=31;
                break;
            case 32:
                image.setImageResource(R.drawable.ibadat3);
                textView1.setText("হ -");
                textView2.setText("তে হাত");
                textView3.setText("হাত ");
                textView4.setText(" উঠিয়ে দোয়া চাই");
                x=32;
                break;
            case 33:
                image.setImageResource(R.drawable.kkhoma);
                textView1.setText("ক্ষ -");
                textView2.setText("তে ক্ষমা");
                textView3.setText("ক্ষমা ");
                textView4.setText(" করা মহৎ কাজ");
                x=33;
                break;
            case 34:
                image.setImageResource(R.drawable.boi_pora);
                textView1.setText("ড় -");
                textView2.setText("তে পড়া");
                textView3.setText("পড়া ");
                textView4.setText(" লেখাতে নেই লাজ");
                x=34;
                break;
            case 35:
                image.setImageResource(R.drawable.oyada);
                textView1.setText("ঢ় -");
                textView2.setText("তে দৃঢ়");
                textView3.setText("দৃঢ়ভাবে ");
                textView4.setText(" প্রতিজ্ঞা কর");
                x=35;
                break;
            case 36:
                image.setImageResource(R.drawable.namaj2);
                textView1.setText("য় -");
                textView2.setText("তে সময়");
                textView3.setText("সময় ");
                textView4.setText(" মত নামাজ পড়");
                x=36;
                break;
            case 37:
                image.setImageResource(R.drawable.success);
                textView1.setText("ৎ -");
                textView2.setText("তে সৎ");
                textView3.setText("সৎপথে ");
                textView4.setText(" জীবন গড়");
                x=37;
                break;
            case 38:
                image.setImageResource(R.drawable.hingsa);
                textView1.setText("ং -");
                textView2.setText("তে হিংসা");
                textView3.setText("হিংসা ");
                textView4.setText(" বিদ্বেষ দূর কর");
                x=38;
                break;
            case 39:
                image.setImageResource(R.drawable.dukkho);
                textView1.setText("ঃ -");
                textView2.setText("তে দুঃখ");
                textView3.setText("দুঃখ ");
                textView4.setText(" আসিলে ধৈর্য্য ধর");
                x=39;
                break;
            case 40:
                image.setImageResource(R.drawable.namaj);
                textView1.setText("ঁ -");
                textView2.setText("তে পাঁচ");
                textView3.setText("পাঁচ ");
                textView4.setText(" ওয়াক্ত নামাজ পড়");
                x=40;
                break;
            case 41:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.oju);
                textView1.setText("অ -");
                textView2.setText("তে অজু");
                textView3.setText("অজু ");
                textView4.setText(" করে নামাজ পড়ি");
                x=41;
                break;
            case 42:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.adesh_palon);
                textView1.setText("আ -");
                textView2.setText("তে আল্লাহ");
                textView3.setText("আল্লাহর ");
                textView4.setText(" আদেশ পালন করি");
                x=42;
                break;
            case 43:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.ibadat2);
                textView1.setText("ই -");
                textView2.setText("তে ইবাদাত");
                textView3.setText("ইবাদাত ");
                textView4.setText(" যার ঠিক আছে");
                x=43;
                break;
            case 44:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.eid2);
                textView1.setText("ঈ -");
                textView2.setText("তে ঈদ");
                textView3.setText("ঈদের ");
                textView4.setText(" খুশি সবার মাঝে");
                x=44;
                break;
            case 45:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.ibadat);
                textView1.setText("উ -");
                textView2.setText("তে উপদেশ");
                textView3.setText("উপদেশ ");
                textView4.setText(" মেনে জীবন গড়");
                x=45;
                break;
            case 46:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.sun2);
                textView1.setText("ঊ -");
                textView2.setText("তে ঊষাকালে");
                textView3.setText("ঊষাকালে ");
                textView4.setText(" কোরআন পড়");
                x=46;
                break;
            case 47:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.rrin2);
                textView1.setText("ঋ -");
                textView2.setText("তে ঋন");
                textView3.setText("ঋন ");
                textView4.setText(" দাও অভাবিকে");
                x=47;
                break;
            case 48:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.ibadat3);
                textView1.setText("এ -");
                textView2.setText("তে এক");
                textView3.setText("এক ");
                textView4.setText(" আল্লাহ তে ইমান আন");
                x=48;
                break;
            case 49:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.quran2);
                textView1.setText("ঐ -");
                textView2.setText("তে ঐশী");
                textView3.setText("ঐশী ");
                textView4.setText(" কিতাব কোরআন মান");
                x=49;
                break;
            case 50:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.oyada);
                textView1.setText("ও -");
                textView2.setText("তে ওয়াদা");
                textView3.setText("ওয়াদা ");
                textView4.setText(" ভঙ্গ করতে নাই");
                x=50;
                break;
            case 51:
                title.setText(" ছন্দে ছবিতে স্বরবর্ণ ");
                image.setImageResource(R.drawable.medichin);
                textView1.setText("ঔ -");
                textView2.setText("তে ঔষধ");
                textView3.setText("ঔষধ ");
                textView4.setText(" খাও অসুখ হলে");
                x=51;
                break;
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
                switch (x){
                    case 1:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("কঅ তে কোরআন। কোরআন পড়ি অজু করে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("খঅ তে খাওয়া। খাওয়ার আগে বিসমিল্লাহ বলি।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("গঅ তে গুনাহ। গুনাহর কাজ না করঅ", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ঘঅ তে ঘুম। ঘুমের আগে দোয়া পড়অ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ওঅ তে রঙ। রঙ দিয়ে ছবি আঁকি।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("চঅ তে চাঁদ। চাঁদ দেখে রোজা রাখি।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ছঅ তে ছল। ছল চাতুরি ভাল নয়।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("বর্গীয় জঅ তে জামাত। জামাতে নামাজ পড়তে হয়।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ঝঅ তে ঝর্ণা। ঝর্ণা আল্লাহর মহা দান।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 10:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ঞঅ তে মিঞা। মিঞা পড়ে আল-কোরআন।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 11:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("টঅ তে টাকা। টাকার চেয়ে ঈমান বড়অ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 12:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ঠঅ তে ঠিক। ঠিকমত এবাদাত করঅ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 13:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ডঅ তে ডান। ডান হাতে খাব জানি।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 14:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ঢহঅ তে ঢাকা। ঢাকা আমাদের রাজধানী।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 15:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("মূর্ধন্য ণঅ তে কৃপণ। কৃপণের সঙ্গ ত্যাগ করঅ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 16:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("তঅ তে তসবিহ। তসবিহ পড়অ সকাল বিকাল।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 17:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("থঅ তে থুতু। থুতু ফেলঅনা যেথায় সেথায়।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 18:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("দঅ তে দয়া। দয়া করঅ যারা অসহায়।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 19:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ধঅ তে ধনী। ধনী গরিব ভেদাভেদ নাই।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 20:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("নঅ তে নামাজ। নামাজ পড়অ সময় হলে।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 21:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("প তে পাপ। পাপ করিলে তওবা করঅ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 22:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ফঅ তে ফুল। ফুলের মত জীবন গড়অ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 23:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ব তে বই। বই হলো জ্ঞানের আলো।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 24:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ভঅ তে ভালো। ভালো লোকের সঙ্গে চলঅ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 25:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ম তে মক্কা। মক্কায় গিয়ে হজ করঅ।", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 26:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("যঅ তে যাকাত। যাকাত ফেতরা আদায় করঅ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 27:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("রঅ তে রমজান। রমজান মাসে রোজা রাখঅ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 28:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("লঅ তে লড়াই। লড়াই হতে বিরত থাক।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 29:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("শঅ তে শাপলা । শাপলা আমাদের জাতীয় ফুল।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 30:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ষঅ তে কৃষক। কৃষক বাঁচায় দেশ কূল।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 31:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("সঅ তে সততা। সততার উপর কিছুই নাই।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 32:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("হঅ তে হাত। হাত উঠিয়ে দোয়া চাই।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 33:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ক্ষঅ তে ক্ষমা। ক্ষমা করা মহৎ কাজ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 34:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ড়অ তে পড়া। পড়া লেখাতে নেই লাজ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 35:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ঢ়অ তে দৃঢ়। দৃঢ়ভাবে প্রতিজ্ঞা করঅ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 36:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("অন্তস্তিয় তে সময়। সময় মত নামাজ পড়অ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 37:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("খন্ড তঅ তে সৎ। সৎপথে জীবন গড়অ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 38:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("অনেষ্বর তে হিংসা। হিংসা বিদ্বেষ দূর করঅ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 39:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("বিশজ্ঞঅ তে দুঃখ। দুঃখ আসিলে ধৈর্য্য ধরঅ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 40:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("চন্দ্র বিন্দু তে পাঁচ। পাঁচ ওয়াক্ত নামাজ পড়অ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 41:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("সরে য় তে অজু। অজু করে নামাজ পড়ি।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 42:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("সরায় য়া তে আল্লাহ। আল্লাহর আদেশ পালন করি।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 43:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("হ্রস্ব ই তে ইবাদাত। ইবাদাত যার ঠিক আছে।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 44:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("দীর্ঘ ঈ তে ঈদ। ঈদের খুশি সবার মাঝে।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 45:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("হ্রস্ব ও তে উপদেশ। উপদেশ মেনে জীবন গড়অ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 46:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("দীর্ঘ ও তে ঊষাকাল। ঊষাকালে কোরআন পড়অ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 47:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("রি তে ঋন। ঋন দাও অভাবিকে।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 48:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("এয় তে এক। এক আল্লাহ তে ইমান আন।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 49:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("অই তে ঐশী। ঐশী কিতাব কোরআন মানঅ।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 50:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("ওয়ু তে ওয়াদা। ওয়াদা ভঙ্গ করতে নাই।",TextToSpeech.QUEUE_FLUSH,null);
                        break;
                    case 51:
                        textToSpeech.setPitch(1f);
                        textToSpeech.setSpeechRate(0.9f);
                        textToSpeech.speak("অও তে ঔষধ। ঔষধ খাও অসুখ হলে।",TextToSpeech.QUEUE_FLUSH,null);
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