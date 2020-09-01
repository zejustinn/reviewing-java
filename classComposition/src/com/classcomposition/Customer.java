package com.classcomposition;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Customer {
    public String name;
    public ArrayList<Purchase> shopping = new ArrayList<>();

    public double getFullShoppingPrice(){
        double fullPrice = 0.0;

        for(Purchase purchase: this.shopping){
            fullPrice += purchase.getFullPurchasePrice();
        }

        return Double.parseDouble(new DecimalFormat("##.##").format(fullPrice));
    }

    public Customer(String name){
        this.name = name;
    }
}
