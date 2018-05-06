package com.example.skrajput.tutorialapp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.skrajput.tutorialapp.ActivitiesFolder.ActivityList;
import com.example.skrajput.tutorialapp.BasicsFolder.BasicsList;
import com.example.skrajput.tutorialapp.FragmentsFolder.ListOfFragment;
import com.example.skrajput.tutorialapp.IntentFolder.IntentListDefs;
import com.example.skrajput.tutorialapp.Widgets.AndroidWidgets;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainList extends Fragment {

    GridView listView;
    String array[] = {"Basics", "Activity", "Fragment", "Intent", "Android Widgets"};

    String img[] = {String.valueOf(R.drawable.basic), String.valueOf(R.drawable.basic), String.valueOf(R.drawable.basic)
            , String.valueOf(R.drawable.basic), String.valueOf(R.drawable.basic)};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        View vv = inflater.inflate(R.layout.main_list, container, false);
        listView = vv.findViewById(R.id.list1);
        //ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),R.layout.my_layout_mainlist,R.id.maintv, array);
        MyAdapter adapter = new MyAdapter(getContext(),array,img);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        getFragmentManager().beginTransaction().replace(R.id.contains, new BasicsList())
                                .addToBackStack("Case0").commit();
                        break;

                    case 1:
                        getFragmentManager().beginTransaction().replace(R.id.contains, new ActivityList())
                                .addToBackStack("Case1").commit();
                        break;

                    case 2:
                        FragmentManager fragmentManager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.contains, new ListOfFragment());
                        fragmentTransaction.addToBackStack("Case2");
                        fragmentTransaction.commit();
                        break;

                    case 3:
                        getFragmentManager().beginTransaction().replace(R.id.contains, new IntentListDefs())
                                .addToBackStack("Case3").commit();
                        break;

                    case 4:
                        getFragmentManager().beginTransaction().replace(R.id.contains, new AndroidWidgets())
                                .addToBackStack("Case4").commit();
                        break;

                }
            }
        });
        return vv;

    }

            class MyAdapter extends ArrayAdapter<String> {

                public MyAdapter(Context context, String[] array, String[] img) {
                    super(context, R.layout.my_layout_mainlist, R.id.maintv, array);
                }

                @NonNull
                @Override
                public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                    LayoutInflater inflater = getLayoutInflater();
                    View vv = inflater.inflate(R.layout.my_layout_mainlist, parent, false);

                    final TextView textView = vv.findViewById(R.id.maintv);
                    textView.setText(array[position]);
//                    textView.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            Toast.makeText(getContext(), "textview "+array[position], Toast.LENGTH_SHORT).show();
//                            //START POSITION
//                            switch (position) {
//                                case 0:
//                                    getFragmentManager().beginTransaction().replace(R.id.contains, new BasicsList())
//                                            .addToBackStack("Case0").commit();
//                                    break;
//
//                                case 1:
//                                    getFragmentManager().beginTransaction().replace(R.id.contains, new ActivityList())
//                                            .addToBackStack("Case1").commit();
//                                    break;
//
//                                case 2:
//                                    FragmentManager fragmentManager = getFragmentManager();
//                                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                                    fragmentTransaction.replace(R.id.contains, new ListOfFragment());
//                                    fragmentTransaction.addToBackStack("Case2");
//                                    fragmentTransaction.commit();
//                                    break;
//
//                                case 3:
//                                    getFragmentManager().beginTransaction().replace(R.id.contains, new IntentListDefs())
//                                            .addToBackStack("Case3").commit();
//                                    break;
//
//                                case 4:
//                                    getFragmentManager().beginTransaction().replace(R.id.contains, new AndroidWidgets())
//                                            .addToBackStack("Case4").commit();
//                                    break;
//
//                            }
//                            // END POSITION
//                        }
//                    });


                    final ImageButton imageButton = vv.findViewById(R.id.mainimg);
                    imageButton.setImageResource(Integer.parseInt(img[position]));
//                    imageButton.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            Toast.makeText(getContext(), "img"+img[position], Toast.LENGTH_SHORT).show();
//
//                            //START POSITION
//                            switch (position) {
//                                case 0:
//                                    getFragmentManager().beginTransaction().replace(R.id.contains, new BasicsList())
//                                            .addToBackStack("Case0").commit();
//                                    break;
//
//                                case 1:
//                                    getFragmentManager().beginTransaction().replace(R.id.contains, new ActivityList())
//                                            .addToBackStack("Case1").commit();
//                                    break;
//
//                                case 2:
//                                    FragmentManager fragmentManager = getFragmentManager();
//                                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                                    fragmentTransaction.replace(R.id.contains, new ListOfFragment());
//                                    fragmentTransaction.addToBackStack("Case2");
//                                    fragmentTransaction.commit();
//                                    break;
//
//                                case 3:
//                                    getFragmentManager().beginTransaction().replace(R.id.contains, new IntentListDefs())
//                                            .addToBackStack("Case3").commit();
//                                    break;
//
//                                case 4:
//                                    getFragmentManager().beginTransaction().replace(R.id.contains, new AndroidWidgets())
//                                            .addToBackStack("Case4").commit();
//                                    break;
//
//                            }
//                            // END POSITION
//
//                        }
//                    });


                    return vv;
                }
            }



//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getActivity(), "clicked" + " " + array[position], Toast.LENGTH_SHORT).show();
//
//                switch (position) {
//                    case 0:
//                        getFragmentManager().beginTransaction().replace(R.id.contains, new BasicsList())
//                                .addToBackStack("Case0").commit();
//                        break;
//
//                    case 1:
//                        getFragmentManager().beginTransaction().replace(R.id.contains, new ActivityList())
//                                .addToBackStack("Case1").commit();
//                        break;
//
//                    case 2:
//                        FragmentManager fragmentManager = getFragmentManager();
//                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                        fragmentTransaction.replace(R.id.contains, new ListOfFragment());
//                        fragmentTransaction.addToBackStack("Case2");
//                        fragmentTransaction.commit();
//                        break;
//
//                    case 3:
//                        getFragmentManager().beginTransaction().replace(R.id.contains, new IntentListDefs())
//                                .addToBackStack("Case3").commit();
//                        break;
//
//                    case 4:
//                        getFragmentManager().beginTransaction().replace(R.id.contains, new AndroidWidgets())
//                                .addToBackStack("Case4").commit();
//                        break;
//
//                }
//
//            }
//        });
//    }


}
