package com.sofka.ejercicios1to9;

import com.sofka.utilities.Messages;

public class Ejercicio9 {
    /**
     * Aplicacion para remplazar letras de una dadena de texto y concatenar con una ingresada por consola
     * @param args d
     */

    public static void main(String[] args) {

        String textoToReplace = "La sonrisa sera la mejor arma contra la tristeza ";
        String textReplace = textoToReplace.replace('a', 'e');
        Messages.logger.info(textReplace);
        Messages.logger.info("Ingresa una nueva frase: ");
        String textOnConsole =   Messages.scanner.nextLine();
        String textConcat = textReplace.concat(textOnConsole);
        Messages.logger.info(textConcat);


    }

}
