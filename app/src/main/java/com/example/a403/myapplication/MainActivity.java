package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;
    CheckBox checkBox1;
    LinearLayout line;
    RadioButton radioButton1, radioButton2, radioButton3;
    Button button;
    ImageView imageView;
    RadioGroup RG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox);
        line = (LinearLayout)findViewById(R.id.line);
        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        button = (Button)findViewById(R.id.button);
        imageView = (ImageView)findViewById(R.id.imageView);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked) {
                    line.setVisibility(View.VISIBLE);
                }else{
                    line.setVisibility(View.INVISIBLE);
            }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton1.isChecked())
                {
                    imageView.setImageResource(R.drawable.dog);

                }else if(radioButton2.isChecked())
                {
                    imageView.setImageResource(R.drawable.cat);

                }else if(radioButton3.isChecked())
                {
                    imageView.setImageResource(R.drawable.rabbit);
                }
            };
        });


    }
}
