package EstruturasI.Pessoa;
import java.util.Scanner;

public class MainEX02 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        RepositorioPessoasEX02 repositorio = new RepositorioPessoasEX02();
        try {
            repositorio.InserirPessoas();
        } catch (PessoaException e) {
            System.out.println(e.getMessage());
        }
        PessoaEX02 pessoa = new PessoaEX02("Ray", "071", 16);
        PessoaEX02 pessoa01 = new PessoaEX02("Ak", "086", 98);
        PessoaEX02 pessoa02 = new PessoaEX02("mai", "862", 44);
        PessoaEX02 pessoa03 = new PessoaEX02("Iris", "521", 8);
        repositorio.pessoas[0] = pessoa;
        repositorio.pessoas[1]= pessoa01;
        repositorio.pessoas[2]= pessoa02;
        repositorio.pessoas[3]= pessoa03;
        System.out.println();
        System.out.println("Lista de Entrada: ");
        System.out.println();
        repositorio.listarPessoas(0);
        System.out.println();
        System.out.println("Lista Ordenada com BubbleSort por NOME: ");
        System.out.println();
        repositorio.ordenarPorNomeComBubbleSort();
        repositorio.listarPessoas(0);
        System.out.println();
        System.out.println("Lista Ordenada com Estrutura_1.MergeSort por CPF: ");
        System.out.println();
        repositorio.mergeSorte(repositorio.pessoas, repositorio.auxVet, 0, repositorio.pessoas.length-1);
        repositorio.listarPessoas(0);
        System.out.println();
        System.out.println("Lista Ordenada com QuickSort por IDADE: ");
        System.out.println();
        repositorio.quicksort(repositorio.pessoas, 0, repositorio.pessoas.length-1);
        repositorio.listarPessoas(0);
    }
}
