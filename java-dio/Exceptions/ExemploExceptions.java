package Exceptions;

import javax.swing.*;

public class ExemploExceptions {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);

        } catch ( NumberFormatException e){

            throw new NumberFormatException("Insira um valor válido ");
        }catch (ArithmeticException e) {

            throw new ArithmeticException("Valor invalido. Impossivel dividir por 0.");

        } finally {

            System.out.println("Sempre executado!");
        }


    }

    public static int dividir(int a, int b){
        return a / b;
    }

}
