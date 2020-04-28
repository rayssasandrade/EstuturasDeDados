package EstruturasI.Pessoa;

public class PessoaException extends Exception{

    String msg;

    public PessoaException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
