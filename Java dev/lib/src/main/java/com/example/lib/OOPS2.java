package com.example.lib;
class Vehicle{
    int numberofWheels;
        public Vehicle(int numberofWheels){
            System.out.println("Its a vehicle constructor");
            this.numberofWheels=numberofWheels;
            System.out.println("It's a "+numberofWheels+" wheel vehicle");
        }

    public void Horn(){
            System.out.println("HORN....................");
        }
        public void Move(){
            System.out.println("Moving.....................");
        }
}
class SportsCar extends  Vehicle{
    public SportsCar(int wheels){
        super(wheels);
        numberofWheels=wheels;
        System.out.println("Sports Car COnstructor");
    }
    public void MOvefast(){
        System.out.println("Moving Fast.");
    }
    public void drift(){
        System.out.println("Drifting......................");
    }
}


public class OOPS2 {
    public static void main(String[] args) {
            SportsCar BMW =new SportsCar(4);
            BMW.Horn();
            BMW.Move();
            BMW.MOvefast();
            BMW.drift();
    }
}
