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

public class Bangla_bornomala extends AppCompatActivity {
    ImageView imageView;
    Animation top_animation,bottom_animation;
    Button bng_ani1,bng_ani2,bng_ani3,bng_ani4;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bangla_bornomala);


        //dialog code

        dialog=new Dialog(this);

        //end dialog code

        //initial id

        bng_ani1=findViewById(R.id.bng_aniid1);
        bng_ani2=findViewById(R.id.bng_aniid2);
        bng_ani3=findViewById(R.id.bng_aniid3);
        bng_ani4=findViewById(R.id.bng_aniid4);

        //set animation

        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        bng_ani2.setAnimation(top_animation);
        bng_ani3.setAnimation(bottom_animation);
        bng_ani1.setAnimation(top_animation);
        bng_ani4.setAnimation(bottom_animation);

        imageView=findViewById(R.id.bangla_bornomala_backID);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });
    }

    public void sorborrn_method(View view) {
openFirstDialog();

    }

    public void consonent_method(View view) {
        openFirstDialog2();
    }

    public void vowel_signs_method(View view) {
        Intent it=new Intent(getApplicationContext(),Vowel_signUse.class);
        startActivity(it);
    }

    public void fola_method(View view) {
        Intent it=new Intent(getApplicationContext(),Folar_details.class);
        startActivity(it);
    }

    public void bangla_number_method(View view) {
        Intent it=new Intent(getApplicationContext(),Bangla_numbers.class);
        startActivity(it);
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
                Intent it=new Intent(getApplicationContext(),Vowels_sounds2.class);
                startActivity(it);

                dialog.dismiss();
            }
        });
        buttonOk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Vowels.class);
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
                Intent it=new Intent(getApplicationContext(),Consonent_sounds.class);
                startActivity(it);
                dialog.dismiss();
            }
        });
        buttonOk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),consonents.class);
                startActivity(it);
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}