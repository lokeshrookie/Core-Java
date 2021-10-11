package com.Lokesh;
//BASIC OPERATION ON ARRAYS LIKE INITIALIZATION AND TRAVERSE ADN SUM OF ALLL THE ELEMENTS AND AVERAGE OF ALL THE ELEMENTS
public class Array_Practice{
    public static void main (String[] args) {
        int[] numArray = {1,2,3,4,5,6,7,8,9,0};
        //to reverse the array use the bolow line
      //  ArrayUtils.reverse(numArray); //
        //-----------------------------------------
//     This is the traversal of elements by using  for loop:
//        you have to initialize sum and average before you use them inside the loop
        int sum = 0;
        double average = 0;

        for(int i = 0; i< numArray.length; i++) {
            System.out.println(" The Element at index " + i + " is " + numArray[i]);

//        to make sum of all the elements in the array. follwing statemt is used.
            sum = sum + numArray[i];
            System.out.println( "Sum is: " + sum);
        }
// length of the array is printed by the follwing statement
        System.out.println("length of the array is : " + numArray.length);
        //to make average of all the elements in an array, the follwing statemnts ar used.
        average = sum/numArray.length;
        System.out.println("The avegare is: " + average);
       // }
//        ---------------------------------------------
//       THis is the traversal of Array using for each looop. using for each we can traverse each element in an array one by one. but using this we can't skip any element. but for each loop is readable
//
//        for(int i:numArray) {
//            System.out.println(i);
//
//      -----------------------------------------
        //To print the entire array in one step, you have use toString method as follows
    }
}