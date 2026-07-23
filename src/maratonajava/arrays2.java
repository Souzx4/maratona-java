package maratonajava;

public class arrays2 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double é 0
        // char 'u0000' ''
        // boolean false
        // String null
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Naruto";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
