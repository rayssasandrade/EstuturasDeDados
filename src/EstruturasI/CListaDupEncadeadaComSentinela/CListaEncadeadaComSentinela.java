package EstruturasI.CListaDupEncadeadaComSentinela;

public class CListaEncadeadaComSentinela<T> implements InterfaceCListaEncadeadaComSentinelas<T>{

    private CNoDup<T> sentinela;
    private int totalElementos;

    public CListaEncadeadaComSentinela(){
        this.sentinela = new CNoDup<>();
        this.sentinela.setProximo(sentinela);
        this.sentinela.setAnterior(sentinela);
    }

    public boolean estaVazia(){
        if (this.totalElementos == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void add(T elemento){
        CNoDup<T> novo = new CNoDup<>(elemento);
        this.sentinela.getAnterior().setProximo(novo);
        novo.setAnterior(this.sentinela.getAnterior());
        this.sentinela.setAnterior(novo);
        novo.setProximo(sentinela);
        totalElementos++;
    }

    public void addIni(T elemento){
        CNoDup<T> novo = new CNoDup<>(elemento);
        novo.setProximo(this.sentinela.getProximo());
        this.sentinela.getProximo().setAnterior(novo);
        this.sentinela.setProximo(novo);
        novo.setAnterior(sentinela);
        totalElementos++;
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao <= this.totalElementos;
    }

    @Override
    public void add(T elemento, int posicao) throws IndiceForaDosLimitesException{
        if (posicaoOcupada(posicao)){
            CNoDup<T> novo = new CNoDup<>(elemento);
            CNoDup<T> aux = getNo(posicao);
            novo.setAnterior(aux.getAnterior());
            aux.getAnterior().setProximo(novo);
            novo.setProximo(aux);
            aux.setAnterior(novo);
            totalElementos++;
        }else {
            throw new IndiceForaDosLimitesException("Esta posição não existe!");
        }
    }

    public CNoDup<T> getNo(int posicao){
        CNoDup<T> atual = sentinela.getProximo();
        for (int i = 1; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    @Override
    public void remove(T elemento) throws ItemNãoEncontradoException, ListaVaziaException {
        if (!estaVazia()){
            CNoDup<T> atual = this.sentinela.getProximo();
            boolean encontrado = false;
            while (atual != sentinela){
                if (atual.getElemento().equals(elemento)){
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                    System.out.println("Removido com sucesso!");
                    encontrado = true;
                    totalElementos--;
                }
                atual = atual.getProximo();
            }
            if (!encontrado){
                throw new ItemNãoEncontradoException("Item não encontrado!");
            }
        } else {
            throw new ListaVaziaException("Lista vazia!");
        }
    }

    @Override
    public void remove(int posicao) throws IndiceForaDosLimitesException, ListaVaziaException {
        if (!estaVazia()){
            if (posicaoOcupada(posicao)){
                CNoDup<T> aux = getNo(posicao);
                aux.getAnterior().setProximo(aux.getProximo());
                aux.getProximo().setAnterior(aux.getAnterior());
                System.out.println("Removido com sucesso!");
                totalElementos--;
            }else {
                throw new IndiceForaDosLimitesException("Esta posição não existe!");
            }
        } else {
            throw new ListaVaziaException("Lista vazia!");
        }
    }

    @Override
    public int find(Object elemento) throws ItemNãoEncontradoException {
        CNoDup<T> atual = this.sentinela.getProximo();
        int posicao = 1;
        while (atual != sentinela){
            if (atual.getElemento().equals(elemento)){
                return posicao;
            }
            atual = atual.getProximo();
            posicao++;
        }
        throw new ItemNãoEncontradoException("Item não encontrado!");
    }

    @Override
    public T get(int posicao) throws IndiceForaDosLimitesException {
        if (!posicaoOcupada(posicao)){
            CNoDup<T> atual = sentinela.getProximo();
            for (int i = 1; i < posicao; i++) {
                atual.getProximo();
            }
            return atual.getElemento();
        }else {
            throw new IndiceForaDosLimitesException("Esta posição não existe!");
        }
    }

    @Override
    public int count() {
        return totalElementos;
    }

    public String toString() {
        if (this.totalElementos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        CNoDup<T> atual = sentinela.getProximo();

        while (atual != sentinela){
            builder.append(atual.getElemento());
            if (atual.getProximo().getElemento() != null){
                builder.append(",");
            }
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }
}
