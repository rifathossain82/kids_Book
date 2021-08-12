package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class English_bornomala extends AppCompatActivity {
    ImageView imageView;
    Animation top_animation,bottom_animation;
    Button eng_ani1,eng_ani2,eng_ani3,eng_ani4;
    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_english_bornomala);


        //dialog code

        dialog=new Dialog(this);

        //end dialog code

        //initial id

        eng_ani1=findViewById(R.id.eng_borno_aniID1);
        eng_ani2=findViewById(R.id.eng_borno_aniID2);
        eng_ani3=findViewById(R.id.eng_borno_aniID3);
        eng_ani4=findViewById(R.id.eng_borno_aniID4);

        //set animation

        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        eng_ani2.setAnimation(top_animation);
        eng_ani3.setAnimation(bottom_animation);
        eng_ani1.setAnimation(top_animation);
        eng_ani4.setAnimation(bottom_animation);


        imageView=findViewById(R.id.eng_bornomala_backID);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    public void small_method(View view) {
        openFirstDialog();
    }

    public void capital_method(View view) {
        openFirstDialog2();
    }

    public void eng_speaking_method(View view) {
        Intent te=new Intent(getApplicationContext(),Learn_english.class);
        startActivity(te);

    }

    public void eng_number_method(View view) {
        Intent te=new Intent(getApplicationContext(),English_Numbers.class);
        startActivity(te);

    }

    //custom dialog method 1

    private void openFirstDialog(){
        dialog.setContentView(R.layout.option_button);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewclose=dialog.findViewById(R.id.imageView_close_ob);
        Button buttonOk1=dialog.findViewById(R.id.button_ok_ob1);
        Button buttonOk2=dialog.findViewById(R.id.button_ok_ob2);

        buttonOk1.setText(" উচ্চারণ শিখি ");
        buttonOk2.setText(" ছবিতে শিখি ");

        imageViewclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        buttonOk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Alphabet_sounds.class);
                it.putExtra("alphabet_value",1);
                startActivity(it);

                dialog.dismiss();
            }
        });
        buttonOk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Alphabet.class);
                it.putExtra("alphabet_value",1);
                startActivity(it);

                dialog.dismiss();
            }
        });
        dialog.show();

    }
    private void openFirstDialog2(){
        dialog.setContentView(R.layout.option_button);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewclose=dialog.findViewById(R.id.imageView_close_ob);
        Button buttonOk1=dialog.findViewById(R.id.button_ok_ob1);
        Button buttonOk2=dialog.findViewById(R.id.button_ok_ob2);

        buttonOk1.setText(" উচ্চারণ শিখি ");
        buttonOk2.setText(" ছবিতে শিখি ");

        imageViewclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        buttonOk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Alphabet_sounds.class);
                it.putExtra("alphabet_value",2);
                startActivity(it);

                dialog.dismiss();
            }
        });
        buttonOk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Alphabet.class);
                it.putExtra("alphabet_value",2);
                startActivity(it);

                dialog.dismiss();
            }
        });
        dialog.show();

    }

}