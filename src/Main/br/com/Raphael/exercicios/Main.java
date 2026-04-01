package Main.br.com.Raphael.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro("Fiat", "Uno", 2012);
        Carro meuCarro2 = new Carro("Honda", "HRV", 2025);
        Carro meuCarro3 = new Carro("BMW", "320i", 1600);
        Carro meuCarro4 = new Carro();

        /*
         * Comentário do Exercício 6c: O que muda entre os dois?
         * O construtor parametrizado já cria o objeto com os dados reais preenchidos (carros 1, 2 e 3).
         * O construtor sem parâmetros cria o objeto com valores padrão genéricos (carro 4).
         * A sobrecarga nos dá essas duas opções de "fabricar" o objeto.
         */

        ArrayList<Carro>listaCarros = new ArrayList<>();
        listaCarros.add(meuCarro1);
        listaCarros.add(meuCarro2);
        listaCarros.add(meuCarro3);
        listaCarros.add(meuCarro4);

        System.out.println("--- Imprimindo a lista com for-each ---");
        for (Carro carroDaVez : listaCarros) {
            carroDaVez.exibir();
    }
  }
}
