package com.example.lib;

interface Vehcile{
    public void Start_Stop();
    public  void Horn();
    public void GPS();
}
 class Bike implements Vehcile{
     @Override
     public void Start_Stop() {
         System.out.println("Starting or stopping");
     }

     @Override
     public void Horn() {
         System.out.println("Horn.........");
     }

     @Override
     public void GPS() {
         System.out.println("GPS Started");
     }
 }

public class OOPS3 {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.Start_Stop();
        b.Horn();
        b.GPS();

    }
}
