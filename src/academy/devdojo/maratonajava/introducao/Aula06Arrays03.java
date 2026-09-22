package academy.devdojo.maratonajava.introducao;

public class Aula06Arrays03 {
    static void main(String[] args) {
        int[] idades = new int[]{10, 20, 30, 40, 50};
//        for (int i = 0; i < idades.length; i++) {
//            System.out.println(idades[i]);
//        }
         for (int num: idades) {
             System.out.println(num);
         }
    }
}
