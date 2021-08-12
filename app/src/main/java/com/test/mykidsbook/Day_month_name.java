package com.test.mykidsbook;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class Day_month_name extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_day_month_name);

        //assign variable
        tabLayout=findViewById(R.id.tab_layout1);
        viewPager=findViewById(R.id.view_pager1);

        //Initial arraylist

        ArrayList<String> arrayList=new ArrayList<>();

        //add tittle in array list

        arrayList.add("দিন");
        arrayList.add("মাস");
        arrayList.add("ঋতু");

        //prepare view pager
        prepareVierPager(viewPager,arrayList);

        tabLayout.setupWithViewPager(viewPager);


    }

    private void prepareVierPager(ViewPager viewPager, ArrayList<String> arrayList) {
        //initial main adapter
        MainAdapter adapter=new MainAdapter(getSupportFragmentManager());

        //initial main fragment
        //DayFragment fragment=new DayFragment();
        Fragment fragment=null;
        for(int i=0;i<arrayList.size();i++){

            if(i==0){
                adapter.addFragment(fragment,arrayList.get(i));
                fragment=new DayFragment();
            }
        }
        viewPager.setAdapter(adapter);

    }

    private class MainAdapter extends FragmentPagerAdapter {
        //initial array list
        ArrayList<String> arrayList=new ArrayList<>();
        List<Fragment> fragmentList=new ArrayList<>();

        //create constructor
        public void addFragment(Fragment fragment,String tittle){
            //add tittle
            arrayList.add(tittle);
            //add fragment
            fragmentList.add(fragment);

        }

        public MainAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return arrayList.get(position);
        }
    }
}