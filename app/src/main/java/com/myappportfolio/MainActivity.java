package com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(View v) {
        if(v.getId() == R.id.buttonSpotify) {
            Toast.makeText(MainActivity.this, "This button will launch Spotify Streamer app", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.buttonScores) {
            Toast.makeText(MainActivity.this, "This button will launch Scores app", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.buttonLibrary) {
            Toast.makeText(MainActivity.this, "This button will launch Library app", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.buttonBuild) {
            Toast.makeText(MainActivity.this, "This button will launch SBuild it bigger app", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.buttonXYZ) {
            Toast.makeText(MainActivity.this, "This button will launch XYZ Reader app", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.buttonCapstone) {
            Toast.makeText(MainActivity.this, "This button will launch Capstone app", Toast.LENGTH_SHORT).show();
        }
    }
}
