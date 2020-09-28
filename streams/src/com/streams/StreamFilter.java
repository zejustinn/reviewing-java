package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamFilter {
    public static void main(String[] args){
        List<Student> schoolClass = Arrays.asList(
            new Student("Delgado", 4.8),
            new Student("Pores", 2.1),
            new Student("Ivanilso", 4.1),
            new Student("Kevin", 6.3)
        );

        Predicate<Student> approved = student -> student.grade >= 6;
        Function<Student, String> congratulations = student -> "Parabéns " + student.name + "! você passou.";

        schoolClass.stream()
            .filter(approved)
            .map(congratulations)
            .forEach(System.out::print);
    }
}
