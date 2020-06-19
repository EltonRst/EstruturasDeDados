package aula12;

public class Pilha {

    private int topo;
    private int memo[];
    private int maxTam;

    Pilha(int maxTam) {
        this.maxTam = maxTam;
        this.memo = new int[maxTam];
        this.topo = -1;
    }

    public void push(int elemento) {
        if (!isFull()) {
            topo++;
            memo[topo] = elemento;
        } else {
            System.out.println("erro -> pilha cheia");
        }
    }

    public int pop() {
        int retorno = 0;

        if (!isEmpty()) {
            retorno = memo[topo];
            topo--;
        } else {
            System.out.println("erro -> pilha vazia");
        }

        return retorno;
    }

    public boolean isFull() {
        if (topo == (maxTam - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int top() {
        return memo[topo];
    }

}
