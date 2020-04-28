package EstruturasI.ListaComVetores;

public class ItemNãoEncontradoException extends Exception {

    String msg;

    public ItemNãoEncontradoException(String msg){
        super(msg);
        this.msg = msg;
    }

}
