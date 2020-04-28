package EstruturasII.Grafos;

import EstruturasI.CListaDupEncadeadaComSentinela.IndiceForaDosLimitesException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Grafo <T>{
    private HashMap<Object, Vertice> verticesMap;

    public Grafo(){
        this.verticesMap = new HashMap<Object, Vertice>();
    }

    public Grafo(ArrayList<Vertice> vertices){
        this();
        //this.verticesMap = new HashMap<Object, Vertice>();
        //this.vertices = new ArrayList<>();
        for(Vertice v : vertices )
        {
            this.verticesMap.put(v.getInfo(), v);
        }

    }
    
    public HashMap<Object, Vertice> getVertices() {
        return verticesMap;
    }

    public void add(Vertice v) {
        verticesMap.put(v.getInfo(), v);
    }

    public void removerVertice(T info){
        verticesMap.remove(info);
    }

    public Set<Object> verticeKeys() {
        return this.verticesMap.keySet();
    }

    public Vertice buscaVertice(T elemento)  {
        return verticesMap.get(elemento);
    }

    String caminho, caminhoAtual;
    int somaCaminho, somaCaminhoAtual;
    ArrayList<Vertice> vizitados = new ArrayList<>();

    public void menorCaminho(Vertice saida, Vertice destino) throws Exception {
        if (verticesMap.containsKey(saida.getInfo()) == true){
            inicializacao(saida);
            caminho1(saida, destino);
            if(somaCaminho!=Integer.MAX_VALUE){
                System.out.println(caminho);
            } else {
                throw new Exception("Não é possivel chegar ao destino com esta saida!");
            }
        } else {
            throw new Exception("Lugares não existentes!");
        }
    }

    public void inicializacao(Vertice saida){
        somaCaminhoAtual = 0;
        caminhoAtual = "";
        caminho = "";
        somaCaminho = Integer.MAX_VALUE;
        saida.inicializarVizitados();
    }

    public void caminho1(Vertice saida, Vertice destino) throws IndiceForaDosLimitesException {
        for (int i = 0; i < saida.getQtdArestas(); i++){
            caminhoAtual = caminhoAtual + saida.toString() + " -> " ;
            Aresta a = saida.getAresta(i);
            caminho2(saida, destino, a);
        }
    }

    public void caminho2(Vertice saida, Vertice destino, Aresta a) throws IndiceForaDosLimitesException {
        if (a.getDestino()==destino){
            // já que é o destino, somar o custo da aresta que ainda não foi adicionada.
            somaCaminhoAtual = somaCaminhoAtual + a.custo();
            //se a soma do caminho atual for menor que a soma do caminho que eu já tinha
            //faço a substituição
            if (somaCaminhoAtual < somaCaminho){
                somaCaminho = somaCaminhoAtual;
                caminho = caminhoAtual + a.getDestino().toString();
                somaCaminhoAtual = 0;
                caminhoAtual = "";
            }
        } else {
            //se o meu vértice não vizitou aquele destino ele vai vizitar
            if (!saida.foiVizitado(a.getDestino())){
                //adiciono esse destino a minha lista de vizitados do vertice que estou
                //já que vou vizitá-lo
                saida.addVizitados(a.getDestino());
                somaCaminhoAtual = somaCaminhoAtual + a.custo();
                caminho1(a.getDestino(), destino);
            }
        }
    }

    @Override
    public String toString() {
        return "Grafo{" +
                "vertices=" + verticesMap +
                '}';
    }

}
