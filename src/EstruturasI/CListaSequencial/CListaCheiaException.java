package EstruturasI.CListaSequencial;

public class CListaCheiaException extends Exception{
    private String msg;

    public CListaCheiaException(String msg){
        super(msg);
        this.msg = msg;
    }
}
