package com.example.mohammadsk.to_let.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.mohammadsk.to_let.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MohammadSk on 30-Oct-17.
 */

public class AddPostFragment extends Fragment {

    private Spinner zoneBox, districtBox, spaceType;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_add_post_layout, container, false);

        zoneBox = view.findViewById(R.id.spinnerZone);
        districtBox = view.findViewById(R.id.spinnerDistrict);
        spaceType = view.findViewById(R.id.spinnerSelectionRoom);

        setSpinner(zoneBox, R.array.spinner_zone_array);
        setSpinner(districtBox, R.array.spinner_district_array);
        setSpinner(spaceType, R.array.spinner_room_type_array);

        return view;
    }

    private void setSpinner(Spinner spinner, int textArrayResId){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), textArrayResId, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

}
