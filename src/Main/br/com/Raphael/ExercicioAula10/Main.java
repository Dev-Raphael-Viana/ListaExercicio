package main.br.com.Raphael.ExercicioAula10;

public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5.0);
        Forma retangulo = new Retangulo(4.0, 6.0);

        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
    }
}