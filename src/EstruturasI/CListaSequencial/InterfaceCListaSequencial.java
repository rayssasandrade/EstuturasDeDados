package EstruturasI.CListaSequencial;

public interface InterfaceCListaSequencial<T>{
    void add(T t) throws CListaCheiaException;
    void add(T t, int index) throws CListaCheiaException;
    void remove(T t) throws ItemNãoEncontradoException, CListaVaziaException;
    void remove(int index) throws ItemNãoEncontradoException, CListaVaziaException;
    int find(T t) throws ItemNãoEncontradoException;
    T get(int index) throws IndiceForaDosLimitesException;
    int count();
}