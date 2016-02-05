/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inserimentodatiaziendali;

import static inserimentodatiaziendali.EasyInput.inputB;

/**
 *
 * @author eliasforna
 */
public class Main {
    
    public static void main(String[] args) {
        InserimentoDatiAziendali dati = new InserimentoDatiAziendali();
        
        
        
        dati.insTotaleOre();
        dati.insPrezzoOra();
        dati.outPrezzoOre();
        dati.calcPrezzoOre();
        double cazzo = dati.outPrezzoOre();
        System.out.println(cazzo);
        dati.calcPrezzoIva(cazzo);
    }
           
    
}
