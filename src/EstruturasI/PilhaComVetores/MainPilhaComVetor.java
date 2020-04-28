package EstruturasI.PilhaComVetores;

import EstruturasI.Pessoa.*;

public class MainPilhaComVetor {

    public static void main(String[] args)  {
        PessoaEX02 pessoa = new PessoaEX02("Rayssa", "071", 20);
        PessoaEX02 pessoa01 = new PessoaEX02("Akeu", "081", 12);
        PessoaEX02 pessoa02 = new PessoaEX02("Maisa", "971", 32);

        System.out.print("Entre com o tamanho do vetor: ");
        PilhaComVetor<PessoaEX02> pilha = new PilhaComVetor(4);
        System.out.println("4");
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.isFull());
        try {
            pilha.pop();
        } catch (PilhaException e){
            System.out.println(e.getMessage());
        }
        try {
            pilha.push(pessoa);
            pilha.push(pessoa01);
            pilha.peek();
            pilha.push(pessoa02);
            pilha.peek();
            pilha.push(pessoa);
        } catch (PilhaException e){
            System.out.println(e.getMessage());
        }

        System.out.println(pilha.isEmpty());
        System.out.println(pilha.isFull());
        try {
            System.out.print(pilha.pop());
            System.out.println(" removido!");
        } catch (PilhaException e){
            System.out.println(e.getMessage());
        }
        try {
            pilha.peek();
        } catch (PilhaException e){
            System.out.println(e.getMessage());
        }
    }
}

