package EstruturasI.PilhaComVetores;

public interface InterfacePilhaComVetor <T>{

    boolean isEmpty();
    boolean isFull();
    void push(T elemento) throws PilhaException;
    T pop() throws PilhaException;
    void peek() throws PilhaException;
}
