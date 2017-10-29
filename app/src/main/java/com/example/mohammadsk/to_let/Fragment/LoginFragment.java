package com.example.mohammadsk.to_let.Fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mohammadsk.to_let.Main2Activity;
import com.example.mohammadsk.to_let.R;


/**
 * Created by MohammadSk on 28-Oct-17.
 */

public class LoginFragment extends Fragment {

    private Button loginButton;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_login_layout, container, false);

        loginButton = (Button) view.findViewById(R.id.userLoginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
