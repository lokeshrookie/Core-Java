package com.Lokesh;
@FunctionalInterface
interface FuncInterface {


    public int multiply(int a, int b);

}

public class Hehe {
    public static void main(String args[]) {

        FuncInterface Total = (a, b) -> a * b;

        System.out.println("Result: "+Total.multiply(30, 60));

    }

}