package com.exceptions;

public class PersonExceptions {
    private PersonExceptions() {}

    public static void checksPerson(Person person) {
        if(person == null)
            throw new CustomException("O valor de \"Pessoa\" não pode ser nulo");

        if(person.getName().trim().isEmpty())
            throw new CustomException("O valor do \"nome\" da pessoa não pode ser nulo");

        if(person.getBirthDate().trim().isEmpty())
            throw new CustomException("O valor da \"dataNascimento\" da pessoa não pode ser nulo");
    }
}
