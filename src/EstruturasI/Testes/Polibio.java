package EstruturasI.Testes;

import java.util.Scanner;

public class Polibio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("###########################################");
            System.out.println("##################*MENU*###################");
            System.out.println("###########################################");
            System.out.println("1. Traduzir de portugues para Polibio");
            System.out.println("2. Traduzir de decimal para Binario");
            System.out.println("3. Traduzir de decimal para Octal");
            System.out.println("4. Traduzir de decimal para Hexadecimal");
            System.out.println("5. Traduzir de portugues para Morce");
            System.out.println("6. Sair");
            System.out.println("############################################");
            System.out.print("Informe sua escolha: ");
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    char a = ' ';
                    String x;
                    char letras[];
                    String P[][] = {{"a", "b", "c", "d", "e",},
                                    {"f", "g", "h", "i", "j",},
                                    {"k", "l", "m", "n", "o",},
                                    {"p", "r", "s", "t", "u",},
                                    {"v", "w", "x", "y", "z"}};
                    System.out.print("Informe a fraze a ser traduzida lembrando que a letra q n existe substitua por k ou a letra n aparecera: ");
                    x = leitura.nextLine();
                    x = leitura.nextLine();
                    letras = x.toCharArray();
                    int n = letras.length;
                    int polibio1[] = new int[n];
                    int polibio2[] = new int[n];
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < 5; j++) {
                            for (int k = 0; k < 5; k++) {
                                if (P[k][j].equals(String.valueOf(letras[i]))) {
                                    polibio1[i] = (j);
                                    polibio2[i] = (k);
                                    System.out.print("(" + polibio1[i] + "," + polibio2[i] + ")");
                                }
                            }
                        } 
                        if (letras[i] == a) {
                            System.out.print("  ");
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    int b;
                    String binario = "";
                    System.out.print("Informe o valor em decimal: ");
                    b = leitura.nextInt();
                    while (b > 0) {
                        switch (b % 2) {
                            case 0:
                                binario = "0" + binario;
                                break;
                            case 1:
                                binario = "1" + binario;
                                break;
                        }
                        b = b / 2;
                    }
                    System.out.println("Número em Binário: " + binario);
                    break;
                case 3:
                    int o;
                    String octal = "";
                    System.out.print("Informe o valor em decimal: ");
                    o = leitura.nextInt();
                    while (o > 0) {
                        switch (o % 8) {
                            case 0:
                                octal = "0" + octal;
                                break;
                            case 1:
                                octal = "1" + octal;
                                break;
                            case 2:
                                octal = "2" + octal;
                                break;
                            case 3:
                                octal = "3" + octal;
                                break;
                            case 4:
                                octal = "4" + octal;
                                break;
                            case 5:
                                octal = "5" + octal;
                                break;
                            case 6:
                                octal = "6" + octal;
                                break;
                            case 7:
                                octal = "7" + octal;
                                break;
                            case 8:
                                octal = "8" + octal;
                                break;
                        }
                        o = o / 8;
                    }
                    System.out.println("Número em Octal: " + octal);
                    break;
                case 4:
                    int h;
                    String hexadecimal = "";
                    System.out.print("Informe o valor em decimal: ");
                    h = leitura.nextInt();
                    while (h > 0) {
                        switch (h % 16) {
                            case 0:
                                hexadecimal = "0" + hexadecimal;
                                break;
                            case 1:
                                hexadecimal = "1" + hexadecimal;
                                break;
                            case 2:
                                hexadecimal = "2" + hexadecimal;
                                break;
                            case 3:
                                hexadecimal = "3" + hexadecimal;
                                break;
                            case 4:
                                hexadecimal = "4" + hexadecimal;
                                break;
                            case 5:
                                hexadecimal = "5" + hexadecimal;
                                break;
                            case 6:
                                hexadecimal = "6" + hexadecimal;
                                break;
                            case 7:
                                hexadecimal = "7" + hexadecimal;
                                break;
                            case 8:
                                hexadecimal = "8" + hexadecimal;
                                break;
                            case 9:
                                hexadecimal = "9" + hexadecimal;
                                break;
                            case 10:
                                hexadecimal = "A" + hexadecimal;
                                break;
                            case 11:
                                hexadecimal = "B" + hexadecimal;
                                break;
                            case 12:
                                hexadecimal = "C" + hexadecimal;
                                break;
                            case 13:
                                hexadecimal = "D" + hexadecimal;
                                break;
                            case 14:
                                hexadecimal = "E" + hexadecimal;
                                break;
                            case 15:
                                hexadecimal = "F" + hexadecimal;
                                break;
                        }
                        h = h / 16;
                    }
                    System.out.println("Número em Hexadecimal: " + hexadecimal);
                    break;
                case 5:

                case 6:
                    break;
            }
        } while (opcao != 6);
    }
}
