package EstruturasII.ArvoreBinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Arvore<Integer> arvore = new Arvore<Integer>();
        for (int i = 0; i < 9; i++) {
            int num = input.nextInt();
            arvore.inserir(num);
        }
        try {
            arvore.remover(10);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        arvore.emOrdem();
    }
}
