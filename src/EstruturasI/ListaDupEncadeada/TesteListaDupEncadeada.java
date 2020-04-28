package EstruturasI.ListaDupEncadeada;

public class TesteListaDupEncadeada {
    public static void main(String[] args) {
        ListaDupEncadeada lista = new ListaDupEncadeada();
        try {
            lista.adiciona("Rafael");
            lista.adiciona("Paulo");
            lista.adiciona(1, "Rayssa");
            System.out.println(" ");
            System.out.println(lista);
            lista.remove(1);
            System.out.println(" ");
            System.out.println(lista);
            lista.pegaNo(1).getElemento().toString();
            System.out.println(" ");
            lista.remove(0);
            System.out.println(" ");
            System.out.println(lista);
            lista.remove(0);
            System.out.println(" ");
            System.out.println(lista);
        } catch (ItemEncadeadoNãoEncontradoException e){
            System.out.println(e.getMessage());
        }
    }
}