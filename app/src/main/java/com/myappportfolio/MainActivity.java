package com.myappportfolio;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSpotify = (Button)findViewById(R.id.button);
        Button buttonScores = (Button)findViewById(R.id.button);
        Button buttonLibrary = (Button)findViewById(R.id.button);
        Button buttonBuild = (Button)findViewById(R.id.button);
        Button buttonXYZ = (Button)findViewById(R.id.button);
        Button buttonCapstone = (Button)findViewById(R.id.button);

        buttonSpotify.setOnClickListener(this);
        buttonScores.setOnClickListener(this);
        buttonLibrary.setOnClickListener(this);
        buttonBuild.setOnClickListener(this);
        buttonXYZ.setOnClickListener(this);
        buttonCapstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button) {
            Toast.makeText(MainActivity.this, "This button will launch Spotify Streamer app", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.button2) {
            Toast.makeText(MainActivity.this, "This button will launch Scores app", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.button3) {
            Toast.makeText(MainActivity.this, "This button will launch Library app", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.button4) {
            Toast.makeText(MainActivity.this, "This button will launch SBuild it bigger app", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.button5) {
            Toast.makeText(MainActivity.this, "This button will launch XYZ Reader app", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "This button will launch Capstone app", Toast.LENGTH_SHORT).show();
        }
    }
}
