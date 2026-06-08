package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Cachorro("Ozzy");
        Animal a2 = new Gato("Dell");
        Animal a3 = new Cachorro("Maya");

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
    }
}