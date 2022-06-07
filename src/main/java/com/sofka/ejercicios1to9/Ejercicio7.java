package com.sofka.ejercicios1to9;

import com.sofka.utilities.Messages;

public class Ejercicio7 {

    /**
     * Aplicacion por la cual se ingresa un numero por consola, y debe ser mayor al definido en el sistema para salir del ciclo.
     * @param args d
     */
    public static void main(String[] args) {

        boolean compareNumber= false;
        do{
            Messages.logger.info("Ingresa un numero para saber si es mayor a 0");
            int number = Messages.scanner.nextInt();


            if(number >= 0){
                compareNumber = true;
                Messages.logger.info("El numero es mayor, finaliza!");

            }else Messages.logger.info("Numero menor, continua.");

        }while (!compareNumber);
    }
}
