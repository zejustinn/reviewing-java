package com.simpleOOExercise;

public class Main {
    public static void main(String[] args) {
        Civic civic = new Civic();
	    civic.speedUp();
        civic.speedUp();
        civic.brake();
        civic.brake();
        civic.brake();

        Ferrari ferrari = new Ferrari();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();
        ferrari.speedUp();

        System.out.print(
                "A velocidade do Civic é de " + civic.currentSpeed
                + "Km/h \nA velocidade da Ferrari é de " + ferrari.currentSpeed
                + "Km/h"
        );
    }
}
