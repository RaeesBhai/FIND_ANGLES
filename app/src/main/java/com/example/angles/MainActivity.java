package com.example.angles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText etn;
private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn= (EditText) findViewById(R.id.etn);
        txt1= (TextView) findViewById(R.id.txt1);

    }
    public void btn(View view){
        int n1=Integer.parseInt(etn.getText().toString());
        int result=n1*n1;
        txt1.setText(String.valueOf(result));

    }
}