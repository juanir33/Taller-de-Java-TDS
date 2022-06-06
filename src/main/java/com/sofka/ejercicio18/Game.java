package com.sofka.ejercicio18;

public class Game implements Entregable{
    private String title;
    private int estimatedHours;
    private String category;
    private String developerStudio;
    private boolean isRental;

    public Game() {
        this.title = "";
        this.category = "";
        this.developerStudio = "";
        this.estimatedHours = 10;
        this.isRental = false;
    }

    public Game(String title, int estimatedHours) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.category = "";
        this.developerStudio = "";
        this.isRental = false;
    }

    public Game(String title, int estimatedHours, String category, String developerStudio) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.category = category;
        this.developerStudio = developerStudio;
        this.isRental = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDeveloperStudio() {
        return developerStudio;
    }

    public void setDeveloperStudio(String developerStudio) {
        this.developerStudio = developerStudio;
    }

    @Override
    public String toString() {
        return "Titulo: %s%nDesarrollador: %s%nHoras de juego: %s%nCategoria: %s%nAlquilado: %s".formatted(title,
                developerStudio, estimatedHours, category, isRental);
    }

    @Override
    public void rent() {
        this.isRental = true;

    }

    @Override
    public void returnRental() {
        this.isRental = false;

    }

    @Override
    public boolean isRent() {
        return this.isRental;
    }

    @Override
    public int compareTo(Object a) {
        Game games = (Game) a;
        int compare = 1;
        if (this.estimatedHours == games.getEstimatedHours()) {
            compare = 2;
        } else if (this.estimatedHours > games.getEstimatedHours()) {
            compare = 3;
        }

        return compare;

    }

}

