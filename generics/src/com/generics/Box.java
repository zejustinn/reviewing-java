package com.generics;

public class Box<T> {
    private final T something;

    public Box(T something) {
        this.something = something;
    }

    public T getSomething() {
        return something;
    }
}
