/**
 * @(#)Ordena.java
 *
 *
 * @ Faculdade Dom Bosco de Porto Alegre
 * @ Sistemas de Informa��o
 * @ Estrutura de Dados
 * @
 * @ version 1.00 2007/11/19
 * @ version 2.00 2008/07/03
 * @ version 3.00 2019/06/12
 *
 * @ M�todos de Ordena��o
 */
package aula13;

public class Ordena {

    private int vetor[];

    public Ordena(int tam) {
        vetor = new int[tam];
    }

    public void setElemento(int index, int valor) {
        this.vetor[index] = valor;
    }

    public int getElemento(int index) {
        return this.vetor[index];
    }

    //
    // Selection Sort -> O(N�)
    // 
    public void selectionSort() {
        int index_min;
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            index_min = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[index_min]) {
                    index_min = j;
                }
                aux = vetor[index_min];
                vetor[index_min] = vetor[i];
                vetor[i] = aux;
            }
        }
    }

    //
    // Insertion Sort -> O(N�)
    //
    public void insertionSort() {
        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i], j = i - 1;
            while ((j >= 0) && (aux < vetor[j])) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
    }

    //
    // ShellSort -> O(N�?�) (N elevado na 1.2223) // Bom
    //
    public void shellSort() {
        int i, j, h = 1, aux;

        do {
            h = 3 * h + 1;
        } while (h < vetor.length);

        do {
            h = h / 3;
            for (i = h; i < vetor.length; i++) {
                aux = vetor[i];
                j = i - h;
                while ((j >= 0) && (aux < vetor[j])) {
                    vetor[j + h] = vetor[j];
                    j = j - h;
                }
                vetor[j + h] = aux;
            }
        } while (h > 1);
    }

    //
    // QUICKSORT -> O(NlogN)
    //
    public void quickSort() {
        recursivoQuickSort(0, vetor.length - 1);
    }

    private void recursivoQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivo = vetor[right];

            int partition = partition(left, right, pivo);
            recursivoQuickSort(left, partition - 1);
            recursivoQuickSort(partition + 1, right);
        }
    }

    private int partition(int left, int right, int pivo) {
        int leftAux = left - 1;
        int rightAux = right;

        while (true) {
            while (vetor[++leftAux] < pivo);

            while (rightAux > 0 && vetor[--rightAux] > pivo);

            if (leftAux >= rightAux) {
                break;
            } else {
                swap(leftAux, rightAux);
            }
        }

        swap(leftAux, right);
        return leftAux;
    }

    private void swap(int dex1, int dex2) {
        int temp = vetor[dex1];
        vetor[dex1] = vetor[dex2];
        vetor[dex2] = temp;
    }

    //
    // MergeSort -> O(NlogN)
    //
    public void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            mesclar(inicio, meio, fim);
        }

    }

    private void mesclar(int inicio, int meio, int fim) {

        int tamanho = fim - inicio + 1;

        int temp[] = new int[tamanho];

        for (int posicao = 0; posicao < tamanho; posicao++) {
            temp[posicao] = vetor[inicio + posicao];
        }

        int i = 0;
        int j = meio - inicio + 1;

        for (int posicao = 0; posicao < tamanho; posicao++) {
            vetor[inicio + posicao]
                    = (j <= tamanho - 1)
                            ? ((i <= meio - inicio)
                                    ? (temp[i] < temp[j])
                                            ? temp[i++]
                                            : temp[j++]
                                    : temp[j++])
                            : temp[i++];
        }
    }

    //
    // HeapSort  -> O(NlogN)
    //
    public void heapSort() {
        buildMaxHeap(vetor);
        int n = vetor.length;

        for (int i = vetor.length - 1; i > 0; i--) {
            swapHeap(vetor, i, 0);
            maxHeapify(vetor, 0, --n);
        }
    }

    private void buildMaxHeap(int v[]) {
        for (int i = v.length / 2 - 1; i >= 0; i--) {
            maxHeapify(v, i, v.length);
        }
    }

    private void maxHeapify(int v[], int pos, int n) {
        int max = 2 * pos + 1, right = max + 1;
        if (max < n) {
            if (right < n && v[max] < v[right]) {
                max = right;
            }
            if (v[max] > v[pos]) {
                swapHeap(v, max, pos);
                maxHeapify(v, max, n);
            }
        }
    }

    public void swapHeap(int v[], int j, int aposJ) {
        int aux = 0;
        aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }

}
