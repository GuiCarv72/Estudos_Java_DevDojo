package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Fernando");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[] {1200, 972.32, 2000});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());
    }
}
