package com.lambdas.calculate;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Product, String> productName =
                product -> product.getName();

        Product product1 = new Product("Notebook", 2600.99, 0.15);

        Function<String, String> productMarketing = product -> product + " é incrível!!!";

        System.out.println(
                productName
                        .andThen(productMarketing)
                        .apply(product1)
        );
    }
}
