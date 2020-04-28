package EstruturasI.Exercicio;

import EstruturasI.PilhaComVetores.PilhaComVetor;
import EstruturasI.PilhaComVetores.PilhaException;

import java.util.Scanner;

//DESAFIO TORRE DE HANOI
public class Ex08_Pilha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a quantidade de discos: ");
        int qtdDiscos = input.nextInt();
        PilhaComVetor <Integer> torre1 = new PilhaComVetor<>(qtdDiscos);
        PilhaComVetor <Integer> torre2 = new PilhaComVetor<>(qtdDiscos);
        PilhaComVetor <Integer> torre3 = new PilhaComVetor<>(qtdDiscos);
        preenchendoTorre1(qtdDiscos, torre1);
        torreDeHanoi(qtdDiscos, torre1, torre2, torre3);
    }
    public static void preenchendoTorre1(int qtdDiscos, PilhaComVetor torre1){
        for (int i = qtdDiscos; i > 0; i--) {
            try {
                torre1.push(i);
            } catch (PilhaException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void torreDeHanoi(int qtdDiscos, PilhaComVetor torre1, PilhaComVetor torre2, PilhaComVetor torre3){
        if (qtdDiscos > 0){
            torreDeHanoi(qtdDiscos-1, torre1, torre3, torre2);
            try {
                torre2.push(torre1.pop());
            } catch (PilhaException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("--------");
            System.out.println("Torre 1: "+ torre1.toString());
            System.out.println("Torre 2: "+ torre2.toString());
            System.out.println("Torre 3: "+ torre3.toString());
            torreDeHanoi(qtdDiscos-1, torre3, torre2, torre1);
        }
    }
}
