package Main.br.com.Raphael.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro("Fiat", "Uno", 1600);
        Carro meuCarro2 = new Carro("Honda", "HRV", 2025);
        Carro meuCarro3 = new Carro("BMW", "320i", 2026);
        Carro meuCarro4 = new Carro();
        Carro meuCarro5 = new Carro("Toyota", "Corolla", 2023);

        ArrayList<Carro>listaCarros = new ArrayList<>();
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

        /*
         * RESPOSTA DO EXERCÍCIO 8c:
         * Por que um método estático não pode acessar atributos de instância (como 'modelo')?
         * Porque o método estático pertence à classe (fábrica) e pode ser chamado mesmo
         * se nenhum carro tiver sido criado. A fábrica não sabe de qual carro está
         * pedindo o modelo, pois modelo só existe na memória quando instanciamos um
         * objeto específico.
         */

  }
}
