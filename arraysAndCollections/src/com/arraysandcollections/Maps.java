package com.arraysandcollections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static Map<Integer, String> createUserMap(){
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "José");
        userMap.put(1, "João");
        userMap.put(2, "Jade");
        userMap.put(3, "Jota");
        userMap.remove(2);

        return  userMap;
    }
}
