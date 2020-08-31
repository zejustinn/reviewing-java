package com.arraysandcollections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
    // Unordered set of strings
     public static HashSet<String> createStringSet(){
         // HashSet<Generics> variableName = new HashSet<>();
         HashSet<String> stringSet = new HashSet<>();
         stringSet.add("Carlos");
         stringSet.add("Ana");
         stringSet.add("João");
         stringSet.add("João"); // Do not duplicate values
         stringSet.remove("Maria");
         stringSet.remove("Ana");

         return stringSet;
     }

     // unordered set of integers
     public static TreeSet<Integer> createIntegerSet(){
         // TreeSet<Generics> variableName = new TreeSet<>();
         TreeSet<Integer> integerSet = new TreeSet<>();
         integerSet.add(22);
         integerSet.add(7);
         integerSet.add(62);
         integerSet.add(62); // Do not duplicate values
         integerSet.remove(50);
         integerSet.remove(62);

         return integerSet;
     }
}
