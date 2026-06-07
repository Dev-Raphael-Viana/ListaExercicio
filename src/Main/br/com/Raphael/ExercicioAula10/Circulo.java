package main.br.com.Raphael.ExercicioAula10;

class Circulo extends Forma {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}