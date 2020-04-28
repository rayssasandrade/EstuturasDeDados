package EstruturasI.CListaSimpEncadeada;

import EstruturasI.CListaDupEncadeadaComSentinela.IndiceForaDosLimitesException;
import EstruturasI.CListaDupEncadeadaComSentinela.ItemNãoEncontradoException;
import EstruturasI.CListaDupEncadeadaComSentinela.ListaVaziaException;

public class CListaSimpEncadeada<T> implements InterfaceCListaSimpEncadeada<T> {

    private CNo<T> sentinela;
    private int totalElementos;

    public CListaSimpEncadeada() {
        this.sentinela = new CNo<T>();
        this.sentinela.setProximo(sentinela);
    }

    public boolean estaVazia(){
        if (this.totalElementos == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void add(T elemento){
        CNo<T> novo = new CNo<>(elemento);
        this.getNo(this.totalElementos).setProximo(novo);
        novo.setProximo(this.sentinela);
        this.totalElementos++;
    }

    public CNo<T> getNo(int posicao){
        CNo<T> atual = this.sentinela.getProximo();
        for (int i = 1; i < posicao; i++){
            atual = atual.getProximo();
        }
        return atual;
    }

    public void addIni(T elemento){
        CNo<T> novo = new CNo<>(elemento);
        novo.setProximo(this.sentinela.getProximo());
        this.sentinela.setProximo(novo);
        totalElementos++;
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao <= this.totalElementos;
    }

    @Override
    public void add(T elemento, int posicao) throws IndiceForaDosLimitesException{
        if (posicaoOcupada(posicao)){
            CNo<T> novo = new CNo<>(elemento);
            CNo<T> aux = getNo(posicao-1);
            novo.setProximo(aux.getProximo());
            aux.setProximo(novo);
            totalElementos++;
        }else {
            throw new IndiceForaDosLimitesException("Esta posição não existe!");
        }
    }

    @Override
    public void remove(T elemento) throws ItemNãoEncontradoException, ListaVaziaException {
        if (!estaVazia()){
            CNo<T> atual = this.sentinela.getProximo();
            boolean encontrado = false;
            while (atual.getProximo() != sentinela){
                if (atual.getProximo().getElemento().equals(elemento)){
                    atual.setProximo(atual.getProximo().getProximo());
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
                if (posicao==1){
                    this.sentinela.setProximo(sentinela.getProximo().getProximo());
                    totalElementos--;
                } else {
                    CNo<T> aux = getNo(posicao-1);
                    aux.setProximo(aux.getProximo().getProximo());
                    System.out.println("Removido com sucesso!");
                    totalElementos--;
                }
            }else {
                throw new IndiceForaDosLimitesException("Esta posição não existe!");
            }
        } else {
            throw new ListaVaziaException("Lista vazia!");
        }
    }

    @Override
    public int find(T elemento) throws ItemNãoEncontradoException {
        CNo<T> atual = this.sentinela.getProximo();
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

    public void findPosicao(T elemento) {
        CNo<T> atual = this.sentinela.getProximo();
        int posicao = 1;
        while (atual != sentinela){
            if (atual.getElemento().equals(elemento)){
                System.out.println(posicao);
            }
            atual = atual.getProximo();
            posicao++;
        }
        if (posicao == 1 && sentinela.getElemento()!=elemento){
            System.out.println("Item não encontrado!");
        }
    }

    @Override
    public T get(int posicao) throws IndiceForaDosLimitesException {
        if (!posicaoOcupada(posicao)){
            CNo<T> atual = sentinela.getProximo();
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
        CNo<T> atual = sentinela.getProximo();

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
