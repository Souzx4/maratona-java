package maratonajava;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador++);
        }
        System.out.println("--------------");

        do {
            System.out.println(contador++);
        } while (contador > 10 && contador < 15);

        System.out.println("--------------");

        for (int i = 15; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
