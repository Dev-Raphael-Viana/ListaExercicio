package main.br.com.Raphael.ExercicioAula10;

class Retangulo extends Forma {
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // Fórmula: largura * altura
        return largura * altura;
    }
}