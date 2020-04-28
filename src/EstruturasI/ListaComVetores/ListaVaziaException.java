package EstruturasI.ListaComVetores;

public class ListaVaziaException extends Exception {

    private String msg;

    public ListaVaziaException(String msg){
        super(msg);
        this.msg = msg;
    }

}
