package EstruturasI.AV2;

public class No {
    private No proximo;
    private Item elemento;

    public No(){
    }

    public No(Comparable chave, Object informacaoCompleta) {
        this.elemento = new Item(chave, informacaoCompleta);
    }

    public No(Comparable chave, Object informacaoCompleta, No proximo) {
        this.elemento = new Item(chave, informacaoCompleta);
        this.proximo = proximo;
    }

    public Item getElemento() {
        return elemento;
    }

    public void setElemento(Item elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

