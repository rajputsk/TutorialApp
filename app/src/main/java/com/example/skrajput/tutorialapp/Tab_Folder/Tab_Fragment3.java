package com.example.skrajput.tutorialapp.Tab_Folder;


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
public class Tab_Fragment3 extends Fragment {
ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv= inflater.inflate(R.layout.tab_fragment3, container, false);
        imageView=vv.findViewById(R.id.imagecontaineroutput);

        PhotoViewAttacher photoViewAttacher=new PhotoViewAttacher(imageView);//For Zoom ImageView
        photoViewAttacher.update();

        if (getFragmentManager().findFragmentByTag("0")!=null){
            int im=getResources().getIdentifier(String.valueOf(R.drawable.manifest2),null,null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("1")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.manifest2), null, null);
            imageView.setImageResource(im);
        }


        else if (getFragmentManager().findFragmentByTag("2")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.btnop), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("3")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.rbtnop), null, null);
            imageView.setImageResource(im);
        }


        else if (getFragmentManager().findFragmentByTag("4")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.cboxoutput), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("5")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.rbaroutput), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("6")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.pbarop), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("7")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.sbarop), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("8")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.switchop), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("9")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.tbtnop), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("10")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.spinnerop), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("11")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.atvop), null, null);
            imageView.setImageResource(im);
        }


        return vv;
    }

}
