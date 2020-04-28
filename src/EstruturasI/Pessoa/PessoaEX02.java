package EstruturasI.Pessoa;
import java.util.Objects;

public class PessoaEX02 {
    private Integer idade;
    private String nome;
    private String CPF;

    public PessoaEX02(String nome, String CPF, Integer idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        this.idade++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaEX02 that = (PessoaEX02) o;
        return CPF.equals(that.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF);
    }

    public String toString() {
        return "Estrutura_1.Pessoa[" +
                "nome: '" + nome + '\'' +
                ", CPF: '" + CPF + '\'' +
                ", idade: " + idade + '\'' +
                ']';
    }

}
