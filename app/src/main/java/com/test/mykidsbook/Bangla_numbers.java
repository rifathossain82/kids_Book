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

public class Bangla_numbers extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    TextToSpeech textToSpeech;
    LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30
            ,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60,t61,t62,t63,t64,t65,t66,t67,t68,t69,t70
            ,t71,t72,t73,t74,t75,t76,t77,t78,t79,t80,t81,t82,t83,t84,t85,t86,t87,t88,t89,t90,t91,t92,t93,t94,t95,t96,t97,t98,t99,t100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bangla_numbers);

        //find id
        imageView=findViewById(R.id.bn_backID);
        t1=findViewById(R.id.bn1);
        t2=findViewById(R.id.bn2);
        t3=findViewById(R.id.bn3);
        t4=findViewById(R.id.bn4);
        t5=findViewById(R.id.bn5);
        t6=findViewById(R.id.bn6);
        t7=findViewById(R.id.bn7);
        t8=findViewById(R.id.bn8);
        t9=findViewById(R.id.bn9);
        t10=findViewById(R.id.bn10);
        t11=findViewById(R.id.bn11);
        t12=findViewById(R.id.bn12);
        t13=findViewById(R.id.bn13);
        t14=findViewById(R.id.bn14);
        t15=findViewById(R.id.bn15);
        t16=findViewById(R.id.bn16);
        t17=findViewById(R.id.bn17);
        t18=findViewById(R.id.bn18);
        t19=findViewById(R.id.bn19);
        t20=findViewById(R.id.bn20);
        t21=findViewById(R.id.bn21);
        t22=findViewById(R.id.bn22);
        t23=findViewById(R.id.bn23);
        t24=findViewById(R.id.bn24);
        t25=findViewById(R.id.bn25);
        t26=findViewById(R.id.bn26);
        t27=findViewById(R.id.bn27);
        t28=findViewById(R.id.bn28);
        t29=findViewById(R.id.bn29);
        t30=findViewById(R.id.bn30);
        t31=findViewById(R.id.bn31);
        t32=findViewById(R.id.bn32);
        t33=findViewById(R.id.bn33);
        t34=findViewById(R.id.bn34);
        t35=findViewById(R.id.bn35);
        t36=findViewById(R.id.bn36);
        t37=findViewById(R.id.bn37);
        t38=findViewById(R.id.bn38);
        t39=findViewById(R.id.bn39);
        t40=findViewById(R.id.bn40);
        t41=findViewById(R.id.bn41);
        t42=findViewById(R.id.bn42);
        t43=findViewById(R.id.bn43);
        t44=findViewById(R.id.bn44);
        t45=findViewById(R.id.bn45);
        t46=findViewById(R.id.bn46);
        t47=findViewById(R.id.bn47);
        t48=findViewById(R.id.bn48);
        t49=findViewById(R.id.bn49);
        t50=findViewById(R.id.bn50);
        t51=findViewById(R.id.bn51);
        t52=findViewById(R.id.bn52);
        t53=findViewById(R.id.bn53);
        t54=findViewById(R.id.bn54);
        t55=findViewById(R.id.bn55);
        t56=findViewById(R.id.bn56);
        t57=findViewById(R.id.bn57);
        t58=findViewById(R.id.bn58);
        t59=findViewById(R.id.bn59);
        t60=findViewById(R.id.bn60);
        t61=findViewById(R.id.bn61);
        t62=findViewById(R.id.bn62);
        t63=findViewById(R.id.bn63);
        t64=findViewById(R.id.bn64);
        t65=findViewById(R.id.bn65);
        t66=findViewById(R.id.bn66);
        t67=findViewById(R.id.bn67);
        t68=findViewById(R.id.bn68);
        t69=findViewById(R.id.bn69);
        t70=findViewById(R.id.bn70);
        t71=findViewById(R.id.bn71);
        t72=findViewById(R.id.bn72);
        t73=findViewById(R.id.bn73);
        t74=findViewById(R.id.bn74);
        t75=findViewById(R.id.bn75);
        t76=findViewById(R.id.bn76);
        t77=findViewById(R.id.bn77);
        t78=findViewById(R.id.bn78);
        t79=findViewById(R.id.bn79);
        t80=findViewById(R.id.bn80);
        t81=findViewById(R.id.bn81);
        t82=findViewById(R.id.bn82);
        t83=findViewById(R.id.bn83);
        t84=findViewById(R.id.bn84);
        t85=findViewById(R.id.bn85);
        t86=findViewById(R.id.bn86);
        t87=findViewById(R.id.bn87);
        t88=findViewById(R.id.bn88);
        t89=findViewById(R.id.bn89);
        t90=findViewById(R.id.bn90);
        t91=findViewById(R.id.bn91);
        t92=findViewById(R.id.bn92);
        t93=findViewById(R.id.bn93);
        t94=findViewById(R.id.bn94);
        t95=findViewById(R.id.bn95);
        t96=findViewById(R.id.bn96);
        t97=findViewById(R.id.bn97);
        t98=findViewById(R.id.bn98);
        t99=findViewById(R.id.bn99);
        t100=findViewById(R.id.bn100);

        //set onclick listener
        imageView.setOnClickListener(this);
       t1.setOnClickListener(this);
       t2.setOnClickListener(this);
       t3.setOnClickListener(this);
       t4.setOnClickListener(this);
       t5.setOnClickListener(this);
       t6.setOnClickListener(this);
       t7.setOnClickListener(this);
       t8.setOnClickListener(this);
       t9.setOnClickListener(this);
       t10.setOnClickListener(this);
        t11.setOnClickListener(this);
        t12.setOnClickListener(this);
        t13.setOnClickListener(this);
        t14.setOnClickListener(this);
        t15.setOnClickListener(this);
        t16.setOnClickListener(this);
        t17.setOnClickListener(this);
        t18.setOnClickListener(this);
        t19.setOnClickListener(this);
        t20.setOnClickListener(this);
        t21.setOnClickListener(this);
        t22.setOnClickListener(this);
        t23.setOnClickListener(this);
        t24.setOnClickListener(this);
        t25.setOnClickListener(this);
        t26.setOnClickListener(this);
        t27.setOnClickListener(this);
        t28.setOnClickListener(this);
        t29.setOnClickListener(this);
        t30.setOnClickListener(this);
        t31.setOnClickListener(this);
        t32.setOnClickListener(this);
        t33.setOnClickListener(this);
        t34.setOnClickListener(this);
        t35.setOnClickListener(this);
        t36.setOnClickListener(this);
        t37.setOnClickListener(this);
        t38.setOnClickListener(this);
        t39.setOnClickListener(this);
        t40.setOnClickListener(this);
        t41.setOnClickListener(this);
        t42.setOnClickListener(this);
        t43.setOnClickListener(this);
        t44.setOnClickListener(this);
        t45.setOnClickListener(this);
        t46.setOnClickListener(this);
        t47.setOnClickListener(this);
        t48.setOnClickListener(this);
        t49.setOnClickListener(this);
        t50.setOnClickListener(this);
        t51.setOnClickListener(this);
        t52.setOnClickListener(this);
        t53.setOnClickListener(this);
        t54.setOnClickListener(this);
        t55.setOnClickListener(this);
        t56.setOnClickListener(this);
        t57.setOnClickListener(this);
        t58.setOnClickListener(this);
        t59.setOnClickListener(this);
        t60.setOnClickListener(this);
        t61.setOnClickListener(this);
        t62.setOnClickListener(this);
        t63.setOnClickListener(this);
        t64.setOnClickListener(this);
        t65.setOnClickListener(this);
        t66.setOnClickListener(this);
        t67.setOnClickListener(this);
        t68.setOnClickListener(this);
        t69.setOnClickListener(this);
        t70.setOnClickListener(this);
        t71.setOnClickListener(this);
        t72.setOnClickListener(this);
        t73.setOnClickListener(this);
        t74.setOnClickListener(this);
        t75.setOnClickListener(this);
        t76.setOnClickListener(this);
        t77.setOnClickListener(this);
        t78.setOnClickListener(this);
        t79.setOnClickListener(this);
        t80.setOnClickListener(this);
        t81.setOnClickListener(this);
        t82.setOnClickListener(this);
        t83.setOnClickListener(this);
        t84.setOnClickListener(this);
        t85.setOnClickListener(this);
        t86.setOnClickListener(this);
        t87.setOnClickListener(this);
        t88.setOnClickListener(this);
        t89.setOnClickListener(this);
        t90.setOnClickListener(this);
        t91.setOnClickListener(this);
        t92.setOnClickListener(this);
        t93.setOnClickListener(this);
        t94.setOnClickListener(this);
        t95.setOnClickListener(this);
        t96.setOnClickListener(this);
        t97.setOnClickListener(this);
        t98.setOnClickListener(this);
        t99.setOnClickListener(this);
        t100.setOnClickListener(this);



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
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bn_backID:
               onBackPressed();
                break;
            case R.id.bn1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এক", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দুই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তিন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চার", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পাঁচ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছয়", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাত", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আট", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("নয়", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("দশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn11:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("এগারো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn12:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বারো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn13:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তেরো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn14:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চৌদ্দ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn15:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পনেরো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn16:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ষোল", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn17:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সতেরো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn18:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আঠারো", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn19:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("উনিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn20:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("কুঁড়ি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn21:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একুশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn22:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাইশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn23:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তেইশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn24:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চব্বিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn25:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঁচিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn26:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছাব্বিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn27:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাতাশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn28:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আঠাশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn29:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঊনত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn30:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn31:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn32:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn33:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তেত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn34:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চৌত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn35:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঁয়ত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn36:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn37:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাঁয় ত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn38:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আট ত্রিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn39:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঊনচল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn40:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn41:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একচল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn42:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বিয়াল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn43:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তেতাল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn44:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চুয়াল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn45:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঁয়তাল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn46:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছেচল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn47:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাতচল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn48:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আটচল্লিশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn49:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঊনপঞ্চাশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn50:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঞ্চাশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn51:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একান্ন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn52:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাহান্ন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn53:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তিপ্পান্ন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn54:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চুয়ান্ন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn55:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঞ্চান্ন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn56:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছাপ্পান্ন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn57:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাতান্ন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn58:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আটান্ন", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn59:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঊনষাট", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn60:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ষাট", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn61:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একষট্টি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn62:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাষট্টি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn63:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তেষট্টি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn64:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চৌষট্টি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn65:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঁয়ষট্টি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn66:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছেষট্টি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn67:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাতষট্টি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn68:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আটষট্টি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn69:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঊনসত্তর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn70:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সত্তর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn71:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একাত্তর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn72:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বাহাত্তর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn73:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তিয়াত্তর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn74:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চুয়াত্তর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn75:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঁচাত্তর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn76:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছিয়াত্তর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn77:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাতাত্তর", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn78:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আটাত্তার", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn79:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঊনআশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn80:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn81:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একাশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn82:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বিরাশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn83:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তিরাশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn84:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চুরাশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn85:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঁচাশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn86:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছিয়াশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn87:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাতাশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn88:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আটআশি", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn89:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ঊননব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn90:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("নব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn91:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একানব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn92:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("বিরানব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn93:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("তিরানব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn94:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("চুরানব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn95:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("পঁচানব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn96:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("ছিয়ানব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn97:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("সাতানব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn98:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("আটানব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn99:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("নিরানব্বই", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.bn100:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("একশ", TextToSpeech.QUEUE_FLUSH, null);
                break;
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