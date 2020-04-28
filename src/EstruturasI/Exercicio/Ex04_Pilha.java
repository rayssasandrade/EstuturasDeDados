package EstruturasI.Exercicio;

import EstruturasI.PilhaComVetores.PilhaComVetor;
import EstruturasI.PilhaComVetores.PilhaException;

import java.util.Scanner;

//DESAFIO DO PALÍNDROMO
//Escreva um programa que teste se uma sequência de caracteres
//        fornecidas pelo usuário é um palíndromo, ou seja, é uma palavra
//        cuja primeira metade é simétrica à segunda metade.Veja alguns exemplos:
//        -AABBCCBBAA- sim
//        -ADDFDDA- sim
//        -ABFFBB- não
public class Ex04_Pilha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a palavra: ");
        String palavra = input.next();
        imprimirResultado(palavra);
    }

    public static void imprimirResultado(String palavra){
        System.out.println(palavra + " é políndromo? "+ testaPalavra(palavra));
    }

    public static boolean testaPalavra(String palavra){
        PilhaComVetor<Character> pilhaComVetor = new PilhaComVetor<Character>(palavra.length());
        for (int i = 0; i < palavra.length() ; i++) {
            try {
                pilhaComVetor.push(palavra.charAt(i));
            } catch (PilhaException e) {
                System.out.println(e.getMessage());;
            }
        }
        String palavraInversa = "";
        while (!pilhaComVetor.isEmpty()){
            try {
                palavraInversa+= pilhaComVetor.pop();
            } catch (PilhaException e){
                System.out.println(e.getMessage());
            }
        }
        if (palavra.equalsIgnoreCase(palavraInversa)){
            return true;
        }
        return false;
    }
}

