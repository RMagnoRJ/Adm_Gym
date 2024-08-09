package Programas.Adm_Gym.Enum;

public enum Pacote_Enum {

    GINASTICA("Apenas aulas de ginástica"),
    CARDIO("Apenas ergometria"),
    IRON("Apenas musculação"),
    MASTER("Ergometria + Musculação"),
    TOTAL("Todos os serviços disponíveis");
    

    private String descricao;
    
    Pacote_Enum (String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}