package Programas.Adm_Gym.Cadastro.Cadastra_Classes;

import Programas.Adm_Gym.Clinico.Clinico;
import Programas.Adm_Gym.Comercial.Comercial;
import Programas.Adm_Gym.Financeiro.Financeiro;
import Programas.Adm_Gym.Pacote.Pacote;
import Programas.Adm_Gym.Pessoal.Pessoal;
import Programas.Adm_Gym.Registro.Registro;

public class Cadastra_Classes {

    private Registro registro;

    private Pessoal cad_Pessoal;

    private Comercial cad_Comercial;

    private Clinico cad_Clinico;

    private Pacote cad_Pacote;

    private Financeiro cad_Financeiro;


    // CONSTRUTOR VAZIO

    public Cadastra_Classes() {
    }


    // GETTERS

    public Clinico getCad_Clinico() {
        return cad_Clinico;
    }

    public Pacote getCad_Pacote() {
        return cad_Pacote;
    }

    public Financeiro getCad_Financeiro() {
        return cad_Financeiro;
    }
    

    public Registro getRegistro() {
        return registro;
    }

    public Pessoal getCad_Pessoal() {
        return cad_Pessoal;
    }

    public Comercial getCad_Comercial() {
        return cad_Comercial;
    }
 
    
    // MÉTODOS
    
    public void addRegistro(Registro reg){
        this.registro = reg;
    }

    public void addPessoal(Pessoal cad){
        this.cad_Pessoal = cad;
    }

    public void addComercial(Comercial comm){
        this.cad_Comercial = comm;
    }

    public void addClinico (Clinico clinic ){
        this.cad_Clinico = clinic;
    }

    public void addFinanceiro (Financeiro financ) {
        this.cad_Financeiro = financ;
    }

    public void addPacote (Pacote pct) {
        this.cad_Pacote = pct;
    }

    public void showElem(){
        registro.showRegistro();
        cad_Pessoal.showPessoal();
        cad_Comercial.showComercial();
        cad_Clinico.showClinico();
        cad_Pacote.showPacote();
        cad_Financeiro.showFinanceiro();

    }

}
