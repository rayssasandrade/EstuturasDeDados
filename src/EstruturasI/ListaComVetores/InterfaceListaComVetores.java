package EstruturasI.ListaComVetores;

interface InterfaceListaComVetores <T>{
    void add(T t) throws ListaCheiaException;
    void add(T t, int index) throws ListaCheiaException;
    void remove(T t) throws ItemNãoEncontradoException, ListaVaziaException;
    void remove(int index) throws ItemNãoEncontradoException, ListaVaziaException;
    int find(T t) throws ItemNãoEncontradoException;
    T get(int index) throws IndiceForaDosLimitesException;
    int count();
}
