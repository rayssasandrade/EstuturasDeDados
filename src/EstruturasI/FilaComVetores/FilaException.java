package EstruturasI.FilaComVetores;

public class FilaException extends Exception {

    private String msg;

    public FilaException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
