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

    public Nodo removeInicio() {
        Nodo nodoAux = prim;
        prim = nodoAux.next;

        return nodoAux;
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
