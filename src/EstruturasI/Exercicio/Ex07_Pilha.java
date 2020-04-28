package EstruturasI.Exercicio;
import EstruturasI.PilhaComVetores.PilhaComVetor;
import EstruturasI.PilhaComVetores.PilhaException;

import java.util.Scanner;

public class Ex07_Pilha {
    //DESAFIO TRANSFORMAÇÃO BINÁRIA

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o número: ");
        imprmirResultado(transformação(input.nextInt()));
    }

    public static PilhaComVetor transformação(int num){
        int resto;
        PilhaComVetor<Integer> pilhaBinaria = new PilhaComVetor(num);
        do {
            resto = (num%2);
            num = num/2;
            try {
                pilhaBinaria.push(resto);
            } catch (PilhaException e) {
                System.out.println(e.getMessage());
            }
        } while (num != 0);
        return pilhaBinaria;
    }

    public static void imprmirResultado(PilhaComVetor pilhaBinaria){
        String numBinarizado = "";
        while (!pilhaBinaria.isEmpty()){
            try {
                numBinarizado += String.valueOf(pilhaBinaria.pop());
            } catch (PilhaException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(numBinarizado);
    }

}
