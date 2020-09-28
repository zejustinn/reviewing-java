package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class StreamMap {
    public static void main(String[] args){
        Consumer<String> print = System.out::print;

        List<String> cars = Arrays.asList("CORSA", "KOMBI", "FUSCA");

        UnaryOperator<String> allWordslowerCase = car -> car.toLowerCase();
        UnaryOperator<String> firstWordUpperCase = car -> car.substring(0, 1).toUpperCase() + car.substring(1);
        UnaryOperator<String> breakLine = car -> car + "\n";

        cars.stream()
                .map(allWordslowerCase)
                .map(firstWordUpperCase)
                .map(breakLine)
                .forEach(print);
    }
}
