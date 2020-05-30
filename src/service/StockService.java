/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Produit;
import bean.Stock;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class StockService {

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

}
