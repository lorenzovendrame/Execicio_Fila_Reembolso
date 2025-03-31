package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciamentoPedidos gp = new GerenciamentoPedidos();
        while (true){

            //Display do menu no console
            System.out.println("==============================");
            System.out.println("|    SISTEMA DE REEMBOLSO    |");
            System.out.println("==============================");
            System.out.println("| Opções :                   |");
            System.out.println("|      1. Adicionar Pedido   |");
            System.out.println("|      2. Decisão Próx Pedido|");
            System.out.println("|      3. Imprimir Pedidos   |");
            System.out.println("|      4. Sair               |");
            System.out.println("==============================");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    Scanner adicionarPedido = new Scanner(System.in);
                    System.out.println("Digite o número da Compra: ");
                    long numCompra = adicionarPedido.nextLong();
                    System.out.println("Digite a descrição do Pedido: ");
                    String descricao = adicionarPedido.next();
                    Pedido pedido = new Pedido(gp.numberoPedido, numCompra, descricao);
                    gp.inserirPedidoFila(pedido);
                    break;
                case 2:
                    if (gp.fila != null && gp.fila.fim() != null) {
                        Scanner decisaoPedido = new Scanner(System.in);
                        System.out.println("Aprova Reembolso do Pedido ? Sim (s) ou Não (n)");
                        String decisao = decisaoPedido.next();
                        boolean decisaoBoolean;
                        if (decisao.equals("sim") || decisao.equals("s")) {
                            decisaoBoolean = true;
                        }
                        else if (decisao.equals("não") || decisao.equals("nao") || decisao.equals("n")) {
                                decisaoBoolean = false;
                        }
                        else {
                            decisaoBoolean = false;
                            System.out.println("Decisão não reconhecida! Atribuindo como falso");
                        }
                        String justificativa = null;
                        Scanner justificativaScan = new Scanner(System.in);
                        if (!decisaoBoolean) {
                            System.out.println("Escreva sua justificativa: ");
                            justificativa = justificativaScan.nextLine();
                        }
                        gp.removerPedidoFila(decisaoBoolean, justificativa);
                    } else {
                        System.out.println("Fila vazia!");
                    }
                    break;
                case 3:
                    gp.printarPedidos();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma escolha válida!");
                    break;
            }
        }
    }
}