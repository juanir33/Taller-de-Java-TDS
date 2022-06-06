package com.sofka.ejercicios10to15;

import com.sofka.utilities.Messages;

public class Ejercicio15 {

    public static void main(String[] args) {
        Messages msg = Messages.getInstance();

        Messages.logger.info("****** GESTION CINEMATOGRÁFICA ********");
        int menuOption;
        do {
            Messages.logger.info("Selecciona un opcion del menu: \n1) - Nuevo actor\n2) - Buscar actor\n3) - Eliminar actor\n4) - Modificar actor\n5) - Ver todos los actores\n6) - Ver peliculas de los actores\n7) - Ver categoria de peliculas de los actores\n8) - Salir");
            menuOption = msg.scanI();

            switch (menuOption) {
                case 1 -> Messages.logger.info("Nuevo actor");
                case 2 -> Messages.logger.info("Buscar actor");
                case 3 -> Messages.logger.info("Eliminar actor");
                case 4 -> Messages.logger.info("Modificar actor");
                case 5 -> Messages.logger.info("Ver todos los actores");
                case 6 -> Messages.logger.info("Ver peliculas de los actores");
                case 7 -> Messages.logger.info("Ver categorias de las peliculas de los actores");
                case 8 -> Messages.logger.info("Has salido");
                default -> Messages.logger.info("Opcion incorrecta");
            }

        } while (menuOption != 8);
    }

}
