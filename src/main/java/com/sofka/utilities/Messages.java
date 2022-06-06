package com.sofka.utilities;

import org.jboss.logging.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Messages {

    public static final Logger logger = Logger.getLogger(Messages.class);
    public static final Scanner scanner = new Scanner(System.in);


    public static Messages getInstance() {
        return new Messages();
    }

    public void showWelcome() {
        logger.info("Bienvenidos al control nutricional IMC");

    }

    public void showName() {
        logger.info("Por favor ingresa tu nombre:");
    }

    public void showAge() {
        logger.info("Por favor ingresa tu edad, en números:");
    }

    public void showWeight() {
        logger.info("Por favor ingresa tu peso: (utiliza la , para decimales)");
    }

    public void showHeight() {
        logger.info("Por favor ingresa tu altura: (utiliza la , para decimales)");
    }

    public void showGender() {
        logger.info("Por favor indica tu sexo: toca tecla M para mujer o H para hombre");
    }

    public String scan() {
        return scanner.nextLine();
    }

    public double scanD() throws InputMismatchException {
        return scanner.nextDouble();
    }

    public int scanI() {
        return scanner.nextInt();
    }

    public char scanC() {
        return scanner.next().charAt(0);

    }

    public void printInfo(String info) {
        logger.info(info);
    }

}


