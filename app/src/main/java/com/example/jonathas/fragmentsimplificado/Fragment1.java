package com.example.jonathas.fragmentsimplificado;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jonathas on 28/09/2017.
 */

public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1, null);

        return v;
    }

    public void alteraTextView(String txt) {

        TextView tv = (TextView) getView().findViewById(R.id.textView); //pegar via view
        tv.setText(txt);
    }

}
