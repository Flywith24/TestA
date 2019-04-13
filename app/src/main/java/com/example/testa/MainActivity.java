package com.example.testa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testbase.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float a = Utils.dp2px(20f);
    }
}
