package EstruturasI.ListaDupComSentinela;

import EstruturasI.ListaDupEncadeada.ItemEncadeadoNãoEncontradoException;

public class ListaDupComSentinelas implements InterfaceListaDupComSentilena{

    private NoDupCabeca noDupCabeca;
    private NoDupCauda noDupCauda;
    private int totalElementos;

    public ListaDupComSentinelas(){
        this.noDupCabeca = new NoDupCabeca();
        this.noDupCauda = new NoDupCauda(null, noDupCabeca);
        this.noDupCabeca.setProximo(noDupCauda);
    }

    public boolean estaVazia(){
        if (this.totalElementos == 0) {
            return true;
        }
        return false;
    }

    public void adiciona(Object elemento) {
        if (estaVazia()){
            NoDup2 novo = new NoDup2(elemento, null, null);
            novo.setProximo(noDupCabeca.getProximo());
            novo.setAnterior(noDupCabeca);
            noDupCabeca.setProximo(novo);
            novo.getProximo().setAnterior(novo);
            this.totalElementos++;
        } else {
            NoDup2 novo = new NoDup2(elemento);
            novo.setAnterior(noDupCauda.getAnterior());
            novo.setProximo(noDupCauda);
            noDupCauda.getAnterior().setProximo(novo);
            noDupCauda.setAnterior(novo);
            this.totalElementos++;
        }
    }

    @Override
    public int tamanhoLista() {
        return totalElementos;
    }

    @Override
    public void remover(Object elemento) throws ListaVaziaException, ItemEncadeadoNãoEncontradoException {
        if (!estaVazia()){
            NoDup2 atual = this.noDupCabeca.getProximo();
            int aux = 0;
            while (atual.getElemento() != null){
                if (atual.getElemento().equals(elemento)){
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                    System.out.println("Removido com sucesso!");
                    aux++;
                    totalElementos--;
                }
                atual = atual.getProximo();
            }
            if (aux == 0){
                throw new ItemEncadeadoNãoEncontradoException("Item não encontrado!");
            }
        } else {
            throw new ListaVaziaException("Lista Vazia!");
        }
    }

    @Override
    public boolean contem(Object elemento){
        NoDup2 atual = this.noDupCabeca.getProximo();
        while (atual.getProximo().getElemento() != null){
            if (atual.getElemento().equals(elemento)){
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalElementos;
    }

    public NoDup2 pegaNo(int posicao) throws ItemEncadeadoNãoEncontradoException{
        if(this.posicaoOcupada(posicao)){
            NoDup2 atual = noDupCabeca.getProximo();
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProximo();
            }
            return atual;
        }else {
            throw new ItemEncadeadoNãoEncontradoException("Posição não encontrada!");
        }
    }

    @Override
    public Object obter(Object elemento) throws ItemEncadeadoNãoEncontradoException {
        NoDup2 atual = this.noDupCabeca.getProximo();
        while (atual.getProximo().getElemento() != null){
            if (atual.getElemento().equals(elemento)){
                return atual.getElemento().toString();
            }
            atual = atual.getProximo();
        }
        throw new ItemEncadeadoNãoEncontradoException("Item não encontrdado!");
    }

    @Override
    public void mesclar(ListaDupComSentinelas lista, ListaDupComSentinelas listaDois) {

    }

    @Override
    public Object[] subconj(int inicio, int fim) {
        return new Object[0];
    }

    @Override
    public ListaDupComSentinelas inverter() {
        return null;
    }

    public String toString() {
        if (this.totalElementos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        NoDup2 atual = noDupCabeca.getProximo();

        while (atual != noDupCauda){
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
