package Main.br.com.Raphael.lanchonete;

public class Lanche {
    private String nome;
    private double preco;

    public Lanche() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0) {
            System.out.println("Preço informado inválido");
        } else {
            this.preco = preco;
        }
    }
}
