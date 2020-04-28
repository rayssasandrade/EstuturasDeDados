package EstruturasII.modelo;

public class Vertice {
    private String nome;
    private boolean flagOrigemDestino = false;

    public Vertice(){
        this.nome = "v";
    }
    public Vertice(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public boolean isFlagOrigemDestino() {
        return flagOrigemDestino;
    }
    public void setFlagOrigemDestino(boolean flagOrigemDestino) {
        this.flagOrigemDestino = flagOrigemDestino;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Vertice)obj).getNome().equalsIgnoreCase(this.nome);
    }

}

