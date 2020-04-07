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
        //l.insereInicio(10);
        //
        //l.insereInicio(20);
        //
        //l.insereInicio(30);
        //
        //l.insereInicio(40);
        //
        l.insereFim(10);
        l.insereFim(20);
        l.insereFim(30);
        l.insereInicio(30);
        l.insereInicio(50);
        l.insereFim(40);
        //
        l.mostraLista();
        //
        System.out.println("valor Removido: " + l.removeFim());
        //        
        l.mostraLista();
        
        //
        Lista busca = l.pesquisa(30);
        
        busca.mostraLista();
        
        
    }

}
