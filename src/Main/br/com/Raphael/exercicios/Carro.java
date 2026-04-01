package Main.br.com.Raphael.exercicios;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public void exibir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }
    public int idadeDoCarro() {
        return 2026 - ano;
    }
}

