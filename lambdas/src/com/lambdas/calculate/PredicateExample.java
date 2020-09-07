package com.lambdas.calculate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Product> isExpensive =
                product ->
                        product.getPrice() * (1 - product.getDiscount()) >= 1200;

        Product notebook = new Product("Notebook", 2600.99, 0.15);
        System.out.println(isExpensive.test(notebook));
    }
}
