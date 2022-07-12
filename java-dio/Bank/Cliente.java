package Bank;

public class Cliente {

    private String nome, cpf,profissao;

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    // Getters
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getProfissao(){
        return this.profissao;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
