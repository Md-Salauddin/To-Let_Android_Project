package com.example.mohammadsk.to_let;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.mohammadsk.to_let.Fragment.AddPostFragment;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

public class Main2Activity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;
    private BoomMenuButton rightMenuButton;
    private BottomNavigationView bottomNavigationView;

    private int[] icons;
    private String[] iconTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolBar);
        rightMenuButton = (BoomMenuButton) findViewById(R.id.action_bar_left_bmb);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationBar);

        setSupportActionBar(toolbar);

        icons = new int[]{
            R.drawable.search, R.drawable.message, R.drawable.logout
        };

        iconTitle = new String[]{
                "Search","Message","Log out"
        };

        //
        rightMenuButton.setButtonEnum(ButtonEnum.TextOutsideCircle);
        rightMenuButton.setPiecePlaceEnum(PiecePlaceEnum.DOT_3_1);
        rightMenuButton.setButtonPlaceEnum(ButtonPlaceEnum.SC_3_1);

        for (int i=0; i<rightMenuButton.getButtonPlaceEnum().buttonNumber(); i++){
            rightMenuButton.addBuilder(new TextOutsideCircleButton.Builder().
                    normalImageRes(icons[i]).
                    normalText(iconTitle[i]).
                    listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {
                            switch (index){
                                case 0:
                                    Intent intentProfile = new Intent(Main2Activity.this, Main3Activity.class);
                                    intentProfile.putExtra("button","4");
                                    startActivity(intentProfile);
                                    break;
                                case 1:
                                    Toast.makeText(Main2Activity.this,"Message",Toast.LENGTH_SHORT).show();
                                    break;
                                case 2:
                                    finish();
                                    break;
                            }
                        }
                    }));
        }

        //
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.userProfile:
                        Intent intentProfile = new Intent(Main2Activity.this, Main3Activity.class);
                        intentProfile.putExtra("button","1");
                        startActivity(intentProfile);
                        break;
                    case R.id.userUploadImage:
                        Intent intentUploadImage = new Intent(Main2Activity.this, Main3Activity.class);
                        intentUploadImage.putExtra("button","2");
                        startActivity(intentUploadImage);
                        break;
                    case R.id.addPost:
                        Intent intentAddPost = new Intent(Main2Activity.this, Main3Activity.class);
                        intentAddPost.putExtra("button","3");
                        startActivity(intentAddPost);
                        break;
                }
                return true;
            }
        });
    }

}
