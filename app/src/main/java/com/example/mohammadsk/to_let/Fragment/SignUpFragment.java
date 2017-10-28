package com.example.mohammadsk.to_let.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohammadsk.to_let.R;

/**
 * Created by MohammadSk on 28-Oct-17.
 */

public class SignUpFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_sign_up_layout, container, false);
        return view;
    }

}
