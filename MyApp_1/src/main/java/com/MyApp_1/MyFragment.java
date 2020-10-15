package com.MyApp_1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);

        Button button = view.findViewById(R.id.button);
        TextView textView = view.findViewById(R.id.tv);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date = new Date();
                SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH:mm:ss");
                textView.setText(formatForDateNow.format(date));
            }
        });

        return view;
    }
}