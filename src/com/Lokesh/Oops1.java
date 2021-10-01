package com.Lokesh;
public class Oops1 { //Oops1 is the class name.
    //the variables declared inside the class are called attributes or FIELDS
    int a = 5;
    int b = 6;//a and b are fields or attributes
    final int c = 7;
    //These fileds are attributes can be used only by creating the Object
    public static void main(String[] args) {
        //lets creater an object using the Oops1 class
        Oops1 Obj1 = new Oops1();
        //An object named "Obj" is created. which inherits the attributes from the Oops1 class
        System.out.println(Obj1.a);//attribute "a" of class Oops1 is called using the Obj object
        // the fields values can  be modified or OVERRIDEN as follows
        System.out.println("Before Modification of b value : " + Obj1.b);//
        Obj1.b = 8;
        System.out.println("After overriden the b value : " + Obj1.b);
        System.out.println("the c value cannoted be oveerridden because, The final keywrod is used before initilizing. if try to change the value, you can end up getting error. " + Obj1.c);

        //The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
        //
        //The final keyword is called a "modifier".
    }
}