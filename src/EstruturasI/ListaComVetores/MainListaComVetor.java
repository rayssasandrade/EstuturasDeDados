package EstruturasI.ListaComVetores;

import EstruturasI.Pessoa.PessoaEX02;

import javax.swing.*;
import java.util.Scanner;

public class MainListaComVetor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PessoaEX02 pessoa = new PessoaEX02("Rayssa", "071", 20);
        PessoaEX02 pessoa01 = new PessoaEX02("Akeu", "081", 12);
        PessoaEX02 pessoa02 = new PessoaEX02("Maisa", "971", 32);
        PessoaEX02 pessoa03 = new PessoaEX02("Iris", "512", 98);

        System.out.println("Entre com o tamanho do vetor: ");
        ListaComVetores lista = new ListaComVetores(input.nextInt());
        try {
            lista.add(pessoa);
        } catch (ListaCheiaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.add(pessoa01);
        } catch (ListaCheiaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.add(pessoa02, 1);
        } catch (ListaCheiaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.add(pessoa03, 1);
        } catch (ListaCheiaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.find(pessoa03);
        } catch (ItemNãoEncontradoException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            lista.get(2);
        }catch (IndiceForaDosLimitesException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.remove(1);
        } catch (ListaVaziaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ItemNãoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.remove(pessoa);
        } catch (ListaVaziaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ItemNãoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.remove(pessoa02);
        } catch (ListaVaziaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ItemNãoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.remove(pessoa01);
        } catch (ListaVaziaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ItemNãoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.remove(pessoa03);
        } catch (ListaVaziaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ItemNãoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
        try {
            lista.remove(2);
        } catch (ListaVaziaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ItemNãoEncontradoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        lista.imprimirLsta();
    }
}
