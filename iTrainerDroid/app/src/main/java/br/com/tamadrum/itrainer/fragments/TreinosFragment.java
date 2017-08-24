package br.com.tamadrum.itrainer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.tamadrum.itrainer.R;

/**
 * Created by ettoreluglio on 20/08/17.
 */

public class TreinosFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_calendario_layout, null);

        return v;
    }
}
