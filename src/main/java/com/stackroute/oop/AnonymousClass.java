package com.stackroute.oop;

interface Age
{
int x=22;
void getAge();

}
class MyClass implements Age{

    @Override
    public void getAge() {
        System.out.println(x);
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.getAge();
    }
}
