package com.exceptions;

/** Unchecked are the exceptions that are not checked at compiled time */
public class UncheckedExceptions {
    public static void main(String[] args){
        try{
            throwUncheckedException();
        }catch (Exception e){
            System.out.println("Mensagem recebida do erro: " + e.getMessage());
        }
    }

    private static void throwUncheckedException(){
        throw new RuntimeException("Erro não checado");
    }
}
