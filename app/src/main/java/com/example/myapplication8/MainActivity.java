package com.example.myapplication8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = findViewById(R.id.show_Count);
    }



    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();

    }


    public void countUp(View view) {
        count++;
        if (showCount != null) {
            showCount.setText(Integer.toString(count));
        }

    }

//
    public void randomtal(View view) {
        Random rand1 = new Random();
        int randomNumber = rand1.nextInt(16); // Slumpmässigt heltal mellan 0 och 15 inklusive 15


        // Create an Intent to start the second activity////
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("RANDOM_NUMBER", randomNumber);

        // Start the second activity
        startActivity(intent);
    }
}




