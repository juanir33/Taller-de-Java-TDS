package com.sofka.ejercicios1to9;

import com.sofka.utilities.Messages;

public class Ejercicio5 {

    /**
     * Nos devuelve los numeros pares e impares entre un min y un max, incluidos. Por medio de un ciclo while.
     * @param args
     */
    public static void main(String[] args) {
        int numberMax = 100;
        int num = 1;
        while (num <= numberMax){
            if (num % 2 == 0) {
                Messages.logger.infov("El numero {0} es par.", num);

            }else {
                Messages.logger.infov("El numero {0} es impar.", num);
            }
            num++;
        }

    }
}
