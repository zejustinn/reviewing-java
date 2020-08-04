package com.basicconsoleapplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Qual vale mais a pena, gasolina ou etanol?");
            System.out.println("Digite o valor da gasolina");

            Scanner scanner = new Scanner(System.in);
            double gasoline = scanner.nextDouble();

            System.out.println("Digite o valor do etanol");
            double ethanol = scanner.nextDouble();

            if(gasolineIsMoreProfitableThanEthanol(gasoline, ethanol)){
                System.out.print("Gasolina tem melhor custo benefício");
            }else{
                System.out.print("Etanol tem melhor custo benefício");
            }
        }catch (InputMismatchException e){
            System.out.print(
                    "Ocorreu um erro! Por favor digite valores coerentes e separe as casas decimais com ponto('.')"
            );
        }
    }

    private static boolean gasolineIsMoreProfitableThanEthanol(double gasoline, double ethanol){
        if(ethanol/gasoline <= 0.7) return false;

        return true;
    }
}
