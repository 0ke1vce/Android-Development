package com.example.lib;
class Car{
//    fields-attributes---> store data
//    methods- functionalities----> perform operations
  public Car(int carspeed,int caryear){
      System.out.println("Constructor of car class ");
      speed=carspeed;
      year=caryear;
  }
//    Fields
    int year;
    int speed;
    private  int horsepower;

//    Getter and setter
    public void setHorsepower(int horsepower){
        this.horsepower=horsepower;
    }
    public int getHorsepower(){
        return horsepower;
    }


//    Functionalities
    public void accerlate(){
        speed+=10;
    }
    public void brake(){
        speed=speed-5;
    }

 /*
    public  void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
*/
    public void speed(){
        System.out.println("Current speed is: "+speed);
    }

}

public class OOPs {
    public static void main(String[] args) {
        /*
        Class- Template or blueprint
        object- Instances of class

//        Syntax for object creation of a class
        ClassName obj=new ClassName();
         */

        Car mustang=new Car(240,1995);
//        mustang.speed=240;
//        mustang.setYear(1995);
        mustang.accerlate();
        mustang.brake();
        mustang.brake();
        mustang.speed();
        mustang.accerlate();
        mustang.speed();
        mustang.setHorsepower(350);
        int x= mustang.getHorsepower();
        System.out.println("hp is-> "+x);





    }
}


//Access Modifiers
/*

 Access Modifier     	within class	within package	        outside package by subclass only	     outside package
        public	                    Y	             Y	                        Y                       	Y
        protected	                Y	             Y	                        Y	                        N
        Default	                    Y                Y	                        N	                        N
        private                     Y	             N	                        N                           N


 */