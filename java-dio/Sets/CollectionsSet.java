package Sets;

import java.util.LinkedHashSet;
import java.util.*;

public class CollectionsSet {


    /*
    *  ------------>> Coleções Singulares Set <<--------------
    *
    *
    * --> Não permite elementos duplicados
    * --> Não possui índice
    *
    * --> Estendem o Collection
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */

    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adcione as notas: ");

        Set<Double> notas = new HashSet<>(){{
            add(7d);
            add(8.5);
            add(3.6);
            add(5.0);
            add(9.3);
            add(7d);
            add(0d);
        }};

        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 est´ano conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
         Iterator<Double> iterator1 = notas.iterator();
         double soma = 0d;
         while(iterator1.hasNext()) {
             double next = iterator1.next();
             soma += next;

         }
        System.out.println(soma);

        System.out.println("Exiba a média dos valores: " + soma / notas.size());

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
          Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            if (next < 7) iterator.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>(){{ // Utilizando o LinkedHashSet
            add(7d);
            add(8.5);
            add(9.3);
            add(5.0);
            add(7d);
            add(0d);
            add(3.6);
        }};

        System.out.println(notas2);

        System.out.println("Exiba em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto esta vazio: " + notas.isEmpty());

    }
}
