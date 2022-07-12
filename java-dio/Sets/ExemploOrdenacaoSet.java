package Sets;

import java.util.*;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("Ordem Aleatória");

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That 70's show", "Comedia", 25));

        }};

        for ( Serie serie : minhasSeries ) {
            System.out.printf("%s: %s - %s min ", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }

        System.out.println("Ordem natural (TempoEpisodio");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);

        for ( Serie serie : minhasSeries2 ) {
            System.out.printf("%s: %s - %s min ", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }

        System.out.println("Ordem (nome-genero-temp)");

        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorAllAtributes());
        minhasSeries3.addAll(minhasSeries);

        for ( Serie serie : minhasSeries3 ) {
            System.out.printf("%s: %s - %s min ", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }
    }

}


class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private int TempoEpisodio;

    public Serie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        TempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempoEpisodio() {
        return TempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", TempoEpisodio=" + TempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Serie s1) {

        int tempoEp = Integer.compare(this.getTempoEpisodio(), s1.getTempoEpisodio());
        if (tempoEp != 0) return tempoEp;

        return this.getGenero().compareToIgnoreCase(s1.getGenero());
    }
}

    class ComparatorAllAtributes implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {
            int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
            if(nome != 0) return nome;

            int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
            if(genero != 0) return genero;

            return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

        }
}


