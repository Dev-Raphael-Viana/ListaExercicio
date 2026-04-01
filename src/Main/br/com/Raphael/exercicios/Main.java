package Main.br.com.Raphael.exercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro1 = new Carro();
        meuCarro1.setMarca("Fiat");
        meuCarro1.setModelo("Uno");
        meuCarro1.setAno(2012);

        Carro meuCarro2 = new Carro();
        meuCarro2.setMarca("Honda");
        meuCarro2.setModelo("HRV");
        meuCarro2.setAno(2025);

        Carro meuCarro3 = new Carro();
        meuCarro3.setMarca("BMW");
        meuCarro3.setModelo("320i");
        meuCarro3.setAno(1600);

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
