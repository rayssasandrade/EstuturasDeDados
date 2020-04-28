package EstruturasI.AV2;

public class Testes {
    public static void main(String[] args) {
        System.out.println("---------------------------LISTA-DUPLAMENTE-ENCADEADA-CIRCULAR---------------------------");
        System.out.println("Lista 1:");
        Pessoa pessoa01 = new Pessoa("Rayssa", "071", 20);
        Pessoa pessoa02 = new Pessoa("Akeu", "831", 18);
        Item item = new Item(1, pessoa01);
        Item item1 = new Item(2 , pessoa02);
        CListaDupEncadeada lista = new CListaDupEncadeada();
        try {
            lista.adicionar(item);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        try {
            lista.adicionar(item1);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(lista);
        System.out.println("qtd "+lista.getQtd());

        try {
            lista.remover(2);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(lista);

        try {
            System.out.println("cntém chave 1"+lista.contem(1));
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }

        Pessoa pessoa09 = new Pessoa( "jÔ", "51", 76);
        Pessoa pessoa10 = new Pessoa( "Carol", "523", 33);
        Item item8 = new Item(173, pessoa09);
        Item item9 = new Item(23, pessoa10);
        Item[] itens = new Item[2];
        itens[0]= item8;
        itens[1]= item9;
        System.out.println("Add vetor de 2 itens!");
        try {
            lista.AdicionarNoFinal(itens);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(lista);
        System.out.println("qtd "+lista.getQtd());
        System.out.println("Remvend chave 73 de um element add d vetr");
        try {
            lista.remover(73);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("(Nã encntrar!)");
        System.out.println("Remvend chave 173 de um element add d vetr");
        try {
            lista.remover(173);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("qtd "+lista.getQtd());
        System.out.println(lista);

        Pessoa pessoa03 = new Pessoa( "Ana", "651", 20);
        Pessoa pessoa04 = new Pessoa( "Pri", "811", 52);
        Pessoa pessoa05 = new Pessoa( "Manu", "161", 3);
        Pessoa pessoa06 = new Pessoa( "tamy", "71", 15);
        Pessoa pessoa07 = new Pessoa( "Alice", "051", 22);
        Pessoa pessoa08 = new Pessoa( "ka", "811", 82);
        Item item2 = new Item(73, pessoa03);
        Item item3 = new Item(03, pessoa04);
        Item item4 = new Item(04, pessoa05);
        Item item5 = new Item(05, pessoa06);
        Item item6 = new Item(06, pessoa07);
        Item item7 = new Item(07, pessoa08);
        CListaEncadeada lista2 = new CListaEncadeada();
        try {
            lista2.adicionar(item2);
            lista2.adicionar(item3);
            lista2.adicionar(item4);
            lista2.adicionar(item5);
            lista2.adicionar(item6);
            lista2.adicionar(item7);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Lista2 simpes encadeada com 6 elements:");
        System.out.println(lista2);
        System.out.println("qtd "+lista2.getQtd());

        System.out.println("Adicionando a lista 2 depois da primeira posição da lista 1: ");
        try {
            lista.AdicionarNoMeio(1,lista2);
        } catch (ListaException e){
            System.out.println(e.getMessage());
        }
        System.out.println("qtd "+lista.getQtd());
        System.out.println("é para ter 8");
        System.out.println(lista);

        System.out.println("Criando a lista dup encadeada 3 com os elementos da lista1 da psição 2 até a 5");
        ListaDupEncadeada lista3 = new ListaDupEncadeada();
        try {
            lista3.AdicionarNoFinal(lista2.getSubLista(2,5));
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("qtd "+lista3.getQtd());
        System.out.println(lista3);
        System.out.println("é para ter 4");

        System.out.println("Adicionando a lista 3 a lista 1: ");
        try {
            lista.AdicionarNoFinal(lista3);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("qtd"+lista.getQtd());
        System.out.println("é para ter 12");
        System.out.println(lista);

        try {
            System.out.println("qtd de eements do item2: "+ lista.getQtdElementos(item2));
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("é para ter 1");

        try {
            System.out.println("qtd de eements do item3: "+ lista.getQtdElementos(item3));
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("é para ter 2");
        System.out.println("Remver dupicads");
        try {
            lista.removerDuplicados();
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("qtd"+lista.getQtd());
        System.out.println(lista);
        System.out.println("é para ficar: 8");

        System.out.println("--------------------------CIRCUAR-LISTA-ENCADEADA------------------------------------");
        System.out.println("Lista 1 cm 2 eements:");
        CListaEncadeada listaEncadeada = new CListaEncadeada();
        try {
            listaEncadeada.adicionar(item);
            listaEncadeada.adicionar(item1);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(listaEncadeada);
        System.out.println("QTD: "+listaEncadeada.getQtd());
        System.out.println("remvend cm chave 0, nã existente");
        try {
            listaEncadeada.remover(0);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("métd cntem cm chave nula");
        try {
            System.out.println(listaEncadeada.contem(null));
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("add ista de vetr cm 2 itens");
        try {
            listaEncadeada.AdicionarNoFinal(itens);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(listaEncadeada);
        System.out.println("qtd: "+listaEncadeada.getQtd());
        try {
            listaEncadeada.AdicionarNoFinal(lista2);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Adicinand utra tipo ista cm 6 eements!");
        System.out.println(listaEncadeada);
        System.out.println(listaEncadeada.getQtd());
        System.out.println("add depis da chave 173 ista cm 4 eements");
        try {
            listaEncadeada.AdicionarNoMeio(173,lista3);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(listaEncadeada);
        System.out.println("qtd "+listaEncadeada.getQtd());
        System.out.println("é para ter 14");
        try {
            listaEncadeada.adicionar(item2);
            listaEncadeada.adicionar(item2);
            listaEncadeada.adicionar(item1);
            listaEncadeada.adicionar(item2);
            listaEncadeada.adicionar(item);
            listaEncadeada.adicionar(item);
            listaEncadeada.adicionar(item2);
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Add 4 eements repetids");
        System.out.println("qtd "+listaEncadeada.getQtd());
        System.out.println("é para ter 18");
        try {
            System.out.println("qtd eements item2: "+ listaEncadeada.getQtdElementos(item2));
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("é para ter: 5");
        try {
            listaEncadeada.removerDuplicados();
        } catch (ListaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Remvend dupicads ");
        System.out.println(listaEncadeada);
        System.out.println("qtd "+listaEncadeada.getQtd());
        System.out.println("é para ter 10");
    }
}
