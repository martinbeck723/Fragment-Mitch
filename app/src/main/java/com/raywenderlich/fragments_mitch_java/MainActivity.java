package com.raywenderlich.fragments_mitch_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsStatePagerAdapter mSectionsStatePagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");

        mViewPager=(ViewPager) findViewById(R.id.container);
        //setup the pager
        setupViewPager(mViewPager);




    }
    //setup the pager method
    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter= new SectionsStatePagerAdapter(getSupportFragmentManager());
        //it will show fragment1 first
        adapter.addFragment(new Fragment1(), "Fragment1 for normal phone screen");
        adapter.addFragment(new Fragment2(), "Fragment2 for medium screen");
        adapter.addFragment(new Fragment3(), "Fragment3 for large screen");

        viewPager.setAdapter(adapter);
    }
    //method for switching to the other fragments
    public void setViewPager (int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }

}
