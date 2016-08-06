package com.caoyang.pattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.caoyang.pattern.type.ObserverPatternActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void patternClick(View view) {
        switch (view.getId()) {
            case R.id.tv_pattern_obesrver:
                startActivity(new Intent(this, ObserverPatternActivity.class));
                break;
        }
    }
}
