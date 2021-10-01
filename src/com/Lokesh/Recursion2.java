package com.Lokesh;

import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number to calculate factorial :");
        int n = s.nextInt();
        System.out.println("The factorial is :" + fact(n));
    }

    static int fact(int n) {
        if(n ==1 || n ==0) {
            return 1;
        }
        else{
            return n*fact(n-1);

        }
    }
}
