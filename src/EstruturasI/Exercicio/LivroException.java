package EstruturasI.Exercicio;

public class LivroException extends Exception{

    String msg;

    public LivroException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
