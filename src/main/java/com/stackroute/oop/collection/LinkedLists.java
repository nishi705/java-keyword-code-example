package com.stackroute.oop.collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        //creating LinkedList
        LinkedList<String> friends = new LinkedList<>();
        friends.add("nishi");
        friends.add("neha");
        friends.add("kajal");
        friends.add("mohita");
        System.out.println(friends);
        friends.add(3,"shalini");
        System.out.println(friends);
        //searching element if element present
        System.out.println(friends.contains("neha"));
        //search the first element
        System.out.println(friends.indexOf("Steve"));
        //search last element
        System.out.println(friends.lastIndexOf("mohita"));
        //iterator using for-each and lambda
        friends.forEach(id -> {
            System.out.println(id);
        });
        //iterate using iterator
        Iterator<String> humanSpeciesIterator = friends.iterator();
        while (humanSpeciesIterator.hasNext()) {
            String speciesName = humanSpeciesIterator.next();
            System.out.println(speciesName);
        }
        //like that we can also use iterator,descendingIterator and ListIterator




    }
}
