package com.example.lib;
import java.util.Scanner;
public class MyClass {
    static  int sum(int a,int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello World");
        int x=10;
        System.out.println("Value of x is: "+x);
        Boolean b1=true;
        System.out.println(b1);
//        Type casting
        char ch='A';
        int typeCasted=(int)ch;
        System.out.println(typeCasted+" is typecasted from: "+ch);

//        Creating Strings
        String s="Hello Friends";
        System.out.println("MY string is-> "+s);
//        Concatenation
        String s1=" DBZ";
        System.out.println(s+s1);

//        If else-if and else
        int age=sc.nextInt();
        if(age>18){
            System.out.println("You can drive");
        }
        else if (age<18) {
            System.out.println("You cannot drive");
        }
        else {
            System.out.println("If age is 18 driving test is necessary");
        }

//        Switch statement
        int marks=sc.nextInt();
        switch (marks){
            case 33:
                System.out.println("Barely pass");
                break;
            case 80:
                System.out.println("Topped exam");
                break;
            default:
                System.out.println("need more work");
                break;
        }

//        While Loop
//        Print table of a number
        int n=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+"X"+i+"="+(n*i));
            i++;
        }

// For loop
//        print table of number
        int num=sc.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(num+"X"+j+"="+(num*j));
        }


//        Break statement use to break out from loop and continue statement use to skip an iteration from a loop


//        Array in JAVA
//        DataTYpe [] array_name=new datatype[size];
        int []arr=new int[5];
        for(int j=0;j<5;j++){
            arr[j]=j;
        }


//        For Each loop
//        Syntax:
//        for(datatype iterator:arrayName){.....code to be executed..........}
        for(int element:arr){
            System.out.println(element);
        }

//        Multidimensional array
        int [][]a=new int[3][3];
        for(int j=0;j<3;j++){
            for(int k=0;k<3;k++){
                System.out.println("Enter element");
                a[j][k]= sc.nextInt();
            }
        }
        for(int[] ele:a){
            System.out.println(ele);
        }

//        Methods in java
//        Syntax-:  returnTypeDatatype MethodName(if_any_Parameters){...codeToBeWritten....}
        x=sum(3,5);
        System.out.println("Sum of 3 and 5 is: "+x);

    }
}