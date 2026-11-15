package telemetria;

public abstract class Veiculo {
    protected int idVeiculo;
    protected String modelo;
    protected double capacidadeCarga;
    private double autonomiaBateria;

    public Veiculo() {
        this.idVeiculo = 0;
        this.modelo = "";
        this.capacidadeCarga = 0.0;
        this.autonomiaBateria = 0.0;
    }

    public double getAutonomiaBateria() {
        return this.autonomiaBateria;
    }

    public void setAutonomiaBateria(double bateria) {
        if (bateria < 0.0 || bateria > 100.0) {
            this.autonomiaBateria = 0.0;
        } else {
            this.autonomiaBateria = bateria;
        }
    }

    public abstract void registrarViagem(double distancia);
}