package com.Lokesh;

import java.util.Arrays;
import java.util.Scanner;

class Array_practice2
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        String[] keywords = {"int", "floaat", "double"};
        //lets take a keyword from the user.
        System.out.println("Enter a String :");
        String k = s.next();
        s.close();
        boolean b = Arrays.asList(keywords).contains(k); //asList is a method in Arrays class is used to change the array into a list
        //then .contains method is used to check whether the passed value is present in the given string or not.
        if(b == true )
        {
            System.out.printf("%s is a keyword \n",k);
        }
        else{
            System.out.printf("%s is not a keyword \n",k);
        }

        String printString = Arrays.toString(keywords);
        // toString method in Arrays class is used to convert the array into string. so that we can print the entire array using a single String variable.
        System.out.println("The entire string is printed as : " + printString);
    }
}
