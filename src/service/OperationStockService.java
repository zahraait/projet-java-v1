/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.OperationStock;
import bean.Stock;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class OperationStockService {
   private StockService stockService=new StockService();
   public OperationStock findById(long id,ArrayList<OperationStock>operationStocks){
       for (OperationStock operationStock : operationStocks) {
           if(operationStock.getId()==id){
               return operationStock;
           }
                   
       }
       return null;
   }
   
    public OperationStock findByMagasinAndProduit(String libelleMagasin, String libelleProduit,ArrayList<OperationStock> operationStocks) {
        for (OperationStock operationStock : operationStocks) {
            if (operationStock.getMagasin().getLibelle().equals(libelleMagasin) && operationStock.getProduit().getLibelle().equals(libelleProduit)) {
                return operationStock;
            }
        }
        return null;
    }
   
   
    public int save(OperationStock operationStock,ArrayList<OperationStock>operationStocks,ArrayList<Stock>stocks){
        System.out.println("before find");
        //OperationStock myOperationStock=findByMagasinAndProduit(operationStock.getMagasin().getLibelle(),operationStock.getProduit().getLibelle() , operationStocks);
     Stock myStock=stockService.findByMagasinAndProduit(operationStock.getMagasin().getLibelle(),operationStock.getProduit().getLibelle() , stocks);
        if(myStock==null){
            return-1;
        }
     System.out.println("before find1");    
      
             myStock.setQte(operationStock.getQte());
                  if(operationStock.getType()==1){
                     
                      stockService.create(myStock, stocks);
      // Stock.setQte(nvQte);
        }else{
             stockService.diminueQte(myStock, stocks);
          }
          operationStocks.add(operationStock);
          return 1  ;
    
         
    }
}
