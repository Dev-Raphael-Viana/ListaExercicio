package main.br.com.Raphael.lanchonete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo Seu Jorge");
        List<Lanche> listaLanches = new ArrayList<Lanche>();
        List<Pedidos> listaPedidos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean controle = true;

        do {
            System.out.println("\nEscolha uma opção do Menu");
            System.out.println("1 - Cadastrar lanche");
            System.out.println("2 - Registrar pedido");
            System.out.println("3 - Consultar quantidade pedidos feitos");
            System.out.println("4 - Consultar pedidos feitos");
            System.out.println("5 - Encerrar o programa");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    cadastrarLanche(listaLanches, sc);
                    break;
                case 2:
                    registrarPedido(listaLanches, sc, listaPedidos);
                    break;
                case 3:
                    consultarQuantidadePedidos();
                    break;
                case 4:
                    mostrarPedidos(listaPedidos);
                    break;
                case 5:
                    controle = false;
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (controle);

        sc.close();
    }

    private static void mostrarPedidos(List<Pedidos> listaPedidos) {
        System.out.println("\n===========Lista de pedidos===========");
        if (listaPedidos.isEmpty()) {
            System.out.println("Nenhum pedido foi feito ainda.");
        } else {
            for (Pedidos pedido : listaPedidos) {
                System.out.println(pedido.getLanche().getNome() + " - R$ " + pedido.getLanche().getPreco());
            }
        }
        System.out.println("======================================");
    }

    private static void consultarQuantidadePedidos() {
        System.out.println("\nQuantidade de pedidos: " + Pedidos.NUMERO_PEDIDOS);
    }

    private static void registrarPedido(List<Lanche> listaLanches, Scanner sc, List<Pedidos> listaPedidos) {
        if (listaLanches.isEmpty()) {
            System.out.println("\nErro: Nenhum lanche cadastrado no sistema ainda! Vá na opção 1 primeiro.");
            return;
        }

        System.out.println("\nEscolha o lanche pelo número:");
        int contador = 1;
        for(Lanche l : listaLanches) {
            System.out.println(contador + " - " + l.getNome());
            contador++;
        }

        int escolha = sc.nextInt();
        sc.nextLine();

        int indiceEscolhido = escolha - 1;

        if (indiceEscolhido >= 0 && indiceEscolhido < listaLanches.size()) {
            Pedidos pedido = new Pedidos();
            pedido.setLanche(listaLanches.get(indiceEscolhido));
            listaPedidos.add(pedido);
            System.out.println("Pedido registrado com sucesso!");
        } else {
            System.out.println("\nErro: Opção inválida! Pedido cancelado.");
        }
    }

    private static void cadastrarLanche(List<Lanche> listaLanches, Scanner sc) {
        Lanche lanche = new Lanche();
        System.out.println("\nDigite o lanche que deseja cadastrar: ");
        lanche.setNome(sc.nextLine());
        System.out.println("Digite o preço do lanche: ");
        lanche.setPreco(sc.nextDouble());
        sc.nextLine();

        listaLanches.add(lanche);
        System.out.println("Lanche cadastrado com sucesso!");
    }
}
