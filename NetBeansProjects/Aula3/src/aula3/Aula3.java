/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author 19221080
 */
public class Aula3 {

    static Scanner leitorNumeros = new Scanner(System.in);
    static Scanner leitorLetras = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //exercicio1();
        //exercicio2();
        //exercicio3();
        exercicio4();
    }

    private static void exercicio4() {
        Stack pilhaP = new Stack(4);
        Stack pilhaN = new Stack(4);
        while (true) {
            System.out.println("Por favor digite um número:");
            int num = leitorNumeros.nextInt();
            if (num > 0) {
                if (!pilhaP.isFull()) {
                    pilhaP.push(num);
                } else {
                    break;
                }
            } else if (num < 0) {
                if (!pilhaN.isFull()) {
                    pilhaN.push(num);
                } else {
                    break;
                }
            } else {
                pilhaP.pop();
                pilhaN.pop();
            }
        }
    }

    private static void exercicio3() {
        Stack pilha = new Stack(5);
        while (true) {
            System.out.println("Por favor digite um número:");
            int num = leitorNumeros.nextInt();
            if (num > 50) {
                if (!pilha.isEmpty()) {
                    System.out.println(pilha.pop());
                } else {
                    pilha.push(num);
                }
            } else if (!pilha.isFull()) {
                pilha.push(num);
            } else {
                pilha.pop();
                pilha.pop();
                break;
            }
        }
        System.out.println("Resultado:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }

    }

    private static void exercicio2() {

        System.out.println("Favor digite uma frase:");
        String frase = leitorLetras.nextLine();
        Stack pilha = new Stack(frase.length());

        for (int i = 0; i < frase.length(); i++) {
            pilha.push(frase.charAt(i));
        }

        System.out.println("Resultado:");

        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }

        System.out.println();

    }

    private static void exercicio1() {
        Stack pilha = new Stack(5);
        System.out.println("Favor digitar 15 números.");
        for (int i = 0; i < 15; i++) {
            int num = i + 1;
            System.out.println("Digite o " + num + "° número");
            num = leitorNumeros.nextInt();
            if (num % 2 == 0) {
                if (!pilha.isFull()) {
                    pilha.push(num);
                } else {
                    pilha.pop();
                    pilha.push(num);
                }
            } else if (!pilha.isEmpty()) {
                pilha.pop();
            } else {
                System.out.println("UNDERFLOW");
            }
        }
        System.out.println("Resultado:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
