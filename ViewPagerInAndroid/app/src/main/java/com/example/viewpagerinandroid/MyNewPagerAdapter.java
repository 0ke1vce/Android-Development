package com.example.viewpagerinandroid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;




public class MyNewPagerAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment>fragmentList=new ArrayList<>();


    public MyNewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
//    This method is responsible for creating and returning a fragment for a specific position within the viewpager2
//    The Purpose of this method is to create a new instance of a fragment based on position parameter
    public Fragment createFragment(int position) {
        return fragmentList.get(position);   // it will return the fragment at that position
    }



    @Override
    public int getItemCount() {  //This method is responsible for returning the total number of elements or  items or fragments that will be displayed in viewpager2
        return fragmentList.size();
    }



    public void addfragment(Fragment fragment){
        fragmentList.add(fragment);   // use to add a new fragment
    }

}
