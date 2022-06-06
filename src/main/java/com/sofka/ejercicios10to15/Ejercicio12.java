package com.sofka.ejercicios10to15;

import com.sofka.utilities.Messages;

public class Ejercicio12 {

    static Messages msg = Messages.getInstance();

    public static void main(String[] args) {
        Messages.logger.info("Ingresa una palabra para comparar con otra: ");
        String firstW = msg.scan();
        Messages.logger.info("Ingresa la otra: ");
        String secondW = msg.scan();

        if (firstW.equalsIgnoreCase(secondW)) {
            Messages.logger.info("Las palabras son iguales");
        }else{

            for (int i = 0; i < firstW.length(); i++) {
                if (firstW.charAt(i) != (secondW.charAt(i))) {

                    Messages.logger.infov("Son distintas en {0}", String.valueOf(secondW.charAt(i)));


                }
            }
        }
    }


}



