

public class Main {
    public static void main(String[] args) {
        Pessoa avo1 = new Pessoa("Josenilson", 80, null, null);
        Pessoa avo2 = new Pessoa("Florinda", 78, null, null);
        Pessoa pai = new Pessoa("José", 50, avo1, avo2);
        Pessoa mae = new Pessoa("Madalena", 45, null, null);
        Pessoa filho = new Pessoa("Pedro", 25, pai, mae);
        Pessoa filha = new Pessoa("Ana", 20, pai, mae);

        System.out.println();
        System.out.println("    Árvore Genealógica:");
        System.out.println("----------------------------");
        System.out.println();

        avo1.exibirArvore();
        avo2.exibirArvore();
        pai.exibirArvore();
        mae.exibirArvore();
        filho.exibirArvore();
        filha.exibirArvore();
    }
}
 