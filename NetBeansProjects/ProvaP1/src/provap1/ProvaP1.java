/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provap1;

/**
 *
 * @author elton
 */
public class ProvaP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        exercicio3();
        exercicio4();

    }

    private static void exercicio3() {

        // Criamos nossa fila circular
        FilaCircular fc = new FilaCircular(20);

        // Preenchemos a nossa fila circular começando com números negativos
        int num = -9;
        while (!fc.isFull()) {
            fc.insere(num);
            num++;
        }

        // Declaramos nossas pilhas para armazenar positivos e negativos
        Pilha ppos = new Pilha(20);
        Pilha pneg = new Pilha(20);

        // Percorre a fila circular
        while (!fc.isEmpty()) {
            // Remove da fila circular
            int removido = (int) fc.remove();
            // Verifica se é positivo ou negativo
            if (removido >= 0) {
                ppos.push(removido); // Adiciona na pliha dos positivos
            } else {
                pneg.push(removido); // Adiciona na pilha dos negativos
            }
        }

    }

    private static void exercicio4() {
        // Criamos nossa lista dupla
        ListaDupla ld = new ListaDupla();
        // Preenchemos a nossa fila circular começando com números negativos
        int num = -9;
        while (num <= 10) {
            ld.insereFim(num);
            num++;
        }
        // Variáveis para controle
        int somaPositivos = 0;
        int qtdNegativos = 0;

        // Iremos percorrer a lista a partir do primeiro
        Nodo atual = ld.prim;
        while (atual != null) {
            // Verificamos se é positivo ou negativo
            if (atual.dado >= 0) {
                somaPositivos += atual.dado; // Soma os positivos
            } else {
                qtdNegativos++; // conta os negativos
            }
            // Segue para o próximo da lista
            atual = atual.next;
        }

        System.out.println("Soma dos positivos: "+somaPositivos);
        System.out.println("Quantidade de negativos: "+qtdNegativos);
    }

}
