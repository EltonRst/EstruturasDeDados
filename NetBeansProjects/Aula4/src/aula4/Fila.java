package aula4;

public class Fila {

    private int inicio;
    private int fim;
    private final Object memo[];
    private final int tamMax;

    Fila(int tamMax) {
        this.tamMax = tamMax;
        this.memo = new Object[tamMax];
        this.inicio = 0;
        this.fim = 0;
    }

    public void insere(Object elemento) {
        if (!isFull()) {
            this.memo[fim] = elemento;
            this.fim++;
        } else {
            System.out.println("erro --> fila cheia");
        }
    }

    public Object remove() {
        Object elemento = 0;
        if (!isEmpty()) {
            elemento = this.memo[inicio];
            this.inicio++;
        } else {
            System.out.println("erro --> fila vazia");
        }

        return elemento;
    }

    public boolean isFull() {
        return this.fim == this.tamMax;
    }

    public boolean isEmpty() {
        return this.inicio == this.fim;
    }
}
