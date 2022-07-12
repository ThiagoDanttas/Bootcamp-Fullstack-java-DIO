package StreamAPI;


import java.util.*;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

      /*  numerosAleatorios.forEach(System.out::println);

        // Pegue os 5 primeiros numero e coloque dentro de um set
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // Transforme a lista de String em uma lista de número inteiro

        numerosAleatorios.stream()
                .map( Integer::parseInt)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
*/
        // Números pares maiores que 2
        List<Integer> listPares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2)).toList();

        System.out.println(listPares);


    }


}
