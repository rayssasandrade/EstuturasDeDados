package EstruturasI.Exercicio;

import EstruturasI.PilhaComVetores.PilhaComVetor;
import EstruturasI.PilhaComVetores.PilhaException;

import java.util.Scanner;

//Ordenar duas pilhas de livros por nome e ano de lançamento em ordem crescente e decrescente;

public class Ex09_Pilha {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o tamanho da pilha 1: ");
        int qtd1 = input.nextInt();
        PilhaComVetor<Livro> pilha1 = new PilhaComVetor<>(qtd1);
        preencherPilha(pilha1, qtd1, preencherElemento(qtd1));
        pilha1.toString();
        System.out.println("Entre com o tamanho da pilha 2: ");
        int qtd2 = input.nextInt();
        PilhaComVetor <Livro> pilha2 = new PilhaComVetor<>(qtd2);
        preencherPilha(pilha2, qtd2, preencherElemento(qtd2));
        pilha2.toString();
        Livro[] vetorAux = new Livro[qtd1+qtd2];
        preencherVetorAux(qtd1,pilha1, vetorAux);
        ordenarPorNomeComBubbleSort(vetorAux);
        ordemCrescente(qtd1,vetorAux, pilha1);
        pilha1.toString();
    }
    public static Livro preencherElemento(int qtd){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < qtd ; i++) {
            System.out.println("Nome: ");
            String nome = input.next();
            System.out.println("Autor: ");
            String autor = input.next();
            System.out.println("ISBN: ");
            String isbn = input.next();
            System.out.println("Ano de lançamento: ");
            int anoDeLancamento = input.nextInt();
            Livro livro = new Livro(nome, autor, isbn, anoDeLancamento);
            return livro;
        }
        return null;
    }

    public static void preencherPilha(PilhaComVetor pilha, int qtd, Livro livro){
        for (int i = 0; i < qtd; i++) {
            try {
                pilha.push(livro);
            } catch (PilhaException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void preencherVetorAux(int qtd, PilhaComVetor pilha, Object[] vetorAux){
        for (int i = 0; i < qtd; i++) {
            try {
                vetorAux[i] = pilha.pop();
            } catch (PilhaException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void ordenarPorNomeComBubbleSort(Livro[] vetorAux) {
        for (int i = vetorAux.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (vetorAux[j].getNome().compareTo(vetorAux[j + 1].getNome()) > 0) {
                    Livro aux = vetorAux[j];
                    vetorAux[j] = vetorAux[j + 1];
                    vetorAux[j + 1] = aux;
                }
            }
        }
    }

    public static void ordemCrescente(int qtd, Livro[] vetorAux, PilhaComVetor pilha){
        for (int i = qtd; i > 0; i--) {
            try {
                pilha.push(vetorAux[i]);
            } catch (PilhaException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void ordemDecrescente(int qtd, Livro[] vetorAux, PilhaComVetor pilha){
        for (int i = 0; i < qtd; i++) {
            try {
                pilha.push(vetorAux[i]);
            } catch (PilhaException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
