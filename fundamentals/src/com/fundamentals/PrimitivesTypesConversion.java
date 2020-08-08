package com.fundamentals;

public class PrimitivesTypesConversion {
    public PrimitivesTypesConversion(){
        // Implicit conversion made by language
        double implicitDouble = 1;
        System.out.println("Conversão implicita feita pelo Java de um inteiro para um double: " + implicitDouble);

        double moreThanFourBytesDouble = 1.123456789;
        System.out.println("Double com mais de 4 bytes: " + moreThanFourBytesDouble);

        // Explicit conversion made by the developer
        float explicitFloat = (float) moreThanFourBytesDouble;
        System.out.println("Conversão explicita feita pelo desenvolvedor de um double para um float: " + explicitFloat);

        // WARNING: Explicit conversions can lose data
        double doubleValue = 2.9;
        int intValue = (int) doubleValue;
        System.out.println("Conversão explicita feita pelo desenvolvedor de um int para um double: " + intValue);
    }
}
