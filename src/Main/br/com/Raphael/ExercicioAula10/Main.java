package main.br.com.Raphael.ExercicioAula10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(new Circulo(3.0));
        listaFormas.add(new Retangulo(5.0, 4.0));
        listaFormas.add(new Circulo(1.5));

        System.out.println("--- Calculando áreas em lote ---");

        for (Forma f : listaFormas) {
            System.out.printf("Área:%.2f%n" , f.calcularArea());
        }
    }
}