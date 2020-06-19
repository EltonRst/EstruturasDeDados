/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author elton
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arvore ar = new Arvore();
        //
        ar.insere(10);
        ar.insere(20);
        ar.insere(5);
        //
        ar.delete(10);
        //
        System.out.println(ar.procura(10));
    }
    
}
