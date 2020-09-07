package com.lambdas.calculate;

import java.util.function.BinaryOperator;

public class BinaryOperatosExample {
    public static void main(String[] args) {
        BinaryOperator<Double> studentsAverageGrade =
                (studentGrade1, studentGrade2) -> (studentGrade1 + studentGrade2) / 2.0;

        System.out.printf(
                "A nota do aluno foi %.2f",
                studentsAverageGrade.apply(8.7, 3.2)
        );
    }
}
