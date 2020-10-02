package com.generics;

public class NumberBox<number extends Number> extends Box<number> {
    public NumberBox(number something) {
        super(something);
    }
}
