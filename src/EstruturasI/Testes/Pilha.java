package EstruturasI.Testes;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<Peca> pecas = new LinkedList<Peca>();

    public void inserir(Peca peca){
        this.pecas.add(peca);
    }

    public Peca remover(){
        return this.pecas.remove(this.pecas.size()-1);
    }

    public boolean vazia(){
        return this.pecas.size() == 0;
    }
}
