package maratonajava.javacore.Bintroducaometodos.teste;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        double result = c.divideDoisNumeros(10, 5);
        System.out.println(result);

        System.out.println(" ouuu somente:");
        System.out.println(c.divideDoisNumeros(20,10));
    }
}
