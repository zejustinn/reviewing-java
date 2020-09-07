package com.lambdas.calculate;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Double, Double, String> studentsGradeResult =
                (studentGrade1, studentGrade2) ->
                        ((studentGrade1 + studentGrade2) / 2.0) >= 6 ? "aprovado" : "reprovado";

        System.out.println(
                "O aluno foi " + studentsGradeResult.apply(8.7, 4.2)
        );
    }
}
