package com.exceptions;

/** Checked are the exceptions that are checked at compile time. */
public class CheckedExceptions {
    public static void main(String[] args){
        try{
            throwCheckedException();
        }catch (Exception e){
            System.out.println("Mensagem recebida do erro: " + e.getMessage());
        }
    }

    private static void throwCheckedException() throws Exception {
        throw new Exception("Erro checado");
    }
}
