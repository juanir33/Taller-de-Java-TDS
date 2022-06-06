package com.sofka.ejercicios10to15;

import com.sofka.utilities.Messages;

public class Ejercicio14 {
    public static void main(String[] args) {
        Messages msg = Messages.getInstance();

        Messages.logger.info("Ingresa un numero y llega hasta el mil: ");
        int number= msg.scanI();
        for(int i = number; i <= 1000; i +=2){
            Messages.logger.info(i);
        }
    }
}
