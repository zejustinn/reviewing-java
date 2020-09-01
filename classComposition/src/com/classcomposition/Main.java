package com.classcomposition;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Marcelo");

        Purchase purchase1 = new Purchase();
        purchase1.items.add(new Item(
            new Product("Garrafinha de água", 0.99),
            1
        ));

        purchase1.items.add(new Item(
            new Product("Pirulito", 0.15),
            4
        ));

        customer1.shopping.add(purchase1);

        Purchase purchase2 = new Purchase();
        purchase2.items.add(new Item(
                new Product("Salgadinho", 12.99),
                1
        ));

        purchase2.items.add(new Item(
                new Product("Guaraná", 6.99),
                1
        ));

        customer1.shopping.add(purchase2);

        for(Purchase purchase: customer1.shopping){
            System.out.printf(
                    "O valor total da compra do %s foi R$ %.2f\n",
                    customer1.name,
                    purchase.getFullPurchasePrice()
            );
        }

        System.out.printf(
                "O valor total das compras deu R$ %.2f\n",
                customer1.getFullShoppingPrice()
        );
    }
}
