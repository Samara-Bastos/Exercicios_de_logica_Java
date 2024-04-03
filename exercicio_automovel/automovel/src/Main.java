public class Main {
    public static void main(String[] args) {
        
        CarroAutomatico carroAutomatico = new CarroAutomatico(4, 200);
        MotoPartidaPedal motoPartidaPedal = new MotoPartidaPedal(2, 180);
        Guincho guincho = new Guincho(4, 150);

        
        System.out.println("Testando os automóveis:");
        System.out.println();
        // carroAutomatico.pressionarFreio(); 
        System.out.println();
        carroAutomatico.ligar(); 
        System.out.println();
        // motoPartidaPedal.puxarAcelerador(); 
        System.out.println();
        motoPartidaPedal.ligar(); 
        System.out.println();
        guincho.carregarCarro(); 
        System.out.println();
        guincho.carregarMoto();
    }
}
