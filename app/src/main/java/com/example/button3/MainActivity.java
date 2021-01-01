package com.example.button3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int i = 0;

    public void click(View view) {
        Button button = (Button) findViewById(R.id.button);
        i = i + 1;
        if (i == 6) {
            button.setText("Enough to click.go to new start!");
            i = 0;
        } else {
            button.setText("This is click number" + " " + i);
        }
    }
}