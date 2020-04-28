package EstruturasI.AV2;

interface ILista {
    /**Adiciona um elemento na lista
     * @param dado Elemento a ser adicionado
     * @throws ListaException Erro caso não tenha mais espaço disponível.
     */
    void adicionar(Item dado) throws ListaException;

    /**Remove um item da lista
     * @param chave informar a chave de busca do item
     * @throws ListaException Erro caso não tenha o item informado.
     */
    void remover(Comparable chave) throws ListaException;
    /**
     * Caso a chave seja encontrada, retorna verdadeiro
     * @param chave
     * @return
     */
    boolean contem(Comparable chave) throws ListaException;

    /**Retorna a quantidade de elementos
     *@return a quantidade de elementos
     */
    int getQtd();

    /**Adiciona a outra lista no final da lista.
     * @param outralista a outra lista a ser somada.
     */
    void AdicionarNoFinal(ILista outralista) throws ListaException;

    /**Adiciona a outra lista no final da lista.
     * @param outralista a outra lista a ser somada.
     */
    void AdicionarNoFinal(Item[] outralista) throws ListaException;

    /**Adiciona a outra lista após o item chave existente na lista.
     * @param outralista        a outra lista a ser somada.
     * @param chaveDoItemDoMeio elemento chave que antecederá a outra lista
     */
    void AdicionarNoMeio(Comparable chaveDoItemDoMeio, ILista outralista) throws ListaException;

    /**Retorna outra lista com os elementos existentes da lista.
     * @param posicaoInicial posição inicial da lista a ser copiada.
     * @param posicaoFinal   posição final da lista que deve ser copiada.
     */
    Item[] getSubLista(int posicaoInicial, int posicaoFinal) throws ListaException;
    /** Retorna a quantidade de elementos que são iguais ao informado no parâmetro.
     * @param item elemento de comparação.
     */
    int getQtdElementos(Item item) throws ListaException;
    /**Remove os itens duplicados
     * @throws ListaException
     */
    void removerDuplicados() throws ListaException;
}
