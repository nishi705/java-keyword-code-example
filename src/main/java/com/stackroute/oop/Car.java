package com.stackroute.oop;


public class Car implements Vehicle {
    /**
     * this is for start method
     */
    @Override
    public void start() {
        System.out.println("Car is started");
    }


    /**
     * this is for driven method
     */
    @Override
    public boolean isBeingDriven() {
        return true;
    }

    /**
     * this is for stop method
     */
    @Override
    public void stop() {
        System.out.println("car stops");
    }
    public void display()
    {
        System.out.println("this is car class");
    }

    public static void main(String[] args) {
        Ciaz cz=new Ciaz();
        cz.display();
        cz.display("s");
        Audi ad=new Audi();
       ad.display();
        Lamborghini lamb=new Lamborghini();
        lamb.display();


    }
}
