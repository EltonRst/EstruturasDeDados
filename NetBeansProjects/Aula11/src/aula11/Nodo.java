package aula11;

public class Nodo {

    int dado;
    Nodo esq;
    Nodo dir;

    public Nodo(int dado) {
        this.dado = dado;
        this.esq = null;
        this.dir = null;
    }

    public void mostraNodo() {
        System.out.println("Dado: " + this.dado);
    }
}
