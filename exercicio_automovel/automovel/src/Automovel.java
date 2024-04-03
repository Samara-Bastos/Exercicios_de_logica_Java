public class Automovel {
     private int numRodas;
     private int velMax;
     private boolean ligado;
 
     public Automovel(int numRodas, int velMax) {
         this.numRodas = numRodas;
         this.velMax = velMax;
         this.ligado = false;
     }

     public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public boolean getLigado() {
        return ligado;
    }
 
     // Método ligar
     public void ligar() {
         ligado = true;
         System.out.println("O automóvel está ligado.");
     }
 
     // Método desligar
     public void desligar() {
         ligado = false;
         System.out.println("O automóvel está desligado.");
     }

}
