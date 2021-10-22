package com.lightning.jurilog.Models;

public class Facture {
    private double taux_honoraire;
    private double montant_total;
    private Rdv rdv;

    public Facture() {
    }

    public Facture(double taux_honoraire, double montant_total, Rdv rdv) {
        this.setTaux_honoraire(taux_honoraire);
        this.setMontant_total(claculTotal(taux_honoraire, rdv.getNb_heure()));
        this.setRdv(rdv);
    }

    private double claculTotal(double taux_honoraire, int nb_heure) {
        return (taux_honoraire * nb_heure);
    }

    public double getTaux_honoraire() {
        return taux_honoraire;
    }

    public void setTaux_honoraire(double taux_honoraire) {
        this.taux_honoraire = taux_honoraire;
    }

    public double getMontant_total() {
        return montant_total;
    }

    public void setMontant_total(double montant_total) {
        this.montant_total = montant_total;
    }

    public Rdv getRdv() {
        return rdv;
    }

    public void setRdv(Rdv rdv) {
        this.rdv = rdv;
    }
}
