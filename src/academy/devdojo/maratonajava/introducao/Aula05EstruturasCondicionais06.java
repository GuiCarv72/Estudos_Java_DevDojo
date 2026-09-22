package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        //Considerando 1 como domingo

        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case  6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
        if (dia == 1 || dia ==7){
            System.out.println("Final de Semana!");
        }else if(dia >=2 && dia <=6){
            System.out.println("Dia útil!");
        }else {
            System.out.println("Inválido!");
        }
    }
}
