package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        Stream<String> stream = Stream.of("Inglês ", "Português ", "Italiano\n");
        stream.forEach(print);

        String[] array = {"Mandarím ", "Japonês ", "Espanhol\n"};
        Stream.of(array).forEach(print);
        Arrays.stream(array).forEach(print);

        List<String> list = Arrays.asList("Russo ", "Francês ", "Shona\n");
        list.stream().forEach(print);
        list.parallelStream().forEach(print);
    }
}
