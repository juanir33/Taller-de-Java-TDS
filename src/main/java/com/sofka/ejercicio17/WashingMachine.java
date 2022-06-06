package com.sofka.ejercicio17;

public class WashingMachine  extends Appliance{
    private final int capacity;
    public static final int MINCAPACITY = 5;

    public WashingMachine() {
        super();
        this.capacity = MINCAPACITY;
    }

    public WashingMachine(double price, double weight) {
        super(price, weight);
        this.capacity = MINCAPACITY;
    }

    public WashingMachine(double price, double weight, char efficiency, String color, int capacity) {
        super(price, weight, efficiency, color);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    /**
     * Metodo para obtener precio de las lavadoras, se actualiza el precio
     * de electrodomestico si la lavadora tiene capacidad de mas 30kg;
     * @return double devuelve el precio final de articulo.
     */
    public double washPrice(){
        double price = super.finalPrice();
        if(this.capacity > 30){
            price+= 50;
        }

        return price;
    }
}
