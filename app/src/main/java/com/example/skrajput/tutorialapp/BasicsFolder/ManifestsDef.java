package com.example.skrajput.tutorialapp.BasicsFolder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.skrajput.tutorialapp.R;

import uk.co.senab.photoview.PhotoViewAttacher;


/**
 * A simple {@link Fragment} subclass.
 */
public class ManifestsDef extends Fragment {

ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vv= inflater.inflate(R.layout.def_manifests, container, false);
        imageView=vv.findViewById(R.id.maniimg);
        PhotoViewAttacher photoViewAttacher=new PhotoViewAttacher(imageView);//For Zoom ImageView
        photoViewAttacher.update();
        return vv;
    }

}
