package telemetria;

public class BicicletaEletrica extends Veiculo{
    private double limiteVelocidadeAssistida;

        this.idVeiculo = idVeiculo;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.limiteVelocidadeAssistida = limiteVelocidadeAssistida;
    }

    @Override
    public void registrarViagem(double distancia){
        double consumo = distancia * 0.2;
        double bateriaRestante = getAutonomiaBateria() - consumo;
        setAutonomiaBateria(bateriaRestante);
    }
}