package com.example.skrajput.tutorialapp.Tab_Folder;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.skrajput.tutorialapp.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabCheck extends Fragment {


    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //((AppCompatActivity)getActivity()).getSupportActionBar().hide();
        // Inflate the layout for this fragment
        View vv= inflater.inflate(R.layout.tab_check, container, false);

//        Toolbar toolbar=vv.findViewById(R.id.tool_bar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        //setSupportActionBar(toolbar);

        TabLayout tabLayout=vv.findViewById(R.id.tab_layout);
        final ViewPager viewPager=vv.findViewById(R.id.view_pager);
        tabLayout.addTab(tabLayout.newTab().setText("xml"));
        tabLayout.addTab(tabLayout.newTab().setText("java"));
        tabLayout.addTab(tabLayout.newTab().setText("output"));
//tabLayout.getTabAt(0).setIcon();
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        Tab_MyAdapter adapter=new Tab_MyAdapter(getFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return vv;
    }

}

class Tab_MyAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> arrayList=new ArrayList<>();

    public Tab_MyAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        arrayList.add(new Tab_Fragment1());
        arrayList.add(new Tab_Fragment2());
        arrayList.add(new Tab_Fragment3());

    }

    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }
}