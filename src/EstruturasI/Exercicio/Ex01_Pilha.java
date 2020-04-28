package EstruturasI.Exercicio;
import EstruturasI.PilhaComVetores.PilhaComVetor;
import EstruturasI.PilhaComVetores.PilhaException;

import java.util.Scanner;

//  Escreva um programa que leia 10 números. Para cada número lido,
//        verifique e codifique de acordo com as regras seguintes:
//        -Se o número for par, empilhe na pilha;
//        -Se o número fo ímpar, desempilhe em número da pilha. Caso a pilha esteja vazia, mostre uma mensagem
//        -Se ao final do programa a pilha não estiver vazia, desempilhe todos elementos, imprimindo-os na tela

public class Ex01_Pilha{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PilhaComVetor<Integer> conjunto = new PilhaComVetor<Integer>(10);
        for (int i = 0; i < 10; i++) {
                System.out.print("Entre com o elemento: ");
                int n = input.nextInt();
                if (n%2==0){
                    try {
                        conjunto.push(n);
                        System.out.println(n + " empilhado! ");
                    }catch (PilhaException e){
                        System.out.println(e.getMessage());
                    }
                } else {
                    try {
                        Integer desempilhado = conjunto.pop();
                        System.out.println("Desempilhado: "+desempilhado);
                    }catch (PilhaException e){
                        System.out.println(e.getMessage());
                    }
                }
        }
        if(conjunto.isEmpty() == false){
            System.out.println("-----------Elementos-------------");
            do {
                try {
                    Integer desempilhado = conjunto.pop();
                    System.out.println("Desempilhado: "+desempilhado);
                } catch (PilhaException e){
                    System.out.println(e.getMessage());
                }
            } while (conjunto.isEmpty() == false);
        }
    }
}
