package EstruturasII.modelo;

public class Aresta {
    private int peso = 0;
    private boolean flagCaminho = false;

    public Aresta(int peso){
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isFlagCaminho() {
        return flagCaminho;
    }

    public void setFlagCaminho(boolean flagCaminho) {
        this.flagCaminho = flagCaminho;
    }

    @Override
    public String toString() {
        return String.valueOf(peso);
    }
}