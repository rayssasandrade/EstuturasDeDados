package EstruturasII.Grafos;

public class Teste {
    public static void main(String[] args) throws Exception {
        Vertice vA = new Vertice("A");
        Vertice vB = new Vertice("B");
        Vertice vC = new Vertice("C");
        Vertice vD = new Vertice("D");
        Vertice vE = new Vertice("E");
        Vertice vF = new Vertice("F");
        Vertice vG = new Vertice("G");
        Vertice vH = new Vertice("H");
        Vertice vI = new Vertice("I");
        Vertice vJ = new Vertice("J");
        Aresta ab = new Aresta(3, 3, 3, vB);
        Aresta ad = new Aresta(2, 3, 2, vD);
        Aresta da = new Aresta(3, 2, 2, vA);
        Aresta dg = new Aresta(4, 2, 3, vG);
        Aresta de = new Aresta(2, 1, 1, vE);
        Aresta ed = new Aresta(2, 1, 2, vD);
        Aresta gh = new Aresta(1, 4, 1, vH);
        Aresta hi = new Aresta(2, 2, 1, vI);
        Aresta ij = new Aresta(2, 1, 3, vJ);
        Aresta ji = new Aresta(3, 1, 2, vI);
        Aresta iF = new Aresta(3, 1, 4, vF);
        Aresta fi = new Aresta(3, 1, 4, vI);
        Aresta bc = new Aresta(4, 3, 3, vC);
        Aresta cf = new Aresta(2, 3, 1, vF);
        Aresta be = new Aresta(2, 2, 2, vE);
        Aresta eb = new Aresta(3, 2, 1, vB);
        Aresta eh = new Aresta(3, 3, 3, vH);
        vA.add(ab);
        vA.add(ad);
        vB.add(bc);
        vB.add(be);
        vC.add(cf);
        vD.add(da);
        vD.add(de);
        vD.add(dg);
        vE.add(eb);
        vE.add(ed);
        vE.add(eh);
        vF.add(fi);
        vG.add(gh);
        vH.add(hi);
        vI.add(iF);
        vI.add(ij);
        vJ.add(ji);
        Grafo grafo = new Grafo();
        grafo.add(vA);
        grafo.add(vB);
        grafo.add(vC);
        grafo.add(vD);
        grafo.add(vE);
        grafo.add(vF);
        grafo.add(vG);
        grafo.add(vH);
        grafo.add(vI);
        grafo.add(vJ);
        try {
            grafo.menorCaminho(vA, vB);
            grafo.menorCaminho(vA, vC);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            grafo.menorCaminho(vA, vD);
            grafo.menorCaminho(vA, vE);
            grafo.menorCaminho(vA, vF);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            grafo.menorCaminho(vA, vG);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            grafo.menorCaminho(vA, vH);
            grafo.menorCaminho(vA, vI);
            grafo.menorCaminho(vA, vJ);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
