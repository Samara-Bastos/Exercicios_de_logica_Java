public class CarroAutomatico extends Carro {
    private boolean freioPressionado;

    public CarroAutomatico(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    public void pressionarFreio() {
        this.freioPressionado = true;
    }

    public void ligar() {
        if (freioPressionado) {
            super.ligar();
        } else {
            System.out.println("O freio precisa estar pressionado para ligar o carro.");
        }
    }
}
