package com.sofka.ejercicios1to9;

import com.sofka.utilities.Messages;

public class Ejercicio8 {
    /**
     * Aplicacion que nos permite conocer si un dia ingresado por consola es laboral o no;
     * @param args d
     */
    public static void main(String[] args) {
        Messages.logger.info("Bienvenido a la consulta de dia laboral,\n ingresa un dia para consultar si se trabaja: ");
        String dayConsole = Messages.scanner.nextLine().toLowerCase();

        switch (dayConsole) {
            case "lunes", "martes", "miercoles", "jueves", "viernes" -> Messages.logger.info("Este es un dia laboral");
            case "sabado", "domingo" -> Messages.logger.info("Este es un dia no laboral");
            default -> Messages.logger.info("Ingrese un dia valido");
        }
    }
}
