package com.sofka.ejercicio17;


import com.sofka.utilities.Messages;
import org.apache.commons.lang3.ArrayUtils;

/**
 * @author  Juan Ramallo
 * @version 1.0
 *
 * Aplicacion para instanciar electrodomesticos y obtener sus precios finales.
 */

public class Appliance {
    public static final double BASEPRICE = 100;
    public static final double BASEWEIGHT = 5;
    public static final char BASEENERGY = 'F';
    public static final String BASECOLOR = "WHITE";
    private  double price;
    private double weight;
    private char efficiency;
    private String color;
    Messages msg = Messages.getInstance();


    public Appliance() {
        this.color = BASECOLOR;
        this.efficiency = BASEENERGY;
        this.weight = BASEWEIGHT;
        this.price = BASEPRICE;
        checkEnergyLetter();
        checkColor();
    }

    public Appliance(double price, double weight) {
        this.price = price;
        this.weight = weight;
        this.color = BASECOLOR;
        this.efficiency = BASEENERGY;
        checkEnergyLetter();
        checkColor();

    }

    public Appliance(double price, double weight, char efficiency, String color) {
        this.price = price;
        this.weight = weight;
        this.efficiency = efficiency;
        this.color = color;
        checkEnergyLetter();
        checkColor();
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public char getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(char efficiency) {
        this.efficiency = efficiency;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    /**
     * Metodo para verificar si el codigo para la eficienia del equipo es correcto, si lo es se aplica el ingresado;
     * sino se aplica la constante por defecto.
     */

    private void checkEnergyLetter() {
        char[] possibleLetter = {'A', 'B', 'C', 'D', 'E', 'F'};
        char currentL;
        currentL = Character.toUpperCase(this.efficiency);
        boolean containLetter = ArrayUtils.contains(possibleLetter, currentL);
        if (!containLetter) {
            setEfficiency(BASEENERGY);
        } else setEfficiency(currentL);
        Messages.logger.info(getEfficiency());


    }

    /**
     * Metodo para verificar si el color introducido, esta dentro de los aceptados si es correcto, se aplica de lo
     * contrario queda por defecto en blanco.
     */

    private void checkColor() {
        String[] possibleColor = {"BLACK", "BLUE", "GRAY", "RED", BASECOLOR};

        String currentC;
        currentC = this.color.toUpperCase();
        boolean containC = ArrayUtils.contains(possibleColor, currentC);
        if (containC) {
            setColor(currentC);
        } else setColor(BASECOLOR);
        msg.printInfo(getColor());


    }

    /**
     * Metodo para obtener los incrementos de precio del articulo segun su eficiencia.
     * @return   double, precio de articulo + incremento
     */
    public double incrementForEnergy() {
        double price = 0;

        switch (this.efficiency) {
            case 'A' -> price+= 100;
            case 'B' -> price += 80;
            case 'C' -> price += 60;
            case 'D' -> price += 50;
            case 'E' -> price += 30;
            case 'F' -> price += 10;
            default -> price += 0;
        }




        return  price;


    }

    /**
     * Metodo para obtener los incrementos de precio del articulo segun su peso.
     * @return   double, precio de articulo + incremento
     */

    public double incrementForWeight() {
        double weightPrice = 0;
        if (this.weight <= 19) {

            weightPrice += 10;

        }
        if (this.weight >= 20 && this.weight <= 49) {

            weightPrice += 50;

        }
        if (this.weight >= 50 && this.weight <= 79) {

            weightPrice += 80;

        }
        if (this.weight >= 80) {

            weightPrice += 100;

        }
        return  weightPrice;
    }

    /**
     * Metodo para el precio final del articulo.
     * @return double, devuelve el precio final.
     */
    public double finalPrice() {
       return this.price + incrementForWeight() + incrementForEnergy();

    }

}
