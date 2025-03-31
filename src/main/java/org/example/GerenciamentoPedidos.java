package org.example;

public class GerenciamentoPedidos {
    public Fila fila;
    long numberoPedido;

    public GerenciamentoPedidos(){
        fila = new Fila();
        numberoPedido = 0;
    };

    public void inserirPedidoFila(Pedido pedido){
        pedido.setNumeroPedido(++numberoPedido);
        fila.inserirNoInicio(pedido);
    }

    public void removerPedidoFila(boolean decisao, String justificativa){
        fila.removerNoFim(decisao, justificativa);
    }

    public void printarPedidos(){
        if (fila != null && fila.inicio != null){
            fila.printarFila();
        } else {
            System.out.println("Fila vazia!");
        }
    }
}
