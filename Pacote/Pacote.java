package Programas.Adm_Gym.Pacote;

import Programas.Adm_Gym.Enum.Pacote_Enum;

public class Pacote {

    private String plano_e_pacote = "";

    private String descritivo = "";
    
    public Pacote() {
    }

    public String getPlano_e_pacote() {
        return plano_e_pacote;
    }

    public String getDescritivo() {
        return descritivo;
    }
       

    public void showPlanos_e_Pacotes(){
        int i = 1;
        for (Pacote_Enum pct : Pacote_Enum.values()){
            System.out.println("[" + i + "] " + String.valueOf(pct));
            i += 1;
            
        }
    }


    public String addPacote(int plano) {
        switch (plano) {
            case 1:
                this.plano_e_pacote = String.valueOf(Pacote_Enum.GINASTICA);
                this.descritivo = String.valueOf(Pacote_Enum.GINASTICA.getDescricao());    
                break;

            case 2:
                this.plano_e_pacote = String.valueOf(Pacote_Enum.CARDIO);
                this.descritivo = String.valueOf(Pacote_Enum.CARDIO.getDescricao());    
                break;

            case 3:
                this.plano_e_pacote = String.valueOf(Pacote_Enum.IRON); 
                this.descritivo = String.valueOf(Pacote_Enum.IRON.getDescricao());       
                break;

            case 4:
                this.plano_e_pacote = String.valueOf(Pacote_Enum.MASTER);
                this.descritivo = String.valueOf(Pacote_Enum.MASTER.getDescricao());       
                break;

            case 5:
                this.plano_e_pacote = String.valueOf(Pacote_Enum.TOTAL);   
                this.descritivo = String.valueOf(Pacote_Enum.TOTAL.getDescricao());    
                break;
        }
        return plano_e_pacote;
    }

    public void showPacote(){
        System.out.println("\n-----------------------------------");
        System.out.println("            PLANO/PACOTE           ");
        System.out.println("-----------------------------------");
        System.out.println("\nPLANO/PACOTE: " + this.plano_e_pacote);
        System.out.println("\nDescrição: " + this.descritivo);
    }

    
    
}
