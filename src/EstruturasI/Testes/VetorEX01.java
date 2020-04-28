package EstruturasI.Testes;

import java.util.Scanner;

public class VetorEX01 {
    Scanner entrada = new Scanner(System.in);
    int[] elementos;
    int soma;
    int multiplicar = 1;

    public VetorEX01() {
        TamanhoVetor();
    }

    public void TamanhoVetor(){
        this.elementos = new int[entrada.nextInt()];
    }

    public void lerElementos(int x){
        System.out.println("Entre com o elemento: ");
        this.elementos[x] = entrada.nextInt();
    }

    public void InserirElementos(int x){
        if (x < this.elementos.length){
            lerElementos(x);
            InserirElementos(++x);
        }
    }

    public int SomarVetor(int x){
        if (x >= this.elementos.length){
            return this.soma;
        } else {
            this.soma += this.elementos[x];
            return SomarVetor(++x);
        }
    }

    public int MultiplicarVetor(int x){
        if (x >= this.elementos.length){
            return this.multiplicar;
        } else {
            this.multiplicar *= this.elementos[x];
            return MultiplicarVetor(++x);
        }
    }

    public int ImprimirVetor(int x){
        if(x < this.elementos.length){
            System.out.println(this.elementos[x]);
            return ImprimirVetor(++x);
        } else {
            return 0;
        }
    }
}
