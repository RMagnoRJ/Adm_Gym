package Programas.Adm_Gym.Clinico.Doenças;

public class Doenças {
    
    String doenca;

    String medicamento;

    String dosagem;

    String posologia;

    public Doenças(String doenca, String medicamento, String dosagem, String posologia) {
        this.doenca = doenca;
        this.medicamento = medicamento;
        this.dosagem = dosagem;
        this.posologia = posologia;
    }

    public String getDoenca() {
        return doenca;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public String getDosagem() {
        return dosagem;
    }

    public String getPosologia() {
        return posologia;
    }

    public void showDoenca () {
        if (this.doenca != null){
            System.out.println("\n-----------------------------------");
            System.out.println("                DOENÇA             ");
            System.out.println("-----------------------------------\n");
            System.out.println("DOENÇA: " + this.doenca);
            System.out.println("MEDICAMENTO: " + this.medicamento);
            System.out.println("DOSAGEM: " + this.dosagem);
            System.out.println("POSOLOGIA: " + this.posologia);
            
        } else {
            System.out.println("\n-----------------------------------");
            System.out.println("                DOENÇA             ");
            System.out.println("-----------------------------------\n");
            System.out.println("Não há doenças cadastradas.");
            System.out.println("\n-----------------------------------");
        }
    }

}
