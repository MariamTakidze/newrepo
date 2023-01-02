package com.solvd.collections;

import java.util.ArrayList;

public class colorList {
    public static void main (String[] args) {
        // creating an ArrayList named marks
        ArrayList<String> colors = new ArrayList<>();

        // adding elements in the Array List
        colors.add("Purple");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");

        // printing the ArrayList
        System.out.println(colors);

        // changing element at index 1 to black from the creators of "BLACK is always Elegant"
        colors.set(1, "Black");
        colors.remove(3);
        int num = colors.size();

        // printing the ArrayList
        System.out.println(colors);
        System.out.println(num);
    }

}









//
//    Node head;
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int d) { data = d; }
//}