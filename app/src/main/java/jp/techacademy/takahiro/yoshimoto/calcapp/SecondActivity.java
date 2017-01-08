package jp.techacademy.takahiro.yoshimoto.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;



public class SecondActivity extends AppCompatActivity {

    int value1 = 0;
    int value2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        value1 = getIntent().getIntExtra("VALUE1", 0);
        value2 = getIntent().getIntExtra("VALUE2", 0);
        String button = getIntent().getStringExtra("Button");

        TextView result = (TextView)findViewById(R.id.result);

        if(button.equals("plus")){
            result.setText(String.valueOf(value1 + value2));
        }else if(button.equals("minus")){
            result.setText(String.valueOf(value1 - value2));
        }else if(button.equals("times")){
            result.setText(String.valueOf(value1 * value2));
        }else if(button.equals("division")){
            result.setText(String.valueOf(value1 / value2));
        }

    }
}
