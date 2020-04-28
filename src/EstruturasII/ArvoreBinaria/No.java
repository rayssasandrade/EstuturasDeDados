package EstruturasII.ArvoreBinaria;

import java.io.Serializable;

public class No<T extends Comparable> implements Serializable {
    private static final long serialVersionUID = 1;
    private T info;
    private No<T> dir, esq, pai;

    public No() {
    }
    public No(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public No<T> getDir() {
        return dir;
    }
    public void setDir(No dir) {
        this.dir = dir;
    }
    public No<T> getEsq() {
        return esq;
    }
    public void setEsq(No esq) {
        this.esq = esq;
    }
    public No<T> getPai() {
        return pai;
    }
    public void setPai(No pai) {
        this.pai = pai;
    }

    public String toString(){
        return "" + info;
    }
}
