package EstruturasI.ListaComVetores;

public class ListaComVetores <T> implements InterfaceListaComVetores <T>{

    private T[] lista;
    private int index;

//    public Estrutura_1.ListaComVetores(){
//        size();
//    }
//    protected void size(){
//        this.lista = (Object[]) new Object[Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho da lista: "))];
//    }

    public ListaComVetores(int capacidade) {
        this.lista = (T[]) new Object[capacidade];
    }

    @Override
    public void add(T t) throws ListaCheiaException {
        if(count() <= lista.length){
            lista[this.index++] = t;
        } else {
            throw new ListaCheiaException("Lista cheia!");
        }
    }

    @Override
    public void add(T t, int index) throws ListaCheiaException {
        if(count() <= lista.length){
            if (lista[index] == null){
                lista[index] = t;
            } else {
                lista[this.index++] = lista[index];
                lista[index] = t;
            }
        } else {
            throw new ListaCheiaException("Lista cheia!");
        }
    }
    public void imprimirLsta(){ //por enquanto
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    @Override
    public void remove(T t) throws ItemNãoEncontradoException, ListaVaziaException {
        if (count() > 0){
            for (int i = 0; i < count(); i++) {
                if (lista[i].equals(t)){
                    for (int j = i; j < (count()-1); j++) {
                        lista[j] = lista[j+1];
                    }
                    lista[(this.index-1)] = null;
                    index--;
                    break;
                } throw new ItemNãoEncontradoException("Item não encontrado!");
            }
        } throw new ListaVaziaException("Lista vazia!");
    }

    @Override
    public void remove(int index) throws ItemNãoEncontradoException, ListaVaziaException { //errado
        if (count() > 0){
            if(lista[index] != null){
                for (int i = index; i < (count()-1); i++) {
                    lista[i] = lista[i+1];
                }
                lista[(this.index-1)] = null;
                index--;
            } throw new ItemNãoEncontradoException("Item não encontrado!");
        } throw new ListaVaziaException("Lista vazia!");
    }

    @Override
    public int find(T t) throws ItemNãoEncontradoException {
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].equals(t)){
                return i;
            }
        }
        throw new ItemNãoEncontradoException("Item não encontrado");
    }

    @Override
    public T get(int index) throws IndiceForaDosLimitesException {
        if (lista[index] != null){
            return (T) lista[index].toString();
        }throw new IndiceForaDosLimitesException("Indice fora dos limites");
    }

    @Override
    public int count() {
        return this.index;
    }

    public int size(){
        return this.lista.length;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0; i<this.size()-1; i++){
            s.append(this.lista[i]);
            s.append(", ");
        }
        if (this.size()>0){
            s.append(this.lista[this.size()-1]);
        }
        s.append("]");
        return s.toString();
    }
}
