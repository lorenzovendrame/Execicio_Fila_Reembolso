package org.example;

public class Fila {

    public No inicio;
    public No fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public void inserirNoInicio(Pedido pedido) {
        No novoNo = new No(pedido);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
            //fim.anterior = novoNo;
            //inicio.anterior = null;
            //inicio.proximo = novoNo;
            //fim.proximo = null;
        } else {
            /*inicio.anterior = novoNo;
            novoNo.proximo = inicio;
            inicio = novoNo;*/
            inicio.anterior = novoNo;
            novoNo.proximo = inicio;
            inicio = novoNo;
        }
    }

    public No fim(){
        return fim;
    }

    public void removerNoFim(boolean decisao, String justificativa) {
        if (fim == null) {
            System.out.println("Fila vazia");
        } else {
            fim.pedido.setDecisao(decisao);
            fim.pedido.setJustificativa(justificativa);
            System.out.println(fim.pedido.toString() + "\nDecisão: " + decisao + "\nJustificativa: " + justificativa);
            //No penultimo = fim.anterior;
            if (fim.pedido == inicio.pedido) {
                inicio = null;
            }
            fim = fim.anterior;
            if (fim != null) {
                //fim.anterior = penultimo.anterior;
                fim.proximo = null;
            }
        }
    }

    public void printarFila() {
        No temp = inicio;
        while (temp != null) {
            System.out.println(temp.pedido.toString() + "\n\n");
            temp = temp.proximo;
        }
        System.out.println();
    }
}
