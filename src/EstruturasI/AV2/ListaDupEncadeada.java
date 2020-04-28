package EstruturasI.AV2;

public class ListaDupEncadeada implements ILista{

    private NoDup noDupCabeca;
    private NoDup noDupCauda;
    private int totalElementos;

    public ListaDupEncadeada(){
        this.noDupCabeca = new NoDup();
        this.noDupCauda = new NoDup();
        this.noDupCauda.setAnterior(noDupCabeca);
        this.noDupCabeca.setProximo(noDupCauda);
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

    @Override
    public void adicionar(Item dado) throws ListaException {
        if (!itemNulo(dado)){
            try {
                NoDup novo = new NoDup(dado.getChave(), dado.getInformacaoCompleta());
                novo.setAnterior(noDupCauda.getAnterior());
                novo.setProximo(noDupCauda);
                noDupCauda.getAnterior().setProximo(novo);
                noDupCauda.setAnterior(novo);
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
        NoDup atual = this.noDupCabeca.getProximo();
        boolean encontrado = false;
        while (atual != noDupCauda){
            if (atual.getElemento().getChave().compareTo(chave)==0){
                atual.getAnterior().setProximo(atual.getProximo());
                atual.getProximo().setAnterior(atual.getAnterior());
                System.out.println("Removido com sucesso!");
                encontrado = true;
                totalElementos--;
            }
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
        NoDup atual = this.noDupCabeca.getProximo();
        while (atual != noDupCauda){
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
        NoDup atual = this.noDupCabeca.getProximo();
        boolean encontrado = false;
        try {
            for (int i = 1; i < this.totalElementos; i++){
                if (atual.getElemento().getChave().compareTo(chaveDoItemDoMeio)==0){
                    encontrado = true;
                    atual = atual.getProximo();
                    Item[] itens = outralista.getSubLista(1, outralista.getQtd());
                    for (int j = 0; j < itens.length; j++) {
                        if (itens[j]!=null){
                            NoDup novo = new NoDup(itens[j].getChave(), itens[j].getInformacaoCompleta());
                            novo.setAnterior(atual.getAnterior());
                            atual.getAnterior().setProximo(novo);
                            novo.setProximo(atual);
                            atual.setAnterior(novo);
                            this.totalElementos++;
                        }
                    }
                    break;
                }
                atual = atual.getProximo();
            }
        }catch (OutOfMemoryError e){
            throw new ListaException("Memória Cheia!");
        }
        if (!encontrado){
            throw new ListaException("Elemento não encontrado!");
        }
    }

    @Override
    public Item[] getSubLista(int posicaoInicial, int posicaoFinal) throws ListaException {
        if (this.totalElementos!= 0 && posicaoFinal <= this.totalElementos){
            NoDup atual = this.noDupCabeca.getProximo();
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
            NoDup atual = this.noDupCabeca.getProximo();
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
            NoDup atual1 = this.noDupCabeca.getProximo();
            while (atual1!=noDupCauda){
                NoDup atual2 = atual1.getProximo();
                while (atual2 !=noDupCauda){
                    if (atual1.getElemento().getChave().equals(atual2.getElemento().getChave())){
                        atual2.getAnterior().setProximo(atual2.getProximo());
                        atual2.getProximo().setAnterior(atual2.getAnterior());
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
        NoDup atual = noDupCabeca.getProximo();
        while (atual != noDupCauda){
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
