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

public class English_poem extends AppCompatActivity {
    private ImageView back;
    private TextToSpeech textToSpeech;
    private LinearLayout t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_english_poem);
        back=findViewById(R.id.english_poem_backID);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

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

        t1=findViewById(R.id.english_poem1);
        t2=findViewById(R.id.english_poem2);
        t3=findViewById(R.id.english_poem3);
        t4=findViewById(R.id.english_poem4);
        t5=findViewById(R.id.english_poem5);
        t6=findViewById(R.id.english_poem6);
        t7=findViewById(R.id.english_poem7);
        t8=findViewById(R.id.english_poem8);
        t9=findViewById(R.id.english_poem9);
        t10=findViewById(R.id.english_poem10);
        t11=findViewById(R.id.english_poem11);
        t12=findViewById(R.id.english_poem12);

        //on click start
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name Early to Bed. Early to bed, Early to rise, Makes a man, Healthy, Wealthy, and Wise.", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name Twinkle Twinkle Little Star. Twinkle, Twinkle, little star, How I wonder what you are? Up above the world so high, Like a diamond in the sky. " +
                        " Twinkle, Twinkle, little star, How I wonder what you are! When the blazing sun is, gone, When he nothing shines, upon, Then you show your little, light." +
                        "Twinkle, Twinkle, all the night. Twinkle, Twinkle, little star, How I wonder what you are!", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name Johny Johny Yes Papa. Johny Johny, Yes Papa, Eating sugar? No Papa, Telling lies? No Papa, Open your mouth, Ha! Ha! Ha!", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name Humpty Dumpty. Humpty Dumpty sat on a , wall, Humpty Dumpty had a, great fall, All the king's horses and, all the king's men, Couldn't put Humpthy " +
                        "together again.", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name Baa Baa Black Sheep. Baa, baa, black sheep, Have you any wool? Yes sir, yes sir, Three bags full. " +
                        "One for the master, And one for the dame, And one for the little boy, Who lives down the lane.", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name Pussy Cat Pussy Cat. Pussy cat, pussy cat, Where have you been? I've been down to London, To visit the Queen. " +
                        "Pussy cat, pussy cat, What did you there? I frightened a little mouse,  Under her chair.", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name Two Little Dicky Birds. Two little dicky birds, Sat upon a wall. One named Peter, The other named Paul. " +
                        "Fly away Peter, Fly away Paul. Come back Peter! Come back Paul!!", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name One Two Three Four Five. One, two, three, four, five, Once I caught a fish alive. Six, seven, eight, nine, ten, Then I let it go again. " +
                        "Why did you let it go? Because it bit my finger so. Which finger did it bite? This little finger on the right.", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name One Two Buckle My Shoe. One, two, Buckle my shoe. Three, four, Knock at the door. Five, six, Pick up sticks. Seven, eight, Lay them straight. " +
                        "Nine, ten, A big fat hen. Eleven, twelve, Dig and delve. Thirteen, fourteen, Maids a-courting. Fifteen, sixteen, Maids in the kitchen. Seventeen, eighteen, Maids a-waiting. " +
                        "Nineteen, twenty, My plate's empty.", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name Teddy Bear, Teddy Bear. Teddy bear, teddy bear, Turn around! Teddy bear, teddy bear, Touch the ground! Teddy bear, teddy bear, Jump up high! Teddy bear, teddy bear, Touch the sky! " +
                        "Teddy bear, teddy bear, Bend down low! Teddy bear, teddy bear, Touch you toes! Teddy bear, teddy bear, Turn out the light! Teddy bear, teddy bear, Say good night!", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name Hey Diddle Diddle. Hey diddle diddle, The cat and the fiddle, The cow jumped over the moon. " +
                        "The little dog laughed to, see such sport, And the dish ran away, with the spoon.", TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.setPitch(1f);
                textToSpeech.setSpeechRate(0.9f);
                textToSpeech.speak("Poem name I'm a Little Teapot. I'm a little teapot, Short and stout, Here is my handle, Here is my spout. " +
                        "When I get all steamed up, Hear me shout, Tip me over, and pour me out.", TextToSpeech.QUEUE_FLUSH, null);
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