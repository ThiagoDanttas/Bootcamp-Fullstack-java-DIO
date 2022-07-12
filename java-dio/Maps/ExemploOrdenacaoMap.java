package Maps;

import java.util.*;

public class ExemploOrdenacaoMap {

    public static void main(String[] args){

        // Exiba em ordem aleatoria
        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 Licoes Para o Seculo 21", 432));
        }};

        for ( Map.Entry<String, Livro> entry : livros.entrySet() ) System.out.println(entry);

        System.out.println("*************************************");

        // Ordem de inserção
        Map<String, Livro> livros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("21 Licoes Para o Seculo 21", 432));
        }};

        for( Map.Entry<String, Livro> entry : livros1.entrySet() ) System.out.println(entry);

        System.out.println("*************************************");

        // Ordem Alfabética autores
        Map<String, Livro> livros2 = new TreeMap<>(livros1);
        for( Map.Entry<String, Livro> entry : livros2.entrySet() ) System.out.println(entry);

        System.out.println("*************************************");

        // Ordem Alfabética dos livros
        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNomeLivro());
        livros3.addAll(livros.entrySet());
        for(Map.Entry<String, Livro> entry : livros3) System.out.println(entry);

        System.out.println("*************************************");

        // Ordem número de Páginas
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPaginas());
        livros4.addAll(livros.entrySet());
        for(Map.Entry<String, Livro> entry : livros4) System.out.println(entry);

    }
}

class Livro {
    private String nome;
    private int paginas;


    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return getPaginas() == livro.getPaginas() && Objects.equals(getNome(), livro.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas='" + paginas + '\'' +
                '}';
    }
}

class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}