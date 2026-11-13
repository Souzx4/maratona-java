package telemetria;

public class BicicletaEletrica extends Veiculo {
    private double limiteVelocidadeAssistida;

    public BicicletaEletrica(int idVeiculo, String modelo, double capacidadeCarga, double autonomiaBateria, double limiteVelocidadeAssistida) {
        this.idVeiculo = idVeiculo;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.limiteVelocidadeAssistida = limiteVelocidadeAssistida;
        setAutonomiaBateria(autonomiaBateria);
    }

    @Override
    public void registrarViagem(double distancia) {
        double consumo = distancia * 0.2;
        double bateriaRestante = getAutonomiaBateria() - consumo;
        setAutonomiaBateria(bateriaRestante);
        System.out.println("Bicicleta Elétrica (" + this.modelo + " - Limite: " + this.limiteVelocidadeAssistida + " km/h) percorreu "
                + distancia + " km. Nível de bateria resultante: " + getAutonomiaBateria() + "%");
    }
}