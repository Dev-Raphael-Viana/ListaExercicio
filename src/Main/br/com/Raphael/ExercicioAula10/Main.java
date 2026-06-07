package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal("Animal ");
        Cachorro cachorro = new Cachorro("Rex ");
        Gato gato = new Gato("Whiskas ");


        animalGenerico.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
    }
}