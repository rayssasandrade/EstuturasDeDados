package EstruturasI.FilaComVetores;

import EstruturasI.Pessoa.PessoaEX02;

import java.util.Scanner;

public class MainFilaComVetor {

    public static void main(String[] args) throws FilaException {
        Scanner input = new Scanner(System.in);

        PessoaEX02 pessoa = new PessoaEX02("Rayssa", "071", 20);
        PessoaEX02 pessoa01 = new PessoaEX02("Akeu", "081", 12);
        PessoaEX02 pessoa02 = new PessoaEX02("Maisa", "971", 32);

        System.out.println("Entre com o tamanho do vetor: ");
        FilaComVetor<PessoaEX02> fila = new FilaComVetor<PessoaEX02>(input.nextInt());
        System.out.println(fila.isEmpty());
        System.out.println(fila.isFull());
        try {
            fila.pop();
        } catch (FilaException e){
            System.out.println(e.getMessage());
        }
        try {
            fila.push(pessoa);
            fila.push(pessoa01);
            fila.first();
            fila.push(pessoa02);
            fila.push(pessoa);
        } catch (FilaException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fila.isEmpty());
        System.out.println(fila.isFull());
        try {
            fila.pop();
            fila.pop();
            fila.pop();
        } catch (FilaException e){
            System.out.println(e.getMessage());
        }
        try {
            fila.first();
        } catch (FilaException e){
            System.out.println(e.getMessage());
        }
    }

}
