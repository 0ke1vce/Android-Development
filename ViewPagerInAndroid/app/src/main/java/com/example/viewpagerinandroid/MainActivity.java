package com.example.viewpagerinandroid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
        ViewPager2 viewpager;
        MyNewPagerAdapter myAdapter;

        TabLayout tablayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        myAdapter=new MyNewPagerAdapter(getSupportFragmentManager(),getLifecycle());
//        getSupportFragmentManager()  --> is commonly called within an activity or fragments to obtain an instance of fragment manager.
//        This instance is used to perform a fragment transaction such as adding,replacing or removing fragments.
// getLifecycle()-->  often use to obtain a reference to the life cycle of current component


//        Adding the fragments in our list
        myAdapter.addfragment(new fragment_1());
        myAdapter.addfragment(new fragment_2());
        myAdapter.addfragment(new fragment_3());

//        Set the orientation
        viewpager =findViewById(R.id.viewPager2);
        viewpager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

//        COnnect the adapter with viewPager2
        viewpager.setAdapter(myAdapter);




        tablayout=findViewById(R.id.tablayout);
//        Connecting tablayout with viewpager
        new TabLayoutMediator(tablayout
                , viewpager, new TabLayoutMediator.TabConfigurationStrategy() {

            //                ,((tab, position) -> {
//                    This lambda function allows you to customise the tabs for each tabs corresponding to the fragment
//            tab-> represent the current tab in the tab layout.   position-> represent the position of fragment within the Viewpager2

            //        }
//        ));  //use to integrate tablayout with viewpager2


            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                    tab.setText("Fragment "+(position+1));

            }
        }).attach();   //the attach() is called at the end to attach the tab layout mediator to the tab layout and Viewpager2
    }
}


/*
View Pager is a layout manager that allows the user to flip left and right through pages of data
iT'S Mostly found in app like  Youtube where user switches left and right to switch to a screen. Instead using of activities, fragments are used
It's also used to guide the user when you installs the app for the first time
 */

// In android documentation of viewpager2 copy the code and paste it to the gradle Scripts->build.gradle.kts->dependencies


// Fragements are use to create swipable section within view pager layout