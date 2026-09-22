package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = (int) 100000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000D;
        float salarioFloat = 3000F;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 10;
        System.out.println(numeroGrande);

        String nome = "Goku";
        var nome2 = "Vegeta";
        System.out.println("Oi eu sou "+nome);
        System.out.println("Eu sou "+nome2);
    }
}
