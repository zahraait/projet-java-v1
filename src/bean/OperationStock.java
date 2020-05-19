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
public class OperationStock {
    private Long id;
    private Produit produit;
    private Magasin magasin;
    private Double qte;
    private int type;//TYPE1= ENTREE    TYPE2=SORTIE

    public OperationStock() {
    }

    public OperationStock(Long id, Produit produit, Magasin magasin, Double qte, int type) {
        this.id = id;
        this.produit = produit;
        this.magasin = magasin;
        this.qte = qte;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Double getQte() {
        return qte;
    }

    public void setQte(Double qte) {
        this.qte = qte;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "OperationStock{" + "id=" + id + ", produit=" + produit + ", magasin=" + magasin + ", qte=" + qte + ", type=" + type + '}';
    }
    
    
}
