package com.example.exercise_5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button Btn1;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        input = new EditText(this);
        input.setHint("입력해주세요.");
        baseLayout.addView(input);

        Btn1 = new Button(this);
        Btn1.setText("버튼입니다");
        Btn1.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(Btn1);

        result = new TextView(this);
        result.setTextColor(Color.MAGENTA);
        result.setText("텍스트뷰입니다.");
        result.setTextSize(20);
        baseLayout.addView(result);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(input.getText().toString());
            }
        });
    }
}