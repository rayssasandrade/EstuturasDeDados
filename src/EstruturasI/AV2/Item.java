package EstruturasI.AV2;

import java.util.Objects;

public class Item implements Comparable{

    private Comparable chave;
    private Object informacaoCompleta;

    public Item(){
    }

    public Item(Comparable chave){
        this();
        this.chave = chave;
        this.informacaoCompleta = chave;
    }

    public Item(Comparable chave, Object dado){
        this(chave);
        this.informacaoCompleta = dado;
    }

    public Object getInformacaoCompleta() {
        return informacaoCompleta;
    }

    public void setInformacaoCompleta(Object informacaoCompleta) {
        this.informacaoCompleta = informacaoCompleta;
    }

    public Comparable getChave() {
        return chave;
    }

    public void setChave(Comparable chave) {
        this.chave = chave;
    }

    // Implementar o método compareTo
    public int compareTo(Object o) {
        if (o.equals(chave)){
            return 0;
        }
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(chave, item.chave) &&
                Objects.equals(informacaoCompleta, item.informacaoCompleta);
    }

    @Override
    public String toString() {
        return "[Chave: " + chave + ", " + informacaoCompleta+"]";
    }
}
