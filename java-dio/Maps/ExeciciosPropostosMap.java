package Maps;
import java.util.*;


public class ExeciciosPropostosMap {

    public static void main(String[] args) {

        Map<String, Integer> estados = new HashMap(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        for ( Map.Entry<String, Integer> entry : estados.entrySet() ) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("***********************************************");

        // Substitua a população do estado do RN por 3.534.165
        estados.put("RN", 3534165);

        for ( Map.Entry<String, Integer> entry : estados.entrySet() ) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Confira se o Estado PB está no dicionário, caso não,  adicione : PB - 4.039.277
        if(!(estados.containsKey("PB"))) estados.put("PB", 4039277);


        for ( Map.Entry<String, Integer> entry : estados.entrySet() ) System.out.println(entry.getKey() + " - " + entry.getValue());


        System.out.println("***********************************************");

        // Exiba a população PE;
        System.out.println("Populacao PE - " + estados.get("PE"));

        System.out.println("***********************************************");

        // Exiba todos os estados e suas populações na ordem que foi informado
        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534165);
            put("PB", 4039277);
        }};

        for ( Map.Entry<String, Integer> entry : estados2.entrySet() )System.out.println(entry.getKey() + " - " + entry.getValue());

        System.out.println("***********************************************");

        // Exiba os estados e suas populações em ordem alfabética
        Map<String, Integer> estados3 = new TreeMap<>(estados2);

        for ( Map.Entry<String, Integer> entry : estados3.entrySet() )System.out.println(entry.getKey() + " - " + entry.getValue());

        System.out.println("***********************************************");


        // Exiba o estado com a menor população e sua quantidade
        int quantidadePopMin = Collections.min(estados3.values());
        for(Map.Entry<String, Integer> entry : estados3.entrySet()){
            if(entry.getValue().equals(quantidadePopMin)){
                System.out.println("Estado com menor Populacao : " + entry.getKey() + " - " + quantidadePopMin);
            }
        }

        System.out.println("***********************************************");

        // Exiba o estado com a menor população e sua quantidade
        int quantidadePopMax = Collections.max(estados3.values());
        for(Map.Entry<String, Integer> entry : estados3.entrySet()) {
            if (entry.getValue().equals(quantidadePopMax)) {
                System.out.println("Estado com maior Populacao : " + entry.getKey() + " - " + quantidadePopMax);
            }
        }

        System.out.println("***********************************************");

        //Exiba a soma da população desses estados
        int soma = 0;
        for( Map.Entry<String, Integer> entry : estados3.entrySet() ){
            soma += entry.getValue();
        }

        System.out.println("A soma dos estados: " + soma);


        System.out.println("***********************************************");

        // Exiba a média da população
        System.out.println("Média da populacao: " + soma / estados3.size());

        System.out.println("***********************************************");

        // Remova os estados com a população menor que 4.000.000
        estados3.entrySet().removeIf(populacao -> populacao.getValue() < 4000000);
        System.out.println(estados3);

        System.out.println("***********************************************");

        // Apague o dicionário de estados
        estados3.clear();
        System.out.println(estados3);


    }

}