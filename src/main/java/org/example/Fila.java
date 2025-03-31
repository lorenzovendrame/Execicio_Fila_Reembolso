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
            fim.anterior = novoNo;
            //inicio.anterior = null;
            inicio.proximo = novoNo;
            //fim.proximo = null;
        } else {
            if (inicio != null) {
                inicio.anterior = novoNo;
                novoNo.proximo = inicio;
                inicio = novoNo;
            }
        }
    }

    /*public void inserirNoFinal(Pedido pedido) {//Nao faz sentido
        No novoNo = new No(pedido);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No temp = cabeca;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
        }
    }*/

    /*public boolean removerNoInicio() {//Nao faz sentido
        if (inicio == null) {
            System.out.println("Fila vazia");
            return false;
        } else {
            System.out.println(inicio.pedido.toString());
            inicio = inicio.proximo;
            return true;
        }
    }*/

    public No fim(){
        return fim;
    }

    public boolean removerNoFim(boolean decisao, String justificativa) {
        if (fim == null) {
            System.out.println("Fila vazia");
            return false;
        } else {
            fim.pedido.setDecisao(decisao);
            fim.pedido.setJustificativa(justificativa);
            System.out.println(fim.pedido.toString());
            No penultimo = fim.anterior;
            fim = fim.anterior;
            if (fim != null) {
                fim.anterior = penultimo.anterior;
            }
            return true;
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
