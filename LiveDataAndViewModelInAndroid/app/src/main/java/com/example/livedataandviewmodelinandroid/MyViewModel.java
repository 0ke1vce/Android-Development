package com.example.livedataandviewmodelinandroid;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
   MutableLiveData<Integer> counter=new MutableLiveData<>();
//   lIVE DATA HOLDER IS AN OBSERVABLE DATA HOLDER CLASS WHICH IS DESIGNED TO HOLD AND OBSERVE DATA CHANGES. IT AUTOMATICALLY UPDATES THE UI

//   int counter=0;

    public void increasecounter(View view){
//        Retrieve the current value from livedata
        int currentValue=counter.getValue()!=null?counter.getValue():0;
//        above line of code means currentValue-> counter.getValue() when it is not null if counter.getValue() is null the currentValue->0

//            now increasing the counter by 1
        counter.setValue(currentValue+1);


//        counter++;
    }

//    public int getCounter(){
    public LiveData<Integer> getCounter(){
        return counter;
    }

}
