/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirot2;

/**
 *
 * @author elton
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arvore ar = new Arvore();
        
        // Inserindo os medicamentos na árvore
        ar.insere(15);
        ar.insere(200);
        ar.insere(100);
        ar.insere(150);
        ar.insere(25);
        ar.insere(40);
        ar.insere(85);
        ar.insere(0);
        ar.insere(244);
        ar.insere(265);
        ar.insere(300);
        ar.insere(301);
        ar.insere(340);
        ar.insere(333);
        ar.insere(370);
        ar.insere(310);
        ar.insere(400);
        ar.insere(354);
        ar.insere(366);

        System.out.println("Árvore em pós ordem:");
        ar.posOrdem(ar.getRaiz());

        System.out.println("Lista dupla, medicamentos de uso geral:");
        ListaDupla ld = new ListaDupla();
        ar.usoGeral(ar.getRaiz(), ld);
        ld.mostraLista();

        System.out.println("Fila circular, medicamentos de uso controlado:");
        FilaCircular fc = new FilaCircular(50);
        ar.usoControlado(ar.getRaiz(), fc);
        while (!fc.isEmpty()) {
            System.out.println(fc.remove());
        }

    }

}
