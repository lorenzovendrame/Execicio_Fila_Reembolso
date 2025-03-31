package org.example;

public class Pedido {

    private long numeroPedido;
    private long numeroCompra;
    private String descricao;
    private boolean decisao;
    private String justificativa;

    public Pedido(long numeroPedido, long numeroCompra, String descricao) {
        this.numeroPedido = numeroPedido;
        this.numeroCompra = numeroCompra;
        this.descricao = descricao;
    }

    public Pedido() {
    }

    public long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public long getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(long numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDecisao() {
        return decisao;
    }

    public void setDecisao(boolean decisao) {
        this.decisao = decisao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    @Override
    public String toString() {
        return "Número do Pedido: " + numeroPedido + "\n" +
               "Número da Compra: " + numeroCompra + "\n" +
               "Descrição do Pedido: " + descricao;
    }
}
