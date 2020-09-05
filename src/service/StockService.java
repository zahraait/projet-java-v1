/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Magasin;
import bean.Produit;
import bean.Stock;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class StockService {
     public Stock findById(Long id, List<Stock> stocks) {
        for (Stock stock : stocks) {
            if (stock.getId()==id) {
                return stock;
            }
        }
        return null;
    }

    
    
    

    public Stock findByMagasinAndProduit(String libelleMagasin, String libelleProduit, List<Stock> stocks) {
        for (Stock stock : stocks) {
            if (stock.getMagasin().getLibelle().equals(libelleMagasin) && stock.getProduit().getLibelle().equals(libelleProduit)) {
                return stock;
            }
        }
        return null;
    }

    public int create(Stock stock, List<Stock> stocks) {
        Stock myStock = findByMagasinAndProduit(stock.getMagasin().getLibelle(), stock.getProduit().getLibelle(), stocks);
        if (myStock == null) {
            stocks.add(stock);
            return 1;
        } else {
            myStock.setQte(myStock.getQte() + stock.getQte());
            return 2;
        }
    }
    
      public int diminueQte(Stock stock, List<Stock> stocks) {
        Stock myStock = findByMagasinAndProduit(stock.getMagasin().getLibelle(), stock.getProduit().getLibelle(), stocks);
        if (myStock == null) {
            return -1;
        } else {
            myStock.setQte(myStock.getQte() - stock.getQte());
            return 1;
        }
    }
    
    
      public int save (Stock stock,List<Stock> stocks) {
          if(findById(stock.getId(),stocks)!=null){
             return-1; 
          }else{
              stocks.add(stock);
              return 1;
          }
      } 
     
 
     
    public Stock findByProduit(String ProduitLibille,List<Stock> stocks){
       // ArrayList<Stock> listeQte=new ArrayList<>();
        for (Stock s :stocks) {
            if(s.getProduit().getLibelle().equals(ProduitLibille)){
                return s;
            }
           
        }
       return null;  
    }
    
    
    
        public  List<Stock> findByMagasin(String MagasinLibille,List<Stock> stocks){
        
            List<Stock> listeMagasin=new ArrayList<Stock>();
        
        for (Stock s :stocks) {
            if(s.getMagasin().getLibelle().equals(MagasinLibille)){
                listeMagasin.add(s);
            }
           
        }
       return listeMagasin;  
    }
}
