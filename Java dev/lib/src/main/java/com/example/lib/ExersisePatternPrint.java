package com.example.lib;

public class ExersisePatternPrint {
    public static void main(String[] args) {
        int rows=4;
        int spaces=rows+4-1;
        for(int i=1;i<=4;i++){//rows
        for(int x=spaces;x!=0;x--){  //spaces
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){ //numbers
            System.out.print(i+" ");
        }
            System.out.println();
        spaces--;
        }
    }
}
