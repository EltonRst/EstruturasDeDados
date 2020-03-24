/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopilhas;

/**
 *
 * @author elton
 */
public class Deposito {

    private Pilha pilhaA;
    private Pilha pilhaB;
    private Pilha pilhaC;

    public Deposito(int capacidade) {
        pilhaA = new Pilha(capacidade);
        pilhaB = new Pilha(capacidade);
        pilhaC = new Pilha(capacidade);
    }

    public Pilha getPilhaA() {
        return pilhaA;
    }

    public Pilha getPilhaB() {
        return pilhaB;
    }

    public Pilha getPilhaC() {
        return pilhaC;
    }

}
