import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Agenda> numeros = new ArrayList<>();
        Scanner numerosInseridos = new Scanner(System.in);

        Agenda numero01 = new Agenda("(32)95542-5699");
        numeros.add(numero01);

        Agenda numero02 = new Agenda("(32)91122-3358");
        numeros.add(numero02);

        System.out.println();
        System.out.println("        AGENDA");
        for(Agenda numerosAgenda: numeros){
            System.out.println("------------------------------");
            System.out.println("Número: "+numerosAgenda.getNumero());
            System.out.println("------------------------------");
        }
        System.out.println();


        for (int i = 1; i <= 2; i++) {
            System.out.println("Por favor, digite dois novos números para adcionar na agenda");
            System.out.println("Exemplo: (99)99999-9999");

            String novoNumero = numerosInseridos.nextLine();
            Agenda numero03 = new Agenda(novoNumero);
            numeros.add(numero03);
        }


        System.out.println();
        System.out.println("        AGENDA");
        for(Agenda numerosAgenda: numeros){
            System.out.println("------------------------------");
            System.out.println("Número: "+numerosAgenda.getNumero());
            System.out.println("------------------------------");
        }
        System.out.println();

        System.out.println("Se você deseja excluir algum número da agenda, digite o número correspondente conforme a lista abaixo");
        System.out.println();

        for(int i = 0; i < numeros.size(); i++) {
            System.out.println(i + " - " + numeros.get(i).getNumero());
        }
        

        int numeroExcluir = Integer.parseInt(numerosInseridos.nextLine());

        if(numeroExcluir >= 0 && numeroExcluir < numeros.size()){
            numeros.remove(numeroExcluir);
            System.out.println("Numero excluido com sucesso!");
        }else{
            System.out.println("Ocorreu algum erro, tente mais tarde");
        }

        numerosInseridos.close();

        System.out.println();
        System.out.println("        AGENDA");
        for(Agenda numerosAgenda: numeros){
            System.out.println("------------------------------");
            System.out.println("Número: "+numerosAgenda.getNumero());
            System.out.println("------------------------------");
        }
        System.out.println();
    }
}
