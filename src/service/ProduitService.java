/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Produit;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ProduitService {
    public Produit findById(Long id,ArrayList<Produit>produits){
        for (Produit produit : produits) {
            if(produit.getId()==id){
                return produit;
            }
        }
        return null;         
    }
    
    public int delete (Produit produit, ArrayList<Produit>produits){
        
        if(findById(produit.getId(),produits)==null){
            return -1;
        }
        else{
            produits.remove(produit);
              return 1;
        }
      
    }
    public int save (Produit produit,ArrayList<Produit>produits){
        if(findById(produit.getId(),produits)!=null){
            return -1;
        }
            else {
                    produits.add(produit);
                    return 1;
                    }
    }
    
   
}
