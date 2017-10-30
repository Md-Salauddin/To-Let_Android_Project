package com.example.mohammadsk.to_let;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

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
                                    Toast.makeText(Main2Activity.this,"Search",Toast.LENGTH_SHORT).show();
                                    break;
                                case 1:
                                    Toast.makeText(Main2Activity.this,"Message",Toast.LENGTH_SHORT).show();
                                    break;
                                case 2:
                                    Toast.makeText(Main2Activity.this,"Log out",Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(Main2Activity.this,"My Profile",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.userUploadImage:
                        Toast.makeText(Main2Activity.this,"Upload Image",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.addPost:
                        Toast.makeText(Main2Activity.this,"Add post",Toast.LENGTH_SHORT).show();
                        break;

                }

                return true;
            }
        });

    }
}
