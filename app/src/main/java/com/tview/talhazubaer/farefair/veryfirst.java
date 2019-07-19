package com.tview.talhazubaer.farefair;

import android.provider.Contacts;
import android.provider.Telephony;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.content.Intent;

public class veryfirst extends AppCompatActivity {

    private ProgressBar progressBar;
    private int prog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_veryfirst);

        progressBar = findViewById(R.id.PBar);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();

            }
        });


        thread.start();
    }

    public void doWork() {

        for (prog=20;prog<=100;prog=prog+20){

            try {
                Thread.sleep(1000);
                progressBar.setProgress(prog);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }

    public void startApp(){
               Intent intent=new Intent(this,MainActivity.class);
               startActivity(intent);
               finish();
    }
}