package Main.br.com.Raphael.exercicios;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public static int totalCarros = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.setAno(ano); // chamei o setter para aproveitar o if de validação
        totalCarros++;
    }
    public Carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
       if (ano < 1886 || ano > 2026){
           // coloquei para mostrar qual carro esta com ano inválido
           System.out.println("Erro: O ano " + ano + " é inválido para o carro. Marca: " + this.marca + " - modelo: " + this.modelo);
       } else {
          this.ano = ano;
       }
    }

    public void exibir() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }
    public int idadeDoCarro() {
        return 2026 - ano;
    }
}

