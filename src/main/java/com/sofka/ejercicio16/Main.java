package com.sofka.ejercicio16;


import com.sofka.utilities.Messages;

public class Main {

    static Messages msg = Messages.getInstance();

    /**
     * Clase principal donde se inicia la aplicación. Se pide por teclado los datos de una persona y se crean 3
     * instancias, primero con lo pedido, segundo sin peso y altura y por último una por defecto.
     * @param args s
     */

    public static void main(String[] args) {

        msg.showWelcome();
        msg.showName();
        String name = msg.scan();

        msg.showAge();
        int age = msg.scanI();

        msg.showGender();
        char gender = msg.scanC();

        msg.showHeight();
        double height = msg.scanD();

        msg.showWeight();
        double weight = msg.scanD();

        Persona firstPerson = new Persona(name, age, weight, height, gender);
        firstPerson.printInfoOne();


        Persona secondPerson = new Persona(name, age, gender);
        secondPerson.setWeight(45);
        secondPerson.setHeight(1.87);
        secondPerson.printInfoOne();


        Persona thirdPerson = new Persona();
        thirdPerson.setName("Juan");
        thirdPerson.setAge(29);
        thirdPerson.setHeight(1.74);
        thirdPerson.setWeight(96);
        thirdPerson.setGender('H');
        thirdPerson.printInfoOne();





    }
}
