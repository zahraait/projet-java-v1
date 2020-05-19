/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Produit;
import bean.Stock;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class StockService {
     public Stock findByMagasinAndProduit(String  magasin,Produit produit,Double qte,ArrayList<Stock> stocks){
         for (Stock stock : stocks) {
             if(stock.getMagasin().equals(magasin)&&stock.getProduit().equals(produit)){
                 Double nvQte=stock.getQte()+qte;
                 stock.setQte(nvQte);
             }else{
                 
             }
             
         }
         return null;
    
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private Stock create (Long id,ArrayList<Stock> stocks){
        for (Stock stock : stocks) {
            if(stock.getId().equals(id)){
                return stock;
            }
            
        }
        return null;
   
    }
  int Stock findByMagasin 
         
}
