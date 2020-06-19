/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author elton
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arvore ar = new Arvore();
        //
        ar.insere(38);
        ar.insere(20);
        ar.insere(15);
        ar.insere(25);
        ar.insere(30);
        ar.insere(22);
        ar.insere(21);
        ar.insere(52);
        ar.insere(51);
        ar.insere(60);
        ar.insere(55);
        ar.insere(65);
        ar.insere(70);
        //
        //System.out.println("Em ordem: eRd");
        //ar.emOrdem(ar.getRaiz());
        //
        //System.out.println("Pré ordem: Red");
        //ar.preOrdem(ar.getRaiz());
        //
        ar.delete(20);
        ar.insere(18);
        //
        System.out.println("Pós ordem: edR");
        ar.posOrdem(ar.getRaiz());
        //
    }

    // Exemplo de recursividade fatorial
    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * fatorial(num - 1));
        }
    }
}
