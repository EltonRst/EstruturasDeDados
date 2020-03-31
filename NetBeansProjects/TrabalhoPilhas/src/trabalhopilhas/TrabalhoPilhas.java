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

        // Fiz em int e object, são semelhantes mas tem diferença
        pilhaInt();
        //pilhaObject();

    }

    public static void pilhaInt() {

        System.out.println("*** Digite aleatoriamente caixas de peso 3, 5 ou 7 toneladas ****");

        PilhaInt pA = new PilhaInt(6);
        PilhaInt pB = new PilhaInt(6);
        PilhaInt pC = new PilhaInt(6);

        // Lê a fila F1
        while (!pA.isFull()) {
            System.out.println("Digite o peso da caixa que deseja empilhar:");
            int caixa = ln.nextInt();
            if (caixa == 3 || caixa == 5 || caixa == 7) {
                // Verificamos se a caixa que está entrando é menor do que a que está no topo
                if (caixa < pA.top()) {
                    // Se for menor, adicionamos a caixa que chegou à pilha
                    pA.push(caixa);
                } else {
                    // Caso não for, removemos as menores para transferir para as pilhas temporárias
                    while (!pA.isEmpty() && pA.top() < caixa) {
                        // Remove da fila
                        int cxp = pA.pop();
                        // Se for de 5 vai para pilha temporária B
                        if (cxp == 5) {
                            pB.push(cxp);
                        }
                        // Se for de 3 vai para pilha temporária C
                        if (cxp == 3) {
                            pC.push(cxp);
                        }
                    }
                    // Depois adicionamos a caixa que chegou à pilha
                    pA.push(caixa);
                    // Removemos os elementos da pilha temporária B e adicionamos na A
                    while (!pB.isEmpty()) {
                        pA.push(pB.pop());
                    }
                    // Removemos os elementos da pilha temporária C e adicionamos na A
                    while (!pC.isEmpty()) {
                        pA.push(pC.pop());
                    }
                }
            } else {
                System.out.println("Peso da caixa informado inválido: " + caixa);
            }
        }

        System.out.println("Conteúdo da pilha A:");
        // Exibe conteúdo da pilha A
        while (!pA.isEmpty()) {
            System.out.println(pA.pop());
        }

    }

    public static void pilhaObject() {

        System.out.println("*** Digite aleatoriamente caixas de peso 3, 5 ou 7 toneladas ****");

        PilhaObject pA = new PilhaObject(6);
        PilhaObject pB = new PilhaObject(6);
        PilhaObject pC = new PilhaObject(6);

        // Lê a fila F1
        while (!pA.isFull()) {
            System.out.println("Digite o peso da caixa que deseja empilhar:");
            int caixa = ln.nextInt();
            if (caixa == 3 || caixa == 5 || caixa == 7) {
                // Se a pilha estiver vazia já adiciona direto a primeira caixa independente do peso
                if (pA.isEmpty()) {
                    // Adiciona independente do peso por que setá só uma mesmo
                    pA.push(caixa);
                } else {
                    // Se não, verificamos se a caixa que está entrando é menor do que a que está no topo
                    if (caixa < (int) pA.top()) {
                        // Se for menor, adicionamos a caixa que chegou à pilha
                        pA.push(caixa);
                    } else {
                        // Caso não for, removemos as menores para transferir para as pilhas temporárias
                        while (!pA.isEmpty() && (int) pA.top() < caixa) {
                            // Remove da fila
                            int cxp = (int) pA.pop();
                            // Se for de 5 vai para pilha temporária B
                            if (cxp == 5) {
                                pB.push(cxp);
                            }
                            // Se for de 3 vai para pilha temporária C
                            if (cxp == 3) {
                                pC.push(cxp);
                            }
                        }
                        // Depois adicionamos a caixa que chegou à pilha
                        pA.push(caixa);
                        // Removemos os elementos da pilha temporária B e adicionamos na A
                        while (!pB.isEmpty()) {
                            pA.push(pB.pop());
                        }
                        // Removemos os elementos da pilha temporária C e adicionamos na A
                        while (!pC.isEmpty()) {
                            pA.push(pC.pop());
                        }
                    }
                }
            } else {
                System.out.println("Peso da caixa informado inválido: " + caixa);
            }
        }

        System.out.println("Conteúdo da pilha A:");
        // Exibe conteúdo da pilha A
        while (!pA.isEmpty()) {
            System.out.println(pA.pop());
        }

    }

}
