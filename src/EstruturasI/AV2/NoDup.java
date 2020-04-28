package EstruturasI.AV2;

public class NoDup {
    private NoDup proximo;
    private NoDup anterior;
    private Item elemento;

    public NoDup(){
    }

    public NoDup(Comparable chave, Object informacaoCompleta) {
        this.elemento = new Item(chave, informacaoCompleta);
    }

    public NoDup(Comparable chave, Object informacaoCompleta, NoDup proximo) {
        this.elemento = new Item(chave, informacaoCompleta);
        this.proximo = proximo;
    }

    public NoDup(Comparable chave, Object informacaoCompleta, NoDup proximo, NoDup anterior) {
        this.elemento = new Item(chave, informacaoCompleta);
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public Item getElemento() {
        return elemento;
    }

    public void setElemento(Item elemento) {
        this.elemento = elemento;
    }

    public NoDup getProximo() {
        return proximo;
    }

    public NoDup getAnterior() {
        return anterior;
    }

    public void setProximo(NoDup proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(NoDup anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
