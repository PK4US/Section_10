package com.Lesson_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ButtonFragment.FragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void update(String data) {
        TextFragment textFragment = (TextFragment) getSupportFragmentManager().findFragmentById(R.id.textFragment);
        textFragment.setTV(data);
    }
}