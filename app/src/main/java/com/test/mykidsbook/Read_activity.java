package com.test.mykidsbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Read_activity extends AppCompatActivity {
    ImageView imageView;
    CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11,cardView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_read_activity);

        //initialisation id

        imageView=findViewById(R.id.imageview_home);
        cardView1=findViewById(R.id.cardV1);
        cardView2=findViewById(R.id.cardV2);
        cardView3=findViewById(R.id.cardV3);
        cardView4=findViewById(R.id.cardV4);
        cardView5=findViewById(R.id.cardV5);
        cardView6=findViewById(R.id.cardV6);
        cardView7=findViewById(R.id.cardV7);
        cardView8=findViewById(R.id.cardV8);
        cardView9=findViewById(R.id.cardV9);
        cardView10=findViewById(R.id.cardV10);
        cardView11=findViewById(R.id.cardV11);
        cardView12=findViewById(R.id.cardV12);

        //start on click listener

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Bangla_bornomala.class);
                startActivity(it);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),English_bornomala.class);
                startActivity(it);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Arbi_bornomala.class);
                startActivity(it);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Animals_intruduce.class);
                startActivity(it);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Fourits_introduce.class);
                startActivity(it);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Poem.class);
                startActivity(it);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Day_Month_Seasons.class);
                startActivity(it);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Namata.class);
                startActivity(it);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Advice_sentence.class);
                startActivity(it);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Body_parts.class);
                startActivity(it);
            }
        });
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Some_national_sub.class);
                startActivity(it);
            }
        });
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(getApplicationContext(),Biramchinnoh.class);
                startActivity(it);
            }
        });
    }

}