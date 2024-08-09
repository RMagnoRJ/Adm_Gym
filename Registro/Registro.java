package Programas.Adm_Gym.Registro;

import java.util.Random;

public class Registro {
    
    private int registro;

    private String status;

    public Registro() {
        
    }


    public int getRegistro() {
        return registro;
    }

    public String getStatus() {
        return status;
    }


    
    public int addRegistro(){
        Random ram = new Random();

        int a = ram.nextInt(1,9);
        int b = ram.nextInt(1,9);
        int c = ram.nextInt(1,9);
        int d = ram.nextInt(1,9);
        
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        String cc = String.valueOf(c);
        String dd = String.valueOf(d);
        
        int reg = Integer.parseInt(aa+bb+cc+dd);
        this.registro = reg;
        return this.registro;
    }
    
    public String addStatus(int status){
        if (status == 1){
            this.status = "ATIVO";
        } else if (status == 2){
            this.status = "BLOQUEADO";
        } else if (status == 3){
            this.status = "ENCERRADO";
        } else {
            System.out.println("# ERROR #");
        }
        return this.status;
    }

    
    public void showRegistro(){
        System.out.println("\nREGISTRO: " + this.registro);
        System.out.println("STATUS: " + this.status);
        System.out.println("\n-----------------------------------");
    }
}
