package main.br.com.Raphael.ExercicioAula9;

import java.util.HashSet;

public class BibliotecaTeste {
    public static void main(String[] args) {
     HashSet<Livro> biblioteca = new HashSet<>();
     Livro l1 = new Livro("Clean Code", "978-0132350884");
     Livro l2 = new Livro("Clean Code", "978-0132350884");

     biblioteca.add(l1);
     biblioteca.add(l2);

     System.out.println(biblioteca.size());
  }
}

/*
 a) 1
 b) Sim, 2, porque Sem o seu hashCode(), o Java voltou a usar o hashCode() padrão da classe Object que gera um número baseado no endereço de memória.
    Como l1 e l2 foram criados com new, eles ganharam números de hash totalmente diferentes.
    O HashSet olhou o hash do l2, achou que era um local completamente novo e o guardou em outra "gaveta".
    O Java sequer chamou o seu metodo equals(), porque para ele, hashes diferentes significam objetos totalmente diferentes de cara.

 c) O HashSet barra duplicatas em duas etapas rápidas:
   1. hashCode(): Descobre a "gaveta" de memória do objeto. Se a gaveta estiver
    vazia, adiciona direto. Se estiver ocupada, vai para o passo 2.
   2. equals(): Compara o conteúdo do objeto com quem já está na gaveta.
   Se der true, é duplicado e o Java descarta. Se der false, ele adiciona.
*/