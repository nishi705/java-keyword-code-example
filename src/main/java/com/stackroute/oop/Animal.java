package com.stackroute.oop;

public class Animal {
   private String name;
    private boolean mammel;
    private String color;
    public Animal() {
    }

    public Animal(String name, boolean mammel, String color) {
        this.name = name;
        this.mammel = mammel;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMammel() {
        return mammel;
    }

    public void setMammel(boolean mammel) {
        this.mammel = mammel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.setColor("Black");
        animal.setName("SivaDatta");
        animal.setMammel(true);
        System.out.println(animal.getColor());
        System.out.println(animal.getName());
        System.out.println(animal.isMammel());


    }

}
