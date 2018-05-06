package com.example.skrajput.tutorialapp.Widgets;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.skrajput.tutorialapp.R;
import com.example.skrajput.tutorialapp.Tab_Folder.TabCheck;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidWidgets extends Fragment {

    ListView listView;
    String arr[]={"TextView", "EditText","Button","RadioButton","Checkbox","RatingBar","ProgressBar","SeekBar","Switch",
                    "ToggleButton","Spinner","AutoComplete TextView"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vv= inflater.inflate(R.layout.fragment_android_widgets, container, false);
        ArrayAdapter arrayAdapter=new ArrayAdapter(getActivity(),R.layout.my_layout,R.id.maintv2,arr);
        listView=vv.findViewById(R.id.listwidgets);
        listView.setAdapter(arrayAdapter);

    return vv;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:

//                        String stringUri = String.valueOf(R.drawable.textview);
//                        Bundle bundle=new Bundle();
//                        bundle.putString("Image",stringUri);
//                        FragmentTransaction ft=getFragmentManager().beginTransaction();
//                        Tab_Fragment1 tab_fragment1= new Tab_Fragment1();
//                        tab_fragment1.setArguments(bundle);
//                        ft.replace(R.id.contains,tab_fragment1).commit();


                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"0")
                                .addToBackStack("tv").commit();
                        break;

                    case 1:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"1")
                                .addToBackStack("et").commit();
                        break;

                    case 2:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"2")
                                .addToBackStack("bt").commit();
                        break;

                    case 3:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"3")
                                .addToBackStack("rb").commit();
                        break;

                    case 4:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"4")
                                .addToBackStack("cb").commit();
                        break;

                    case 5:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"5")
                                .addToBackStack("rbar").commit();
                        break;

                    case 6:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"6")
                                .addToBackStack("pbar").commit();
                        break;

                    case 7:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"7")
                                .addToBackStack("sbar").commit();
                        break;

                    case 8:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"8")
                                .addToBackStack("switch").commit();
                        break;

                    case 9:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"9")
                                .addToBackStack("tb").commit();
                        break;

                    case 10:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"10")
                                .addToBackStack("spinner").commit();
                        break;

                    case 11:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"11")
                                .addToBackStack("actv").commit();
                        break;

//                    case 12:
//                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"12")
//                                .addToBackStack("mactv").commit();
//                        break;
//
//                    case 13:
//                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"13")
//                                .addToBackStack("ctv").commit();
//                        break;
//
//                    case 14:
//                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"14")
//                                .addToBackStack("ts").commit();
//                        break;
//
//                    case 15:
//                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"15")
//                                .addToBackStack("is").commit();
//                        break;
//
//                    case 16:
//                        getFragmentManager().beginTransaction().replace(R.id.contains,new TabCheck(),"16")
//                                .addToBackStack("avf").commit();
//                        break;
                }
            }
        });


    }

}



