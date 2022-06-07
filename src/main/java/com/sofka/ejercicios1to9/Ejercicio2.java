package com.sofka.ejercicios1to9;

import com.sofka.utilities.Messages;

public class Ejercicio2 {

    /**
     * Aplicacion que compara dos numeros ingresados por consola, y devuelve si el primero es mayor, menor o igual al segundo.
     * @param args
     */
    public static void main(String[] args) {
        Messages.logger.info("Ingresa 2 numeros para compararlos\n el primero: ");
        double firstNum = Messages.scanner.nextDouble();
        Messages.logger.info("el segundo: ");
        double secondNum = Messages.scanner.nextDouble();

        if(firstNum < secondNum){
            Messages.logger.info("El primero es menor al segundo");
        } else if (firstNum > secondNum) {
            Messages.logger.info("El primero es mayor al segundo");

        }else  Messages.logger.info("Los numeros son iguales");

    }
}
