package EstruturasI.CListaDupEncadeadaComSentinela;

public class CNoDup<T>{
    private CNoDup<T> proximo;
    private CNoDup<T> anterior;
    private T elemento;

    public CNoDup(){
    }

    public CNoDup(T elemento) {
        this.elemento = elemento;
    }

    public CNoDup(T elemento, CNoDup<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public CNoDup(T elemento, CNoDup<T> proximo, CNoDup<T> anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public CNoDup<T> getProximo() {
        return proximo;
    }

    public CNoDup<T> getAnterior() {
        return anterior;
    }

    public void setProximo(CNoDup<T> proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(CNoDup<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                '}';
    }
}
