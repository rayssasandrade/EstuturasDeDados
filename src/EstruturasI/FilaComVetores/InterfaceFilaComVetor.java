package EstruturasI.FilaComVetores;

public interface InterfaceFilaComVetor <T>{

    boolean isEmpty();
    boolean isFull();
    void push(T t)throws FilaException;
    void organizarFila();
    T pop() throws FilaException;
    void first() throws FilaException;

}
