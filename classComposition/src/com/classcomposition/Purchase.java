package com.classcomposition;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Purchase {
    public ArrayList<Item> items = new ArrayList<>();

    public double getFullPurchasePrice(){
        double fullPrice = 0.0;

        for(Item item: this.items){
            fullPrice += item.amount * item.product.price;
        }

        return Double.parseDouble(new DecimalFormat("##.##").format(fullPrice));
    }
}
