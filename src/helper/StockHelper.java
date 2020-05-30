/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Stock;
import java.util.List;
import javax.swing.JTable;
import ma.fstg.banque.view.helper.AbstractHelperItem;

/**
 *
 * @author Chaimaa-abd
 */
public class StockHelper extends AbstractHelper<Stock> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("Le Magasin", "magasin"),
            new AbstractHelperItem("Le produit", "produit"),
            new AbstractHelperItem("La quantité", "qte")
        };
    }

    public StockHelper(JTable jTable, List<Stock> list) {
        super(titres, jTable, list);
    }

    public StockHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public StockHelper(JTable jTable) {
        super(titres, jTable);
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex ==0) {
            return list.get(rowIndex).getMagasin().getLibelle();
        } else if (columnIndex == 1) {
            return list.get(rowIndex).getProduit().getLibelle();
        }else{
            return super.getValueAt(rowIndex, columnIndex);
        }
    }

}
