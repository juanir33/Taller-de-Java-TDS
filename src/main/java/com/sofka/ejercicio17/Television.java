package com.sofka.ejercicio17;

public class Television extends Appliance{
    double screenSize;
    boolean tdtSignal;

    public Television() {
        super();
        this.screenSize= 20;
        this.tdtSignal =false;
    }

    public Television(double price, double weight) {
        super(price, weight);
        this.tdtSignal =false;
        this.screenSize = 20;
    }

    public Television(double price, double weight, char efficiency, String color, double screenSize, boolean tdtSignal) {
        super(price, weight, efficiency, color);
        this.screenSize = screenSize;
        this.tdtSignal = tdtSignal;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public boolean isTdtSignal() {
        return tdtSignal;
    }

    /**
     * Metodo para actualizar el precio si el televisor, tiene mas de 20 pulgadas y/o tiene tdt.
     * toma el valor del metodo del padre y procede actualizar.
     * @return double precio de articulo
     */

    public double tvPrice(){
         double price = super.finalPrice();
        if(this.screenSize > 40){
            price*= 1.3;
        }
        if(this.tdtSignal){
            price+= 50;
        }

        return price;
    }

}
