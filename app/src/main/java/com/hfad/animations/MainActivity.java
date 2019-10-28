package com.hfad.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import com.hanks.htextview.base.HTextView;

import java.util.ArrayList;

import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    private HTextView textView,textViewScale,textViewRainBow,textViewTyper,textViewFade,textViewLine;
    int delay = 2000; //milliseconds
    Handler handler;
    ArrayList<String> arrMessages = new ArrayList<>();
    int position=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrMessages.add("Hello, Adarsh!");
        arrMessages.add("Hello, World!");
        arrMessages.add("Animations");
        arrMessages.add("By Adarsh Rna");
        arrMessages.add("@adarshrana205");
        arrMessages.add("How are you?");
        arrMessages.add("Support me");
        textView = findViewById(R.id.textView);
        textViewScale= findViewById(R.id.textViewScale);
        textViewRainBow= findViewById(R.id.textViewRainBow);
        textViewTyper= findViewById(R.id.textViewTyper);
        textViewFade= findViewById(R.id.textViewFade);
        textViewLine= findViewById(R.id.textViewLine);

        /* First Message */
        textView.animateText(arrMessages.get(position));
        textViewScale.animateText(arrMessages.get(position));
        textViewRainBow.animateText(arrMessages.get(position));
        textViewTyper.animateText(arrMessages.get(position));
        textViewFade.animateText(arrMessages.get(position));
        textViewLine.animateText(arrMessages.get(position));
        position++;
        handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){

                handler.postDelayed(this, delay);
                if(position>=arrMessages.size())
                    position=0;
                textView.animateText(arrMessages.get(position));
                textViewScale.animateText(arrMessages.get(position));
                textViewRainBow.animateText(arrMessages.get(position));
                textViewTyper.animateText(arrMessages.get(position));
                textViewFade.animateText(arrMessages.get(position));
                textViewLine.animateText(arrMessages.get(position));
                position++;
            }
        }, delay);


    }
}
