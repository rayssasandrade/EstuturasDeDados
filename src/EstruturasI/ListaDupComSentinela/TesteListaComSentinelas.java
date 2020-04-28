package EstruturasI.ListaDupComSentinela;

import EstruturasI.ListaDupEncadeada.ItemEncadeadoNãoEncontradoException;

public class TesteListaComSentinelas {
    public static void main(String[] args) {
        ListaDupComSentinelas lista = new ListaDupComSentinelas();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        System.out.println(" ");
        System.out.println(lista);
        try {
            lista.obter("Akeu");
        } catch (ItemEncadeadoNãoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(lista.contem("Akeu"));
        System.out.println(lista.contem("Rafael"));
        try {
            lista.remover("Paulo");
        } catch (ListaVaziaException e) {
            System.out.println(e.getMessage());
        } catch (ItemEncadeadoNãoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
        System.out.println(lista);
        lista.adiciona("Rayssa");
        try {
            lista.remover("Akeu");
        } catch (ListaVaziaException e) {
            System.out.println(e.getMessage());
        } catch (ItemEncadeadoNãoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        lista.tamanhoLista();
        try {
            lista.pegaNo(0);
        } catch (ItemEncadeadoNãoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
        System.out.println(lista);
    }
}
