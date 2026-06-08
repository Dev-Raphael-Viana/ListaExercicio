package main.br.com.Raphael.ExercicioAula10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(new Cachorro("Ozzy"));
        listaAnimais.add(new Gato("Dell"));
        listaAnimais.add(new Leao("Maya"));
        listaAnimais.add(new Coruja("Janja"));

        System.out.println("--- Percorrendo a lista com for-each ---");

        for (Animal animal : listaAnimais) {
            animal.emitirSom();
        }
    }
}