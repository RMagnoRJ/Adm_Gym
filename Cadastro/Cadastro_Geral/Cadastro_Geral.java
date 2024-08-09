package Programas.Adm_Gym.Cadastro.Cadastro_Geral;

import java.util.ArrayList;
import java.util.List;
import Programas.Adm_Gym.Cadastro.Cadastra_Classes.Cadastra_Classes;

public class Cadastro_Geral {
    
    private List <Cadastra_Classes> cadastros = new ArrayList<>();


    public Cadastro_Geral() {
    }


    public List<Cadastra_Classes> getCadastros() {
        return cadastros;
    }
    

    public void addCadastro(Cadastra_Classes cads){
        cadastros.add(cads);
    }


    public void showCadastros(){
        
        for (Cadastra_Classes show : cadastros){
            show.showElem();
        }
    }
}
