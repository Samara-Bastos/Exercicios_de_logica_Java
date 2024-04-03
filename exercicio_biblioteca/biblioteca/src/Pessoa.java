

public class Pessoa {
    private int id_pessoa;
    private String nome_pessoa;

    public Pessoa(int id_pessoa, String nome_pessoa) {
        this.id_pessoa = id_pessoa;
        this.nome_pessoa = nome_pessoa;
    }

    public int getIdPessoa(){
        return id_pessoa;
    }

    public String getNomePessoa(){
        return nome_pessoa;
    }

    public void setIdPessoa(int id_pessoa){
        this.id_pessoa = id_pessoa;
    }

    public void setNomePessoa(String nome_pessoa){
        this.nome_pessoa = nome_pessoa;
    }

}
