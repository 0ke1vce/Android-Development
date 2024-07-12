package com.example.lib;
import  java.util.Scanner;
public class ExersiseStringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char [] ch=sc.nextLine().toCharArray();
//        Printing the string
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
        System.out.println();
//        Printing in reverse
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
