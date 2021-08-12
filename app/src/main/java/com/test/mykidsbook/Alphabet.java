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
import android.widget.TextView;

import java.util.Locale;

public class Alphabet extends AppCompatActivity {
    int q=1;
   private ImageView imageView;
    private TextView textView;
    private Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26;
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_alphabet);

        //initialisation id

        imageView=findViewById(R.id.alphabet_back);
        textView=findViewById(R.id.alphabet_title);
        c1=findViewById(R.id.alphabet1);
        c2=findViewById(R.id.alphabet2);
        c3=findViewById(R.id.alphabet3);
        c4=findViewById(R.id.alphabet4);
        c5=findViewById(R.id.alphabet5);
        c6=findViewById(R.id.alphabet6);
        c7=findViewById(R.id.alphabet7);
        c8=findViewById(R.id.alphabet8);
        c9=findViewById(R.id.alphabet9);
        c10=findViewById(R.id.alphabet10);
        c11=findViewById(R.id.alphabet11);
        c12=findViewById(R.id.alphabet12);
        c13=findViewById(R.id.alphabet13);
        c14=findViewById(R.id.alphabet14);
        c15=findViewById(R.id.alphabet15);
        c16=findViewById(R.id.alphabet16);
        c17=findViewById(R.id.alphabet17);
        c18=findViewById(R.id.alphabet18);
        c19=findViewById(R.id.alphabet19);
        c20=findViewById(R.id.alphabet20);
        c21=findViewById(R.id.alphabet21);
        c22=findViewById(R.id.alphabet22);
        c23=findViewById(R.id.alphabet23);
        c24=findViewById(R.id.alphabet24);
        c25=findViewById(R.id.alphabet25);
        c26=findViewById(R.id.alphabet26);



        //textToSpeech Coding

        textToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==TextToSpeech.SUCCESS){
                    int result=textToSpeech.setLanguage(new Locale("bn_IN"));

                    if(result==TextToSpeech.LANG_MISSING_DATA
                            || result==TextToSpeech.LANG_NOT_SUPPORTED){
                        Log.e("TTS","Language not supported.");
                    }
                    else{

                    }
                }else{
                    Log.e("TTS","Initialization failed.");}
            }
        });

        //on click listener start

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এয়",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",1);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বি",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",2);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সি",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",3);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডি",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",4);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ই",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",5);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এফ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",6);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জি",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",7);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এইচ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",8);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আই",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",9);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জে",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",10);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কে",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",11);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এল",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",12);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এম",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",13);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এন",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",14);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওু",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",15);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পি",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",16);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কিউ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",17);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আর",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",18);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এস",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",19);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("টি",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",20);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ইউ",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",21);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ভি",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",22);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ডব্লিও",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",23);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এক্স",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",24);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ওয়াই",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",25);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
        c26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("জেড",TextToSpeech.QUEUE_FLUSH,null);
                Intent it=new Intent(getApplicationContext(),test_english.class);
                it.putExtra("data",26);
                it.putExtra("letter",q);
                startActivity(it);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        int p = getIntent().getIntExtra("alphabet_value", 0);
        if (p == 1) {
            q=1;
            textView.setText("ছোট অক্ষর");
            c1.setText("a");
            c2.setText("b");
            c3.setText("c");
            c4.setText("d");
            c5.setText("e");
            c6.setText("f");
            c7.setText("g");
            c8.setText("h");
            c9.setText("i");
            c10.setText("j");
            c11.setText("k");
            c12.setText("l");
            c13.setText("m");
            c14.setText("n");
            c15.setText("o");
            c16.setText("p");
            c17.setText("q");
            c18.setText("r");
            c19.setText("s");
            c20.setText("t");
            c21.setText("u");
            c22.setText("v");
            c23.setText("w");
            c24.setText("x");
            c25.setText("y");
            c26.setText("z");
        } else if (p == 2) {
            q=2;

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