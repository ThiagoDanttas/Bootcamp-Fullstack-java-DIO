package Sets;

import java.util.*;
public class ExeciciosPropostosCores {

    public static void main(String[] args){

        Set<String> cores = new HashSet<>(){{
            add("vermelha");
            add("laranja");
            add("amarela");
            add("verde");
            add("azul");
            add("azul-escuro");
            add("violeta");
        }};

        // Exiba todas as cores uma abaixo da outra
        for( String cor : cores ) {
            System.out.println(cor);
        }
        System.out.println("-----------------------------");

        // A quantidade de cores que o arco-íris tem
        Iterator<String> iterator1 = cores.iterator();
        int soma = 0;
        while(iterator1.hasNext()) {
        String next = iterator1.next();
            soma += 1;
        }

        System.out.println("Quantidade de cores " + soma);
        System.out.println("-----------------------------");

        // Exiba as cores em ordem alfabética
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);
        System.out.println("-----------------------------");

        // Exiba as cores na ordem inversa da que foi informada
        System.out.println("-----------------------------");

        // Exiba todas as cores que começam com a letra "v"
        for (String next : cores2) {
            if (next.startsWith("v")) System.out.println(next.toString());
        }
        System.out.println("-----------------------------");

        // Remova todas as cores que não começa com a letra "v"
        cores2.removeIf(next -> !(next.startsWith("v")));
        System.out.println(cores2);
        System.out.println("-----------------------------");

        // Limpe o conjunto
        cores2.clear();
        System.out.println(cores2);
        System.out.println("-----------------------------");

        // Confira se o conjunto está vazio
        System.out.println("O Conjunto esta vazio ? " + cores2.isEmpty());

    }

}
