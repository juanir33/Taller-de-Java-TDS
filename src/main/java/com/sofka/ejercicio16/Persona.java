package com.sofka.ejercicio16;

import com.sofka.utilities.Messages;

import java.util.Random;

/**
 * @author  Juan Ramallo
 * @version 1.0
 *
 * Aplicación para conocer el índice de masa corporal.
 */

public class Persona {

    private static final char MALE = 'H';
    private static final Random rand = new Random();
    private static final int LOW = -1;
    private static final int IDEAL = 0;
    private static final int HAIGH = 1;

    private String name;
    private int age;
    private String dni;
    private double weight;
    private double height;
    private char gender;

    Messages msg = Messages.getInstance();

    /**
     * Constructor por defecto, nos crea la instancia con las variables iniciadas en la misma.
     */
    public Persona() {
        this.name = "";
        this.age = 0;
        this.gender = MALE;
        this.height = 0;
        this.weight = 0;
        setRandomDni();

    }

    /**
     * Constructor de clase con algunos de las variables como parámetros.
     * @param nombre tipo string, nos indica el nombre de la persona
     * @param edad tipo integer, para iniciar la edad del mismo
     * @param sexo tipo char, indica el sexo de la persona, por medio de H para hombre o M para mujer
     */
    public Persona(String nombre, int edad, char sexo) {
        this.name = nombre;
        this.age = edad;
        this.gender = sexo;
        checkGender();
        setRandomDni();
    }

    /**
     * Constructor con todos los parámetros.
     * @param name tipo string, nos indica el nombre de la persona
     * @param age  tipo integer, para iniciar la edad del mismo
     * @param weight tipo double, indica el peso
     * @param height tipo double, indica la altura
     * @param gender tipo char, indica el sexo de la persona, por medio de H para hombre o M para mujer
     */

    public Persona(String name, int age, double weight, double height, char gender) {
        this.name = name;
        this.age = age;
        setRandomDni();
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        checkGender();
    }

    public int compareToZero() {
        if (this.weight == 0 && this.height == 0) {
            return 2;
        }
        return 1;
    }


    /**
     * Metodo que nos calcula el IMC, por medio del peso y la altura de la persona
     * @return tipo integer, devuelve un valor de acuerdo al imc, bajo peso = -1 , ideal = 0 , sobrepeso = 1
     */
    public int calculateImc() {
        int zero = compareToZero();

        if (zero == 1) {
            double imc = this.weight / Math.pow(this.height, 2);
            if (imc < 20) {
                return LOW;
            } else if (20 <= imc && imc <= 25) {
                return IDEAL;

            }
        }
        return HAIGH;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    private void checkGender() {
        if (this.gender != 'M') {
            this.gender = MALE;
        }
    }

    /**
     *
     * Metodo para imprimir en consola la informacion del objeto
     * @return tipo string, devuelve todos los atributos del objeto como un string.
     */
    public String toString() {
        return "Nombre: %s%nEdad: %s%nDNI: %s%nSexo: %s%nPeso: %s%nAltura: %s%n".formatted(name, age, dni, gender, weight, height);
    }

    /**
     * Metodo para crear y otorgar al dni un valor aleatorio por cada persona nueva.
     */
    private void setRandomDni() {
        int rNumber = rand.nextInt(90000000) + 10000000;
        char letter = (char) (rand.nextInt(26) + 'A');
        this.dni = String.valueOf(rNumber) + letter;


    }

    /**
     * Metodo con el cual indicamos por un mensaje, si la persona esta por sobre, debajo o ideal en su peso.
     * @return string, devuelve un mensaje segun lo retornado en el metodo calculateImc.
     */
    public String printWeight() {
        int imc = calculateImc();
        return switch (imc) {
            case LOW -> "Estas por debajo de tu peso ideal";
            case IDEAL -> "Estas en tu peso ideal";
            case HAIGH -> "Estas con sobrepeso";
            default -> "Datos insuficientes para calcular imc";
        };

    }

    /**
     * Metodo para imprimir en consola los resultados de los metodos de conocer su peso y si es adulto.
     */
    public void printInfoOne() {
        msg.printInfo(printWeight());
       msg.printInfo(isAdult() ? "Es mayor de edad" : "es menor de edad");
       msg.printInfo(toString());

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
