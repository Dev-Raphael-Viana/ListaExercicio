package main.br.com.Raphael.estacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento();
        boolean rodando = true;

        System.out.println("=== SISTEMA DE ESTACIONAMENTO DO CARLÃO ===");

        do {
            System.out.println("\n1 - Registrar Entrada de Veículo");
            System.out.println("2 - Registrar Saída de Veículo");
            System.out.println("3 - Consultar Status de Vagas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Modelo do carro: ");
                    String modelo = sc.nextLine();
                    System.out.print("Placa do carro: ");
                    String placa = sc.nextLine();

                    Veiculo novoVeiculo = new Veiculo(placa, modelo);
                    estacionamento.registrarEntrada(novoVeiculo);
                    break;

                case 2:
                    System.out.print("Digite a placa do carro que está saindo: ");
                    String placaSaida = sc.nextLine();
                    estacionamento.registrarSaida(placaSaida);
                    break;

                case 3:
                    estacionamento.exibirStatus();
                    break;

                case 4:
                    rodando = false;
                    System.out.println("Fechando o estacionamento. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (rodando);

        sc.close();
    }
}