package aula12;

public class Grafo {

    private int max_nos;
    private No vetorNos[];
    private int matrizAdj[][];
    private int nroNo;

    private Pilha minhaPilha;
    private Fila minhaFila;

    public Grafo(int tamMax) {
        this.max_nos = tamMax;
        this.vetorNos = new No[this.max_nos];

        this.matrizAdj = new int[this.max_nos][this.max_nos];

        this.nroNo = 0;

        for (int i = 0; i < this.max_nos; i++) {
            for (int j = 0; j < this.max_nos; j++) {
                this.matrizAdj[i][j] = 0;
            }
        }

        this.minhaPilha = new Pilha(this.max_nos);
        this.minhaFila = new Fila(this.max_nos);

    }

    public void addNo(String label) {

        this.vetorNos[this.nroNo] = new No(label);
        this.nroNo++;

    }

    public void addAresta(int inicio, int fim) {
        this.matrizAdj[inicio][fim] = 1;
        this.matrizAdj[fim][inicio] = 1;
    }

    public void mostraNo(int nro) {
        System.out.println(this.vetorNos[nro].label);
    }

    // busca em profundidade
    public void profundidade() {

        this.vetorNos[0].foiVisitado = true;
        mostraNo(0);
        minhaPilha.push(0);

        while (!minhaPilha.isEmpty()) {
            int v = getNoAdjNaoVisitado(minhaPilha.top());

            if (v == -1) {
                minhaPilha.pop();
            } else {
                vetorNos[v].foiVisitado = true;
                mostraNo(v);
                minhaPilha.push(v);
            }
        }

        // pilha vazia, chegou ao final da profundidade
        for (int j = 0; j < nroNo; j++) {
            vetorNos[j].foiVisitado = false;
        }

    }

    private int getNoAdjNaoVisitado(int v) {
        for (int j = 0; j < nroNo; j++) {
            if ((matrizAdj[v][j] == 1) && (vetorNos[j].foiVisitado == false)) {
                return j;
            }

        }

        return -1;
    }

    //busca em largura
    public void largura() {
        vetorNos[0].foiVisitado = true;
        mostraNo(0);
        minhaFila.insere(0);
        int v2;

        while (!minhaFila.isEmpty()) {
            int v1 = minhaFila.remove();

            while ((v2 = getNoAdjNaoVisitado(v1)) != -1) {
                vetorNos[v2].foiVisitado = true;
                mostraNo(v2);
                minhaFila.insere(v2);
            }

        }

        for (int j = 0; j < nroNo; j++) {
            vetorNos[j].foiVisitado = false;
        }

    }

    public void mostraMatriz() {
        for (int i = 0; i < matrizAdj.length; i++) {
            for (int j = 0; j < matrizAdj.length; j++) {
                System.out.print(" "+ matrizAdj[i][j]);
            }
            System.out.print("\n");
        }
    }
}
