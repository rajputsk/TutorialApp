package com.example.skrajput.tutorialapp.FragmentsFolder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.skrajput.tutorialapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CommFragDef extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comm_frag_def, container, false);
    }

}
