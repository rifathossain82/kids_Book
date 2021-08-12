package com.test.mykidsbook.game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
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

public class Level1 extends AppCompatActivity {
    private TextView qus_no,score,qus;
    private ImageView imageView;
    private Button button1,button2,next;
    private int x=1,p=0,q_no=1,point=0,n=0;
    private String value="১",value2="০";
    private Dialog dialog;
    private TextToSpeech textToSpeech;
    private String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_level1);

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

        qus_no=findViewById(R.id.qus_no_id);
        score=findViewById(R.id.score_id);
        qus=findViewById(R.id.qus_id);
        next=findViewById(R.id.next_qus_id);
        imageView=findViewById(R.id.image_id);
        button1=findViewById(R.id.button1_id);
        button2=findViewById(R.id.button2_id);

        if(x==1){
            qus_no.setText("প্রশ্ন নংঃ ১");
            score.setText("স্কোরঃ ০/১০");
            button2.setText("কলা");
            button1.setText("আম");
            imageView.setImageResource(R.drawable.mango);

        }


        textToSpeech.setPitch(1f);
        textToSpeech.setSpeechRate(0.9f);
        textToSpeech.speak("ছবি দেখে সঠিক উত্তর চিহ্নিত করি", TextToSpeech.QUEUE_FLUSH, null);




        //dialog code

        dialog=new Dialog(this);
        openFirstDialog();


        //end dialog code




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
                    if(p==2){
                        wrong_dialog();
                    }
                    else if(p==1){
                        winning_dialog();
                        point++;

                    }
                }
                if(x==2){
                    if(p==2){
                        wrong_dialog();
                    }
                    else if(p==1){
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
                    if(p==1){
                        wrong_dialog();
                    }
                    else if(p==2){
                       winning_dialog();
                        point++;

                    }
                }
                if(x==5){
                    if(p==2){
                       wrong_dialog();
                    }
                    else if(p==1){
                       winning_dialog();
                        point++;

                    }
                }
                if(x==6){
                    if(p==1){
                        wrong_dialog();
                    }
                    else if(p==2){
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
                    if(p==1){
                        wrong_dialog();
                    }
                    else if(p==2){
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
            score.setText("স্কোরঃ "+value2);
            button1.setText("কলা");
            button2.setText("আম");
            imageView.setImageResource(R.drawable.mango);
        }
        if(x==2){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("আপেল");
            button2.setText("লিচু");
            imageView.setImageResource(R.drawable.apple);
        }
        if(x==3){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("কলা");
            button2.setText("তরমুজ");
            imageView.setImageResource(R.drawable.banana);
        }
        if(x==4){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("আপেল");
            button2.setText("আঙুর");
            imageView.setImageResource(R.drawable.grape);
        }
        if(x==5){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("কাঠাল");
            button2.setText("লিচু");
            imageView.setImageResource(R.drawable.jackfruit);
        }
        if(x==6){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("জাম");
            button2.setText("লিচু");
            imageView.setImageResource(R.drawable.litchi);
        }
        if(x==7){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("আনারস");
            button2.setText("কমলা");
            imageView.setImageResource(R.drawable.orange3);
        }
        if(x==8){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("আনারস");
            button2.setText("কাঠাল");
            imageView.setImageResource(R.drawable.pineapple);
        }
        if(x==9){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("আপেল");
            button2.setText("কামরাঙা");
            imageView.setImageResource(R.drawable.starfruit);
        }
        if(x==10){
            qus_no.setText("প্রশ্ন নংঃ "+value);
            score.setText("স্কোরঃ "+value2+"/১০");
            button1.setText("কমলা");
            button2.setText("তরমুজ");
            imageView.setImageResource(R.drawable.watermalon);
        }
        if(x==11){
            qus_no.setText("প্রশ্ন নংঃ ১০");
            score.setText("স্কোরঃ "+value2+"/১০");
        }

        next.setEnabled(false);
        button1.setBackgroundResource(R.drawable.butn_backgraound4);
        button2.setBackgroundResource(R.drawable.butn_backgraound4);
    }

    //custom dialog method 1

    private void openFirstDialog(){
        dialog.setContentView(R.layout.open_fdialog_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewclose=dialog.findViewById(R.id.imageView_close);
        Button buttonOk=dialog.findViewById(R.id.button_ok);

        s1=button2.getText().toString();
        s2=button1.getText().toString();


        imageViewclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("উপরের ছবিটিতে কি দেখছ?"+s2+" নাকি "+s1, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("উপরের ছবিটিতে কি দেখছ?"+s2+" নাকি "+s1, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        dialog.show();

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
                Intent it=new Intent(Level1.this, Game_Home.class);
                startActivity(it);
            }
        });
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("উপরের ছবিটিতে কি দেখছ? ব্যঙ নাকি ইদুঁর", TextToSpeech.QUEUE_FLUSH, null);
                Intent it=new Intent(Level1.this,Level2.class);
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