package com.Lokesh.Strings;
import java.util.Scanner;

public class StringBufferr {
    public static void main(String[] args) {
        //Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String S = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();

        System.out.println(solve(S, L, R));

    }

    //complete the function below

    public static String solve(String s, int L, int R) {

        String sub = s.substring(L, R + 1);
        StringBuffer a = new StringBuffer(sub);
        a.reverse();
        String temp = a.toString();
        StringBuffer b = new StringBuffer(s);
        b.replace(L, R + 1, temp);
        return b.toString();
    }
}
