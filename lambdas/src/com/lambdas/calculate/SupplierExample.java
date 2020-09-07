package com.lambdas.calculate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<List<Product>> productList =
                () -> Arrays.asList(
                        new Product("Notebook", 2600.99, 0.10),
                        new Product("Pencil", 1.99, 0.05)
                );

//        System.out.println(productList.get());
        productList.get().forEach(System.out::println);
    }
}
