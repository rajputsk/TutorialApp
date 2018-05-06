package com.example.skrajput.tutorialapp.FragmentsFolder;


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


/**
 * A simple {@link Fragment} subclass.
 */
public class ListOfFragment extends Fragment {
    ListView listView;
    String array[]={"Defination","LifeCycle","Communication"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv= inflater.inflate(R.layout.fragment_list, container, false);
        listView=vv.findViewById(R.id.listfragment);
        ArrayAdapter arrayAdapter=new ArrayAdapter(getActivity(),R.layout.my_layout,R.id.maintv2,array);
        listView.setAdapter(arrayAdapter);
        return vv;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),"click"+array[position],Toast.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new DefinitionFragment())
                                .addToBackStack("case0").commit();
                        break;
                    case 1:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new FragLifeDef())
                                .addToBackStack("case1").commit();
                        break;
                    case 2:
                        getFragmentManager().beginTransaction().replace(R.id.contains,new CommFragDef())
                                .addToBackStack("case2").commit();
                        break;
                }
            }
        });
    }
}
