package POO;

public class ExmploInterface {

    interface OperacoesMatematicas {

        void soma(double op1, double op2);

        void sub(double op1, double op2);

        void mult(double op1, double op2);

        void divisao(double op1, double op2);
    }

}

class Calculadora implements ExmploInterface.OperacoesMatematicas {

    @Override
    public void soma(double op1, double op2) {
        System.out.println(op1 + op2);
    }

    @Override
    public void sub(double op1, double op2) {
        System.out.println(op1 - op2);
    }

    @Override
    public void mult(double op1, double op2) {
        System.out.println(op1 * op2);
    }

    @Override
    public void divisao(double op1, double op2) {
        System.out.println(op1 / op2);
    }
}