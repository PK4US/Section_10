package com.MyApp_2;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ButtonAndEditTextFragment extends Fragment {

    private FragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_button_and_edit_text, container, false);
        Button button = view.findViewById(R.id.button);
        EditText editText = view.findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s;
                s = editText.getText().toString();
                String data = s;
                listener.update(data);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        this.listener = (FragmentListener) context;
    }

    public interface FragmentListener{
        void update(String data);
    }
}