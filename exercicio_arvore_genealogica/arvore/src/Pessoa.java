public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public Pessoa getPai(){
        return pai;
    }

    public Pessoa getMae(){
        return mae;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setPai(Pessoa pai){
        this.pai = pai;
    }

    public void setMae(Pessoa mae){
        this.mae = mae;
    }

    // Método para imprimir a árvore genealógica
    public void exibirArvore() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (pai != null) {
            System.out.println("Pai: " + pai.getNome());
        }
        if (mae != null) {
            System.out.println("Mãe: " + mae.getNome());
        }
        System.out.println();
    }
}
