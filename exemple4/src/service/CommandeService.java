/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Commande;

/**
 *
 * @author hp
 */
public class CommandeService {
    public Commande cree(String reference,double total,double totalPaye){
        if(total<0||totalPaye<0||totalPaye>total){
            return null;
        }
            
        else{
            Commande C=new Commande(reference,total,totalPaye);
            return C;
        }
              
    }
    public int paye(Commande C,double montant){
        if (montant+C.getTotalPaye()>C.getTotal()){
            return -1;
        }
        else {
            double nouveauTotalPaye=montant+C.getTotalPaye();
            C.setTotalPaye(nouveauTotalPaye);
            return 1;
        }
    }
}
