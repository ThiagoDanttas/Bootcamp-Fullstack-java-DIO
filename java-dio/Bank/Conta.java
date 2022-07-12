package Bank;

public class Conta {

    private int agencia;
    private int numero;
    private double saldo;

    private Cliente titular;

    public Conta(int numero, int agencia){
        this.numero = numero;
        this.agencia = agencia;
    }

    // Setters
    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    // Getter

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    // Methods
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void transferir(Conta conta, double valor){
        conta.depositar(valor);
        this.saldo -= valor;
    }

    public void depositaPoupanca(ContaPoupanca cc, double valor){

        if(valor <= this.saldo){
            cc.setSaldoPoup(valor);
            this.saldo -= valor;
            System.out.println("Depositado na poupanca");
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }
}


