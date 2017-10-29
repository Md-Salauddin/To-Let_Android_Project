package com.example.mohammadsk.to_let;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

public class Main2Activity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar toolbar;
    private BoomMenuButton rightMenuButton;

    private int[] icons;
    private String[] iconTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolBar);
        rightMenuButton = (BoomMenuButton) findViewById(R.id.action_bar_left_bmb);

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
                    normalText(iconTitle[i]));
        }

    }
}
