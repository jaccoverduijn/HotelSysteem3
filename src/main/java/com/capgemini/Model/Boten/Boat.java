package com.capgemini.Model.Boten;

/**
 * Created by JVERDUIJ on 5-5-2017.
 */
public class Boat {
    private int nummer;

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getBootnaam() {
        return bootnaam;
    }

    public void setBootnaam(String bootnaam) {
        this.bootnaam = bootnaam;
    }

    private String bootnaam;
    public Boat(int nummer, String bootnaam){
        this.bootnaam =bootnaam;
        this.nummer=nummer;
    }
    public Boat(){};

}