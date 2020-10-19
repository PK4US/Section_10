package com.Lesson_3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;

    public BlankFragment() { }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("___________________________________________________onCreate: Создание фрагмента");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        log("___________________________________________________onCreateView: Создание интерфейса");
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        log("___________________________________________________onAttach: Ассоциирование фрагмента с Activity");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        log("___________________________________________________onAttach: Снятие ассоциации фрагмента с Activity");
        mListener = null;
    }

    public void onStart() {
        super.onStart();
        log("___________________________________________________onStart: Фрагмент активен");
    }

    public void onResume() {
        super.onResume();
        log("___________________________________________________onResume: Фрагмент видим");
    }

    public void onPause() {
        super.onPause();
        log("___________________________________________________onPause: Пользователь убрал фрагмент из поля видимости");
    }

    public void onStop() {
        super.onStop();
        log("___________________________________________________onStop: Фрагмент становится невидимым");
    }

    public void onDestroy() {
        super.onDestroy();
        log("___________________________________________________onDestroy: Окончательное удаление фрагмента");
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    private void log (String msg){
        System.out.println(msg);
    }
}