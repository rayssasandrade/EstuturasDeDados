package Jogo;
import EstruturasII.ArvoreBinaria.Arvore;
import EstruturasII.ArvoreBinaria.ArvoreVaziaException;
import EstruturasII.ArvoreBinaria.InvalidPositionException;
import EstruturasII.ArvoreBinaria.No;
import com.google.gson.reflect.TypeToken;
import iojava.IOJson;

import javax.swing.*;
import java.io.Serializable;
import java.lang.reflect.Type;


public class Jogo implements Serializable {
    public static void main(String[] args){
        String path = "C:\\Users\\Rayssa\\IdeaProjects\\EstruturasDeDados\\src\\Jogo\\jogo.json";
        Arvore<String> arvore = new Arvore<>();
        IOJson iOJson = new IOJson();
        if (path==null){
            try {
                iOJson.write(arvore);
            } catch (Exception e){
                e.getMessage();
            }
        } else {
            try {
                iOJson = new IOJson(path);
                Type type = new TypeToken<Arvore<String>>(){}.getType();
                arvore = (Arvore<String>)iOJson.read(type);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
            int opJogar;
            do {
                opJogar = JOptionPane.showConfirmDialog(null, "Jogar?", "Escolha", JOptionPane.YES_NO_OPTION);
                if (opJogar == JOptionPane.YES_OPTION) {
                    if (arvore.estaVazia()){
                        String pergunta = JOptionPane.showInputDialog("Entre com uma pergunta: ");
                        arvore.inserir(pergunta);
                        String respostaErrada = JOptionPane.showInputDialog("Entre com uma resposta incorreta: ");
                        try {
                            arvore.inserirEsq(arvore.raiz(), respostaErrada);
                        } catch (ArvoreVaziaException e){
                            System.out.println(e.getMessage());
                        }
                        String respostaCorreta = JOptionPane.showInputDialog("Entre com uma resposta correta: ");
                        try {
                            arvore.inserirDir(arvore.raiz(), respostaCorreta);
                        } catch (ArvoreVaziaException e){
                            System.out.println(e.getMessage());
                        }
                    } else {
                        int msgPense = JOptionPane.showConfirmDialog( null, "Pense em algo! Ok?", "", JOptionPane.OK_CANCEL_OPTION);
                        if (msgPense == JOptionPane.OK_OPTION){
                            try{
                                No atual = arvore.raiz();
                                while(!arvore.eInterno(atual)){
                                    int op = JOptionPane.showConfirmDialog(null, atual.getInfo(), "Escolha", JOptionPane.YES_NO_OPTION);
                                    if (op == JOptionPane.YES_OPTION) {
                                        atual = atual.getDir();
                                    } else {
                                        atual = atual.getEsq();
                                    }
                                }
                                int msgAdvinhada = JOptionPane.showConfirmDialog(null, "O que você pensou foi "+arvore.exibirAtual(atual)+"? ", "", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
                                if (msgAdvinhada == JOptionPane.YES_OPTION){
                                    JOptionPane.showMessageDialog(null, "Eu não erro!");
                                } else {
                                    JOptionPane.showMessageDialog(null, "A máquina errou! :( ");
                                    String pergunta2 = JOptionPane.showInputDialog("Entre com outra pergunta: ");
                                    arvore.inserirEsqTroca(atual,pergunta2);
                                    String resposta2 = JOptionPane.showInputDialog("Entre com uma resposta correta: ");
                                    arvore.inserirDir(atual, resposta2);
                                }
                            } catch (ArvoreVaziaException | InvalidPositionException e) {
                                System.out.println(e.getMessage());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Jogo cancelado! :( ");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Fim do jogo!");
                }
            } while (opJogar == JOptionPane.YES_OPTION);
            try {
                iOJson.write(arvore);
            } catch (Exception e){
                e.getMessage();
            }
    }
}