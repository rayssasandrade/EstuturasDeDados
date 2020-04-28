package EstruturasI.Exercicio;

import java.util.Objects;

public class Livro {
    private String nome;
    private String autor;
    private String isbn;
    private int anoDeLancamento;

    public Livro(String nome, String autor, String isbn, int anoDeLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return isbn == livro.isbn &&
                anoDeLancamento == livro.anoDeLancamento &&
                Objects.equals(nome, livro.nome) &&
                Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, autor, isbn, anoDeLancamento);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                ", anoDeLancamento=" + anoDeLancamento +
                '}';
    }
}
