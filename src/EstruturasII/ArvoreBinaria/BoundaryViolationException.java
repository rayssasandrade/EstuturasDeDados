package EstruturasII.ArvoreBinaria;

public class BoundaryViolationException extends Exception {
    private String msg;

    public BoundaryViolationException(String msg){
        super(msg);
        this.msg = msg;
    }
}
