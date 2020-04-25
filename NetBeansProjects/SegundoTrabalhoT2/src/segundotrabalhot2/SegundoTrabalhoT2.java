/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundotrabalhot2;

/**
 *
 * @author elton
 */
public class SegundoTrabalhoT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista L = new Lista();
        // Insere as idades dos indivíduos
        L.insereFim(95); // 6
        L.insereFim(10);
        L.insereFim(20);
        L.insereFim(30);
        L.insereFim(40);
        L.insereFim(50);
        L.insereFim(60); // 1
        L.insereFim(65); // 2
        L.insereFim(70); // 3
        L.insereFim(75); // 4
        L.insereFim(80); // 5
        L.insereFim(34);
        L.insereFim(42);
        //
        int aptos = 0;
        Nodo nodoAtual = L.prim;
        while (nodoAtual != null) {
            if (nodoAtual.dado >= 60) {
                aptos += 1;
            }
            nodoAtual = nodoAtual.next;
        }
        //
        System.out.println("Pessoas aptas a receber a vacina: " + aptos);
        //
    }

}
