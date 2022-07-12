package Lists;

import java.util.*;

public class CollectionsFrameworks {

    public static void main(String[] args){

         /* Collection é um objeto que agrupa múltiplos elementos
         (variáveis primitivas ou objetos) dentro de uma única unidade; */

        // Serve para armazenar e processar conjuntos de dados de forma eficiente

        /*
        *  ------- Composição Collections
        *
        * Interfaces --> é um contrato que quando assumido por uma classe deve ser implementado;
        *
        * Implementções ou classes --> São as materializações, a codificação das interfaces;
        *
        * Algoritmos --> é uma sequência lógica, finita e definida de instruções
        * que devem ser seguidas para resolver um problema;
        *
        * --------------------- ArrayList vs LinkedList ---------------------
        *
        * Arraylist --> Usado onde mais operações de pesquisa são necessárias
        * LinkedList --> Usado onde mais operações de inserção e exclusão são necessárias
        *
        *
        *
        * */

        System.out.println("Crie uma lista e adcione as setes notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adiciona na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem que foram informados: ");
        for ( double i : notas ) System.out.println(notas);

        System.out.println("Exiba a terceira nota adcionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas) );

        System.out.println("Exiba a menor nota: " + Collections.max(notas));

        System.out.println("Exiba a soma das notas: ");
        Iterator<Double> iterator = notas.iterator();

        double soma = 0d;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a média das notas: " + (soma / notas.size()) );

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        //*Iterator<Double> iterator = notas.iterator();*//*

        while(iterator.hasNext()){
            Double num = iterator.next();
            if(num < 7) iterator.remove();
        }

        System.out.println("Apague toda a lista: ");
        notas.clear();

        System.out.println("Confia se a lista está vazia: " + notas.isEmpty());

    }

}
