/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author elton
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        exercicio1();
        exercicio2();

    }

    private static void exercicio1() {
        System.out.println("Exercício 1:");
        Grafo gr = new Grafo(9);

        gr.addNo("A");
        gr.addNo("B");
        gr.addNo("C");
        gr.addNo("D");
        gr.addNo("E");
        gr.addNo("F");
        gr.addNo("G");
        gr.addNo("H");
        gr.addNo("I");

        gr.addAresta(0, 1);
        gr.addAresta(0, 2);
        gr.addAresta(0, 3);
        gr.addAresta(0, 4);
        gr.addAresta(1, 5);
        gr.addAresta(3, 6);
        gr.addAresta(5, 7);
        gr.addAresta(6, 8);

        System.out.println("Matriz do Grafo:");
        gr.mostraMatriz();

        System.out.println("Percurso em Largura:");
        gr.largura();

        System.out.println("Percurso em Profundidade:");
        gr.profundidade();
    }

    private static void exercicio2() {
        System.out.println("Exercício 2:");
        Grafo gr = new Grafo(13);

        gr.addNo("38");
        gr.addNo("52");
        gr.addNo("20");
        gr.addNo("60");
        gr.addNo("51");
        gr.addNo("25");
        gr.addNo("15");
        gr.addNo("65");
        gr.addNo("55");
        gr.addNo("30");
        gr.addNo("22");
        gr.addNo("70");
        gr.addNo("21");
        
        gr.addAresta(0, 1);
        gr.addAresta(0, 2);
        gr.addAresta(1, 3);
        gr.addAresta(1, 4);
        gr.addAresta(2, 5);
        gr.addAresta(2, 6);
        gr.addAresta(3, 7);
        gr.addAresta(3, 8);
        gr.addAresta(5, 9);
        gr.addAresta(5, 10);
        gr.addAresta(7, 11);
        gr.addAresta(10, 12);
        
        System.out.println("Matriz do Grafo:");
        gr.mostraMatriz();

        System.out.println("Percurso em Largura:");
        gr.largura();

        System.out.println("Percurso em Profundidade:");
        gr.profundidade();
    }

}
