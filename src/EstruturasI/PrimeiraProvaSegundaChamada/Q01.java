package EstruturasI.PrimeiraProvaSegundaChamada;

import EstruturasI.PilhaComVetores.PilhaComVetor;
import EstruturasI.PilhaComVetores.PilhaException;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a expressão: ");
        String expressao = input.next();
        imprimirSimbolosResultado(expressao);
        imprimirOperadoresResultado(expressao);
    }

    public static void imprimirSimbolosResultado(String expressao){
        System.out.println(expressao + " está com símbolos corretos? "+ testaSimbolosExpressao(expressao));
    }

    public static boolean testaSimbolosExpressao(String expressao){
        int chave = 0;
        int conchete = 0;
        int parentes = 0;
        PilhaComVetor<Character> pilhaComVetor = new PilhaComVetor<Character>(expressao.length());
        for (int i = 0; i < expressao.length() ; i++) {
            try {
                pilhaComVetor.push(expressao.charAt(i));
                if (expressao.compareTo(expressao.charAt(i) + "{") < 0){
                    chave =+ 1;
                } else if (expressao.compareTo(expressao.charAt(i) +"[") < 0){
                    conchete =+ 1;
                } else if (expressao.compareTo(expressao.charAt(i) +"(") < 0){
                    parentes =+1;
                }
            } catch (PilhaException e) {
                System.out.println(e.getMessage());;
            }
        }
        Character elem;
        for (int i = 0; i < expressao.length() ; i++) {
            try {
                elem = pilhaComVetor.pop();
                if (elem.equals("}")){
                    chave =- 1;
                } else if (elem.equals("]")){
                    conchete =- 1;
                } else if (elem.equals(")")){
                    parentes =-1;
                }
            } catch (PilhaException e){
                System.out.println(e.getMessage());
            }
        }

        if (chave == 0 || conchete == 0 || parentes == 0 ){
            return true;
        }
        return false;
    }

    public static void imprimirOperadoresResultado(String expressao){
        System.out.println(expressao + " está com operadores corretos? "+ testaSimbolosExpressao(expressao));
    }

    public static boolean testaOperadoresExpressao(String expressao){
        PilhaComVetor<Character> pilhaComVetor = new PilhaComVetor<Character>(expressao.length());
        try {
            pilhaComVetor.push(expressao.charAt(0));
        } catch (PilhaException e) {
            System.out.println(e.getMessage());;
        }
        for (int i = 1; i < expressao.length() ; i++) {
            try {
                pilhaComVetor.push(expressao.charAt(i));
                if(pilhaComVetor.pop() == expressao.charAt(i) ){
                    return false;
                }
            } catch (PilhaException e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
}
