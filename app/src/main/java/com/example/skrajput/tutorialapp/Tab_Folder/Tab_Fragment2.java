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
public class Tab_Fragment2 extends Fragment {

ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv= inflater.inflate(R.layout.tab_fragment2, container, false);
        imageView=vv.findViewById(R.id.imagecontainerjava);
        PhotoViewAttacher photoViewAttacher=new PhotoViewAttacher(imageView);//For Zoom ImageView
        photoViewAttacher.update();
//        int id = getResources().getIdentifier(String.valueOf(R.drawable.textviewjava), null, null);
//        imageView.setImageResource(id);


        if (getFragmentManager().findFragmentByTag("0")!=null){
            int im=getResources().getIdentifier(String.valueOf(R.drawable.textviewjava),null,null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("1")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.edittextjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("2")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.btnjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("3")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.rbtnjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("4")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.cboxjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("5")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.rbarjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("6")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.pbarjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("7")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.sbarjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("8")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.switchjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("9")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.tbtnjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("10")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.spinnerjava), null, null);
            imageView.setImageResource(im);
        }

        else if (getFragmentManager().findFragmentByTag("11")!=null){
            int im = getResources().getIdentifier(String.valueOf(R.drawable.atvjava), null, null);
            imageView.setImageResource(im);
        }


        return vv;
    }

}
