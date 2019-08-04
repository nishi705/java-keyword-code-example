package com.stackroute.oop;


class OterClass {
    //static member
    static int outer_z = 10;
    //non-static memeber
    int outer_y = 20;
    //private static member
    private static int outer_x = 50;

    static class StaticOuterClass {
        void display() {
            System.out.println(OterClass.outer_z);

            System.out.println(outer_x);
            //but we can not access non static member
            //it will give compile time error
            //System.out.println(outer_y);

        }


    }
}


public class NestedClass {
    public static void main(String[] args) {
        OterClass.StaticOuterClass object = new OterClass.StaticOuterClass();
        object.display();

    }
}
