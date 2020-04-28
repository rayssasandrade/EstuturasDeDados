package EstruturasI.ListaComVetores;

public class ListaCheiaException extends Exception{
    private String msg;

    public ListaCheiaException(String msg){
        super(msg);
        this.msg = msg;
    }
}
