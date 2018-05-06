package com.example.skrajput.tutorialapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RatingbarFragment extends Fragment {

RatingBar ratingBar;
Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv = inflater.inflate(R.layout.fragment_ratingbar, container, false);
        ratingBar = vv.findViewById(R.id.ratingbar);
        button=vv.findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalstars=ratingBar.getNumStars();
                float rating=ratingBar.getRating();
             Toast.makeText(getActivity(), "Total Stars: "+totalstars+"\n"+"Rating: "+rating,
                        Toast.LENGTH_SHORT).show();
            }
        });
        return vv;
    }
}
