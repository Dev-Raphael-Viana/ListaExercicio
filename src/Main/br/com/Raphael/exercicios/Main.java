package main.br.com.Raphael.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carro> listaCarros = new ArrayList<>();
        int opcao = 0;

        System.out.println("=== BEM-VINDO AO SISTEMA DE CONCESSIONÁRIA ===");

        while (opcao != 4) {
            System.out.println("\nMenu:");
            System.out.println("1) Cadastrar Carro");
            System.out.println("2) Listar todos");
            System.out.println("3) Total cadastrado");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Novo Cadastro ---");
                    System.out.print("Digite a marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Digite o ano de fabricação: ");
                    int ano = scanner.nextInt();

                    Carro novoCarro = new Carro(marca, modelo, ano);
                    listaCarros.add(novoCarro);
                    System.out.println("Carro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("--- Lista de Carros ---");
                    if (listaCarros.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado no sistema ainda.");
                    } else {
                        for (Carro c : listaCarros) {
                            c.exibir();
                        }
                    }
                    break;

                case 3:
                    System.out.println("--- Relatório ---");
                    System.out.println("Total de carros Cadastrado " + Carro.totalCarros);
                    break;

                case 4:
                    System.out.println("Encerrando o sistema... Até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}