package fr.oc.bibliotheque.microservicebibliotheque.model;

import fr.oc.projet.model.beans.utilisateur.Adresse;

public class Bibliotheque {

    private Integer id;
    private String nom;
    private Adresse adresse;
    private String numeroSiret;

    public Bibliotheque() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNumeroSiret() {
        return numeroSiret;
    }

    public void setNumeroSiret(String numeroSiret) {
        this.numeroSiret = numeroSiret;
    }
}
