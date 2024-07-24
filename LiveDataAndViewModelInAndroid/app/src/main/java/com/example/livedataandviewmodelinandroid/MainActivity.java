package com.example.livedataandviewmodelinandroid;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.livedataandviewmodelinandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   MyViewModel viewModel;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);

    viewModel=new ViewModelProvider(this).get(MyViewModel.class);
//Linking mainbinding with viewmodel object
        mainBinding.setMyviewmodel(viewModel);


   /*
    mainBinding.button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            viewModel.increasecounter();
//            mainBinding.textView2.setText(""+viewModel.getCounter());
        }
    });
//        mainBinding.textView2.setText(""+viewModel.getCounter());
*/



//        Observing the Live data
        viewModel.getCounter().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer counter) {
//                    Updating the UI when Live data changes
                mainBinding.textView2.setText(""+counter);
            }
        });

    }
}



/*

View Model is a class that is responsible for prepraring and managing the data for an activity or fragment.
It also handles the communication of the Activity/Fragment with rest of Application.

View Model Class is a buiesness logic or screen level state holder. It exposes the state to UI and encapsulates related Buiesness logic.

 */
