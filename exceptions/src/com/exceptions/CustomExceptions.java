package com.exceptions;

public class CustomExceptions extends RuntimeException {
    public static void main(String[] args){
        try {
            Person person = new Person("Jose", "01-02-1994");
            PersonExceptions.checksPerson(person);
            System.out.println("Nenhum erro identificado :D");
        } catch (CustomException e) {
            System.out.println("Um erro criado pelo desenvolvedor do tipo \"CustomException\" " +
                    "foi identificado com a seguinte mensagem: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            System.out.print("Vida que segue...");
        }
    }
}
