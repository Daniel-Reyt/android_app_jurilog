package com.lightning.jurilog.Models;

public class Client {
    private String username;
    private String password;
    private String prenom;
    private String nom;
    private double balance;

    public Client() {
    }

    public Client(String username, String password, String prenom, String nom, double balance) {
        this.setUsername(username);
        this.setPassword(password);
        this.setPrenom(prenom);
        this.setNom(nom);
        this.setBalance(balance);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
