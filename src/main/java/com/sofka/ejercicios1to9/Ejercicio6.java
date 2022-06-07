package com.sofka.ejercicios1to9;

import com.sofka.utilities.Messages;

public class Ejercicio6 {

    /**
     * Aplicacion que muestra en consola los numeros pares e impares, entre dos valores determinados, min y max; incluidos.
     * @param args
     */
    public static void main(String[] args) {
        Messages.logger.info("Numeros pares.");
        int numberInit = 1;
        int numberMax = 100;
        for (int i = numberInit; i <= numberMax; i++) {

            if (numberInit % 2 == 0) {
                Messages.logger.infov("El numero {0} es par.", numberInit);

            }else {
                Messages.logger.infov("El numero {0} es impapar.", numberInit);
            }
            numberInit++;


    }
}}



