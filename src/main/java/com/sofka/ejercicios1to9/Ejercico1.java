package com.sofka.ejercicios1to9;

import com.sofka.utilities.Messages;

public class Ejercico1 {
    /**
     * Se crea una aplicacion para comparar dos numeros
     * @param args d
     */
    public static void main(String[] args) {
        compareNums(23, 45);
        compareNums(33,2);
        compareNums(2, 2);



    }
    public static void compareNums(int first, int second){
        if(first < second){
            Messages.logger.info("El primero es menor al segundo");
        } else if (first > second) {
            Messages.logger.info("El primero es mayor al segundo");

        }else  Messages.logger.info("Los numeros son iguales");
    }
    }

