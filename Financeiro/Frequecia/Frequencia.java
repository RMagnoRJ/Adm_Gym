package Programas.Adm_Gym.Financeiro.Frequecia;
import java.util.Scanner;

public class Frequencia {
    
    private int frequencia;

    Scanner inn = new Scanner(System.in);

    public Frequencia() {
    }


    public int getFrequencia() {
        return frequencia;
    }
    
    
    public int addFrequencia() {
        
        System.out.println("\n-----------------------------------");
        System.out.println("             FREQUENCIA            ");
        System.out.println("-----------------------------------\n");
        System.out.print("Escolha a frequencia semanal: \n\n"+
                         "[1] 1 vez na semana\n" +
                         "[2] 2 vez na semana\n" +
                         "[3] 3 vez na semana\n" +
                         "[7] Acesso FULL\n\n"+
                         "> ");
        this.frequencia = inn.nextInt(); inn.nextLine();
        return this.frequencia;
    }



    
}
