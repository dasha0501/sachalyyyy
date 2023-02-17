package com.example.sachaliivibor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn2 = (Button)findViewById(R.id.button2);
        final Button btn3 = (Button)findViewById(R.id.button3);
        final TextView vopros = (TextView) findViewById(R.id.vopros);
        final TextView point1 = (TextView) findViewById(R.id.point1);

        final int[] power = {0,1};


        btn2.setClipToOutline(true);
        btn3.setClipToOutline(true);
        vopros.setClipToOutline(true);



        TextView text = (TextView) findViewById(R.id.text);
        Button btn = (Button) findViewById(R.id.btn);
        View.OnClickListener oclbtn = new View.OnClickListener()
        {
            @Override
            public void onClick(View v){

                long seconds = 20;


                CountDownTimer timer = new CountDownTimer(seconds  * 1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished)
                    {
                        text.setText(Long.toString(millisUntilFinished/1000));
                        btn.setVisibility(View.GONE);
                    }

                    @Override
                    public void onFinish() {
                        text.setText("Конец");
                    }
                };

                timer.start();


            }
        };
        btn.setOnClickListener(oclbtn);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setText("Ответ правильный");
                btn3.setBackgroundColor(getResources().getColor(R.color.green));
                point1.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setText("Неправильно");
                btn2.setBackgroundColor(getResources().getColor(R.color.red));

            }
        });

    }

}
