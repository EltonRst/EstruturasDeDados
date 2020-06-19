package segundot2;

public class Fila {

    private int inicio;
    private int fim;
    private int memo[];
    private int tamMax;

    Fila(int tamMax) {
        this.tamMax = tamMax;
        this.memo = new int[tamMax];
        this.inicio = 0;
        this.fim = 0;
    }

    public void insere(int elemento) {
        if (!isFull()) {
            memo[fim] = elemento;
            fim++;
        } else {
            System.out.println("erro --> fila cheia");
        }
    }

    public int remove() {
        int elemento = 0;
        if (!isEmpty()) {
            elemento = memo[inicio];
            inicio++;
        } else {
            System.out.println("erro --> fila vazia");
        }

        return elemento;
    }

    public boolean isFull() {
        if (fim == tamMax) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (inicio == fim) {
            return true;
        } else {
            return false;
        }
    }
}
