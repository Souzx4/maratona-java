package maratonajava;

public class Operadores {
    public  static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println(resultado + " Valor " +
                numero1 + numero2);
        System.out.println("-------------------");

        // %
        int resto = 21 % 2;
        System.out.println(resto);
        System.out.println("-------------------");

        // <  > <=  >= ==  !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("10 > 20 ou não =" + isDezMaiorQueVinte);
        System.out.println("10 < 20 ou não = " + isDezMenorQueVinte);
        System.out.println("10 é igual a 20 ou não = " + isDezIgualAVinte);
        System.out.println("10 é igual a 10 ou não = " + isDezIgualDez);
        System.out.println("10 é diferente de 10 ou não = " + isDezDiferenteDez);
        System.out.println("--------------------------");


        //Operadores logicos
        // && [AND], || [OR], ! [NOT]
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Maior que 30 " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("menor que 30 " + isDentroDaLeiMenorQueTrinta);
        System.out.println("------------------------");

        double valorTotalComContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000f;
        boolean ysPS5 = valorTotalComContaCorrente > valorPlayStation ||
                valorTotalContaPoupanca > valorPlayStation;
        System.out.println(ysPS5);
        System.out.println("-----------------------");

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 2000;
        bonus -= 1000;
        bonus *= 2;
        bonus %= 3;
        bonus /= 2;
        System.out.println(bonus);
        System.out.println("-------------");

        // ++ --
        int contador = 0;
        contador++;
        contador--;
        System.out.println(contador);
    }
}
