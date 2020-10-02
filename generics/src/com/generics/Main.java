package com.generics;

public class Main {

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(638);
        System.out.println(box1.getSomething());

        Box<String> box2 = new Box<>("Teste");
        System.out.println(box2.getSomething());

        CharBox box3 = new CharBox('A');
        System.out.println(box3.getSomething());

        AnythingBox<Boolean> box4 = new AnythingBox<>(true);
        System.out.println(box4.getSomething());

        NumberBox<Double> box5 = new NumberBox<>(2.5);
        System.out.println(box5.getSomething());

        NumberBox<Integer> box6 = new NumberBox<>(7);
        System.out.println(box6.getSomething());
    }
}
