package com.arraysandcollections;

import java.util.ArrayList;

public class Lists {
    public static ArrayList<Double> createDoubleList(){
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(2.6);
        doubleList.add(7.7);
        doubleList.add(7.7); // Duplicate values
        doubleList.add(5.3);
        doubleList.remove(4.8);
        doubleList.remove(2.6);

        return doubleList;
    }
}
