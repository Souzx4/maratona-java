package maratonajava.dominio;

public class Calculadora {
    public void alteraDoisNumeros (int nume1, int nume2){
        nume1 = 99;
        nume2 = 33;
        System.out.println("dentro do alteraDoisNumeros");
        System.out.println("num1: " + nume1);
        System.out.println("num2: " + nume2);
    }

    public void somaVarArg(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
