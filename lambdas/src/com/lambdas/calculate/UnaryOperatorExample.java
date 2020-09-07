package com.lambdas.calculate;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator <Integer> addTwo = n -> n + 2;
        UnaryOperator <Integer> multiplyTwo = n -> n * 2;
        UnaryOperator <Integer> twoSquared = n -> n * n;

        System.out.println(
                addTwo
                    .andThen(multiplyTwo)
                    .andThen(twoSquared)
                    .apply(0)
        );

        // Using compose
        System.out.println(
                twoSquared
                    .compose(multiplyTwo)
                    .compose(addTwo)
                    .apply(0)
        );
    }
}
