package EstruturasI.CListaSimpEncadeada;

public class CNo<T> {
    private CNo proximo;
    private T elemento;

    public CNo(){
    }

    public CNo(T elemento) {
        this.elemento = elemento;
    }

    public CNo(T elemento, CNo<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public CNo<T> getProximo() {
        return proximo;
    }

    public void setProximo(CNo<T> proximo) {
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                '}';
    }
}
