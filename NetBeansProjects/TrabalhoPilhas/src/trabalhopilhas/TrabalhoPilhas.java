/* 
* FACULDADE DOM BOSCO DE PORTO ALEGRE
* Sistemas de Informação – Estrutura de Dados – Primeiro T1
*
* Objetivo do Programa: Controlar caixas a serem empilhadas em um depósito
* Componentes do grupo: Élton Reisdorfer
* Data da entrega do arquivo fonte: 31/03/2020
 */
package trabalhopilhas;

import java.util.Scanner;

/**
 *
 * @author elton
 */
public class TrabalhoPilhas {

    public static Scanner ln = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite aleatóriamente 6 caixas de peso 3, 5 ou 7 toneladas:");

        Fila fila = new Fila(6);

        // Lê a fila F1
        while (!fila.isFull()) {
            System.out.println("Digite um peso de caixa para adicionar na fila F:");
            int num = ln.nextInt();
            if (num == 3 || num == 5 || num == 7) {
                fila.insere(num);
            } else {
                System.out.println("Peso da caixa informado inválido: " + num);
            }
        }

        Pilha pA = new Pilha(6);
        Pilha pB = new Pilha(6);
        Pilha pC = new Pilha(6);

        // Adiciona os elementos da fila na pilha
        while (!fila.isEmpty()) {

            int caixa = (int) fila.remove();

            // Se for de 7 toneladas vai direto para pilha A
            if (caixa == 7) {
                pA.push(caixa);
            }

            // Se for de 5 vai para pilha temporária B
            if (caixa == 5) {
                pB.push(caixa);
            }

             // Se for de 3 vai para pilha temporária C
            if (caixa == 3) {
                pC.push(caixa);
            }
        }

        // Remove os elementos da pilha temporária B e adiciona na A
        while (!pB.isEmpty()) {
            pA.push(pB.pop());
        }

         // Remove os elementos da pilha temporária C e adiciona na A
        while (!pC.isEmpty()) {
            pA.push(pC.pop());
        }

        System.out.println("Conteúdo da pilha A:");
        // Exibe conteúdo da pilha A
        while (!pA.isEmpty()) {
            System.out.println(pA.pop());
        }

    }

}
