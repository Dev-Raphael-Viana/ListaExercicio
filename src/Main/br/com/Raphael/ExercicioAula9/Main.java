package main.br.com.Raphael.ExercicioAula9;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));
    }
}

//Porque em Java, toda classe que criamos herda implicitamente da classe mãe de todas,
//a classe Object. Se nós não escrevermos o nosso próprio método .equals() dentro da classe Livro,
//o Java vai usar o .equals() padrão herdado de Object.