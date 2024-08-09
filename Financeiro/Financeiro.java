package Programas.Adm_Gym.Financeiro;

import Programas.Adm_Gym.Financeiro.Frequecia.Frequencia;
import Programas.Adm_Gym.Financeiro.Mensalidade.Mensalidade;
import Programas.Adm_Gym.Financeiro.Taxa.Taxa;


public class Financeiro {
    
    private Mensalidade mensalidade_Class = new Mensalidade();

    private Taxa boleto_Class = new Taxa();

    private Frequencia frequencia_Class = new Frequencia();

    

    public Financeiro() {
    }


    public void geraMensalidade(int pacote){
        frequencia_Class.addFrequencia();
        mensalidade_Class.addMensalidade(frequencia_Class.getFrequencia(), pacote);
    }

    public void geraBoleto(){
        boleto_Class.addBoleto(mensalidade_Class.getMensalidade());
    }
    
    public void showFinanceiro(){
        System.out.println("\n-----------------------------------");
        System.out.println("             MENSALIDADE           ");
        System.out.println("-----------------------------------");
        System.out.printf("\nVALOR DO PLANO/PACOTE: %.2f %n", mensalidade_Class.getMensalidade());
        System.out.printf("\nVALOR DA MENSALIDADE: %.2f %n", boleto_Class.getBoleto());
        System.out.println("\n-----------------------------------");
    }
    
}

