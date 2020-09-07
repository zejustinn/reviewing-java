package com.lambdas.calculate;

public class LambdaIntefaceExample {
    public static void main(String[] args) {
        //Using an interface to define a lambda
        ICalculate calc = (c, d) -> {
            return c + d;
        };
        System.out.println(calc.calculate(2, 3));

        calc = (c, d) -> c * d;
        System.out.println(calc.calculate(2, 3));

        System.out.println(calc.nonFunctionalDefaultMethod());
        System.out.println(ICalculate.nonFunctionalStaticMethod());
    }
}
