/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundot2;

import java.util.Scanner;

/**
 *
 * @author elton
 */
public class SegundoT2 {

    static Scanner ln = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Montamos nosso grafo que é mo mapa com as arestas ligando a
        // distribuidora e os clientes
        Grafo gr = new Grafo(15);
        //
        gr.addNo("Dist"); // 0
        gr.addNo("Bou2"); // 1
        gr.addNo("Zaf1"); // 2
        gr.addNo("Big3"); // 3
        gr.addNo("Dia1"); // 4
        gr.addNo("Big2"); // 5
        gr.addNo("Uni1"); // 6
        gr.addNo("Bou1"); // 7
        gr.addNo("Dia2"); // 8
        gr.addNo("Uni2"); // 9
        gr.addNo("Zaf3"); // 10
        gr.addNo("Uni3"); // 11
        gr.addNo("Big1"); // 12
        gr.addNo("Zaf2"); // 13
        gr.addNo("Bou3"); // 14
        // Arestas
        gr.addAresta(0, 1);
        gr.addAresta(0, 2);
        gr.addAresta(0, 3);
        gr.addAresta(0, 4);
        gr.addAresta(1, 5);
        gr.addAresta(1, 6);
        gr.addAresta(2, 7);
        gr.addAresta(3, 8);
        gr.addAresta(4, 9);
        gr.addAresta(4, 10);
        gr.addAresta(7, 11);
        gr.addAresta(9, 12);
        gr.addAresta(12, 13);
        gr.addAresta(12, 14);
        
        // Prenchemos a fila dos 6 caminhões conforme o tipo digitado
        Fila f = new Fila(6);
        System.out.println("Insira os 6 caminhões na fila !");
        int n = 1;
        while (!f.isFull()) {
            System.out.println("Digite o tipo caminhão Cam" + n + " (1 – perecível, 2 – não perecível):");
            int tipCam = ln.nextInt();
            if (tipCam == 1 || tipCam == 2) {
                f.insere(tipCam);
                n++;
            } else {
                System.out.println("Tipo de caminhão inválido !");
            }
        }

        // Removemos os caminhões da fila e mostramos o caminho feito conforme
        // o seu tipo de alimento transportado
        n = 1;
        while (!f.isEmpty()) {
            int tipCam = f.remove();
            
            switch (tipCam) {
                case 1:
                    System.out.println("Caminho para o caminhão Cam"+n+" (1 – perecível):");
                    gr.profundidade();
                    break;
                case 2:
                    System.out.println("Caminho para o caminhão Cam"+n+" (2 – não perecível):");
                    gr.largura();
                    break;
            }
            n++;
        }
    }

}
