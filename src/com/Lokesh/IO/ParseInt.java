package com.Lokesh.IO;

import java.util.Scanner;

public class ParseInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        String a = s.next(); // to take the input
        String b = "5";
        String e = "loki";
        int c = 111;
        int  d = 1000;
//        System.out.println(Integer.toBinaryString(c));
//        System.out.println(Integer.bitCount(c)); // it counts the nubmer of digits in a nubmer. it do not count 0 as a bit.
//        System.out.println(Integer.compare(c,d)); // compares two binary number and returns 1 if they are not equal. returns 0 if they are equal.
        // But, First binary number must be greater than second number. if not, then it returns -1.
//        System.out.println(Integer.toBinaryString(c)); // it converts the input Decimal number to binary number.
//        System.out.println(Integer.valueOf(d)); // it returns the value of a number in the from of int or string.
//        System.out.println(Integer.decode(b)); // string to int
        System.out.println(Integer.highestOneBit(c)); // n = 100. since 1 is



//        System.out.println(Integer.max(Integer.parseInt(a),Integer.parseInt(b))); // to find the max of two numbers using parseInt().

        /*
        For binary to decimal conversion.

         System.out.println(Integer.parseInt(a,2)); //

         */

        /*
        For octal to decimal conversion.

//         System.out.println(Integer.parseInt(a,8)); //

         */
        System.out.println(Integer.parseInt(Integer.toString(c) ,2)); //
    }
}
