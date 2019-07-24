package com.example.squareshape;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    public boolean Off=true;
    private View circle;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        circle = (View) findViewById(R.drawable.circle);

       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (Off){
                   button1.setBackgroundColor(R.drawable.circle);
                   Off=false;
               }
               else if (!Off) {
                   button1.setBackgroundResource(R.drawable.off);
                   Off = true;
               }

           }

       });

    }
}
