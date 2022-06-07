package com.sofka.ejercicios1to9;

import com.sofka.utilities.Messages;

public class Ejercicio4 {

    /**
     * Aplicacion para determinar el iva de un producto, se ingresa el precio por consola y devuelve el valor final.
     * @param args
     */
    public static void main(String[] args) {
        final double IVA = 1.21;
        Messages.logger.info("Ingresa el precio de un producto para agregar el IVA: ");
        double product = Messages.scanner.nextDouble();
        double productIva = (product*IVA);
        Messages.logger.infov("El precio mas IVA es {0}", productIva);
    }
}
