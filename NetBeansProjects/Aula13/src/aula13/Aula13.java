/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.util.Iterator;

/**
 *
 * @author elton
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Ordena ord = new Ordena(5);
        int[] vetor = new int[]{1, 4, 2, 3, 5};
        int i = 0;
        for (int val : vetor) {
            ord.setElemento(i, val);
            i++;
        }

        ord.shellSort();

        for (int j = 0; j < 5; j++) {
            System.out.println(ord.getElemento(j));
        }

    }

}
