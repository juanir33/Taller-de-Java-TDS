package com.sofka.ejercicios10to15;

import com.sofka.utilities.Messages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio13 {
    public static void main(String[] args) {



    Messages msg = Messages.getInstance();
    Date firstDate = new Date();

    Date newDate = Calendar.getInstance().getTime();
    SimpleDateFormat setFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String formatDate = setFormat.format(newDate);

    Messages.logger.info(formatDate);
}
}
