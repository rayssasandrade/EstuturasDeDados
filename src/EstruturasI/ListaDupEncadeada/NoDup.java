package EstruturasI.ListaDupEncadeada;

public class NoDup {
    private NoDup proximo;
    private NoDup anterior;
    private Object elemento;

    public NoDup() {
    }

    public NoDup(Object elemento, NoDup proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public NoDup(Object elemento) {
        this.elemento = elemento;
    }

    public Object getElemento() {
        return elemento;
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
        return "No{" +
                "proximo=" + proximo +
                ", anterior=" + anterior +
                ", elemento=" + elemento +
                '}';
    }
}
