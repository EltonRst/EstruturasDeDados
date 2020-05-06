/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

/**
 *
 * @author elton
 */
public class Aula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        exercicio4();

    }

    private static void exercicio4() {

        ListaDupla ld = new ListaDupla();

        ld.insereFim(1);
        ld.insereFim(2);
        ld.insereFim(3);
        ld.insereFim(4);
        ld.insereFim(5);

        ld.mostraLista();
        
        Nodo prev = null;
        Nodo next = null;
        Nodo nodoAtual = ld.prim;
        while (nodoAtual != null) {
            next = nodoAtual.next;
            nodoAtual.next = prev;
            prev = nodoAtual;
            nodoAtual = next;
        }
        ld.prim = prev;

        ld.mostraLista();

    }

}
