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

public class English_Numbers extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30
            ,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46,t47,t48,t49,t50,t51,t52,t53,t54,t55,t56,t57,t58,t59,t60,t61,t62,t63,t64,t65,t66,t67,t68,t69,t70
            ,t71,t72,t73,t74,t75,t76,t77,t78,t79,t80,t81,t82,t83,t84,t85,t86,t87,t88,t89,t90,t91,t92,t93,t94,t95,t96,t97,t98,t99,t100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_english__numbers);
        //find id
        imageView=findViewById(R.id.ln_backID);
        t1=findViewById(R.id.ln1);
        t2=findViewById(R.id.ln2);
        t3=findViewById(R.id.ln3);
        t4=findViewById(R.id.ln4);
        t5=findViewById(R.id.ln5);
        t6=findViewById(R.id.ln6);
        t7=findViewById(R.id.ln7);
        t8=findViewById(R.id.ln8);
        t9=findViewById(R.id.ln9);
        t10=findViewById(R.id.ln10);
        t11=findViewById(R.id.ln11);
        t12=findViewById(R.id.ln12);
        t13=findViewById(R.id.ln13);
        t14=findViewById(R.id.ln14);
        t15=findViewById(R.id.ln15);
        t16=findViewById(R.id.ln16);
        t17=findViewById(R.id.ln17);
        t18=findViewById(R.id.ln18);
        t19=findViewById(R.id.ln19);
        t20=findViewById(R.id.ln20);
        t21=findViewById(R.id.ln21);
        t22=findViewById(R.id.ln22);
        t23=findViewById(R.id.ln23);
        t24=findViewById(R.id.ln24);
        t25=findViewById(R.id.ln25);
        t26=findViewById(R.id.ln26);
        t27=findViewById(R.id.ln27);
        t28=findViewById(R.id.ln28);
        t29=findViewById(R.id.ln29);
        t30=findViewById(R.id.ln30);
        t31=findViewById(R.id.ln31);
        t32=findViewById(R.id.ln32);
        t33=findViewById(R.id.ln33);
        t34=findViewById(R.id.ln34);
        t35=findViewById(R.id.ln35);
        t36=findViewById(R.id.ln36);
        t37=findViewById(R.id.ln37);
        t38=findViewById(R.id.ln38);
        t39=findViewById(R.id.ln39);
        t40=findViewById(R.id.ln40);
        t41=findViewById(R.id.ln41);
        t42=findViewById(R.id.ln42);
        t43=findViewById(R.id.ln43);
        t44=findViewById(R.id.ln44);
        t45=findViewById(R.id.ln45);
        t46=findViewById(R.id.ln46);
        t47=findViewById(R.id.ln47);
        t48=findViewById(R.id.ln48);
        t49=findViewById(R.id.ln49);
        t50=findViewById(R.id.ln50);
        t51=findViewById(R.id.ln51);
        t52=findViewById(R.id.ln52);
        t53=findViewById(R.id.ln53);
        t54=findViewById(R.id.ln54);
        t55=findViewById(R.id.ln55);
        t56=findViewById(R.id.ln56);
        t57=findViewById(R.id.ln57);
        t58=findViewById(R.id.ln58);
        t59=findViewById(R.id.ln59);
        t60=findViewById(R.id.ln60);
        t61=findViewById(R.id.ln61);
        t62=findViewById(R.id.ln62);
        t63=findViewById(R.id.ln63);
        t64=findViewById(R.id.ln64);
        t65=findViewById(R.id.ln65);
        t66=findViewById(R.id.ln66);
        t67=findViewById(R.id.ln67);
        t68=findViewById(R.id.ln68);
        t69=findViewById(R.id.ln69);
        t70=findViewById(R.id.ln70);
        t71=findViewById(R.id.ln71);
        t72=findViewById(R.id.ln72);
        t73=findViewById(R.id.ln73);
        t74=findViewById(R.id.ln74);
        t75=findViewById(R.id.ln75);
        t76=findViewById(R.id.ln76);
        t77=findViewById(R.id.ln77);
        t78=findViewById(R.id.ln78);
        t79=findViewById(R.id.ln79);
        t80=findViewById(R.id.ln80);
        t81=findViewById(R.id.ln81);
        t82=findViewById(R.id.ln82);
        t83=findViewById(R.id.ln83);
        t84=findViewById(R.id.ln84);
        t85=findViewById(R.id.ln85);
        t86=findViewById(R.id.ln86);
        t87=findViewById(R.id.ln87);
        t88=findViewById(R.id.ln88);
        t89=findViewById(R.id.ln89);
        t90=findViewById(R.id.ln90);
        t91=findViewById(R.id.ln91);
        t92=findViewById(R.id.ln92);
        t93=findViewById(R.id.ln93);
        t94=findViewById(R.id.ln94);
        t95=findViewById(R.id.ln95);
        t96=findViewById(R.id.ln96);
        t97=findViewById(R.id.ln97);
        t98=findViewById(R.id.ln98);
        t99=findViewById(R.id.ln99);
        t100=findViewById(R.id.ln100);
        

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
                    int result = textToSpeech.setLanguage(Locale.ENGLISH);

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
            case R.id.ln_backID:
               onBackPressed();
                break;
            case R.id.ln1:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("One", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln2:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln3:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln4:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln5:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln6:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln7:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln8:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln9:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln10:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ten", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln11:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eleven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln12:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twelve", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln13:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirteen", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln14:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fourteen", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln15:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifteen", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln16:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixteen", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln17:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventeen", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln18:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighteen", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln19:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Nineteen", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln20:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln21:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty one", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln22:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln23:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln24:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln25:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln26:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln27:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln28:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln29:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Twenty nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln30:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln31:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty one", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln32:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln33:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln34:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln35:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln36:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln37:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln38:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln39:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Thirty nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln40:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln41:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty one", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln42:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln43:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln44:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln45:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln46:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln47:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln48:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln49:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Forty nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln50:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln51:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty one", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln52:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln53:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln54:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln55:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln56:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln57:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln58:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln59:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Fifty nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln60:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln61:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty one", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln62:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln63:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln64:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln65:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln66:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln67:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln68:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln69:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Sixty nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln70:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln71:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy one", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln72:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln73:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln74:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln75:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln76:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln77:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln78:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln79:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Seventy nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln80:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln81:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty one", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln82:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln83:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln84:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln85:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln86:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln87:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln88:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln89:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Eighty nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln90:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln91:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety one", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln92:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety two", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln93:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety three", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln94:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety four", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln95:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety five", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln96:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety six", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln97:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety seven", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln98:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety eight", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln99:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Ninety nine", TextToSpeech.QUEUE_FLUSH, null);
                break;
            case R.id.ln100:
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("One Hundred", TextToSpeech.QUEUE_FLUSH, null);
                break;
        }
    }
}