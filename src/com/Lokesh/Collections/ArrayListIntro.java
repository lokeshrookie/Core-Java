package com.Lokesh.Collections;

import java.util.*;

public class ArrayListIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        ArrayList<Integer> Al = new ArrayList<Integer>(size);
        Al.add(5);
        Al.add(77);
        Al.add(66);
        Al.add(73);
        System.out.println(Al.contains(66));
        Object[] arr = Al.toArray();
//        System.out.println(List.toArray(arr[]));
//        System.out.println(Al);
//        System.out.println(Al.size());
//        Al.remove(2);
//        System.out.println(Al.clone());

        for (int i = 0; i<Al.size(); i++) {
                System.out.println(Al.get(i));
        }
    }
}
