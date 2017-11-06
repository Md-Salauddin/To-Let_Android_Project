package com.example.mohammadsk.to_let;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.mohammadsk.to_let.Fragment.AddPostFragment;
import com.example.mohammadsk.to_let.Fragment.SearchDetailsFragment;
import com.example.mohammadsk.to_let.Fragment.UploadImageFragment;
import com.example.mohammadsk.to_let.Fragment.UserProfileFragment;

public class Main3Activity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolBar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String button = getIntent().getStringExtra("button");

        switch (button){
            case "1":
                loadFragment(new UserProfileFragment());
                break;
            case "2":
                loadFragment(new UploadImageFragment());
                break;
            case "3":
                loadFragment(new AddPostFragment());
                break;
            case "4":
                loadFragment(new SearchDetailsFragment());
                break;
        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void loadFragment(Fragment fragment){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout2, fragment);
        fragmentTransaction.commit();
    }

}
