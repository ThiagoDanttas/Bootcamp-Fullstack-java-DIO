package Bank;

public class TestaConta {

    public static void main(String[] args){

        // Criando objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Thiago");
        cliente.setCpf("1234567891011");
        cliente.setProfissao("Programador");

        Cliente cliente1 = new Cliente();
        cliente1.setProfissao("Biologa");
        cliente1.setCpf("1234567891011");
        cliente1.setNome("Eliane");

        // Criando objeto Conta
        Conta cc = new Conta(123, 1170);
        cc.setTitular(cliente);
        Conta cc1 = new Conta(321, 1271);
        cc1.setTitular(cliente1);


        // Depósito
        cc.depositar(1000.0);
        cc1.depositar(1000.0);

        // Saque
        cc.sacar(100);
        cc1.sacar(50);

        // transferência
        cc.transferir(cc1, 100);


        ContaPoupanca cp = new ContaPoupanca(112,221);


        cc.depositaPoupanca(cp, 25000);

        System.out.println(cp.getSaldoPoup());



    }

}
