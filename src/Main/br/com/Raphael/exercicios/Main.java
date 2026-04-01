package Main.br.com.Raphael.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro("Fiat", "Uno", 2012);
        Carro meuCarro2 = new Carro("Honda", "HRV", 2025);
        Carro meuCarro3 = new Carro("BMW", "320i", 1600);

        ArrayList<Carro>listaCarros = new ArrayList<>();
        listaCarros.add(meuCarro1);
        listaCarros.add(meuCarro2);
        listaCarros.add(meuCarro3);

        System.out.println("--- Imprimindo a lista com for-each ---");
        for (Carro carroDaVez : listaCarros) {
            carroDaVez.exibir();
    }
  }
}
