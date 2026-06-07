package main.br.com.Raphael.ExercicioAula9;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("trash code", "978-0132350884");

        System.out.println(l1 == l2);
        System.out.println(l1.equals(null));
    }
}

//a) Sim
//b) Não, nenhuma exceção é lançada. O código é totalmente seguro por causa da linha: if (!(obj instanceof Livro)) return false;
//c) O título não é confiável podem existir livros diferentes com o mesmo título, já o ISBN é universal e único.