package main.br.com.Raphael.ExercicioAula10;

class Moto extends Veiculo {
    public Moto(String marca, int ano) {
        super(marca, ano);
    }

    @Override
    public void buzinar() {
        System.out.println("A moto buzina: Beep-Beep!");
    }
}