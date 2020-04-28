package EstruturasII.ArvoreAVL;

import java.io.Serializable;

public class No<T extends Comparable> implements Serializable {
    private T info;
    private No<T> dir, esq;
    private int h;

    public No(){
    }
    public No(T info) {
        this.info = info;
        this.h = 0;
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
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    public String toString(){
        return "" + info;
    }
}
