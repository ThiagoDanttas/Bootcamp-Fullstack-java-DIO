package Sets;

import java.util.*;


/*
 * Crie uma classe Sets.LinguagemFavorita que possua os atributos nome, anoDeCriacao e Ide. Em seguida,
 * crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por :
 *
 * --> Ordem de Inserção
 * --> Ordem Natural (Nome)
 * --> IDE
 * --> Ano de Criação e nome
 *
 * */

public class ExeciciosPropostosLinguagemFav {

    public static void main(String[] args){

        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Python", 1990, "PyCharm"));
            add(new LinguagemFavorita("JavaScript", 1995, "VsCode" ));
            add(new LinguagemFavorita("Java", 1991, "Intellij" ));
        }};

        // Exibindo por ondem de inserção
        for( LinguagemFavorita lf : linguagens ) System.out.println(lf);

        System.out.println("------------------------------------");

        // Exibindo por ordem de nome e por IDE
        Set<LinguagemFavorita> linguagemPorNome = new TreeSet<>(linguagens);
        for( LinguagemFavorita lf : linguagemPorNome ) System.out.println(lf);

        System.out.println("------------------------------------");

        Set<LinguagemFavorita> ComparatorPorCriacaoNome = new TreeSet<>(new ComparatorPorCriacaoNome());
        ComparatorPorCriacaoNome.addAll(linguagens);
        for( LinguagemFavorita lf : ComparatorPorCriacaoNome ) System.out.println(lf);
    }
}


class LinguagemFavorita implements Comparable<LinguagemFavorita> {

    private String nome;
    private int anoDeCriacao;
    private String ide;


    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome(){
        return this.nome;
    }

    public int getAnoDeCriacao() {
        return this.anoDeCriacao;
    }

    public String getIde() {
        return this.ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita lf) {
        int nome = this.getNome().compareToIgnoreCase(lf.getNome());
        if(nome != 0) return nome;

        return this.getIde().compareToIgnoreCase(lf.getIde());
    }
}

class ComparatorPorCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if(anoCriacao != 0) return anoCriacao;

        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}




