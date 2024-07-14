package com.example.masteringdatabinding_quadraticequationsolverapp;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.masteringdatabinding_quadraticequationsolverapp.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {
    String a;
    String b;
    String c;

    ActivityMainBinding binding;

    public MyEquation( ActivityMainBinding binding) {

        this.binding = binding;
    }

    public MyEquation() {
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void solveEquation(View view ){
            int x=Integer.parseInt(getA());
            int y=Integer.parseInt(getB());
            int z=Integer.parseInt(getC());

            double D=(y*y)-(4*x*z);

            double X1,X2;
            if(D>0){
                X1=(-y+Math.sqrt(D))/(2*x);
                X2=(-y-Math.sqrt(D))/(2*x);

                binding.textView.setText("X1= "+X1+" X2= "+X2);
            }
            else if (D==0) {
                X1=X2=-y/(2*x);

                binding.textView.setText("X1= "+X1+" X2= "+X2);
            }
            else{
                binding.textView.setText("No real roots (Complex roots)");
            }


    }

}
