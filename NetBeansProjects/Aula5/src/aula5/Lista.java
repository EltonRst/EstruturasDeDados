package aula5;

public class Lista {

    public Nodo prim;

    public Lista() {
        this.prim = null;
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
        novoNodo.next = prim;
        prim = novoNodo;
    }

    public void insereFim(int elemento) {
        if (prim == null) {
            insereInicio(elemento);
        } else {
            Nodo nodoAtual = prim;
            while (nodoAtual.next != null) {
                nodoAtual = nodoAtual.next;
            }
            Nodo novoNodo = new Nodo(elemento);
            nodoAtual.next = novoNodo;
        }
    }

    public Nodo removeInicio() {
        Nodo nodoAux = prim;
        prim = nodoAux.next;

        return nodoAux;
    }

    public Nodo removeFim() {
        if (prim != null) {
            Nodo nodoAtual = prim;
            Nodo nodoAnt = null;
            while (nodoAtual.next != null) {
                nodoAnt = nodoAtual;
                nodoAtual = nodoAtual.next;
            }
            nodoAnt.next = null;
            return nodoAtual;
        }
        return null;
    }

    public void mostraLista() {
        System.out.println("mostra do primeiro ao ultimo");

        Nodo nodoAtual = prim;

        while (nodoAtual != null) {
            nodoAtual.mostraNodo();
            nodoAtual = nodoAtual.next;
        }
    }

}
