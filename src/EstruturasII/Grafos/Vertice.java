package EstruturasII.Grafos;

import EstruturasI.CListaDupEncadeadaComSentinela.IndiceForaDosLimitesException;
import EstruturasI.CListaDupEncadeadaComSentinela.ListaVaziaException;

import java.util.ArrayList;
import java.util.HashMap;

public class Vertice<T> {
    private T info;
    private HashMap<Vertice, Aresta> adjacentes = new HashMap<Vertice, Aresta>();
    private ArrayList<Aresta> arestas;
    private ArrayList<Vertice> vizitados = new ArrayList<>();
    private int cont;

    public Vertice(){
    }

    public Vertice(T info) {
        this.info = info;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    public boolean foiTudo(){
        if (getCont()==getQtdArestas()-1){
            return true;
        }
        return false;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void inicializarVizitados(){
        for (int i = 0; i < vizitados.size() ; i++) {
            vizitados.set(i, null);
        }
    }

    public void add(Aresta aresta){
        if (arestas == null){
            this.arestas = new ArrayList<>();
            this.arestas.add(aresta);
        } else {
            this.arestas.add(aresta);
        }
    }

    public int distanciaProx(Vertice v) throws Exception {
        for (int i = 0; i < arestas.size() ; i++) {
            if (arestas.get(i).getDestino()==v){
                return arestas.get(i).custo();
            }
        }
        throw new Exception("Não tem próximo!");
    }

    public void removerAresta(int indice) throws ListaVaziaException, IndiceForaDosLimitesException {
        this.arestas.remove(indice);
        System.out.println("removida!");
    }

    public Aresta getAresta(int indice) throws IndiceForaDosLimitesException {
        return this.arestas.get(indice);
    }

    public boolean temArestas(){
        if (arestas!=null){
            return true;
        }
        return false;
    }

    public int getQtdArestas(){
        return this.arestas.size();
    }

    public boolean equals(Object vertice2)
    {
        if( !(vertice2 instanceof Vertice))
            return false;

        Vertice v = (Vertice) vertice2;
        return this.arestas.equals(v.arestas);
    }

    public void addVizitados(Vertice v) {
        vizitados.add(v);
    }

    public boolean todosVizitados(){
        if(vizitados.size()==getQtdArestas()){
            return true;
        }
        return false;
    }

    public ArrayList<Vertice> getVizitados() {
        return vizitados;
    }

    public void setVizitados(ArrayList<Vertice> vizitados) {
        this.vizitados = vizitados;
    }

    @Override
    public String toString() {
        return (String) this.info;
    }

    public HashMap<Vertice, Aresta> getAdjacentes() {
        return adjacentes;
    }

    public boolean foiVizitado(Vertice v) {
        for (int i = 0; i < vizitados.size() ; i++) {
            if(vizitados.get(i)==v){
                return true;
            }
        }
        return false;
    }
}