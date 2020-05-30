    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Magasin;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class MagasinService {
    public Magasin findBylibelleAndId(String libelle,Long id,ArrayList<Magasin> magasins){
        for (Magasin magasin : magasins) {
           if(magasin.getLibelle().equals(libelle)&&magasin.getId()==id){
               return magasin;
           } 
        }
        return null;
    }
   
    public int save(Magasin m,ArrayList<Magasin> magasins){
        if(findBylibelleAndId(m.getLibelle(),m.getId(),magasins)!=null){
           return -1; 
        }else{
            magasins.add(m);
        }
        return 1;
            
    }
}
 