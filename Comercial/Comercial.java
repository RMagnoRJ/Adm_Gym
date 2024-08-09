package Programas.Adm_Gym.Comercial;


public class Comercial {
    

    String empresa;

    String profissao_cargo;

    String ddd;
    
    String telefone;

    String ramal;

    String endereco_rua;

    String endereco_numero;

    String endereco_complemento;

    String endereco_bairro;

    String endereco_cidade;

    String recado;

    String ddd_recado;

    String telefone_recado;

    String ramal_recado;


    public Comercial() {
    }



    public void addComercial(String empresa,
                            String profissao_cargo,
                            String ddd,
                            String telefone,
                            String ramal,
                            String endereco_rua,
                            String endereco_numero,
                            String endereco_complemento,
                            String endereco_bairro,
                            String endereco_cidade,
                            String recado,
                            String ddd_recado,
                            String telefone_recado,
                            String ramal_recado
                            ) {                        
        this.empresa = empresa;
        this.profissao_cargo = profissao_cargo;
        this.ddd = ddd;
        this.telefone = telefone;
        this.ramal = ramal;
        this.endereco_rua = endereco_rua;
        this.endereco_numero = endereco_numero;
        this.endereco_complemento = endereco_complemento;
        this.endereco_bairro = endereco_bairro;
        this.endereco_cidade = endereco_cidade;
        this.recado = recado;
        this.ddd_recado = ddd_recado;
        this.telefone_recado = telefone_recado;
        this.ramal_recado = ramal_recado;
    }

    
    public void showComercial(){
        System.out.println("\n-----------------------------------");
        System.out.println("             COMERCIAL             ");
        System.out.println("-----------------------------------");
        if (this.empresa == null){
            System.out.println("\nPROFISSÃO/STATUS: " + this.profissao_cargo);
        } else {
            System.out.println("\nEMPRESA: " + this.empresa);
            System.out.println("CARGO: " + this.profissao_cargo);
            if (this.telefone != null){
                System.out.println("TELEFONE: (" + this.ddd + ") " + this.telefone);
                if (this.ramal != null){
                    System.out.println("RAMAL: " + this.ramal);
                }
            }
            if (this.endereco_rua != null){
                System.out.println("LOGRADOURO: " + this.endereco_rua);
                System.out.println("NÚMERO: " + this.endereco_numero);
                if (this.endereco_complemento != null){
                    System.out.println("COMPLEMENTO: " + this.endereco_complemento);
                }
                System.out.println("BAIRRO: " + this.endereco_bairro);
                System.out.println("CIDADE: " + this.endereco_cidade);
            }
            
            if (this.recado != null){
                System.out.println("RECADO: " + this.recado);
                System.out.println("TELEFONE: (" + this.ddd_recado + ") " + this.telefone_recado);
                if (this.ramal_recado != null){
                System.out.println("RAMAL: " + this.ramal_recado);
                } 
            }
        }
        System.out.println("\n-----------------------------------");
    }
}
