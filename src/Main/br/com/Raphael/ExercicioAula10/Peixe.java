package main.br.com.Raphael.ExercicioAula10;

class Peixe implements Nadador {
    String especie;

    public Peixe(String especie) {
        this.especie = especie;
    }

    @Override
    public void nadar() {
        System.out.println("O peixe " + especie + " está nadando nos corais...");
    }
}