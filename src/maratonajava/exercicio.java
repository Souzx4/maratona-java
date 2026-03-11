package maratonajava;

public class exercicio {
    public static void main(String[] args) {
        double salario = 50000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salario <= 34713){
            valorImposto = salario * primeiraFaixa;
        } else if (salario >= 34713 && salario <= 68507) {
            valorImposto = salario * segundaFaixa;
        } else {
            valorImposto = salario * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
