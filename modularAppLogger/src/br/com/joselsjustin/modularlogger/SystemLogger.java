package br.com.joselsjustin.modularlogger;

import br.com.joselsjustin.modularlogger.innerclasses.UtilsDateMethods;

public class SystemLogger {
    public static void logError(String message){
        System.out.println(
                "An error occurred on " + UtilsDateMethods.getFormattedDate() +
                "\nMessage:\n" + message
        );
    }
}
