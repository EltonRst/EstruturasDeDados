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
public class Pesquisa {

    public boolean pesquisaNaoOrdenada(int vetor[], int elemento) // Big O: O(N)
    {
        boolean achou = false, fim = false;
        int i = 0;

        while ((!achou) && (!fim)) {
            //System.out.println(elemento);
            if (vetor[i] == elemento) {
                achou = true;
            } else if (i < (vetor.length - 1)) {
                i++;
            } else {
                fim = true;
            }
        }

        if (achou) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pesquisaOrdenada(int vetor[], int elemento) // Big O: O(N)
    {
        int i = 0;

        while ((vetor[i] < elemento) && (i < (vetor.length - 1))) {
            i++;
        }

        if (elemento == vetor[i]) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pesquisaBinaria(int vetor[], int elemento) // Big O: O(log N)
    {
        int inf = 0;
        int sup = vetor.length - 1;
        int ende = -1;
        int med = -1;

        while ((inf <= sup) && (ende == -1)) {

            med = (inf + sup) / 2;
            //System.out.println(inf + " " + sup + " " + med);

            if (elemento == vetor[med]) {
                ende = med;
            } else if (elemento > vetor[med]) {
                inf = med + 1;
            } else {
                sup = med - 1;
            }
        }

        if (ende == -1) {
            return false;
        } else {
            return true;
        }
    }
}
