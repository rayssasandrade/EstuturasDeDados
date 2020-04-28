package iojava;

import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = 1;
    private long mat;
    private String nome, fone, endereco, email;
    private double nota1;

    public long getMat() {
        return mat;
    }


    public void setMat(long mat) {
        this.mat = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getFone() {
        return fone;
    }


    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
