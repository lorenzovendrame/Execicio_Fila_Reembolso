package org.example;

public class No { //Nó da lista encadeada
    public Pedido pedido;
    public No proximo;
    public No anterior;

    public No() {
        this.pedido = null;
        this.proximo = null;
        this.anterior = null;
    }

    public No(Pedido pedido) {
        this.pedido = pedido;
        this.proximo = null;
        this.anterior = null;
    }
}
