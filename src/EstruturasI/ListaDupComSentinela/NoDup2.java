package EstruturasI.ListaDupComSentinela;

public class NoDup2 {
    private NoDup2 proximo;
    private NoDup2 anterior;
    private Object elemento;

    public NoDup2() {
    }

    public NoDup2(Object elemento) {
        this.elemento = elemento;
    }

    public NoDup2(Object elemento, NoDup2 proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public NoDup2(Object elemento, NoDup2 proximo, NoDup2 anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NoDup2 getProximo() {
        return proximo;
    }

    public NoDup2 getAnterior() {
        return anterior;
    }

    public void setProximo(NoDup2 proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(NoDup2 anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "NoDup2{" +
                "elemento=" + elemento +
                '}';
    }
}
