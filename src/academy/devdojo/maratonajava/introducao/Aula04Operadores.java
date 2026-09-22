package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01+numero02;
        System.out.println("Valor:"+resultado);

        // %
        int resto = 23 / 2;
        System.out.println("Valor:"+resto);

        // < > <= >= == != - sempre retornar valores booleanos (true/false)
        boolean isDezMaiorQueVInte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("Valor:"+isDezMaiorQueVInte);
        System.out.println("Valor:"+isDezMenorQueVinte);
        System.out.println("Valor:"+isDezIgualVinte);
        System.out.println("Valor:"+isDezIgualDez);
        System.out.println("Valor:"+isDezDiferenteDez);

        // && (AND) || (or) !

        int idade = 29;
        float salario = 5500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation ||  valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 500;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus "+bonus);

        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
    }
}
