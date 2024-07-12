package com.example.viewpagerinandroid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {
        ViewPager2 viewpager;
        MyNewPagerAdapter myAdapter;
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




    }
}


/*
View Pager is a layout manager that allows the user to flip left and right through pages of data
iT'S Mostly found in app like  Youtube where user switches left and right to switch to a screen. Instead using of activities, fragments are used
It's also used to guide the user when you installs the app for the first time
 */

// In android documentation of viewpager2 copy the code and paste it to the gradle Scripts->build.gradle.kts->dependencies


// Fragements are use to create swipable section within view pager layout