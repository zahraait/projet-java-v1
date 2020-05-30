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
public class Commande {
    private String reference;
    private double total;
    private double totalPaye;
    public double gettotalPaye;

    public Commande() {
    }

    public Commande(String reference, double total, double totalPaye) {
        this.reference = reference;
        this.total = total;
        this.totalPaye = totalPaye;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        if (total>0)
            
        this.total = total;
        
    }

    public double getTotalPaye() {
       
        return totalPaye;
    }

    public void setTotalPaye(double totalPaye) {
        if(totalPaye>0)
        this.totalPaye = totalPaye;
    }

    @Override
    public String toString() {
        return "Commande{" + "reference=" + reference + ", total=" + total + ", totalPaye=" + totalPaye + '}';
    }
    
    
}
