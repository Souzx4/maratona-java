package maratonajava;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short e boolean
        int i = 21;
        long numeroLongos = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0f;
        byte idadeByte = -128;
        short idadeShort = 3299;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        String nome = "Gilmar";

        System.out.println("Sua idade é " + i + " anos");
        System.out.println(numeroLongos);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Oi meu nome é " + nome);
    }
}
