package jp.techacademy.takahiro.yoshimoto.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText aEditText;
    EditText bEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aEditText = (EditText)findViewById(R.id.EditText1);
        bEditText = (EditText)findViewById(R.id.EditText2);

        Button plus = (Button)findViewById(R.id.plus);
        plus.setOnClickListener(this);

        Button minus = (Button)findViewById(R.id.minus);
        minus.setOnClickListener(this);

        Button times = (Button)findViewById(R.id.times);
        times.setOnClickListener(this);

        Button division = (Button)findViewById(R.id.division);
        division.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        Editable getText1 = aEditText.getText();
        Editable getText2 = bEditText.getText();

        int int1 = Integer.parseInt(getText1.toString());
        int int2 = Integer.parseInt(getText2.toString());

        //Intentのextrasには複数の値を代入できる。
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", int1);
        intent.putExtra("VALUE2", int2);

        if(v.getId() == R.id.plus){
            //＋ボタン押したときの動作
            intent.putExtra("Button", "plus");

        }else if(v.getId() == R.id.minus){
            //－ボタンを押したときの動作
            intent.putExtra("Button", "minus");

        }else if(v.getId() == R.id.times){
            //×ボタンを押したときの動作
            intent.putExtra("Button", "times");

        }else if(v.getId() == R.id.division){
            //÷ボタンを押したときの動作
            intent.putExtra("Button", "division");
        }
        startActivity(intent);
    }
}
