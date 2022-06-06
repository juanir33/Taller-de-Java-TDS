package com.sofka.ejercicios10to15;

import com.sofka.utilities.Messages;


public class Ejercicio10 {
    static Messages msg = Messages.getInstance();

    public static void main(String[] args) {
        replaceWhiteSpace();
    }

    public static void replaceWhiteSpace() {
        Messages.logger.info("Ingrese la frase que desea modificar: ");

        String textForReplace = msg.scan();
        String newText = textForReplace.replace(" ", "");
        Messages.logger.infov("La nueva frase queda: {0}", newText);

    }
}

