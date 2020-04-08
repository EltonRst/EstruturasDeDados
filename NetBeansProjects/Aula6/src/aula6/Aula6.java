/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author elton
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        exercicio3();

    }

    private static void exercicio1() {
        Lista l = new Lista();
        // 1 = A
        // 2 = B
        l.insereFim(3); // C
        l.insereFim(4); // D
        l.insereFim(5); // E
        //
        l.insereInicio(1);
        l.insere(2, 2);
        //
        l.mostraLista();
    }

    private static void exercicio2() {
        Lista l = new Lista();
        //
        l.insereFim(1); // A
        l.insereFim(2); // B
        l.insereFim(3); // C
        // D = 4
        //
        l.prim.dado = 4;
        //
        l.mostraLista();
    }

    private static void exercicio3() {
        Lista l = new Lista();
        //
        l.insereFim(1); // A
        l.insereFim(2); // B
        l.insereFim(3); // C
        // D = 4
        //
        Nodo nodoAtual = l.prim;
        while (nodoAtual.next != null) {
            nodoAtual = nodoAtual.next;
        }
        nodoAtual.dado = 4;
        //
        l.mostraLista();
    }

}
