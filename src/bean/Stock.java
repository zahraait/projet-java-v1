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
    private Magasin magasin;
    private Double qte;
    private Produit produit;
    

    public Stock() {
    }

    public Stock(Long id, Magasin magasin, Double qte, Produit produit) {
        this.id = id;
        this.magasin = magasin;
        this.qte = qte;
        this.produit = produit;
    }

    public Stock(long l, Magasin m, Produit p, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", magasin=" + magasin.getLibelle() + ", qte=" + qte + ", produit=" + produit.getLibelle() + '}';
    }
    

    
}
