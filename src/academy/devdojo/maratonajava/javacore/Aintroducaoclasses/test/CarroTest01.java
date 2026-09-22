package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();
        Carro  carro2 = new Carro();

        carro.nome = "Fusca";
        carro.modelo = "Sport";
        carro.ano = 1969;

        carro2.nome = "BMW 320i";
        carro2.modelo = "Sport";
        carro2.ano = 2024;

        System.out.println("\nCarro 1");
        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);

        System.out.println("\nCarro 2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
