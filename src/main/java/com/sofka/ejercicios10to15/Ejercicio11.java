package com.sofka.ejercicios10to15;

import com.sofka.utilities.Messages;

public class Ejercicio11 {

    static Messages msg = Messages.getInstance();
    public static void main(String[] args) {
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        Messages.logger.info("Ingresa una frase para saber su longitud y vocales");
        String newText = msg.scan().toLowerCase();
        String large = String.valueOf( newText.length());

        for(int i = 0; i < newText.length(); i++ ){
            if(newText.charAt(i) == 'a'){
                countA++;
            }else if(newText.charAt(i) == 'e'){
                countE++;
            }else if(newText.charAt(i) == 'i'){
                countI++;
            }else if(newText.charAt(i) == 'o'){
                countO++;
            }else if(newText.charAt(i) == 'u'){
                countU++;
            }

        }

        Messages.logger.infov("La longitud de la frase es: {0}\nLa cantidad de vocales son:\nTotal de a= {1}\nTotal de e= {2}\nTotal de i= {3}\nTotal de o= {4}\nTotal de u= {5}\n", large, countA,countE,countI,countO,countU );



    }




}
