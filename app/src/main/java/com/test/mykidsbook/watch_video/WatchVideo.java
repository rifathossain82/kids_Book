package com.test.mykidsbook.watch_video;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.material.snackbar.Snackbar;
import com.test.mykidsbook.R;

public class WatchVideo extends AppCompatActivity {
VideoView videoView;
    String ss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_watch_video);

        //check connection

        ConnectivityManager connectivityManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
        if(networkInfo!=null && networkInfo.isConnected()==true){

            Bundle bundle=getIntent().getExtras();
            ss=bundle.getString("link");


            MediaController mediaController=new MediaController(this);

            videoView=findViewById(R.id.myvideoID);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);

            Uri uri=Uri.parse(ss);
            videoView.setVideoURI(uri);
            videoView.start();

        }
        else{
            onBackPressed();
            Toast.makeText(this, "You Are Offline, Check Internet Connection!", Toast.LENGTH_LONG).show();

        }




    }
}