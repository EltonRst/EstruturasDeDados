/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author 19221080
 */
public class Zodiaco {

    private static final Scanner leitorNumeros = new Scanner(System.in);

    public static void main(String[] args) {
        //
        int op = 0;
        do {
            System.out.println("Digite um signo do zodíaco:");
            op = leitorNumeros.nextInt();
            imprimeSigno(op);
        } while (op != 0);

        //
    }

    public static void imprimeSigno(int numero) {

        String mensagem;

        switch (numero) {
            case 1:
                mensagem = "1° signo do zodíaco: Aquário (21/jan à 19/fev)";
                break;
            case 2:
                mensagem = "2° signo do zodíaco: Peixes (20/fev à 20/mar)";
                break;
            case 3:
                mensagem = "3° signo do zodíaco: Áries (21/mar à 20/abr)";
                break;
            case 4:
                mensagem = "4° signo do zodíaco: Touro (21/abr à 20/mai) ";
                break;
            case 5:
                mensagem = "5° signo do zodíaco: Gêmeos (21/mai à 20/jun)";
                break;
            case 6:
                mensagem = "6° signo do zodíaco: Câncer (21/jun à 21/jul)";
                break;
            case 7:
                mensagem = "7° signo do zodíaco: Leão (22/jul à 22/ago)";
                break;
            case 8:
                mensagem = "8° signo do zodíaco: Virgem (23/ago à 22/set)";
                break;
            case 9:
                mensagem = "9° signo do zodíaco: Libra (23/set à 22/out)";
                break;
            case 10:
                mensagem = "10° signo do zodíaco: Escorpião (23/out à 21/nov)";
                break;

            default:
                mensagem = "Número do signo informado inválido: " + numero;
                break;
        }

        System.out.println(mensagem);
    }
}
