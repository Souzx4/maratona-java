package maratonajava;

public class ExercicioEstruturaDeRepeticao {
    public static void main(String[] args) {
        //conte de 0 a 1000000 somente em numeros pares
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 ==0) {
                System.out.println(i);
            }
        }
    }
}
