package Main.br.com.Raphael.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro();
        meuCarro1.marca = "Fiat";
        meuCarro1.modelo = "Uno";
        meuCarro1.ano = 2012;

        Carro meuCarro2 = new Carro();
        meuCarro2.marca = "Honda";
        meuCarro2.modelo = "HRV";
        meuCarro2.ano = 2025;

        Carro meuCarro3 = new Carro();
        meuCarro3.marca = "BMW";
        meuCarro3.modelo = "320i";
        meuCarro3.ano = 2026;

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
