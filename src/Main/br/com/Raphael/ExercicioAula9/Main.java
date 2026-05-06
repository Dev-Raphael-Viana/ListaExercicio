package main.br.com.Raphael.ExercicioAula9;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 15.90);

        System.out.println(p1);
        System.out.println(p2);
    }
}

//a) Agora aparece os valores.
//Produto{nome=Caneta, preco=2.5}
//Produto{nome=Caderno, preco=15.9}

//b) Sim. * No System.out.println(objeto), o Java chama internamente o String.valueOf(objeto),
// que por sua vez executa o toString().
//Na concatenação com o operador +, o compilador entende que quero transformar tudo em texto e invoca o toString()
//automaticamente para mim.