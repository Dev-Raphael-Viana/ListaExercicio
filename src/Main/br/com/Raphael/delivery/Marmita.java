package main.br.com.Raphael.delivery;

public class Marmita {

    // Preços fixos
    public static final double PRECO_P = 18.0;
    public static final double PRECO_M = 25.0;
    public static final double PRECO_G = 32.0;

    private String descricao;
    private String tamanho;

    public Marmita(String descricao, String tamanho) {
        this.descricao = descricao;
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        if (tamanho.equals("P")) {
            return PRECO_P;
        } else if (tamanho.equals("M")) {
            return PRECO_M;
        } else {
            return PRECO_G;
        }
    }

    public String toString() {
        return descricao + " (Tamanho " + tamanho + ") - R$ " + getPreco();
    }
}
