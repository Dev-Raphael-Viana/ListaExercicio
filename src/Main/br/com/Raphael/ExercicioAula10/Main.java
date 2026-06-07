package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", 2023);
        Moto moto = new Moto("Honda", 2025);

        carro.buzinar();
        moto.buzinar();
    }
}