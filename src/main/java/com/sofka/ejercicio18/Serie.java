package com.sofka.ejercicio18;

public class Serie implements Entregable{
    private String title;
    private String maker;
    private int seasons;
    private String category;

    private boolean isRental;

    public Serie() {
        this.title = "";
        this.maker = "";
        this.category = "";
        this.seasons = 3;
        this.isRental = false;
    }

    public Serie(String title, String maker) {
        this.title = title;
        this.maker = maker;
        this.category = "";
        this.seasons = 3;
        this.isRental = false;
    }

    public Serie(String title, String maker, int seasons, String category) {
        this.title = title;
        this.maker = maker;
        this.seasons = seasons;
        this.category = category;
        this.isRental = false;
    }

    public String getTitle() {
        return title;
    }

    public String getMaker() {
        return maker;
    }

    public int getSeasons() {
        return seasons;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Titulo: %s%nCreador: %s%nTemporadas: %s%nCategoria: %s%nAlquilada: %s".formatted(title, maker, seasons, category, isRental);
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
        Serie serie = (Serie) a;
        int compare = 1;
        if (this.seasons == serie.getSeasons()) {
            compare = 2;
        } else if (this.seasons > serie.getSeasons()) {
            compare = 3;
        }

        return compare;
    }
}
