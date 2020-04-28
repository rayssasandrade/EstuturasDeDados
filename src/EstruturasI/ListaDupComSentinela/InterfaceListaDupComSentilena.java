package EstruturasI.ListaDupComSentinela;

import EstruturasI.ListaDupEncadeada.ItemEncadeadoNãoEncontradoException;

public interface InterfaceListaDupComSentilena {
    int tamanhoLista();
    void adiciona(Object elemento);
    void remover(Object elemento) throws ItemEncadeadoNãoEncontradoException, ListaVaziaException;
    boolean contem(Object elemento);
    Object obter(Object elemento) throws ItemEncadeadoNãoEncontradoException;
    void mesclar(ListaDupComSentinelas lista, ListaDupComSentinelas listaDois);
    Object[] subconj(int inicio, int fim);
    ListaDupComSentinelas inverter();
}
