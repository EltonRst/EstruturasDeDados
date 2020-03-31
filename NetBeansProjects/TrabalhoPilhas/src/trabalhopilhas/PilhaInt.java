/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopilhas;

/**
 *
 * @author 19221080
 */
public class PilhaInt {

    private int topo;
    private final int[] pilha;
    private final int tamaho;

    public PilhaInt(int size) {
        this.topo = -1;
        this.tamaho = size;
        this.pilha = new int[this.tamaho];
    }

    public int top() {
        if (!isEmpty()) {
            return pilha[this.topo];
        }
        underflow();
        return 0;
    }

    public void push(int value) {
        if (!isFull()) {
            this.topo += 1;
            this.pilha[this.topo] = value;
        } else {
            overflow();
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int aux = this.pilha[this.topo];
            this.topo -= 1;
            return aux;
        }
        underflow();
        return 0;
    }

    public boolean isFull() {
        return this.topo == tamaho - 1;
    }

    public boolean isEmpty() {
        return this.topo == -1;
    }

    private void overflow() {
        System.out.println("OVERFLOW");
    }

    private void underflow() {
        System.out.println("UNDERFLOW");
    }

}
