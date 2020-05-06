package provap1;

public class FilaCircular {

    private int inicio;
    private int fim;
    private int total;
    private final int maxTam;
    private final Object memo[];

    FilaCircular(int maxTam) {
        this.inicio = 0;
        this.fim = 0;
        this.total = 0;
        this.maxTam = maxTam;
        this.memo = new Object[maxTam];
    }

    public void insere(Object elemento) {
        if (!isFull()) {
            this.memo[fim] = elemento;
            this.total++;
            if (this.fim == this.maxTam - 1) {
                this.fim = 0;
            } else {
                this.fim++;
            }
        } else {
            System.out.println("erro --> fila cheia");
        }
    }

    public Object remove() {
        Object elemento = null;
        if (!isEmpty()) {
            elemento = this.memo[inicio];
            this.total--;
            if (this.inicio == this.maxTam - 1) {
                this.inicio = 0;
            } else {
                this.inicio++;
            }
        } else {
            System.out.println("erro --> fila vazia");
        }

        return elemento;
    }

    public boolean isFull() {
        return this.total == this.maxTam;
    }

    public boolean isEmpty() {
        return this.total == 0;
    }

}
