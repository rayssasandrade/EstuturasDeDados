package EstruturasI.CListaDupEncadeadaComSentinela;

public class ItemNãoEncontradoException extends Exception{
    private String msg;

    public ItemNãoEncontradoException(String msg){
        super(msg);
        this.msg = msg;
    }
}
