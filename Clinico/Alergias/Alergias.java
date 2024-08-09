package Programas.Adm_Gym.Clinico.Alergias;

public class Alergias {
    
    String alergia;

    String medicamento;

    String observacao;

   
    public Alergias(String alergia, String medicamento, String observacao) {
        this.alergia = alergia;
        this.medicamento = medicamento;
        this.observacao = observacao;
    }


    public String getAlergia() {
        return alergia;
    }


    public String getMedicamento() {
        return medicamento;
    }


    public String getObservacao() {
        return observacao;
    }

    public void showAlergia () {
        if (this.alergia != null){
            System.out.println("\n-----------------------------------");
            System.out.println("               ALERGIA             ");
            System.out.println("-----------------------------------\n");
            System.out.println("ALERGIA: " + this.alergia);
            System.out.println("MEDICAMENTO: " + this.medicamento);
            if (this.observacao != null){
                System.out.println("OBSERVAÇÃO: " + this.observacao);
            }
        } else {
            System.out.println("\n-----------------------------------");
            System.out.println("               ALERGIA             ");
            System.out.println("-----------------------------------\n");
            System.out.println("Não há alergias cadastradas.");
            System.out.println("\n-----------------------------------");
        }
    }
    
    
}
