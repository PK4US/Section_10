package com.MyApp_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ButtonAndEditTextFragment.FragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void update(String data) {
        TextViewFragment textViewFragment = (TextViewFragment) getSupportFragmentManager().findFragmentById(R.id.textViewFragment);
        textViewFragment.setTV(data);
    }
}