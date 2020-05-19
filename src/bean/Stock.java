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
public class Stock {
    private Long id;
    private String magasin;
    private Double qte;
    private Produit produit;

    public Stock() {
    }

    public Stock(Long id, String magasin, Double qte, Produit produit) {
        this.id = id;
        this.magasin = magasin;
        this.qte = qte;
        this.produit = produit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMagasin() {
        return magasin;
    }

    public void setMagasin(String magasin) {
        this.magasin = magasin;
    }

    public Double getQte() {
        return qte;
    }

    public void setQte(Double qte) {
        this.qte = qte;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", magasin=" + magasin + ", qte=" + qte + ", produit=" + produit + '}';
    }
    
    
}
