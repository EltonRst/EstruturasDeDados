package aula10;

public class Arvore {

    private Nodo raiz;

    public Arvore() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public Nodo procura(int elemento) {
        Nodo nodoAtual = raiz;

        while (nodoAtual.dado != elemento) {
            if (elemento < nodoAtual.dado) {
                nodoAtual = nodoAtual.esq;
            } else {
                nodoAtual = nodoAtual.dir;
            }

            if (nodoAtual == null) {
                return null;
            }
        }

        return nodoAtual;
    }

    public void insere(int elemento) {
        Nodo novoNodo = new Nodo(elemento);

        if (raiz == null) {
            raiz = novoNodo;
        } else {
            Nodo nodoAtual = raiz;
            Nodo nodoAnterior;
            boolean achou = false;

            while (!achou) {
                nodoAnterior = nodoAtual;
                if (elemento < nodoAtual.dado) {
                    nodoAtual = nodoAtual.esq;
                    if (nodoAtual == null) {
                        nodoAnterior.esq = novoNodo;
                        achou = true;
                    }
                } else {
                    nodoAtual = nodoAtual.dir;
                    if (nodoAtual == null) {
                        nodoAnterior.dir = novoNodo;
                        achou = true;
                    }
                }
            }
        }
    }

    public boolean delete(int elemento) {
        Nodo nodoAtual = raiz;
        Nodo nodoAnterior = raiz;

        boolean filhoEsquerda = true;

        while (nodoAtual.dado != elemento) {
            nodoAnterior = nodoAtual;

            if (elemento < nodoAtual.dado) {
                filhoEsquerda = true;
                nodoAtual = nodoAtual.esq;
            } else {
                nodoAtual = nodoAtual.dir;
                filhoEsquerda = false;
            }

            if (nodoAtual == null) {
                return false;
            }
        }

        // encontrou o nodo
        // caso 1: n�o tem filhos
        //
        if ((nodoAtual.esq == null) && (nodoAtual.dir == null)) {
            if (nodoAtual == raiz) {
                raiz = null;
            } else {
                if (filhoEsquerda) {
                    nodoAnterior.esq = null;
                } else {
                    nodoAnterior.dir = null;
                }
            }
        } // caso 2: tem um �nico filho
        else if (nodoAtual.dir == null) {
            if (nodoAtual == raiz) {
                raiz = nodoAtual.esq;
            } else if (filhoEsquerda) {
                nodoAnterior.esq = nodoAtual.esq;
            } else {
                nodoAnterior.dir = nodoAtual.esq;
            }

        } else if (nodoAtual.esq == null) {
            if (nodoAtual == raiz) {
                raiz = nodoAtual.dir;
            } else if (filhoEsquerda) {
                nodoAnterior.esq = nodoAtual.dir;
            } else {
                nodoAnterior.dir = nodoAtual.dir;
            }
        } // caso3: tem 2 filhos
        else {
            Nodo sucessor = getSucessor(nodoAtual);

            if (nodoAtual == raiz) {
                raiz = sucessor;
            } else if (filhoEsquerda) {
                nodoAnterior.esq = sucessor;
            } else {
                nodoAnterior.dir = sucessor;
            }

            sucessor.esq = nodoAtual.esq;

        }
        return true;

    }

    private Nodo getSucessor(Nodo nodoExcluir) {
        Nodo paiSucessor = nodoExcluir;
        Nodo sucessor = nodoExcluir;
        Nodo nodoAtual = nodoExcluir.dir;

        while (nodoAtual != null) {
            paiSucessor = sucessor;
            sucessor = nodoAtual;
            nodoAtual = nodoAtual.esq;
        }

        if (sucessor != nodoExcluir.dir) {
            paiSucessor.esq = sucessor.dir;
            sucessor.dir = nodoExcluir.dir;
        }

        return sucessor;
    }

}
