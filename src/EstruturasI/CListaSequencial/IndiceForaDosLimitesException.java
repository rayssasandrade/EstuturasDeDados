package EstruturasI.CListaSequencial;

public class IndiceForaDosLimitesException extends Exception {
    private String msg;

    public IndiceForaDosLimitesException(String msg){
        super(msg);
        this.msg = msg;
    }
}
