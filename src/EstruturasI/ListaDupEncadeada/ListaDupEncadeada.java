package EstruturasI.ListaDupEncadeada;

public class ListaDupEncadeada implements InterfaceListaDuplamenteEncadeada {

    private NoDup primeiro;
    private NoDup ultimo;
    private int totalElementos;

    @Override
    public void adicionaNoComeco(Object elemento) {
        if (this.totalElementos == 0){
            NoDup novo = new NoDup(elemento, this.primeiro);
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            NoDup novo = new NoDup(elemento, this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
        }
        this.totalElementos++;
    }

    @Override
    public void adiciona(Object elemento){
        if (totalElementos == 0){
            this.adicionaNoComeco(elemento);
        } else {
            NoDup novo = new NoDup(elemento);
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
            this.totalElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalElementos;
    }

    public NoDup pegaNo(int posicao) throws ItemEncadeadoNãoEncontradoException{
        if(this.posicaoOcupada(posicao)){
            NoDup atual = primeiro;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProximo();
            }
            return atual;
        }else {
            throw new ItemEncadeadoNãoEncontradoException("Posição não encontrada!");
        }
    }

    @Override
    public void adiciona(int posicao, Object elemento) throws ItemEncadeadoNãoEncontradoException {
        if (posicao == 0){ //no começo
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.totalElementos){ //no final
            this.adiciona(elemento);
        } else {
            NoDup anterior = this.pegaNo(posicao -1);
            NoDup proxima = anterior.getProximo();
            NoDup novo = new NoDup(elemento, anterior.getProximo());
            novo.setAnterior(anterior);
            anterior.setProximo(novo);
            proxima.setAnterior(novo);
            this.totalElementos++;
        }
    }

    @Override
    public Object pega(int posicao) throws ItemEncadeadoNãoEncontradoException {
        return this.pegaNo(posicao).getElemento();
    }

    @Override
    public void removeDoComeco() throws ItemEncadeadoNãoEncontradoException {
        if(this.posicaoOcupada(0)){
            this.primeiro = this.primeiro.getProximo();
            this.totalElementos--;
            if (this.totalElementos == 0){
                this.ultimo = null;
            }
        } else {
            throw new ItemEncadeadoNãoEncontradoException("Posição não encntrada!");
        }
    }

    @Override
    public void removeDoFim() throws ItemEncadeadoNãoEncontradoException {
        if(this.posicaoOcupada(0)){
            if (this.totalElementos == 1){
                this.removeDoComeco();
            } else {
                NoDup penultimo = this.ultimo.getAnterior();
                penultimo.setProximo(null);
                this.ultimo = penultimo;
                this.totalElementos--;
            }
        } else {
            throw new ItemEncadeadoNãoEncontradoException("Posição não encntrada!");
        }
    }

    @Override
    public void remove(int posicao) throws ItemEncadeadoNãoEncontradoException{
        if(this.posicaoOcupada(posicao)){
            if (posicao == 0){ //no começo
                this.removeDoComeco();
            } else if (posicao == this.totalElementos){ //no final
                this.removeDoFim();
            } else {
                NoDup anterior = this.pegaNo(posicao-1);
                NoDup atual = anterior.getProximo();
                NoDup proximo = atual.getProximo();
                anterior.setProximo(proximo);
                proximo.setAnterior(anterior);
                this.totalElementos--;
            }
        } else {
            throw new ItemEncadeadoNãoEncontradoException("Posição não encntrada!");
        }
    }

    @Override
    public int tamanho() {
        return this.totalElementos;
    }

    @Override
    public boolean contem(Object elemento) {
        NoDup atual = this.primeiro;
        while (atual != null){
            if (atual.getElemento().equals(elemento)){
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.totalElementos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        NoDup atual = primeiro;

        while (atual != null){
            builder.append(atual.getElemento());
            if (atual.getProximo() != null){
                builder.append(",");
            }
            atual = atual.getProximo();
        }

        builder.append("]");
        return builder.toString();
    }
}
