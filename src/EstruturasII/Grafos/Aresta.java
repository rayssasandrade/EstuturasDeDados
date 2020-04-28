package EstruturasII.Grafos;

public class Aresta<T> {
    private Vertice destino;
    private int custo;
    private int tempo;
    private int perigo;

    public Aresta(){
    }

    public Aresta(int custo, int tempo, int perigo) {
        this.custo = custo;
        this.tempo = tempo;
        this.perigo = perigo;
    }

    public Aresta(int custo, int tempo, int perigo, Vertice destino) {
        this.custo = custo;
        this.tempo = tempo;
        this.perigo = perigo;
        this.destino = destino;
    }

    public int compareTo(Aresta arista2) {
        int mediaAtual = (this.custo + this.perigo + this.tempo) / 3;
        return mediaAtual - ((arista2.custo + arista2.tempo + arista2.perigo) / 3);
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getPerigo() {
        return perigo;
    }

    public void setPerigo(int perigo) {
        this.perigo = perigo;
    }

    public int custo(){
        return this.custo + this.perigo + this.tempo;
    }

    @Override
    public String toString() {
        return "Aresta{" +
                "custo=" + custo +
                ", tempo=" + tempo +
                ", seguranca=" + perigo +
                '}';
    }
}
