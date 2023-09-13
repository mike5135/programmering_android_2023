package com.example.myapplication8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

  //  private static TextView showRandom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        // Retrieve the random number from the Intent
        Intent intent = getIntent();
        if (intent != null) {
            int randomNumber = intent.getIntExtra("RANDOM_NUMBER", 0);

            // Display the random number in a TextView
            TextView textView = findViewById(R.id.textview_random);
            textView.setText(Integer.toString(randomNumber));

        }
    }

    public void openMain1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

}