/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author elton
 */
public class Aula4 {

    public static Scanner ln = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        exercicio1();
        exercicio3();
    }

    public static void exercicio1() {

        Fila F = new Fila(8);
        Fila F1 = new Fila(4);
        Fila F2 = new Fila(4);

        // Lê a fila F1
        while (!F1.isFull()) {
            System.out.println("Digite um número para adicionar na fila F1:");
            int num = ln.nextInt();
            F1.insere(num);
        }

        // Lê a fila F2
        while (!F2.isFull()) {
            System.out.println("Digite um número para adicionar na fila F2:");
            int num = ln.nextInt();
            F2.insere(num);
        }

        // Mescla as filas F1 e F2 na fila F
        while (!F.isFull()) {
            F.insere(F1.remove());
            F.insere(F2.remove());
        }

        System.out.println("Elementos mesclados da fila F:");
        // Exibe a fila F
        while (!F.isEmpty()) {
            System.out.println(F.remove());
        }

    }

    public static void exercicio3() {
        Fila fila = new Fila(5);
        PilhaObject pilha = new PilhaObject(5);

        // Lê a fila F1
        while (!fila.isFull()) {
            System.out.println("Digite um número para adicionar na fila F:");
            int num = ln.nextInt();
            fila.insere(num);
        }

        // Adiciona os elementos da fila na pilha
        while (!pilha.isFull()) {
            pilha.push(fila.remove());
        }

        // Só resolveu dando new, parece que a fila retorna cheia, 
        // mesmo após remover os elementos e adicionar na pilha bug na classe fila
        fila = new Fila(5);

        // Remove os elementos da pilha re-adicionando na fila
        while (!fila.isFull()) {
            fila.insere(pilha.pop());
        }

        System.out.println("Elementos reordenados na fila F:");
        // Exibe a fila F
        while (!fila.isEmpty()) {
            System.out.println(fila.remove());
        }

    }
}
