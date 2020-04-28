package EstruturasI.PrimeiraProvaSegundaChamada;

import EstruturasI.ListaComVetores.IndiceForaDosLimitesException;
import EstruturasI.ListaComVetores.ListaCheiaException;
import EstruturasI.ListaComVetores.ListaComVetores;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o tamanho da lista: ");
        int qtd = input.nextInt();
        ListaComVetores<String> lista = new ListaComVetores(qtd);
        for (int i = 0; i < qtd; i++) {
            System.out.println("Entre com o elemento: ");
            try {
                lista.add(input.next());
            } catch (ListaCheiaException e){
                System.out.println(e.getMessage());
            }
        }
        lista.imprimirLsta();
        quicksort(lista, 0, lista.size());
        lista.imprimirLsta();
    }

    public static void quicksort(ListaComVetores<String> lista, int esq, int dir) {
        if (esq < dir) {
            int j = particao(lista, esq, dir);
            quicksort(lista, esq, j - 1);
            quicksort(lista, j + 1, dir);
        }
    }

    public static int particao(ListaComVetores<String> lista, int esq, int dir) {
        int i = esq + 1;
        int j = dir;
        String pivo = null;
        try {
            pivo = lista.get(esq);
        } catch (IndiceForaDosLimitesException e) {
            System.out.println(e.getMessage());
        }

        while (i <= j) {
            try {
                if (lista.get(i).compareTo(pivo) <= 0) {
                    i++;
                } else if (lista.get(j).compareTo(pivo) > 0) {
                    j--;
                } else {
                    trocar(lista, i, j);
                    i++;
                    j--;
                }
            } catch (IndiceForaDosLimitesException e) {
                System.out.println(e.getMessage());
            }
        }
        trocar(lista, esq, j);
        return j;
    }

    private static void trocar(ListaComVetores<String> lista, int i, int j) {
        String aux = null;
        try {
            aux = lista.get(i);
            lista.add(lista.get(j),i);
            lista.add(aux, j);
        } catch (IndiceForaDosLimitesException e) {
            System.out.println(e.getMessage());
        } catch (ListaCheiaException e) {
            System.out.println(e.getMessage());
        }
    }
}
