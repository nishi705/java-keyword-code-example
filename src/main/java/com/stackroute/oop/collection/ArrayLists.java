package com.stackroute.oop.collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //creating of arraylist Of String Type
        List<String> animal = new ArrayList<>();
        //add element to arraylist
        animal.add("lion");
        animal.add("tiger");
        animal.add("elephant");
        animal.add("cheeta");
        System.out.println(animal);
        animal.add(2, "bear");
        System.out.println(animal);
        //creating ArrayList using another collection
        List<String> newanimal = new ArrayList<>(animal);

        List<String> nextnewanimal = new ArrayList<>();
        animal.add("xyz");
        animal.add("qwe");
        animal.add("dfg");
        animal.add("ghj");

        newanimal.addAll(nextnewanimal);
        System.out.println(newanimal);
        //find size of an ArrayList
        System.out.println(animal.size());
        //retrieve the element at the given index
        String firstanimal = animal.get(0);
        String secondBestanimal = animal.get(1);
        String lastanimal = animal.get(animal.size() - 1);
        System.out.println(firstanimal);
        System.out.println(secondBestanimal);
        System.out.println(lastanimal);
        //modify the list using set method
        animal.set(3,"wolf");
        System.out.println(animal);




    }
}
