package EstruturasI.ListaDupEncadeada;

public interface InterfaceListaDuplamenteEncadeada {
    public void adicionaNoComeco(Object elemento);
    public void removeDoComeco() throws ItemEncadeadoNãoEncontradoException;
    public void removeDoFim() throws ItemEncadeadoNãoEncontradoException;
    public void adiciona(Object elemento);
    public void adiciona(int posicao, Object elemento) throws ItemEncadeadoNãoEncontradoException;
    public Object pega(int posicao) throws ItemEncadeadoNãoEncontradoException;
    public void remove(int posicao) throws ItemEncadeadoNãoEncontradoException;
    public int tamanho();
    public boolean contem(Object o);

}
