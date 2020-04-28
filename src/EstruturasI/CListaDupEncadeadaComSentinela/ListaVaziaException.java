package EstruturasI.CListaDupEncadeadaComSentinela;

public class ListaVaziaException extends Exception {
    private String msg;

    public ListaVaziaException(String msg){
        super(msg);
        this.msg = msg;
    }
}
