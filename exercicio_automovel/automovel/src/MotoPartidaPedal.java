public class MotoPartidaPedal extends Moto {
    private boolean aceleradorPuxado;

    public MotoPartidaPedal(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    public void puxarAcelerador() {
        this.aceleradorPuxado = true;
    }

    public void ligar() {
        if (aceleradorPuxado) {
            super.ligar();
        } else {
            System.out.println("O acelerador precisa estar puxado para ligar a moto.");
        }
    }
}
