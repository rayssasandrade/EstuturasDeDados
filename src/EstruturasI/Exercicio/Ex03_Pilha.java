package EstruturasI.Exercicio;

//Utilize a classe Estrutura_1.Pilha e desenvolva os seguintes itens:
//        1. Crie uma pilha com capacidade para 20 livros;
//        2. Insira 6 livros na pilha. Cada livro contém nome, isbn, ano de lançamento e autor
//        3. Crie um exemplo para utilizar cada método da classe Estrutura_1.Pilha

import EstruturasI.PilhaComVetores.PilhaComVetor;

import java.util.Scanner;

public class Ex03_Pilha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PilhaComVetor<Livro> pilha_livros = new PilhaComVetor<Livro>(20);
        System.out.println("Entre com o nome: ");
    }
}
