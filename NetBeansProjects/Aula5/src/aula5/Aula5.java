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
        Lista l = new Lista();
        //
        l.insereInicio(23);
        l.insereInicio(19);
        l.insereFim(78);
        l.insere(51, 3);
        l.insere(77, 3);
        l.removeFim();
        l.remove(2);
        //
        l.mostraLista();
    }

}
