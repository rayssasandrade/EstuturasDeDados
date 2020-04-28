package EstruturasII.ArvoreAVL;

import EstruturasII.ArvoreBinaria.ArvoreVaziaException;
import EstruturasII.ArvoreBinaria.InvalidPositionException;

public class ArvoreAVL<T>{
    private No raiz;
    private int totalElementos;

    public ArvoreAVL(){

    }

    public ArvoreAVL(No raiz) {
        this.raiz = raiz;
    }

    public int tamanho() {
        return this.totalElementos;
    }

    public boolean estaVazia() {
        return raiz==null;
    }

    public boolean eInterno(No no) throws InvalidPositionException {
        if (!temDireita(no)||!temEsquerda(no)){
            return true;
        }
        return false;
    }

    public boolean isRaiz(No no){
        if(no.equals(this.raiz)){
            return true;
        }
        return false;
    }

    private boolean temEsquerda(No no) {
        if (no.getEsq()!=null){
            return true;
        }
        return false;
    }

    private boolean temDireita(No no) {
        if (no.getDir()!=null){
            return true;
        }
        return false;
    }

    public No raiz() throws ArvoreVaziaException {
        if (this.raiz!=null){
            return this.raiz;
        }
        throw new ArvoreVaziaException("Árvore vazia!");
    }

    private int altura(No no) {
        if (no==null){
            return (-1);
        } else {
            return no.getH();
        }
    }

    private int max(int a, int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }

    private No balanDireita(No no){
        No aux = no.getEsq();
        no.setEsq(aux.getDir());
        aux.setDir(no);
        if (isRaiz(no)){
            this.raiz = aux;
        }
        no.setH(max(altura(no.getDir()), altura(no.getEsq())+1));
        aux.setH(max(altura(aux.getEsq()), no.getH()+1));
        return aux;
    }

    private No balanEsquerda(No no){
        No aux = no.getDir();
        no.setDir(aux.getEsq());
        aux.setEsq(no);
        if (isRaiz(no)){
            this.raiz = aux;
        }

        no.setH(max(altura(no.getDir()), altura(no.getEsq())+1));
        aux.setH(max(altura(aux.getDir()), no.getH())+1);
        return aux;
    }

    private No balanEsquerdaDireita(No no){
        no.setEsq(balanEsquerda(no.getEsq()));
        return balanDireita(no);
    }

    private No balanDireitaEsquerda(No no){
        no.setDir(balanDireita(no.getDir()));
        return balanEsquerda(no);
    }

    public void inserir(T i){
        if(estaVazia()){
            raiz= new No();
            raiz.setInfo((Comparable) i);
            totalElementos++;
        } else {
            inserir(raiz, i);
        }
    }

    private No inserir(No no, T i){
        if (no == null){
            this.totalElementos++;
            return new No((Comparable) i);
        }
        if (no.getInfo().compareTo(i) > 0){
            no.setEsq(inserir(no.getEsq(), i));
            if (((altura(no.getEsq()))-(altura(no.getDir()))) == 2){
                if (((Comparable) i).compareTo(no.getEsq().getInfo()) > 0){
                    no = balanDireita(no);
                } else {
                    no = balanEsquerdaDireita(no);
                }
            }
        } else {
            if (no.getInfo().compareTo(i) < 0){
                no.setDir(inserir(no.getDir(),i));
            }
            if (((altura(no.getDir()))-(altura(no.getEsq())) == 2)){
                if (((Comparable) i).compareTo(no.getDir().getInfo()) > 0){
                    no = balanEsquerda(no);
                } else {
                    no = balanDireitaEsquerda(no);
                }
            }

        }
        no.setH(max(altura(no.getEsq()), altura(no.getDir())) +1);
        return no;
    }

//    public void emOrdem(ArvorePrint aPrint){
//        emOrdem(raiz, aPrint);
//    }
//    private void emOrdem(No no, ArvorePrint aPrint){
//        if(no!= null){
//            emOrdem(no.getEsq(), aPrint);
//            //System.out.println(no.getInfo());
//            if (aPrint.print(no.getInfo())) {
//                emOrdem(no.getDir(), aPrint);
//            }
//        }
//    }

    public void emOrdem(){
        emOrdem(raiz);
    }
    private void emOrdem(No no){
        if(no!= null){
            emOrdem(no.getEsq());
            System.out.println(no.getInfo());
            emOrdem(no.getDir());
        }
    }

    public boolean contem(T i){
        if (raiz.getInfo().equals(i)){
            return true;
        } else {
            int aux = -1;
            contem(raiz, i, aux).equals(i);
            if(aux==0){
                return true;
            }
            return false;
        }
    }
    private No contem(No no, T i, int aux){
        if(no!=null){
            if(no.getInfo().compareTo(i) < 0) {
                if (no.getInfo().equals(i)) {
                    aux=0;
                } else {
                    contem(no.getDir(), i, aux);
                }
            } else {
                if (no.getInfo().equals(i)) {
                    aux=0;
                } else {
                    contem(no.getEsq(), i, aux);
                }
            }
        }
        return no;
    }

