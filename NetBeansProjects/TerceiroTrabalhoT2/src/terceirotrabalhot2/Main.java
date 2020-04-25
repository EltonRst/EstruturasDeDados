/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceirotrabalhot2;

import java.util.Scanner;

/**
 *
 * @author elton
 */
public class Main {
    
    static Scanner ln = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nova liusta dupla
        ListaDupla LD = new ListaDupla();
        // Número que será lido do teclado e adicionado na lista ou usado como flag
        int num = 0;
        //
        // Leitura dos números para adição na lista
        do {
            System.out.println("Digite números pares ou ímpares, ou para sair digite o número zero: ");
            num = ln.nextInt();
            // Se positivo e não o flag, insere no início
            if (num > 0) {
                LD.insereInicio(num);
            } else if (num < 0) { // Se negativo e não o flag, insere no fim
                LD.insereFim(num);
            }
        } while (num != 0); // Flag de controle
        
        // Lista dupla dos pares
        ListaDupla LDPar = new ListaDupla();
        
        // Análise da lista dupla LD em busca dos pares
        Nodo nodoAtual = LD.prim;
        while (nodoAtual != null) {
            // Verifica se é par
            if (nodoAtual.dado % 2 == 0) {
                LDPar.insereFim(nodoAtual.dado); // Adiciona em LDPar
            }
            nodoAtual = nodoAtual.next;
        }
        
        // Mosta lista coletada.
        LD.mostraLista();
        
        // Mostra lista dos pares.
        LDPar.mostraLista();
        
    }
    
}
