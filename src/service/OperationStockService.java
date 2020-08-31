/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.OperationStock;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class OperationStockService {
   public OperationStock findById(long id,ArrayList<OperationStock>operationStocks){
       for (OperationStock operationStock : operationStocks) {
           if(operationStock.getId()==id){
               return operationStock;
           }
                   
       }
       return null;
   }
    public int save(OperationStock operationStock,ArrayList<OperationStock>operationStocks){
        if(findById(operationStock.getId(), operationStocks)!=null){
            return -1;
        }else{
          operationStocks.add(operationStock);
          return 1;
        }
        
    }
}
