package EstruturasI.ListaDupEncadeada;

public class ItemEncadeadoNãoEncontradoException extends Exception {

    private String msg;

    public ItemEncadeadoNãoEncontradoException(String msg){
        super(msg);
        this.msg = msg;
    }
}
