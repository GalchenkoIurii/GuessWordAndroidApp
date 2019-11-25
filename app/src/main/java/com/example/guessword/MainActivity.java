package com.example.guessword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guess_word);

        // letter buttons
        Button btnA = (Button)findViewById(R.id.button12);
        Button btnB = (Button)findViewById(R.id.button11);
        Button btnC = (Button)findViewById(R.id.button10);
        Button btnD = (Button)findViewById(R.id.button9);
        Button btnE = (Button)findViewById(R.id.button8);
        Button btnF = (Button)findViewById(R.id.button17);
        Button btnG = (Button)findViewById(R.id.button16);
        Button btnH = (Button)findViewById(R.id.button15);
        Button btnI = (Button)findViewById(R.id.button14);
        Button btnJ = (Button)findViewById(R.id.button13);

    }
}
