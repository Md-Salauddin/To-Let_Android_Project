package com.example.mohammadsk.to_let.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.example.mohammadsk.to_let.R;

/**
 * Created by MohammadSk on 01-Nov-17.
 */

public class SearchDetailsFragment extends Fragment {

    private Spinner zoneBox, districtBox, spaceType;
    private Switch one, two, three, four;
    private EditText amount;

    private Boolean switchOne, switchTwo, switchThree, switchFour;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_search_details_layout, container, false);

        zoneBox = view.findViewById(R.id.spinnerZoneSearch);
        districtBox = view.findViewById(R.id.spinnerDistrictSearch);
        spaceType = view.findViewById(R.id.spinnerSelectionRoomSearch);

        one = view.findViewById(R.id.switchZone);
        two = view.findViewById(R.id.switchDistrict);
        three = view.findViewById(R.id.switchSelectionRoom);
        four = view.findViewById(R.id.switchAmount);

        amount = view.findViewById(R.id.amountWiseSearch);

        setSpinner(zoneBox, R.array.spinner_zone_array);
        setSpinner(districtBox, R.array.spinner_district_array);
        setSpinner(spaceType, R.array.spinner_room_type_array);

        zoneBox.setEnabled(false);
        districtBox.setEnabled(false);
        spaceType.setEnabled(false);
        amount.setEnabled(false);


        //
        one.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switchOne = one.isChecked();
                if (switchOne){
                    zoneBox.setEnabled(true);
                }
                else{
                    zoneBox.setEnabled(false);
                }
            }
        });
        //
        two.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switchTwo = two.isChecked();
                if (switchTwo){
                    districtBox.setEnabled(true);
                }
                else{
                    districtBox.setEnabled(false);
                }
            }
        });
        //
        three.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switchThree = three.isChecked();
                if (switchThree){
                    spaceType.setEnabled(true);
                }
                else{
                    spaceType.setEnabled(false);
                }
            }
        });
        //
        four.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switchFour = four.isChecked();
                if (switchFour){
                    amount.setEnabled(true);
                }
                else{
                    amount.setEnabled(false);
                }
            }
        });

        return view;
    }

    private void setSpinner(Spinner spinner, int textArrayResId){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), textArrayResId, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
