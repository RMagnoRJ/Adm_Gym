package Programas.Adm_Gym.Clinico;

import java.util.ArrayList;
import java.util.List;

import Programas.Adm_Gym.Clinico.Alergias.Alergias;
import Programas.Adm_Gym.Clinico.Doenças.Doenças;

public class Clinico {
    
    List <Doenças> doenca = new ArrayList<>();
    
    List <Alergias> alergia = new ArrayList<>();

    String sos_nome;

    String sos_ddd;

    String sos_telefone;

    public Clinico() {
    }

    public List<Doenças> getDoenca() {
        return doenca;
    }

    public List<Alergias> getAlergia() {
        return alergia;
    }

    public String getSos_nome() {
        return sos_nome;
    }

    public String getSos_ddd() {
        return sos_ddd;
    }

    public String getSos_telefone() {
        return sos_telefone;
    }

    

    public void addSocorro (String nome, String ddd, String telefone){
        this.sos_nome = nome;
        this.sos_ddd = ddd;
        this.sos_telefone = telefone;
    }
    
    public void addDoenca (Doenças doec) {
        doenca.add(doec);
    }
    
    public void addAlergia (Alergias alerg){
        alergia.add(alerg);
    }
    
    public void showClinico () {

        for (Doenças doc : doenca){
            doc.showDoenca();
        }

        for (Alergias ale : alergia){
            ale.showAlergia();
        }

        if (this.sos_nome != null){
            System.out.println("\n-----------------------------------");
            System.out.println("              URGÊNCIAS            ");
            System.out.println("-----------------------------------");
            System.out.println("\nCONTATO DE URGÊNCIAS: " + this.sos_nome);
            System.out.println("\nTELEFONE: (" + this.sos_ddd + ") " + this.sos_telefone );
            System.out.println("-----------------------------------\n");
        } else {
            System.out.println("\n-----------------------------------");
            System.out.println("              URGÊNCIAS            ");
            System.out.println("-----------------------------------\n");
            System.out.println("Não há CONTATO DE URGÊNCIAS cadastrado.");
            System.out.println("\n-----------------------------------\n");
        }
    }

}
