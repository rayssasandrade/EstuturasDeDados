package EstruturasI.CListaDupEncadeadaComSentinela;

public class Teste {
    public static void main(String[] args) {
        CListaEncadeadaComSentinela<String> lista = new CListaEncadeadaComSentinela<String>();
        lista.add("Rafael");
        lista.add("Paulo");
        lista.addIni("Ray");
        lista.addIni("Mai");
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
