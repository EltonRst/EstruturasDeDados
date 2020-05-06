/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author elton
 */
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        Lista ls = new Lista();
        ls.insereFim(9);
        ls.insereFim(8);
        ls.insereFim(7);
        ls.insereFim(6);
        
        ls.removeFim();
        ls.removeFim();
        ls.removeFim();
        
        ls.mostraLista();
    }

}
