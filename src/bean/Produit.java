/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author hp
 */
public class Produit {
   private String libelle;
   private String reference;
   private Long id;

    public Produit() {
    }

    public Produit(String libelle, String reference, Long id) {
        this.libelle = libelle;
        this.reference = reference;
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produit{" + "libelle=" + libelle + ", reference=" + reference + ", id=" + id + '}';
    }
   
    
}
