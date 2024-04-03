

public class Emprestimo {
    private int id_emprestimo;
    private String livro_emprestado;
    private String leitor_responsavel;

    public Emprestimo(int id_emprestimo, String livro_emprestado, String leitor_responsavel) {
        this.id_emprestimo = id_emprestimo;
        this.livro_emprestado = livro_emprestado;
        this.leitor_responsavel = leitor_responsavel;
    }

    public int getIdEmprestimo(){
        return id_emprestimo;
    }

    public String getLivroEmprestado(){
        return livro_emprestado;
    }

    public String getLeitorResponsavel(){
        return leitor_responsavel;
    }

    public void setIdEmprestimo(int id_emprestimo){
        this.id_emprestimo = id_emprestimo;
    }

    public void setLivroEmprestado(String livro_emprestado){
        this.livro_emprestado = livro_emprestado;
    }

    public void setLeitorResponsavel(String leitor_responsavel){
        this.leitor_responsavel = leitor_responsavel;
    }

}
