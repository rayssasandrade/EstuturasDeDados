package EstruturasI.Pessoa;

//import EstruturasI.Exercicio.Livro;
//import EstruturasI.Exercicio.LivroException;

import javax.swing.*;
import java.util.Scanner;

public class RepositorioPessoasEX02 {

    PessoaEX02[] pessoas;
//    Livro[][] livros;
    int qtdPessoas;
    PessoaEX02[] auxVet;
    Scanner input = new Scanner(System.in);

    public RepositorioPessoasEX02() {
        TamanhoRepositorio();
    }

    public void TamanhoRepositorio() {
        this.pessoas = new PessoaEX02[Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de pessoas: "))];
        this.auxVet = new PessoaEX02[pessoas.length];
    }

    public String verificarCpf(int x, String cpf){
//        if (x < this.pessoas.length){
//            if (this.pessoas[x].getCPF().equals(cpf)){
//                System.out.println("CPF já cadastrado!");
//            }
//            x++;
//            verificarCpf(0, cpf);
//        }
        return cpf;
    }

    public PessoaEX02 lerPessoas(int x) {
        String nome = JOptionPane.showInputDialog("Nome: ");
        String cpf = verificarCpf(0, JOptionPane.showInputDialog("CPF: "));
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        PessoaEX02 pessoa = new PessoaEX02(nome, cpf, idade);
        return pessoa;
    }

    public void InserirPessoas() throws PessoaException{
        if (qtdPessoas < pessoas.length){
            for (int i = 0; i < pessoas.length; i++) {
                System.out.println("Nome: ");
                String nome = input.next();
                System.out.println("Cpf: ");
                String cpf = input.next();
                System.out.println("Idade: ");
                int idade = input.nextInt();
                pessoas[i] = new PessoaEX02(nome, cpf, idade);
            }
        } else{
            throw new PessoaException("Limite de pessoas alcançado!");
        }
    }
//    public void InserirLivros() throws LivroException {
//        if (qtdPessoas < livros.length) {
//            for (int i = 0; i < livros.length; i++) {
//                for (int j = 0; j < livros.length; j++) {
//                    System.out.println("Titulo: ");
//                    String titulo = input.next();
//                    System.out.println("Autor: ");
//                    String autor = input.next();
//                    System.out.println("Publicadora");
//                    String publicadora = input.next();
//                    System.out.println("Data de publicação: ");
//                    int data = input.nextByte();
//
//                    livros[i][j] = new Livro(titulo, autor, publicadora, data);
//                }
//            }
//        } else {
//            throw new LivroException("Limite atingido!");
//        }
//    }

    public PessoaEX02[] listarPessoas(int x) {
        if (x < pessoas.length) {
            System.out.println(pessoas[x].toString());
            return listarPessoas(++x);
        } else {
            return null;
        }
    }

    public void ordenarPorNomeComBubbleSort() {
        for (int i = pessoas.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (pessoas[j].getNome().compareTo(pessoas[j + 1].getNome()) > 0) {
                    PessoaEX02 aux = pessoas[j];
                    pessoas[j] = pessoas[j + 1];
                    pessoas[j + 1] = aux;
                }
            }
        }
    }

    public void mergeSorte(PessoaEX02[] pessoas, PessoaEX02[] vetAux, int ini, int fim){
        if(ini < fim){
            int meio = (ini + fim)/2;
            mergeSorte(pessoas,vetAux, ini, meio);
            mergeSorte(pessoas,vetAux, meio+1, fim);
            intercala(pessoas,vetAux, ini, meio, fim);
        }
    }

    public void intercala(PessoaEX02[] pessoas, PessoaEX02[] vetAux, int ini, int meio, int fim) {
        for (int k = ini; k <= fim; k++) {
            vetAux[k] = pessoas[k];
        }
        int i = ini;
        int j = meio + 1;

        for (int k = ini; k <= fim; k++) {
            if(i > meio){
                pessoas[k]= vetAux[j++];
            } else if (j > fim){
                pessoas[k]= vetAux[i++];
            } else if (pessoas[j].getCPF().compareTo(pessoas[i].getCPF()) > 0){
                pessoas[k] = vetAux[i++];
            } else {
                pessoas[k] = vetAux[j++];
            }
        }
    }


    public void quicksort(PessoaEX02[] pessoas, int esq, int dir) {
        if (esq < dir) {
            int j = particao(pessoas, esq, dir);
            quicksort(pessoas, esq, j - 1);
            quicksort(pessoas, j + 1, dir);
        }
    }

    public int particao(PessoaEX02[] pessoas, int esq, int dir) {
        int i = esq + 1;
        int j = dir;
        int pivo = pessoas[esq].getIdade();

        while (i <= j) {
            if (pessoas[i].getIdade() <= pivo) {
                i++;
            } else if (pessoas[j].getIdade() > pivo) {
                j--;
            } else {
                trocar(pessoas, i, j);
                i++;
                j--;
            }
        }
        trocar(pessoas, esq, j);
        return j;
    }

    private void trocar(PessoaEX02[] pessoas, int i, int j) {
        PessoaEX02 aux = pessoas[i];
        pessoas[i] = pessoas[j];
        pessoas[j] = aux;
    }
}
