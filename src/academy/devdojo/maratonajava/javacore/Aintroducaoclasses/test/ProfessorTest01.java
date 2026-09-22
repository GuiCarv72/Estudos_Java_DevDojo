package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Elisete";
        professor.sexo = 'M';
        professor.idade = 50;

        System.out.println("Nome: " + professor.nome + "Idade: " + professor.idade +  "Sexo: " + professor.sexo);
    }
}
