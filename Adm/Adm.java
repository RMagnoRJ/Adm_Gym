package Programas.Adm_Gym.Adm;

import java.util.ArrayList;
import java.util.List;

public class Adm {

    List <Administrador> teste_Adm = new ArrayList<>();

    public Adm() {
    }

    public void addAdmm(Administrador admm){
        teste_Adm.add(admm);
    }

    public List<Administrador> getTeste_Adm() {
        return teste_Adm;
    }

    public void addCadastro(Administrador admm){
        teste_Adm.add(admm);
    }

    public void showCadastros(){
        
        //for (Administrador show : teste_Adm){
        //    show.showCadastro();
        //}
    }
    
}
