package main.br.com.Raphael.delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pedido> listaPedidos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== DELIVERY DA CAMILA  ===");
            System.out.println("1 - Registrar novo pedido");
            System.out.println("2 - Listar pedidos do dia");
            System.out.println("3 - Fechar o caixa (Ver totais)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("\n-- Novo Pedido --");

                System.out.print("Nome do cliente: ");
                String nome = scanner.nextLine();

                System.out.print("Descrição da marmita (ex: Frango grelhado): ");
                String descricao = scanner.nextLine();

                System.out.print("Tamanho (P, M ou G): ");
                String tamanho = scanner.nextLine();

                Marmita marmita = new Marmita(descricao, tamanho);
                Pedido novoPedido = new Pedido(nome, marmita);
                listaPedidos.add(novoPedido);

                System.out.println("Pedido registrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n-- Pedidos do Dia --");
                if (listaPedidos.isEmpty()) {
                    System.out.println("Nenhum pedido foi registrado ainda.");
                } else {
                    for (Pedido p : listaPedidos) {
                        System.out.println(p.toString());
                    }
                }

            } else if (opcao == 3) {
                System.out.println("\n-- Fechamento do Caixa --");
                System.out.println("Total de pedidos vendidos: " + Pedido.getTotalPedidos());
                System.out.println("Valor total arrecadado: R$ " + Pedido.getValorTotalVendido());

            } else if (opcao == 0) {
                System.out.println("\nEncerrando o sistema... Bom descanso!");
            } else {
                System.out.println("\nOpção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}