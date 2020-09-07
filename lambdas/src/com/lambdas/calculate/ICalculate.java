package com.lambdas.calculate;

@FunctionalInterface
public interface ICalculate {
    public abstract int calculate(int a, int b);

    public default String nonFunctionalDefaultMethod(){
        return "Método \"Default\", não funcional, que não interfere na implementação da lambda pois já foi implementado";
    };

    public static String nonFunctionalStaticMethod(){
        return "Método \"Static\", não funcional, que não interfere na implementação da lambda pois já foi implementado";
    }
}
