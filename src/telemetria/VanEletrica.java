package telemetria;

public class VanEletrica extends Veiculo {
    private String placaIdentificacao;

    public VanEletrica(int idVeiculo, String modelo, double capacidadeCarga,double autonomiaBateria, String placaIdentificacao) {
        this.idVeiculo = idVeiculo;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.placaIdentificacao = placaIdentificacao;
        setAutonomiaBateria(autonomiaBateria);
    }

    @Override
    public void registrarViagem(double distancia){
        double consumo = distancia * 0.5;
        double bateriaRestante = getAutonomiaBateria() - consumo;
        setAutonomiaBateria(bateriaRestante);
    }
}