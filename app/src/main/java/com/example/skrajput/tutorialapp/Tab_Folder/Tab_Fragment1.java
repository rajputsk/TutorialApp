package com.example.skrajput.tutorialapp.Tab_Folder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.skrajput.tutorialapp.R;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Tab_Fragment1 extends Fragment {
    ImageView imageView;
    int arr[]={R.drawable.textview,R.drawable.textviewjava};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv= inflater.inflate(R.layout.tab_fragment1, container, false);
        imageView=vv.findViewById(R.id.imagecontainerxml);
        PhotoViewAttacher photoViewAttacher=new PhotoViewAttacher(imageView);//For Zoom ImageView
        photoViewAttacher.update();

        if (getFragmentManager().findFragmentByTag("0")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.textview), null, null);
            imageView.setImageResource(im);

        }
        else if (getFragmentManager().findFragmentByTag("1")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.edittextxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("2")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.btnxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("3")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.rbtnxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("4")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.cboxxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("5")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.rbarxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("6")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.pbarxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("7")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.sbarxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("8")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.switchxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("9")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.tbtnxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("10")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.spinnerxml), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("11")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.atvxml), null, null);
            imageView.setImageResource(im);
        }


//        int position = getResources().getIdentifier(String.valueOf(R.drawable.textview), null, null);
//        Toast.makeText(getActivity(), ""+position, Toast.LENGTH_SHORT).show();
//        imageView.setImageResource(position);
            return  vv;
    }

}
