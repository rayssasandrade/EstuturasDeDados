package EstruturasII.ArvoreBinaria;

public class ArvoreVaziaException extends Exception {
    private String msg;

    public ArvoreVaziaException(String msg){
        super(msg);
        this.msg = msg;
    }
}
