package EstruturasI.PilhaComVetores;

public class PilhaComVetor <T> implements InterfacePilhaComVetor<T>{

    private T[] pilha;
    private int topo = -1;

//    public PilhaComVetor(){
//        size();
//    }
//
//    protected void size(){
//        this.pilha = (T[]) new Object[Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho da pilha: "))];
//    }

    public int size(){
        return this.topo+1;
    }

    public PilhaComVetor(int capacidade) {
        this.pilha = (T[]) new Object[capacidade];
    }

    public boolean isEmpty(){
        if (this.topo == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(this.topo+1 == this.pilha.length){
            return true;
        }
        return false;
    }

    public void push(T elemento)throws PilhaException{
        if(isFull() == false){
            pilha[this.topo+1] = elemento;
            topo++;
        } else {
            throw new PilhaException("Pilha cheia!");
        }
    }

    public T pop() throws PilhaException {
        if (isEmpty() == false){
            T removido = pilha[topo];
            pilha[topo] = null;
            topo--;
            return removido;
        } else {
            throw new PilhaException("Pilha vazia!");
        }
    }

    public void peek() throws PilhaException{
        if (isEmpty() == false){
            System.out.println(pilha[topo]);
        } else {
            throw new PilhaException("Pilha vazia!");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i=0; i < size() -1; i++){
            s.append(this.pilha[i]);
            s.append(", ");
        }
        if (size()>0){
            s.append(this.pilha[size()-1]);
        }
        s.append("]");
        return s.toString();
    }
}
