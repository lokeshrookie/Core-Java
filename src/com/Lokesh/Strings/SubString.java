package com.Lokesh.Strings;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        String A = s.next();
        int start = s.nextInt();
        int end = s.nextInt();
        System.out.println(A.substring(start , end+1));
        String sub = A.substring(start, end);
        for (int i = 0; i < A.length(); i++){
//            String rev = ""
        }
    }
}
