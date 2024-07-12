package com.example.lib;
interface  shapes{
    public  double Area();
    public double perimeter();
}
class circle implements  shapes{
    private int rad;
    public  circle(int rad){
        this.rad=rad;
    }

    @Override
    public double Area() {
        return  3.14*rad*rad;
    }

    @Override
    public double perimeter() {
        return  2*3.14*rad;
    }
}

class rectangle implements shapes{
    private int len;
    private  int width;
    public rectangle(int len,int width){
        this.len=len;
        this.width=width;
    }

    @Override
    public double Area() {
        return len*width;
    }

    @Override
    public double perimeter() {
        return 2*(len+width);
    }
}

public class OOPS4 {
    public static void main(String[] args) {
        circle c=new circle(5);
        System.out.println("area is: "+c.Area()+" perimeter is: "+c.perimeter());
        rectangle r=new rectangle(5,4);
        System.out.println("area is: "+r.Area()+" perimeter is: "+r.perimeter());
    }
}
