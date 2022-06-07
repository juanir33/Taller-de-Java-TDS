package com.sofka.ejercicios1to9;

import com.sofka.utilities.Messages;

public class Ejercicio3 {
    /**
     * Aplicacion que permite calcular el área de un círculo, al ingresar en consola su radio.
     * @param args
     */
    public static void main(String[] args) {
        Messages.logger.info("Ingresa el radio en mm, de un circulo para conocer su area: ");
        double radius = Double.parseDouble(Messages.scanner.nextLine());
        double area = Math.PI*(Math.pow(radius,2));
        Messages.logger.infov("El area del circulo es: {0} mm2", area);
    }
}
