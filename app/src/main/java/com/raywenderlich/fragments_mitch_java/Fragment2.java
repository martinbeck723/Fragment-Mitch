package com.raywenderlich.fragments_mitch_java;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    private static final String TAG = "Fragment1";

    private Button btnNavFrag1;
    private Button btnNavFrag2;
    private Button btnNavFrag3;
    private Button btnNavSecondActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout, container, false);
        btnNavFrag1 = (Button) view.findViewById(R.id.btnNavFrag1);
        btnNavFrag2 = (Button) view.findViewById(R.id.btnNavFrag2);
        btnNavFrag3 = (Button) view.findViewById(R.id.btnNavFrag3);
        btnNavSecondActivity = (Button) view.findViewById(R.id.btnNavSecondActivity);
        Log.d(TAG, "onCreateView: started.");

        btnNavFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going to Fragment 1, ", Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        btnNavFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going to Fragment 2, ",Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        btnNavFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going to Fragment 3, ",Toast.LENGTH_SHORT).show();
                //navigate to fragment method called
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });

        btnNavSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"going to second activity, ",Toast.LENGTH_SHORT).show();
                //tow lines below navigate to other activity
                Intent intent=new Intent(getActivity(),SecondActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
