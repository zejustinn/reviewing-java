package br.com.joselsjustin.modularlogger.innerclasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilsDateMethods {
    public static String getFormattedDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
