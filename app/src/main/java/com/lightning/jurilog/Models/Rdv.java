package com.lightning.jurilog.Models;

import java.util.Date;

public class Rdv {
    private Date date;
    private String heure;
    private int nb_heure;
    private Client client;
    private Avocat avocat;

    public Rdv() {
    }

    public Rdv(Date date, String heure, int nb_heure, Client client, Avocat avocat) {
        this.setDate(date);
        this.setHeure(heure);
        this.setNb_heure(nb_heure);
        this.setClient(client);
        this.setAvocat(avocat);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Avocat getAvocat() {
        return avocat;
    }

    public void setAvocat(Avocat avocat) {
        this.avocat = avocat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public int getNb_heure() {
        return nb_heure;
    }

    public void setNb_heure(int nb_heure) {
        this.nb_heure = nb_heure;
    }
}
