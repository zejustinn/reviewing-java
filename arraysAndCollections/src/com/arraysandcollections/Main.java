package com.arraysandcollections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        double doubleArray[] = Arrays.createDoubleArray();
        System.out.println("Valores do array de double:");
        for(int i = 0; i < doubleArray.length; i += 1){
            System.out.println(doubleArray[i]);
        }

        HashSet<String> stringSet = Sets.createStringSet();
        System.out.println("Valores do conjunto desordenado de strings desordenado:");
        for(String string: stringSet){
            System.out.println(string);
        }

        TreeSet<Integer> integerSet = Sets.createIntegerSet();
        System.out.println("Valores do conjunto ordenado de integers:");
        for(Integer integer: integerSet){
            System.out.println(integer.toString());
        }

        ArrayList<Double> doubleList = Lists.createDoubleList();
        System.out.println("Valores da lista de doubles:");
        System.out.println(doubleList.get(0)); // Allows access to data with an index
        for(Double doubleValue: doubleList){
            System.out.println(doubleValue.toString());
        }

        Queue<Character> characterQueue = Queues.createCharacterQueue();
        System.out.println("Utilizando a fila:");
        System.out.println(characterQueue.peek()); // Inspect the next queue value
        System.out.println(characterQueue.poll()); // Get the next value
        System.out.println(characterQueue.peek());

        Deque<String> stringDeque = Stacks.createStringDeque();
        System.out.println("Utilizando a pilha:");
        System.out.println(stringDeque.peek()); // Inspect the next queue value
        System.out.println(stringDeque.poll()); // Get the next value
        System.out.println(stringDeque.peek());

        Map<Integer, String> userMap = Maps.createUserMap();
        System.out.println("Valores do mapa de \"usuarios\":");
        for(Map.Entry user: userMap.entrySet()){
            System.out.println(
                    "Chave do usuário: " + user.getKey()
                    + ". valor do usuário: " + user.getValue()
            );
        }
    }
}
