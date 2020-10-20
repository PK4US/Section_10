package com.MyApp_3;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlankFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        System.out.println ("___________________________________________________onCreateView: Создание интерфейса");
        return view;
    }

    @Override
    public void onResume() {
        System.out.println ("___________________________________________________onStart: Фрагмент активен");
        TextView tv = getView().findViewById(R.id.tvNum);
        int num = Integer.parseInt(tv.getText().toString());
        num++;
        tv.setText(String.valueOf(num));
        super.onResume();
    }


}