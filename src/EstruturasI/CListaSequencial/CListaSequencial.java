package EstruturasI.CListaSequencial;

public class CListaSequencial<T> implements InterfaceCListaSequencial<T>{

    private T[] lista;
    private int index;
    private int capacidade;
    private int qtdElementos;

    public CListaSequencial(int capacidade) {
        this.capacidade = capacidade;
        this.lista = (T[]) new Object[this.capacidade];
    }

    public boolean estaVazia(){
        if (qtdElementos == 0){
            return true;
        }
        return false;
    }

    @Override
    public void add(T t) throws CListaCheiaException {
        if (this.qtdElementos != this.capacidade){
            retomar();
            if (lista[index] == null){
                lista[index] = t;
                index++;
                qtdElementos++;
            } else {
                index++;
            }
        } else {
            throw new CListaCheiaException("Lista Cheia!");
        }
    }

    public void retomar(){
        if (this.index > capacidade){
            this.index = 0;
        }
    }

    @Override
    public void add(T t, int index) throws CListaCheiaException {
        if(this.qtdElementos != this.capacidade){
            if (lista[index] == null){
                lista[index] = t;
            } else {
                retomar();
                lista[this.index++] = lista[index];
                lista[index] = t;
            }
        } else {
            throw new CListaCheiaException("Lista cheia!");
        }
    }

    @Override
    public void remove(T t) throws ItemNãoEncontradoException, CListaVaziaException {

    }

    @Override
    public void remove(int index) throws ItemNãoEncontradoException, CListaVaziaException {

    }

    @Override
    public int find(T t) throws ItemNãoEncontradoException {
        return 0;
    }

    @Override
    public T get(int index) throws IndiceForaDosLimitesException {
        return null;
    }

    @Override
    public int count() {
        return qtdElementos;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0; i<this.capacidade; i++){
            s.append(this.lista[i]);
            s.append(", ");
        }
        s.append("]");
        return s.toString();
    }
}