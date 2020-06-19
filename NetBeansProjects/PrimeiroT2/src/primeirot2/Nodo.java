package primeirot2;

public class Nodo {

    int dado;
    Nodo esq;
    Nodo dir;
    Nodo next;
    Nodo prev;

    public Nodo(int dado) {
        this.dado = dado;
        this.esq = null;
        this.dir = null;
    }

    public void mostraNodo() {
        System.out.println("Dado: " + this.dado);
    }
}
