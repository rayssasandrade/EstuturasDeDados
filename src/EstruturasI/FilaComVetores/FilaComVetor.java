package EstruturasI.FilaComVetores;

public class FilaComVetor <T> implements InterfaceFilaComVetor <T>{

    private T[] fila;
    private int fim;
    private int elem;
    private T aux;

//    public FilaComVetor(){
//        size();
//    }
//    protected void size(){
//        this.fila = (T[]) new Object[Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho da pilha: "))];
//    }

    public FilaComVetor(int capacidade) {
        this.fila = (T[]) new Object[capacidade];
    }

    public int size(){
        return this.fila.length;
    }
    public boolean isEmpty(){
        if (this.elem == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(this.elem == this.fila.length){
            return true;
        }
        return false;
    }

    public void push(T elemento)throws FilaException{
        if(isFull() == false){
            fila[this.fim] = elemento;
            fim++;
            elem++;
        } else {
            throw new FilaException("Fila cheia!");
        }
    }

    public void organizarFila(){
        for (int i = 0; i < fila.length-1; i++) {
            fila[i] = fila[i+1];
        }
        fim--;
        elem--;
    }

    public T pop() throws FilaException {
        aux = fila[0];
        if (isEmpty() == false){
            organizarFila();
            fila[fim]= null;
            return aux;
        } else {
            throw new FilaException("Fila vazia!");
        }
    }

    public void first() throws FilaException{
        if (isEmpty() == false){
            System.out.println(fila[0]);
        } else {
        throw new FilaException("Fila vazia!");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0; i<this.size()-1; i++){
            s.append(this.fila[i]);
            s.append(", ");
        }
        if (this.size()>0){
            s.append(this.fila[this.size()-1]);
        }
        s.append("]");
        return s.toString();
    }
}
