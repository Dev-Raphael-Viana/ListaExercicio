package main.br.com.Raphael.ExercicioAula9;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("trash code", "978-0132350884");
        Livro l3 = new Livro("Refactoring", "978-0134757599");
        System.out.println(l1 == l2);
        System.out.println(l1.equals(null));
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l3.hashCode());
    }
}

//1) Sim, são exatamente iguais. Como ambos possuem o mesmo ISBN ("978-0132350884"),
// a função Objects.hash(isbn) vai gerar exatamente o mesmo número inteiro para os dois objetos.
//2) Sim, são diferentes. Como o ISBN do Livro 1 é diferente do Livro 3,
// o Java gerará um número inteiro matemático diferente para cada string correspondente.