/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartotrabalhot2;

import java.util.Scanner;

/**
 *
 * @author elton
 */
public class QuartoTrabalhoT2 {

    public static Scanner ln = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ListaDupla ld = new ListaDupla();
        ld.insereFim(1);
        ld.insereFim(2);
        ld.insereFim(3);
        ld.insereFim(4);
        ld.insereFim(5);

        System.out.println("Digite um numero para remover da lista:");
        int aremover = ln.nextInt();
        int cont = 0;
        boolean removido = false;

        Nodo nodoAtual = ld.prim;
        while (nodoAtual != null) {
            cont++;
            if (nodoAtual.dado == aremover) {
                ld.remove(cont);
                removido = true;
                break;
            }
            nodoAtual = nodoAtual.next;
        }
        if (removido) {
            System.out.println("Número removido com sucesso: "+aremover);
        } else {
            System.out.println("Número não encontrado na lista: "+aremover);
        }

        ld.mostraLista();

    }

}
