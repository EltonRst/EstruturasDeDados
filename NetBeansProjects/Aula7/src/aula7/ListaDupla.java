package aula7;

public class ListaDupla {

    public Nodo prim;
    public Nodo ult;

    public ListaDupla() {

        this.prim = null;
        this.ult = null;
    }

    public boolean isEmpty() {

        if (this.prim == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insereInicio(int elemento) {

        Nodo novoNodo = new Nodo(elemento);

        if (isEmpty()) {
            this.ult = novoNodo;
        } else {
            this.prim.prev = novoNodo;
        }

        novoNodo.next = this.prim;
        this.prim = novoNodo;
    }

    public void insereFim(int elemento) {

        Nodo novoNodo = new Nodo(elemento);

        if (isEmpty()) {
            this.prim = novoNodo;
        } else {
            this.ult.next = novoNodo;
        }

        novoNodo.prev = this.ult;
        this.ult = novoNodo;
    }

    public Nodo removeInicio() {

        Nodo nodoRemove = this.prim;

        if (this.prim.next == null) {
            this.ult = null;
        } else {
            this.prim.next.prev = null;
        }

        this.prim = this.prim.next;

        return nodoRemove;
    }

    public Nodo removeFim() {

        Nodo nodoRemove = this.ult;

        if (this.ult.prev == null) {
            this.prim = null;
        } else {
            this.ult.prev.next = null;
        }

        this.ult = this.ult.prev;

        return nodoRemove;
    }

    public void mostraLista() {

        System.out.println("mostra do primeiro ao ultimo");

        Nodo nodoAtual = this.prim;

        while (nodoAtual != null) {

            nodoAtual.mostraNodo();
            nodoAtual = nodoAtual.next;
        }
    }
}
