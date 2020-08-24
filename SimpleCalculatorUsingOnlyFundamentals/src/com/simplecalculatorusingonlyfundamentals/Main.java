package com.simplecalculatorusingonlyfundamentals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Por favor, não tente quebrar o código pois tratamento de erro não deveria ser implementado");
	    System.out.println("Digite o primeiro valor do calculo: ");
        Scanner scanner = new Scanner(System.in);
        double firstValue = scanner.nextDouble();

        System.out.println("Digite o segundo valor do calculo: ");
        double secondValue = scanner.nextDouble();

        System.out.println("Digite o operado do calculo(+, -, /, *, %)");
        String calculationOperator = scanner.next();
        scanner.close();

        double result = calculationOperator.equals("+") ? firstValue + secondValue :
        calculationOperator.equals("/") ? firstValue / secondValue :
        calculationOperator.equals("-") ? firstValue - secondValue :
        calculationOperator.equals("*") ? firstValue * secondValue :
        calculationOperator.equals("%") ? firstValue % secondValue : null;

        System.out.printf("O resultado do calculo é: %.2f \n", result);
    }
}
