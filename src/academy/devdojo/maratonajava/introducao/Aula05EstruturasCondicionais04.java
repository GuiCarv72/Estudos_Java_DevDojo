package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //€0 – €34,712: 9.70%
    //€34,713 – €68,507: 37.35%
    //Over €68,507: 49.50%
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraTaxa = 9.70/100;
        double segundataxa = 37.35/100;
        double terceiraTaxa = 49.50/100;
        double valorImposto;
        if (salarioAnual <= 34712){
            valorImposto = salarioAnual*primeiraTaxa;
        }else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual*segundataxa;
        }else{
            valorImposto = salarioAnual*terceiraTaxa;
        }
        System.out.println("VocÊ precisar pagar de imposto R$:"+valorImposto);
    }
}
