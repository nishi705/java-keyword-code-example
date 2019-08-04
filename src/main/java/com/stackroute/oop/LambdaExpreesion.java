package com.stackroute.oop;
//interface having only one abstract method is called functional interface
//lambda Expression implements this functional interface

interface FunctionalInterface
{
    void abstractFun(int x);
    default void normalFun()
    {
        System.out.println("hello");
    }
}

public class LambdaExpreesion {
    public static void main(String[] args) {
        FunctionalInterface fobj= (int x)-> System.out.println(2*x);
        fobj.abstractFun(5);
    }


}
