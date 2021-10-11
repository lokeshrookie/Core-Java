package com.Lokesh.Strings;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        s.close();
        System.out.println(A.length()+ B.length());
        System.out.println(B.compareTo(A));
        System.out.println(A.toUpperCase() + " " +  B.toUpperCase());
    }
}
