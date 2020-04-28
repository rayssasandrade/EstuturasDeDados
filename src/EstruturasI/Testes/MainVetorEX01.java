package EstruturasI.Testes;

public class MainVetorEX01 {
    public static void main(String[] args) {
        System.out.println("Entre com o tamanho do vetor: ");
        VetorEX01 vetor = new VetorEX01();
        vetor.InserirElementos(0);

        System.out.println("Soma: ");
        vetor.SomarVetor(0);
        System.out.println(vetor.soma);

        System.out.println("Multiplicação: ");
        vetor.MultiplicarVetor(0);
        System.out.println(vetor.multiplicar);

        System.out.println("Imprimir Vetor: ");
        vetor.ImprimirVetor(0);

    }
}
