package Main.br.com.Raphael.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro("Fiat", "Uno", 1600);
        Carro meuCarro2 = new Carro("Honda", "HRV", 2025);
        Carro meuCarro3 = new Carro("BMW", "320i", 2026);
        Carro meuCarro4 = new Carro();
        Carro meuCarro5 = new Carro("Toyota", "Corolla", 2023);

        ArrayList<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(meuCarro1);
        listaCarros.add(meuCarro2);
        listaCarros.add(meuCarro3);
        listaCarros.add(meuCarro4);
        listaCarros.add(meuCarro5);

        System.out.println("--- Imprimindo a lista com for-each ---");
        for (Carro carroDaVez : listaCarros) {
            carroDaVez.exibir();
        }
        System.out.println("\n--- Total de Carros na Fábrica ---");
        Carro.imprimirTotal();

        System.out.println("\n--- Exercício 14: Sobrecarga na classe Cliente ---");

        Cliente cliente1 = new Cliente("Raphael", "raphael@email.com", "99999-1111");
        Cliente cliente2 = new Cliente("Jaqueline", "Jaqueline@email.com");
        Cliente cliente3 = new Cliente("João");
        cliente1.exibir();
        cliente2.exibir();
        cliente3.exibir();
        System.out.println("Total de clientes cadastrados: " + Cliente.totalClientes);

    }
}
