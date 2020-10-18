package com.Lesson_2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_text, container, false);
    }

    public  void setTV (String text){
        TextView tv = getView().findViewById(R.id.tv);
        tv.setText(text);

    }
}