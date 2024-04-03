public class Guincho extends Automovel {
    public Guincho(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    public void carregarCarro() {
        System.out.println("Carregando um carro no guincho.");
    }

    public void carregarMoto() {
        System.out.println("Carregando uma moto no guincho.");
    }
}
