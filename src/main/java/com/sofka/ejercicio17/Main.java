package com.sofka.ejercicio17;

import com.sofka.utilities.Messages;

public class Main {
    /**
     * Clase principal para ejecutar la aplicacion, se cre array de electrodomesticos y se suman los precios por separado.
     * @param args        d
     */


    public static void main(String[] args) {


        Appliance [] applianceList = new Appliance[10];

        applianceList[0] = new Television();
        applianceList[1] = new Appliance();
        applianceList[2] = new WashingMachine();
        applianceList[3] = new Television(100, 12);
        applianceList[4] = new Appliance(20, 20, 'A',"red");
        applianceList[5] = new WashingMachine(400, 40);
        applianceList[6] = new Television(450, 20,'b', "blue", 60, true);
        applianceList[7] = new WashingMachine(100, 48, 'u', "green", 56);
        applianceList[8] = new Appliance(100, 4);
        applianceList[9] = new Television(200,12);

        double appliancePrice = 0;
        double televisionPrice =0;
        double washPrice= 0;

        for(Appliance apli : applianceList){
            appliancePrice += apli.finalPrice();

            if(apli instanceof Television television){
                televisionPrice+= television.tvPrice();
            }
            if(apli instanceof WashingMachine washingMachine){
                washPrice+= washingMachine.washPrice();
            }

        }

        Messages.logger.infov("La suma de los electrodomesticos es: {0}", String.valueOf(appliancePrice));
        Messages.logger.infov("La suma de los Televisores es: {0}", String.valueOf(televisionPrice));
        Messages.logger.infov("La suma de los Lavarropas es: {0}", String.valueOf(washPrice));






    }
}
