package maratonajava;

public class ExercicioBreak {
    public static void main(String[] args) {
        double carro = 40000;
        for (int parcelas = 1; parcelas <= 1000; parcelas++) {
            double valorParcela = carro / parcelas;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcelas " + parcelas + " Valor " + valorParcela);
        }
    }
}
