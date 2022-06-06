package com.sofka.ejercicio18;

import com.sofka.utilities.Messages;



public class Main {

    public static void main(String[] args) {

        Serie [] seriesList = new Serie[5];
        Game [] gamesList = new Game[5];

        seriesList[0]= new Serie("Vikings", "Hirst",6, "Historica");
        seriesList[1]= new Serie("Supertnatural","Bobby", 16, "Ciencia ficcion");
        seriesList[2]= new Serie("The Boys", "boys");
        seriesList[3]= new Serie("Arrow","Green", 8, "Heroes");
        seriesList[4]= new Serie();

        gamesList[0] = new Game("God of War", 55);
        gamesList[1] = new Game("gta", 4);
        gamesList[2] = new Game("mario", 34);
        gamesList[3] = new Game("ACValhalla", 89);
        gamesList[4] = new Game("Metro redux", 79);


        gamesList[3].rent();
        gamesList[2].rent();
        gamesList[1].rent();

        seriesList[3].rent();
        seriesList[1].rent();

        int rentGames= 0;
        int rentSeries = 0;

        for(Game g : gamesList){
            if(g.isRent()){
                Messages.logger.infov("Juego entregado : \n{0}", g.toString());
                rentGames++;
            }
        }

        for(Serie s: seriesList){
            if(s.isRent()){
                Messages.logger.infov("Juego entregado : \n{0}", s.toString());
                rentSeries++;
            }
        }

        Messages.logger.infov("La cantidad de juegos entregados es: {0}\t La cantidad de series entregadas es: {1}", rentGames, rentSeries);

        Game gameHours = new Game();
        gameHours.setEstimatedHours(0);
        for(Game gam : gamesList){
            if(gam.compareTo(gameHours) == 3) gameHours = gam;


        }
        Serie serieHours = new Serie();
        serieHours.setSeasons(0);
        for(Serie gam : seriesList){
            if( gam.compareTo(serieHours) == 3) serieHours = gam;

        }




        Messages.logger.infov( "El juego con mas horas es: {0}", gameHours.toString());
        Messages.logger.infov( "La serie con mas temporadas es: {0}", serieHours.toString());








    }




}
