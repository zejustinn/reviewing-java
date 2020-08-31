package com.arraysandcollections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static Queue<Character> createCharacterQueue(){
        Queue<Character> characterQueue = new LinkedList<>();
        characterQueue.add('F');
        characterQueue.add('G');
        characterQueue.add('L');
        characterQueue.add('C');
        characterQueue.add('Z');

        return  characterQueue;
    }
}
