package EstruturasI.CListaSimpEncadeada;

import EstruturasI.CListaDupEncadeadaComSentinela.IndiceForaDosLimitesException;
import EstruturasI.CListaDupEncadeadaComSentinela.ItemNãoEncontradoException;
import EstruturasI.CListaDupEncadeadaComSentinela.ListaVaziaException;

public interface InterfaceCListaSimpEncadeada<T>{
    void add(T elemento);
    void add(T elemento, int posicao)throws IndiceForaDosLimitesException;
    void remove(T elemento) throws ItemNãoEncontradoException, ListaVaziaException;
    void remove(int posicao) throws IndiceForaDosLimitesException, ListaVaziaException;
    int find(T elemento) throws ItemNãoEncontradoException;
    void findPosicao(T elemento);
    T get(int posicao) throws IndiceForaDosLimitesException;
    int count();
}
