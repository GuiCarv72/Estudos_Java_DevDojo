package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 19;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if(idade >= 18){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não altotizado a comprar bebida alcólica!");
        }

        boolean c = false;
        if(c = true){
            System.out.println("Dentro de algo qure nunca deve ser feito!");
        }
    }
}
