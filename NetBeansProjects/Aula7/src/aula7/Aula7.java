/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

import java.util.Scanner;

/**
 *
 * @author elton
 */
public class Aula7 {
    
    static Scanner ln = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nova liusta dupla
        ListaDupla LD = new ListaDupla();
        
        LD.insereFim(10);
        LD.insereInicio(20);
        LD.insereFim(30);
        LD.insereInicio(40);
                
        // Análise Percorre a lista de trás para frente
        Nodo nodoAtual = LD.ult;
        while (nodoAtual != null) {
            // mostra o valor do nodo
            nodoAtual.mostraNodo();
            //
            nodoAtual = nodoAtual.prev;
        }
        
        LD.removeInicio(); // 40
        LD.removeFim(); // 30
        
        // Mosta lista
        LD.mostraLista();
        
    }
    
}
