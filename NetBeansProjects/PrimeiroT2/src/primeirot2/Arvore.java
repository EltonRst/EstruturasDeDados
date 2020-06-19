package primeirot2;

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

    public void emOrdem(Nodo nodoAtual) {
        if (nodoAtual != null) {
            emOrdem(nodoAtual.esq);

            System.out.println("data: " + nodoAtual.dado);

            emOrdem(nodoAtual.dir);
        }
    }

    public void usoGeral(Nodo nodoAtual, ListaDupla ld) {
        if (nodoAtual != null) {
            usoGeral(nodoAtual.esq, ld);

            if (nodoAtual.dado <= 300) {
                ld.insereFim(nodoAtual.dado);
            }

            usoGeral(nodoAtual.dir, ld);
        }
    }

    public void usoControlado(Nodo nodoAtual, FilaCircular fc) {
        if (nodoAtual != null) {
            usoControlado(nodoAtual.esq, fc);

            if (nodoAtual.dado > 300 && nodoAtual.dado <= 400) {
                fc.insere(nodoAtual.dado);
            }

            usoControlado(nodoAtual.dir, fc);
        }
    }

    public void preOrdem(Nodo nodoAtual) {
        if (nodoAtual != null) {

            System.out.println("data: " + nodoAtual.dado);

            preOrdem(nodoAtual.esq);

            preOrdem(nodoAtual.dir);
        }
    }

    public void posOrdem(Nodo nodoAtual) {
        if (nodoAtual != null) {

            posOrdem(nodoAtual.esq);

            posOrdem(nodoAtual.dir);

            System.out.println("Dado Nodo: " + nodoAtual.dado);

        }
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
