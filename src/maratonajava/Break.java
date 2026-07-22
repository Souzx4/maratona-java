package maratonajava;

public class Break {
    // imprima os primeiros 25 numeros de um dado. Por exemplo, 50
    public static void main(String[] args) {
        int max = 50;
        for (int i = 0; i <= max; i++){
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
