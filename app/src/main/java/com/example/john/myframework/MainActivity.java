package com.example.john.myframework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import easily.tech.guideview.lib.GuideViewBundle;
import easily.tech.guideview.lib.GuideViewFragment;

/**
 * john
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.guide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
