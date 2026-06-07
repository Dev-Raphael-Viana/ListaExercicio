package main.br.com.Raphael.ExercicioAula10;

class Carro extends Veiculo {
    public Carro(String marca, int ano) {
        super(marca, ano);
    }

    @Override
    public void buzinar() {
        System.out.println("O carro buzina: Bi-Bi!");
    }
}