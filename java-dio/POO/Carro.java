package POO;

public class Carro extends Veiculo {

    private String cor;
    private String modelo;
    private int capacidadeTanque;

    // Constructor
    public Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Getters & Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    // Methods
    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }

}
