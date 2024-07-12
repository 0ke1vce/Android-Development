package com.example.fragmentsinandroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class First_fragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(context, "on Attach method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "On create is called", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "On Resume is called", Toast.LENGTH_SHORT).show();
    }

    //    Most Important method to override
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_first_fragment,container,false);
//         Used in Android to inflATE an XML layout resource file into a viiew object.
        Button btn=view.findViewById(R.id.btnfrag1);
        TextView txt=view.findViewById(R.id.textview);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Hello this is first fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return  view;
    }


}