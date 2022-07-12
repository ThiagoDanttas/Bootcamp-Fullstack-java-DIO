package Maps;/*
 * -------------->> MAP <<-----------------
 *
 * -> Elementos únicos (key) para cada valor (value)
 * -> TreeMap - Usado para ordenação
 *
 * HashMap (Random)
 * Linkedhashmap ( Sorted )
 *
 * */


import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.2);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        // Substitua o consumo do gol por 15.2 km/l
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("----------------------");

        // Confira se o modelo tucson está no dicionario
        System.out.println("Tem um tucson no dicionario ? " + carrosPopulares.containsKey("tucson"));

        System.out.println("----------------------");

        // Exiba o consumo do uno
        System.out.println("Consumo do uno -> " + carrosPopulares.get("uno"));

        System.out.println("----------------------");

        // Exiba os modelos
        System.out.println(carrosPopulares.keySet());

        System.out.println("----------------------");

        // Exiba os consumos dos carros
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("----------------------");

        // Exiba o modelo mais economico e seu consumo
        Double consumoMax = Collections.max(consumos);
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        for( Map.Entry<String, Double> entry : entries ) {
            if(entry.getValue().equals(consumoMax)){
                System.out.println(entry.getKey() + " - " + consumoMax);
            }
        }

        System.out.println("----------------------");

        // Exiba o modelo menos economico e seu consumo
        Double consumoMin = Collections.min(consumos);
        for(Map.Entry<String, Double> entry : entries ) {
            if(entry.getValue().equals(consumoMin)){
                System.out.println(entry.getKey() + " - " + consumoMin);
            }
        }

        System.out.println("----------------------");

        // Exiba a soma dos consumos
        Double somaConsumos = 0d;
        for(Map.Entry<String, Double> entry : entries ) {
            somaConsumos += entry.getValue();
        }
        System.out.println("Soma dos consumos " + somaConsumos);

        System.out.println("----------------------");

        //Exiba a média dos consumos destes carros
        System.out.println(somaConsumos / entries.size());

        System.out.println("----------------------");

        // Remova os modelos com o consumo igual a 15.6 km/l
        entries.removeIf(carro -> carro.getValue().equals(15.6));

        System.out.println(entries);

        System.out.println("----------------------");

        // Exiba todos os carros na ordem em que foram informados
        Map<String, Double> carros1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.2);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros1.toString());

        System.out.println("----------------------");

        // Exiba o dicionario ordenado pelo modelo
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println(carros2);

        System.out.println("----------------------");
        // Apague o conjunto de carros
        carros2.clear();

        System.out.println(carros2);

        System.out.println("----------------------");

        // Certifique que a lista está vazia
        System.out.println(carros2.isEmpty());








    }
}


