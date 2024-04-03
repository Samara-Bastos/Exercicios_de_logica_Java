

public class Livro {
    private int id_livro;
    private String titulo_livro;
    private String autor_livro;
    private boolean disponivel;

    public Livro(int id_livro, String titulo_livro, String autor_livro, boolean disponivel) {
          this.id_livro = id_livro;
          this.titulo_livro = titulo_livro;
          this.autor_livro = autor_livro;
          this.disponivel = disponivel;
     }

    public int getIdLivro(){
        return id_livro;
    }

   public String getTituloLivro(){
        return titulo_livro;
   }

   public String getAutorLivro(){
        return autor_livro;
   }

   public boolean getDisponivel(){
        return disponivel;
   }

   public void setIdLivro(int id_livro){
        this.id_livro = id_livro;
   }

   public void setTituloLivro(String titulo_livro){
        this.titulo_livro = titulo_livro;
   }

   public void setAutorLivro(String autor_livro){
        this.autor_livro = autor_livro;
   }

   public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
   }
}