    protected String exibirAtual(No no){
        return no.toString();
    }

    protected No buscarPai(No no){
        No atual = this.raiz;
        No pai = null;
        while (atual!=null){
            if (atual.getInfo().equals(no.getInfo())){
                return pai;
            }
            pai = atual;
            if (atual.getInfo().compareTo(no.getInfo()) < 0){
                atual = atual.getDir();
            } else {
                atual = atual.getEsq();
            }
        }
        return null;
    }

//    protected No buscarNo(No no, T i){
//        No atual = this.raiz;
//        while (atual!=null){
//            if (atual.getInfo().equals(i)){
//                return atual;
//            }
//            if (atual.getInfo().compareTo(i) < 0){
//                atual = atual.getDir();
//            } else {
//                atual = atual.getEsq();
//            }
//        }
//        return null;
//    }

//    public No remover(T i) throws Exception {
//        if (totalElementos!=0){
//            No pai = null, no = null, paiSubs= null, Substituto = null;
//            no = buscarNo(i);
//            pai = buscarPai(i);
//            if (no==null){
//                throw new Exception("Elemento não encontrado!");
//            }
//            if (!temEsquerda(no) || !temDireita(no)){
//                if (!temEsquerda(no)){
//                    Substituto = no.getDir();
//                } else {
//                    Substituto = no.getEsq();
//                }
//            } else {
//                paiSubs = no;
//                paiSubs = no;
//                Substituto = no.getEsq();
//                while (Substituto.getDir()!=null){
//                    paiSubs = Substituto;
//                    Substituto = Substituto.getDir();
//                }
//                if (paiSubs!=no){
//                    paiSubs.setDir(Substituto.getEsq());
//                    Substituto.setEsq(no.getEsq());
//                }
//                Substituto.setDir(no.getDir());
//            }
//            if (pai==null) {
//                no = null;
//                totalElementos--;
//                System.out.println("removido com sucesso!");
//                this.raiz = Substituto;
//                return Substituto;
//            }
//            if (pai.getInfo().compareTo(i) < 0){
//                pai.setDir(Substituto);
//            } else {
//                pai.setEsq(Substituto);
//            }
//            no = null;
//            totalElementos--;
//            System.out.println("removido com sucesso!");
//            return raiz;
//        } throw new Exception("Árvore vazia!");
//    }

    protected No buscarNo(No atual){
        No no1 = atual;
        No no2 = atual.getEsq();
        while (no2!=null){
            no1 = no2;
            no2 = no2.getEsq();
        }
        return no1;
    }

//    public No deletar(No no){
//        No atual = this.raiz;
//        No pai = raiz;
//        while (atual!=null){
//            if (atual.equals(no)){
//                pai.
//                return pai;
//            }
//            pai = atual;
//            if (atual.getInfo().compareTo(no.getInfo()) < 0){
//                atual = atual.getDir();
//            } else {
//                atual = atual.getEsq();
//            }
//        }
//        return null;
//    }

    public void remover(T i) throws Exception{
        if (raiz!=null){
            remover(raiz, i);
//            deletar(oldNo);
            totalElementos--;
        } else {
            throw new Exception("Árvore vazia!");
        }
    }

    No oldNo;
    private int remover(No no, T i){
        if (no == null){
            System.out.println("Não existe!");
            return 0;
        }
        int res = 0;
        if (no.getInfo().compareTo(i) > 0){
            if((res = remover(no.getEsq(),i)) == 1){
                if (((altura(no.getEsq()))-(altura(no.getDir()))) >= 2){
                    if (altura(no.getDir().getEsq())<=altura(no.getDir().getDir())){
                        balanEsquerda(no);
                    } else {
                        balanDireitaEsquerda(no);
                    }
                }
            }
        } else if (no.getInfo().compareTo(i) < 0){
                if((res = remover(no.getDir(),i)) == 1){
                    if (((altura(no.getDir()))-(altura(no.getEsq())) >= 2)){
                        if (altura(no.getEsq().getDir())<=altura(no.getEsq().getEsq())){
                            balanDireita(no);
                        } else {
                            balanEsquerdaDireita(no);
                        }
                    }
                }
        } else {
            if (!temEsquerda(no) || !temDireita(no)){ //Só tem 1 filho
                oldNo = no;
                if (no.getEsq()!= null){
                    no = no.getEsq();
                } else if(no.getDir()!= null){
                    no = no.getDir();
                }
                oldNo = null;
            } else { //tem 2 filhos
                No temp = buscarNo(no.getDir());
                no.setInfo(temp.getInfo());
                remover(no.getDir(),(T) no.getInfo());
                if (((altura(no.getDir()))-(altura(no.getEsq())) >= 2)){
                    if (altura(no.getEsq().getDir())<=altura(no.getEsq().getEsq())){
                        balanDireita(no);
                    } else {
                        balanEsquerdaDireita(no);
                    }
                }
            }
            if (no!=null){
                no.setH(max(altura(no.getEsq()), altura(no.getDir())) +1);
            }
            return 1;
        }
        no.setH(max(altura(no.getEsq()), altura(no.getDir())) +1);
        return res;
    }
}
