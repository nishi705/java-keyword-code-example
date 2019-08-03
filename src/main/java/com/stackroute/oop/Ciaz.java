package com.stackroute.oop;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

public class Ciaz extends Car {
    //here display method overrides
    //also used pollymorphism here
    public void  display() {
        System.out.println("this is Ciaz class");
    }
    public void display(String s)
    {
        System.out.println("hello ciaz");
    }
}

