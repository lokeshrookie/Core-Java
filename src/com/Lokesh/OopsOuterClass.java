package com.Lokesh;
//class OuterClass {
//    int x = 10;
//
//    class InnerClass {
//        public int myInnerMethod() {
//            return x;
//        }
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myInner.myInnerMethod());
//    }
//}

//---------------------------------------------------
class Outer {
     int x = 6;
     class Inner {
         int y =5;
         public int print() {
             return y;
         }
         public void printt(){
             System.out.println("printt");
         }
     }
}
class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println(o.x);
        System.out.println(i.y);
        System.out.println(i.print());
        i.printt();
    }
}