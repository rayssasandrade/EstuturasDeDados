package EstruturasII.ArvoreAVL;

import java.util.Scanner;

public class MainAVL{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArvoreAVL<Integer> arvore = new ArvoreAVL<>();
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
        System.out.println(arvore.tamanho());

    }
}
