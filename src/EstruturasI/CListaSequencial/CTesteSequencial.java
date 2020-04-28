package EstruturasI.CListaSequencial;

import javax.swing.*;
import java.util.Scanner;

public class CTesteSequencial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        PessoaEX02 pessoa = new PessoaEX02("Rayssa", "071", 20);
//        PessoaEX02 pessoa01 = new PessoaEX02("Akeu", "081", 12);
//        PessoaEX02 pessoa02 = new PessoaEX02("Maisa", "971", 32);
//        PessoaEX02 pessoa03 = new PessoaEX02("Iris", "512", 98);

        System.out.println("Entre com o tamanho do vetor: ");
        CListaSequencial<String> lista = new CListaSequencial<String>(input.nextInt());
        try {
            lista.add("Rayssa");
        } catch (CListaCheiaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        System.out.println(lista);
        try {
            lista.add("Akeu");
        } catch (CListaCheiaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        System.out.println(lista);
        try {
            lista.add("Mai", 5);
        } catch (CListaCheiaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        System.out.println(lista);
        try {
            lista.add("Iris", 10);
        } catch (CListaCheiaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println();
        System.out.println(lista);
//        try {
//            lista.find(pessoa03);
//        } catch (ItemNãoEncontradoException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        try {
//            lista.get(2);
//        }catch (IndiceForaDosLimitesException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println();
//        System.out.println(lista);
//        try {
//            lista.remove(1);
//        } catch (CListaVaziaException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } catch (ItemNãoEncontradoException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println();
//        System.out.println(lista);
//        try {
//            lista.remove(pessoa);
//        } catch (CListaVaziaException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } catch (ItemNãoEncontradoException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println();
//        System.out.println(lista);
//        try {
//            lista.remove(pessoa02);
//        } catch (CListaVaziaException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } catch (ItemNãoEncontradoException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println();
//        System.out.println(lista);
//        try {
//            lista.remove(pessoa01);
//        } catch (CListaVaziaException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } catch (ItemNãoEncontradoException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println();
//        System.out.println(lista);
//        try {
//            lista.remove(pessoa03);
//        } catch (CListaVaziaException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } catch (ItemNãoEncontradoException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println();
//        System.out.println(lista);
//        try {
//            lista.remove(2);
//        } catch (CListaVaziaException e){
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        } catch (ItemNãoEncontradoException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println();
//        System.out.println(lista);
    }
}
