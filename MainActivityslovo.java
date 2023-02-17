package com.example.soedinenieslov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn7 = (Button)findViewById(R.id.button22);
        Button btn6 = (Button)findViewById(R.id.button21);
        Button check = (Button)findViewById(R.id.buttoncheck);
        TextView word2 = (TextView) findViewById(R.id.word2);
        TextView word3 = (TextView) findViewById(R.id.word3);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                word2.setVisibility(View.VISIBLE);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                word3.setVisibility(View.VISIBLE);
                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast = Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
            }

        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Введите слово", Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }

}
