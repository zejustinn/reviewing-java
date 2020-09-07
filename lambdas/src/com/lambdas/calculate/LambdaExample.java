package com.lambdas.calculate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaExample {
    public static void main(String[] args) {
        BinaryOperator<Double> addDouble = (e, f) -> e + f;
        System.out.println(
                "Necessário transformar o valor int(primitivo) em Double(classe), pois só é possível"
                        + " transformar int(primitivo) em double(primitivo) implicitamente \nSoma: "
                        + addDouble.apply(1.0, 2.0)
        );

        System.out.println("Maneira tradicional:");
        List<String> users = Arrays.asList("Jose", "João", "Pedro");
        for(String user: users){
            System.out.println(user);
        }

        System.out.println("Lambda:");
        users.forEach(user -> System.out.println(user));

        System.out.println("Method reference:");
        users.forEach(System.out::println);
    }
}
