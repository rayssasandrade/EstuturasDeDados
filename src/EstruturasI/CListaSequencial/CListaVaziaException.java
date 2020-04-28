package EstruturasI.CListaSequencial;

public class CListaVaziaException extends Exception{
    private String msg;

    public CListaVaziaException(String msg){
        super(msg);
        this.msg = msg;
    }
}
