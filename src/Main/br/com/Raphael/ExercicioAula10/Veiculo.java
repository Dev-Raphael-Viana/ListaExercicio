package main.br.com.Raphael.ExercicioAula10;

abstract class Veiculo {
    String marca;
    int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }
    public void ligar() {
        System.out.println("O veículo está ligado.");
    }
    public abstract void buzinar();
}