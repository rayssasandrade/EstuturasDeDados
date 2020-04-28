package EstruturasI.AV2;

public class CListaEncadeada implements ILista {

    private No sentinela;
    private int totalElementos;

    public CListaEncadeada(){
        this.sentinela = new No();
        this.sentinela.setProximo(sentinela);
    }

    public boolean estaVazia(){
        if (this.totalElementos == 0) {
            return true;
        }
        return false;
    }

    public boolean itemNulo(Item dado){
        if (dado.getChave()==null || dado.getInformacaoCompleta()==null){
            return true;
        }
        return false;
    }

    public No getNo(int posicao){
        No atual = this.sentinela.getProximo();
        for (int i = 1; i < posicao; i++){
            atual = atual.getProximo();
        }
        return atual;
    }

    @Override
    public void adicionar(Item dado) throws ListaException{
        if (!itemNulo(dado)){
            try {
                No novo = new No(dado.getChave(), dado.getInformacaoCompleta());
                this.getNo(this.totalElementos).setProximo(novo);
                novo.setProximo(this.sentinela);
                this.totalElementos++;
            }catch (OutOfMemoryError e){
                throw new ListaException("Memória Cheia!");
            }
        } else {
            throw new ListaException("Item nulo!");
        }
    }

    @Override
    public void remover(Comparable chave) throws ListaException {
        if (estaVazia()){
            throw new ListaException("Lista vazia!");
        } else if(chave == null) {
            throw new ListaException("Chave nula!");
        }
        No atual = this.sentinela.getProximo();
        No aux = atual;
        boolean encontrado = false;
        while (atual != sentinela){
            if (atual.getElemento().getChave().compareTo(chave)==0){
                aux.setProximo(aux.getProximo().getProximo());
                System.out.println("Removido com sucesso!");
                encontrado = true;
                totalElementos--;
            }
            aux = atual;
            atual = atual.getProximo();
        }
        if (!encontrado){
            throw new ListaException("Item não encontrado!");
        }
    }

    @Override
    public boolean contem(Comparable chave) throws ListaException {
        if (estaVazia()){
            throw new ListaException("Lista vazia!");
        } else if(chave == null) {
            throw new ListaException("Chave nula!");
        }
        boolean encontrado = false;
        No atual = this.sentinela.getProximo();
        while (atual != sentinela){
            if (atual.getElemento().getChave().compareTo(chave)==0){
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public int getQtd() {
        return this.totalElementos;
    }

    @Override
    public void AdicionarNoFinal(ILista outralista) throws ListaException {
        try {
            this.AdicionarNoFinal(outralista.getSubLista(1, outralista.getQtd()));
        } catch (OutOfMemoryError e){
            throw new ListaException("Memória Cheia!");
        }
    }

    @Override
    public void AdicionarNoFinal(Item[] outralista) throws ListaException {
        try {
            for (int i = 0; i < outralista.length; i++) {
                if (outralista[i]!=null){
                    adicionar(outralista[i]);
                }
            }
        } catch (OutOfMemoryError e){
            throw new ListaException("Memória Cheia!");
        }
    }

    @Override
    public void AdicionarNoMeio(Comparable chaveDoItemDoMeio, ILista outralista) throws ListaException {

        Item[] itens = outralista.getSubLista(1, outralista.getQtd());
        No atual = this.sentinela.getProximo();
        boolean encontrado=false;
        try {
            for (int i = 1; i <= this.totalElementos; i++) {
                if (atual.getElemento().getChave().compareTo(chaveDoItemDoMeio) == 0) {
                    for (int j = 0; j < itens.length; j++) {
                        No novo = new No(itens[j].getChave(), itens[j].getInformacaoCompleta());
                        novo.setProximo(atual.getProximo());
                        atual.setProximo(novo);
                        this.totalElementos++;
                        atual=novo;
                    }
                    encontrado=true;
                    break;
                }
                atual=atual.getProximo();
            }
        }catch (OutOfMemoryError e){
            throw new ListaException("Memória Cheia!");
        }
        if (!encontrado){
            throw new ListaException("Item não encontrado!");
        }
    }

    @Override
    public Item[] getSubLista(int posicaoInicial, int posicaoFinal) throws ListaException {
        if (this.totalElementos!= 0 && posicaoFinal <= this.totalElementos){
            No atual = this.sentinela.getProximo();
            Item[] itens = new Item[(posicaoFinal-posicaoInicial)+1];
            int posicao = 0;
            for (int i = 1; i <= posicaoFinal; i++) {
                if (i >= posicaoInicial){
                    itens[posicao] = atual.getElemento();
                    posicao++;
                }
                atual = atual.getProximo();
            }
            return itens;
        } else {
            throw new ListaException("Posições não existentes!");
        }
    }

    @Override
    public int getQtdElementos(Item item) throws ListaException {
        if (!itemNulo(item)){
            No atual = this.sentinela.getProximo();
            int cont = 0;
            for (int i = 1; i <= this.totalElementos; i++) {
                if (atual.getElemento().getChave().equals(item.getChave())){
                    cont++;
                }
                atual= atual.getProximo();
            }
            return cont;
        } else {
            throw new ListaException("Item nulo!");
        }
    }

    @Override
    public void removerDuplicados() throws ListaException {
        if (!estaVazia()){
            No atual1 = this.sentinela.getProximo();
            while (atual1!=sentinela){
                No atual2 = atual1;
                while (atual2.getProximo()!=sentinela){
                    if (atual1.getElemento().getChave().equals(atual2.getProximo().getElemento().getChave())){
                        atual2.setProximo(atual2.getProximo().getProximo());
                        this.totalElementos--;
                    }
                    atual2 = atual2.getProximo();
                }
                atual1=atual1.getProximo();
            }
        }else {
            throw new ListaException("Lista vazia!");
        }
    }

    public String toString() {
        if (this.totalElementos == 0){
            return "Lista{}";
        }
        StringBuilder builder = new StringBuilder("Lista {");
        No atual = sentinela.getProximo();
        while (atual != sentinela){
            builder.append(atual.getElemento());
            if (atual.getProximo().getElemento() != null){
                builder.append(", ");
            }
            atual = atual.getProximo();
        }
        builder.append("}");
        return builder.toString();
    }
}
