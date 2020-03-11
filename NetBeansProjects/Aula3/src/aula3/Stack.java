/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author 19221080
 */
public class Stack {

    private int top;
    private final Object[] stack;
    private final int size;

    public Stack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = new Object[this.size];
    }

    public Object top() {
        if (!isEmpty()) {
            return stack[this.top];
        }
        underflow();
        return null;
    }

    public void push(Object value) {
        if (!isFull()) {
            this.top += 1;
            this.stack[this.top] = value;
        } else {
            overflow();
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            Object aux = this.stack[this.top];
            this.top -= 1;
            return aux;
        }
        underflow();
        return null;
    }

    public boolean isFull() {
        return this.top == size - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    private void overflow() {
        System.out.println("OVERFLOW");
    }

    private void underflow() {
        System.out.println("UNDERFLOW");
    }

}
