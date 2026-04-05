package main.br.com.Raphael.exercicios;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;

    public static int totalClientes = 0;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalClientes++;
    }
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = "Não informado";
        totalClientes++;
    }
    public Cliente(String nome) {
        this.nome = nome;
        this.email = "Não informado";
        this.telefone = "Não informado";
        totalClientes++;
    }
    public void exibir() {
        System.out.println("Nome: " + nome + " | E-mail: " + email + " | Telefone: " + telefone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
