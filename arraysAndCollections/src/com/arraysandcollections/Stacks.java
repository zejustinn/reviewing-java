package com.arraysandcollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
    public static Deque<String> createStringDeque(){
        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("Roberto");
        stringDeque.add("Romário");
        stringDeque.add("Rebecca");
        stringDeque.add("Ricardo");

        return stringDeque;
    }
}
