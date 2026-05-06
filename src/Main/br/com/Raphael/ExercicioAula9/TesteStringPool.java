package main.br.com.Raphael.ExercicioAula9;

public class TesteStringPool {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}

//Por que a == b retorna true?
//Ambas foram criadas como literais. O Java colocou "Java" no Pool e fez tanto a quanto b apontarem para o mesmo endereço de memória.
//O == compara endereços, e como são o mesmo, dá true.
//
//Por que a == c retorna false?
//O uso do operador new força o Java a criar um novo objeto fora do Pool, em um endereço de memória diferente.
// Embora o conteúdo seja igual, o == vê que os endereços são distintos.
//
//Por que a.equals(c) retorna true?
//Porque o metodo .equals() foi programado para entrar dentro dos objetos e comparar caractere por caractere.
// Ele não se importa com o endereço, apenas com o conteúdo.