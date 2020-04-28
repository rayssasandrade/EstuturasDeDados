package EstruturasI.CListaSimpEncadeada;

import EstruturasI.CListaDupEncadeadaComSentinela.IndiceForaDosLimitesException;
import EstruturasI.CListaDupEncadeadaComSentinela.ItemNãoEncontradoException;
import EstruturasI.CListaDupEncadeadaComSentinela.ListaVaziaException;

public class CTesteSimpEnca {
    public static void main(String[] args) {
        CListaSimpEncadeada<String> lista = new CListaSimpEncadeada<String>();
        lista.add("Rafael");
        System.out.println(" ");
        System.out.println(lista);
        lista.add("Paulo");
        System.out.println(" ");
        System.out.println(lista);
        lista.addIni("Ray");
        System.out.println(" ");
        System.out.println(lista);
        lista.addIni("Mai");
        System.out.println(" ");
        System.out.println(lista);
        try {
            lista.add("Jonatas", 2);
        } catch (IndiceForaDosLimitesException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
        System.out.println(lista);
        try {
            lista.remove("Rafael");
        } catch (ItemNãoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (ListaVaziaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
        System.out.println(lista);
        try {
            lista.remove("Iris");
        } catch (ItemNãoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (ListaVaziaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
        System.out.println(lista);
        try {
            lista.remove(1);
        } catch (IndiceForaDosLimitesException e) {
            System.out.println(e.getMessage());
        } catch (ListaVaziaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
        System.out.println(lista);
        try {
            System.out.println(lista.find("Ray"));
        } catch (ItemNãoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
