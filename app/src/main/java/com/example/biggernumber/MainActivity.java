package com.example.biggernumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity { //implements View.OnClickListener {

    TextView tv;
    int number, number1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static int randomNumber() { // Generating random number for 2 different buttons
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        return randomNum;
    }


    public void setTheButtons() {
        number = randomNumber();
        Button left = this.findViewById(R.id.LEFT1);
        left.setText(Integer.toString(number));

        number1 = randomNumber();
        Button right = this.findViewById(R.id.RIGHT1);
        right.setText(Integer.toString(number1));

    }


    public void guessTheBiggerNumberLeft(View view) {
        tv = this.findViewById(R.id.displayText);
        if (number > number1) {
            tv.setText("Congratulations");
            setTheButtons();

        } else {
            tv.setText("Wrong");

            setTheButtons();

        }

    }


    public void guessTheBiggerNumberRight(View view) {
        tv = this.findViewById(R.id.displayText);
        if (number1 > number) {
            tv.setText("Congratulations");
            setTheButtons();

        } else {
            tv.setText("Wrong");

            setTheButtons();

        }
    }
}
