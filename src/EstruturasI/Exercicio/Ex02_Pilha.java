package EstruturasI.Exercicio;

import EstruturasI.PilhaComVetores.PilhaComVetor;
import EstruturasI.PilhaComVetores.PilhaException;

import java.util.Scanner;

//Escreva um programa que leia 10 números. Para cada número lido,
//        verifique e codifique de acordo com as regras seguintes:
//        -Se o número for par, empilhe na pilha chamada par;
//        -Se o número for ímpar, empilhe na pilha chamada ímpar;
//        -Se o número for zero(0), desempilhe um elemento de cada pilha.
//        Caso alguma pilha esteja vazia, mostre uma mensagem de erro na tela.
//        Ao final do programa desempilhe todos os elementos das duas pilhas, imprimindo-os na tela
public class Ex02_Pilha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PilhaComVetor<Integer> conjuntoPar = new PilhaComVetor<Integer>(10);
        PilhaComVetor<Integer> conjuntoÍmpar = new PilhaComVetor<Integer>(10);
        for (int i = 0; i < 10; i++) {
            System.out.print("Entre com o elemento: ");
            int n = input.nextInt();
            if (n==0){
                try {
                    Integer desempilhado = conjuntoPar.pop();
                    System.out.println("Desempilhado da pilha par: "+ desempilhado);
                }catch (PilhaException e){
                    System.out.println(e.getMessage()+" Par");
                }
                try {
                    Integer desempilhado = conjuntoÍmpar.pop();
                    System.out.println("Desempilhado da pilha ímpar: "+ desempilhado);
                }catch (PilhaException e){
                    System.out.println(e.getMessage()+" Ímpar");
                }
            } else if (n%2==0){
                try {
                    conjuntoPar.push(n);
                    System.out.println("Empilhado da pilha par: "+ n);
                }catch (PilhaException e){
                    System.out.println(e.getMessage());
                }
            } else {
                try {
                    conjuntoÍmpar.push(n);
                    System.out.println("Empilhado da pilha ímpar: "+ n);
                }catch (PilhaException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        if(conjuntoPar.isEmpty() == false){
            System.out.println("-----------Elementos da pilha PAR-------------");
            do {
                try {
                    Integer desempilhado = conjuntoPar.pop();
                    System.out.println("Desempilhado: "+ desempilhado);
                } catch (PilhaException e){
                    System.out.println(e.getMessage());
                }
            } while (conjuntoPar.isEmpty() == false);
        }
        if(conjuntoÍmpar.isEmpty() == false){
            System.out.println("-----------Elementos da pilha ÍMPAR-------------");
            do {
                try {
                    Integer desempilhado = conjuntoÍmpar.pop();
                    System.out.println("Desempilhado: "+ desempilhado);
                } catch (PilhaException e){
                    System.out.println(e.getMessage());
                }
            } while (conjuntoÍmpar.isEmpty() == false);
        }
    }
}

