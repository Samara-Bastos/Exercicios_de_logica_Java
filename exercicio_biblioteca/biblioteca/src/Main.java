import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Pessoa> leitores = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        
        Pessoa leitor01 = new Pessoa(1, "João");
        leitores.add(leitor01);

        Livro livro01 = new Livro(1,"Titulo fake","Autor fake", true);
        livros.add(livro01);

        if(livro01.getDisponivel() == true){
            Emprestimo emprestimo01 = new Emprestimo(1, livro01.getTituloLivro(), leitor01.getNomePessoa());
            emprestimos.add(emprestimo01);
            livro01.setDisponivel(false);
            System.out.println();
            System.out.println("Parabéns pelo empréstimo "+leitor01.getNomePessoa()+" , aproveite o livro "+livro01.getTituloLivro());
            System.out.println();
        }else{
            System.out.println();
            System.out.println("Hum "+leitor01.getNomePessoa()+" não é possivel fazer o empréstimo, pois o livro "+livro01.getTituloLivro()+" está indisponivel");
            System.out.println();
        }

        Pessoa leitor02 = new Pessoa(2, "Maria");
        leitores.add(leitor02);

        if(livro01.getDisponivel() == true){
            Emprestimo emprestimo02 = new Emprestimo(2, livro01.getTituloLivro(), leitor02.getNomePessoa());
            emprestimos.add(emprestimo02);
            livro01.setDisponivel(false);
            System.out.println();
            System.out.println("Parabéns pelo empréstimo "+leitor02.getNomePessoa()+" , aproveite o livro "+livro01.getTituloLivro());
            System.out.println();
        }else{
            System.out.println();
            System.out.println("Hum "+leitor02.getNomePessoa()+" não é possivel fazer o empréstimo, pois o livro "+livro01.getTituloLivro()+" está indisponivel");
            System.out.println();
        }

        System.out.println();
        System.out.println("        LEITORES");
        for(Pessoa leitorPessoa : leitores){
            System.out.println("------------------------------");
            System.out.println("Nome: "+leitorPessoa.getNomePessoa()+" - Identificador: "+leitorPessoa.getIdPessoa());
            System.out.println("------------------------------");
        }

        System.out.println();
        System.out.println("        LIVROS");
        for(Livro livrosBiblioteca : livros){
            System.out.println("------------------------------");
            System.out.println("Titulo: "+livrosBiblioteca.getTituloLivro()+" - Autor: "+livrosBiblioteca.getAutorLivro());
            System.out.println("------------------------------");
        }

        System.out.println();
        System.out.println("        EMPRÉSTIMOS");
        for(Emprestimo emprestimosBiblioteca : emprestimos){
            System.out.println("------------------------------");
            System.out.println("Identificador: "+emprestimosBiblioteca.getIdEmprestimo()+" - Livro emprestado : "+emprestimosBiblioteca.getLivroEmprestado()+" - Leitor responsavel: "+emprestimosBiblioteca.getLeitorResponsavel());
            System.out.println("------------------------------");
        }
        System.out.println();
        
    }
}
