/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author elton
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] ordenado = new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10};
        int[] naoOrdenado = new int[]{10, 5, 1, 9, 4, 2, 8, 3, 6, 7};

        Pesquisa p = new Pesquisa();

        boolean existe = false;

        // Pesquisa sequencial ordenada
        existe = p.pesquisaOrdenada(ordenado, 5);
        System.out.println("Existe o 5: " + existe);
        existe = p.pesquisaOrdenada(ordenado, 11);
        System.out.println("Existe o 11: " + existe);
        
        // Pesquisa sequencial não ordenada
        existe = p.pesquisaNaoOrdenada(naoOrdenado, 4);
        System.out.println("Existe o 4: " + existe);
        existe = p.pesquisaNaoOrdenada(naoOrdenado, 14);
        System.out.println("Existe o 14: " + existe);

        // Pesquisa binária
        existe = p.pesquisaBinaria(ordenado, 7);
        System.out.println("Existe o 7: " + existe);
        existe = p.pesquisaBinaria(ordenado, 0);
        System.out.println("Existe o 0: " + existe);

    }

}
