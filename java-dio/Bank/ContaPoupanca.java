package Bank;

public class ContaPoupanca extends Conta {

    private double saldoPoup;

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    // Setter
    public void setSaldoPoup(double valor){
        this.saldoPoup += valor;
    }

    // Getters
    public double getSaldoPoup(){
        return this.saldoPoup;
    }







}
