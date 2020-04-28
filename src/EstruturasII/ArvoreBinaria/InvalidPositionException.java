package EstruturasII.ArvoreBinaria;

public class InvalidPositionException extends Exception {
    private String msg;

    public InvalidPositionException(String msg){
        super(msg);
        this.msg = msg;
    }
}
