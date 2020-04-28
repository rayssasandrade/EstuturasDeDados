package EstruturasII.ArvoreBinaria;

public interface InterfaceArvoreBinaria<T>{
    int tamanho();
    boolean estaVazia();
    void emOrdem();
    void inserir(T i);
//    void exibir();
    boolean eInterno(No no) throws InvalidPositionException;

}
