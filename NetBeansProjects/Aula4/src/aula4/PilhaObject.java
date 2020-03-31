/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author 19221080
 */
public class PilhaObject {

    private int topo;
    private final Object[] pilha;
    private final int tamaho;

    public PilhaObject(int size) {
        this.topo = -1;
        this.tamaho = size;
        this.pilha = new Object[this.tamaho];
    }

    public Object top() {
        if (!isEmpty()) {
            return pilha[this.topo];
        }
        underflow();
        return null;
    }

    public void push(Object value) {
        if (!isFull()) {
            this.topo += 1;
            this.pilha[this.topo] = value;
        } else {
            overflow();
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            Object aux = this.pilha[this.topo];
            this.topo -= 1;
            return aux;
        }
        underflow();
        return null;
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
