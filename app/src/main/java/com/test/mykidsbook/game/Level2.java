package com.test.mykidsbook.game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.test.mykidsbook.Game_Home;
import com.test.mykidsbook.Homepage;
import com.test.mykidsbook.R;

import java.util.Locale;

public class Level2 extends AppCompatActivity {
    private TextView qus_no,score,qus;
    private ImageView imageView;
    private Button button1,button2,next;
    private int x=1,p=0,q_no=1,point=0,n=0;
    private String value="১",value2="০";
    private Button l2;
    private Dialog dialog;
    private TextToSpeech textToSpeech;
    private String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_level2);

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


        //initial all id

        qus_no=findViewById(R.id.qus_no_id2);
        score=findViewById(R.id.score_id2);
        qus=findViewById(R.id.qus_id2);
        next=findViewById(R.id.next_qus_id2);
        imageView=findViewById(R.id.image_id2);
        button1=findViewById(R.id.button1_id2);
        button2=findViewById(R.id.button2_id2);

        //dialog code

        dialog=new Dialog(this);


        //end dialog code

        if(x==1){
            qus_no.setText("প্রশ্ন নংঃ ১");
            score.setText("স্কোরঃ ০/১০");
            button1.setText("ব্যঙ");
            button1.setText("ইদুঁর");
            imageView.setImageResource(R.drawable.frog);
        }


        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                s2=button1.getText().toString();
                button1.setBackgroundResource(R.drawable.butn_backgraound3);
                button2.setBackgroundResource(R.drawable.butn_backgraound4);
                next.setEnabled(true);
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak(""+s2, TextToSpeech.QUEUE_FLUSH, null);
                p=1;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=button2.getText().toString();
                button2.setBackgroundResource(R.drawable.butn_backgraound3);
                button1.setBackgroundResource(R.drawable.butn_backgraound4);
                next.setEnabled(true);
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak(""+s1, TextToSpeech.QUEUE_FLUSH, null);
                p=2;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==1){
                    if(p==1){
                        wrong_dialog();
                    }
                    else if(p==2){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==2){
                    if(p==1){
                        wrong_dialog();
                    }
                    else if(p==2){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==3){
                    if(p==2){
                        wrong_dialog();
                    }
                    else if(p==1){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==4){
                    if(p==2){
                        wrong_dialog();
                    }
                    else if(p==1){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==5){
                    if(p==1){
                        wrong_dialog();
                    }
                    else if(p==2){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==6){
                    if(p==2){
                        wrong_dialog();
                    }
                    else if(p==1){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==7){
                    if(p==1){
                        wrong_dialog();
                    }
                    else if(p==2){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==8){
                    if(p==2){
                        wrong_dialog();
                    }
                    else if(p==1){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==9){
                    if(p==1){
                        wrong_dialog();
                    }
                    else if(p==2){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==10){
                    n=1;
                    if(p==2){
                        wrong_dialog();
                    }
                    else if(p==1){
                        winning_dialog();
                        point++;

                    }
                }

                q_no++;
                p=0;
                x++;

                quiz_test();
                s1=button2.getText().toString();
                s2=button1.getText().toString();
            }
        });
    }
    void quiz_test(){
        if(q_no==1){
            value="১";
        }
        if(q_no==2){
            value="২";
        }
        if(q_no==3){
            value="৩";
        }
        if(q_no==4){
            value="৪";
        }
        if(q_no==5){
            value="৫";
        }
        if(q_no==6){
            value="৬";
        }
        if(q_no==7){
            value="৭";
        }
        if(q_no==8){
            value="৮";
        }
        if(q_no==9){
            value="৯";
        }
        if(q_no==10){
            value="১০";
        }
        if(q_no==11){
            value="১১";
        }
        if(point==1){
            value2="১";
        }
        if(point==2){
            value2="২";
        }
        if(point==3){
            value2="৩";
        }
        if(point==4){
            value2="৪";
        }
        if(point==5){
            value2="৫";
        }
        if(point==6){
            value2="৬";
        }
        if(point==7){
            value2="৭";
        }
        if(point==8){
            value2="৮";
        }
        if(point==9){
            value2="৯";
        }
        if(point==10){
            value2="১০";
        }
        if(point==11){
            value2="১১";
        }

        if(x==1){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("ব্যঙ");
            button2.setText("ইদুঁর");
            imageView.setImageResource(R.drawable.frog);
        }
        if(x==2){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("ভেড়া");
            button2.setText("ছাগল");
            imageView.setImageResource(R.drawable.goat);
        }
        if(x==3){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("মুরগি");
            button2.setText("হাঁস");
            imageView.setImageResource(R.drawable.henp);
        }
        if(x==4){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("হরিন");
            button2.setText("ঘোড়া");
            imageView.setImageResource(R.drawable.horin);
        }
        if(x==5){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("জেব্রা");
            button2.setText("ঘোড়া");
            imageView.setImageResource(R.drawable.horse);
        }
        if(x==6){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("কুমির");
            button2.setText("কচ্ছপ");
            imageView.setImageResource(R.drawable.kumir);
        }
        if(x==7){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("বাঘ");
            button2.setText("সিংহ");
            imageView.setImageResource(R.drawable.lionp);
        }
        if(x==8){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("বাঘ");
            button2.setText("বিড়াল");
            imageView.setImageResource(R.drawable.tigerp);
        }
        if(x==9){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("বিড়াল");
            button2.setText("খরঘোশ");
            imageView.setImageResource(R.drawable.rabbitp);
        }
        if(x==10){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("জেব্রা");
            button2.setText("উট");
            imageView.setImageResource(R.drawable.zebrap);
        }
        if(x==11){
            qus_no.setText("প্রশ্ন নংঃ ১০");
            score.setText("স্কোরঃ "+value2+"/১০");
        }

        next.setEnabled(false);
        button1.setBackgroundResource(R.drawable.butn_backgraound4);
        button2.setBackgroundResource(R.drawable.butn_backgraound4);
    }
    private void winning_dialog(){
        dialog.setContentView(R.layout.winnig_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewclose=dialog.findViewById(R.id.imageView_close2);
        Button buttonOk=dialog.findViewById(R.id.button_ok2);

        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak(" তোমার উত্তর সঠিক! ", TextToSpeech.QUEUE_FLUSH, null);

        imageViewclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("উপরের ছবিটিতে কি দেখছ?"+s1+" নাকি "+s2, TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0){
                    dialog.dismiss();
                    textToSpeech.setPitch(1f);
                    textToSpeech.setSpeechRate(0.9f);
                    textToSpeech.speak("উপরের ছবিটিতে কি দেখছ?"+s1+" নাকি "+s2, TextToSpeech.QUEUE_FLUSH, null);
                }
                if(n==1){
                    next_level_dialog();
                }
            }
        });
        dialog.show();

    }
    private void wrong_dialog(){
        dialog.setContentView(R.layout.wrong);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewclose=dialog.findViewById(R.id.imageView_close3);
        Button buttonOk=dialog.findViewById(R.id.button_ok3);

        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak(" তোমার উত্তর ভুল! ", TextToSpeech.QUEUE_FLUSH, null);

        imageViewclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("উপরের ছবিটিতে কি দেখছ?"+s1+" নাকি "+s2, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n==0){
                    dialog.dismiss();
                    textToSpeech.setPitch(1f);
                    textToSpeech.setSpeechRate(0.9f);
                    textToSpeech.speak("উপরের ছবিটিতে কি দেখছ?"+s1+" নাকি "+s2, TextToSpeech.QUEUE_FLUSH, null);
                }
                if(n==1){
                    next_level_dialog();
                }
            }
        });
        dialog.show();

    }
    private void next_level_dialog(){
        dialog.setContentView(R.layout.next_dialog_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewclose=dialog.findViewById(R.id.imageView_close4);
        Button buttonOk=dialog.findViewById(R.id.button_ok4);
        TextView textView_score=dialog.findViewById(R.id.textView104);

        textView_score.setText("তুমি পেয়েছ ১০ থেকে "+value2);
        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("অভিনন্দন! তুমি পেয়েছ ১০ থেকে "+value2, TextToSpeech.QUEUE_FLUSH, null);

        imageViewclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent it=new Intent(Level2.this, Game_Home.class);
                startActivity(it);
            }
        });
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("উপরের ছবিটিতে কি দেখছ? আলু নাকি আলু", TextToSpeech.QUEUE_FLUSH, null);
                Intent it=new Intent(Level2.this,Level3.class);
                startActivity(it);
            }
        });
        dialog.show();

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