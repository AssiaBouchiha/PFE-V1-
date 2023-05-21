package com.example.tpcommande.bean;

import javax.persistence.*;

import java.util.List;

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String reference;
    private String email;

    @OneToMany
    private List<Achat> achats ;



    // constructeurs, getters et setters

    public Fournisseur(Long id, String nom, String prenom, String fournisseurReference, String email, List<Achat> achats) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.reference = fournisseurReference;
        this.email = email;
        this.achats = achats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Achat> getAchats() {
        return achats;
    }

    public void setAchats(List<Achat> achats) {
        this.achats = achats;
    }
}
