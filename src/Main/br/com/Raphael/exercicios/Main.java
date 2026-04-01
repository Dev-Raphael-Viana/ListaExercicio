package Main.br.com.Raphael.exercicios;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Uno";
        meuCarro.ano = 2020;

        // Este método apenas executa a ação de imprimir.
        meuCarro.exibir();

        //Este método DEVOLVE um valor, que guardamos na variável 'idade'.
        int idade = meuCarro.idadeDoCarro();
        System.out.println("Idade do carro: " + idade + " anos.");
    }
}
