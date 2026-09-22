package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante(); //variavel de referencia
        estudante.idade = 20;
        estudante.sexo = 'M';
        estudante.nome = "Jorge";
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
    }
}
