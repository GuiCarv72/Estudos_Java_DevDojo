package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new  Estudante();

        estudante01.idade = 20;
        estudante01.sexo = 'M';
        estudante01.nome = "Vegeta";

        estudante02.idade = 20;
        estudante02.sexo = 'F';
        estudante02.nome = "Bulma";

        estudante01.imprime();
        estudante02.imprime();
    }
}
