/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import bean.Commande;
import static java.awt.PageAttributes.MediaType.C1;
import service.CommandeService;

/**
 *
 * @author hp
 */
public class CommandeServiceTest {
    public static void main(String[] args) {
        CommandeService CS=new CommandeService();
       Commande C1=CS.cree("cmd1",100,2);
       
        System.out.println("C1 = " + C1);
        Commande C2=CS.cree("cmd2",100,200);
        if(C2!=null)
        System.out.println("C2 = " + C2);
        else
            System.out.println("creation de la commande C2 avec erreur");
        int res1=CS.paye(C1,30);
        System.out.println("res1 = " + res1);
        System.out.println("C1 = " + C1);

        
         int res2=CS.paye(C1,20);
        System.out.println("res2 = " + res2);
        System.out.println("C1 = " + C1);
        
        
         int res3=CS.paye(C1,60);
        System.out.println("res3 = " + res3);
        System.out.println("C1 = " + C1);
        
        
            
    }
}
