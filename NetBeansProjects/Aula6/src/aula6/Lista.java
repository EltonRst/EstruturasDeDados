package aula6;

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

    public Lista pesquisa(int elemento) {
        Lista encontrados = new Lista();
        if (prim != null) {
            Nodo nodoAtual = prim;
            while (nodoAtual.next != null) {
                nodoAtual = nodoAtual.next;
                if (nodoAtual.dado == elemento) {
                    encontrados.insereFim(nodoAtual.dado);
                }
            }
            return encontrados;
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

    public void insere(int elemento, int pos) {
        if ((pos == 1) || (prim == null)) {
            insereInicio(elemento);
        } else {
            int cont = 1;
            Nodo nodoAux = prim;
            while (nodoAux.next != null) {
                cont++;
                nodoAux = nodoAux.next;
            }

            if (pos > cont) {
                insereFim(elemento);
            } else {
                cont = 1;
                nodoAux = prim;
                while (cont < (pos - 1)) {
                    cont++;
                    nodoAux = nodoAux.next;
                }

                Nodo novoNodo = new Nodo(elemento);

                novoNodo.next = nodoAux.next;

                nodoAux.next = novoNodo;

            }
        }
    }

    public Nodo remove(int pos) {
        Nodo nodoRetorno = null;

        if (pos == 1) {
            nodoRetorno = removeInicio();
        } else {
            int cont = 1;
            Nodo nodoAux = prim;
            while (nodoAux.next != null) {
                cont++;
                nodoAux = nodoAux.next;
            }

            if (pos >= cont) {
                nodoRetorno = removeFim();
            } else {
                cont = 1;
                nodoAux = prim;
                Nodo nodoAnt = prim;
                while (cont < pos) {
                    cont++;
                    nodoAnt = nodoAux;
                    nodoAux = nodoAux.next;
                }

                nodoAnt.next = nodoAux.next;

                nodoRetorno = nodoAux;
            }

        }

        return nodoRetorno;
    }

}
