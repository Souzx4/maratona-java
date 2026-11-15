package telemetria;

public class Main {
    public static void main(String[] args) {
        VanEletrica van = new VanEletrica(1, "Ford E-Transit", 1200.0,
                100.0, "ABC-123");
        BicicletaEletrica bicicleta = new BicicletaEletrica(2, "Caloi E-Vibe Cargo",
                35.0, 100.0, 25.0);

        van.registrarViagem(50.0);
        bicicleta.registrarViagem(50.0);

        System.out.println(" RESUMO FINAL ");
        System.out.println("Bateria final da van eletrica: " + van.getAutonomiaBateria() + "%");
        System.out.println("Bateria final da bicicleta elétrica: " + bicicleta.getAutonomiaBateria() + "%");
    }
}
