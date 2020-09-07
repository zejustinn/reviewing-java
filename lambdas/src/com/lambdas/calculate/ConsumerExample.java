package com.lambdas.calculate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Product> printProductName =
                product -> System.out.println(product.getName());

        Product notebook = new Product("Notebook", 2600.99, 0.15);
        printProductName.accept(notebook);

        List<Product> products = Arrays.asList(
                notebook,
                new Product("Lápis", 1.99, 0.05),
                new Product("Caneta", 3.99, 0.05),
                new Product("Borracha", 2.99, 0.05)
        );
        products.forEach(printProductName);

        products.forEach(System.out::println);
    }
}
