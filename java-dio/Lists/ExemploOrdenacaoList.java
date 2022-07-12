package Lists;

import java.util.*;


public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("Ordem de Inserção");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Natural (nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Natural (idade)");

        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem nome-cor-idade");
        meusGatos.sort(new ComparatorNomeIdadeCor());

        System.out.println(meusGatos);

    }


    public static class Gato implements Comparable<Gato> {
        private String nome;
        private int idade;
        private String cor;

        public Gato(String nome, int idade, String cor){
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }
    }


    static class ComparatorIdade implements Comparator<Gato> {

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }


    static class ComparatorCor implements Comparator<Gato> {

        @Override
        public int compare(Gato g1, Gato g2){
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
    }

    static class ComparatorNomeIdadeCor implements Comparator<Gato> {

        @Override
        public int compare(Gato g1, Gato g2) {

            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if(nome != 0) return nome;

            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if(cor != 0) return cor;

            return Integer.compare(g1.getIdade(), g2.getIdade());

        }

    }


}

