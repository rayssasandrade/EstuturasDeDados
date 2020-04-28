package EstruturasI.CListaDupEncadeadaComSentinela;

public interface InterfaceCListaEncadeadaComSentinelas<T>{
    void add(T elemento);
    void add(T elemento, int posicao)throws IndiceForaDosLimitesException ;
    void remove(T elemento) throws ItemNãoEncontradoException, ListaVaziaException;
    void remove(int posicao) throws IndiceForaDosLimitesException, ListaVaziaException;
    int find(T elemento) throws ItemNãoEncontradoException;
    T get(int posicao) throws IndiceForaDosLimitesException;
    int count();
}
