package Programas.Adm_Gym.Adm;

import java.util.Scanner;

import Programas.Adm_Gym.Financeiro.Mensalidade.Mensalidade;
import Programas.Adm_Gym.Financeiro.Taxa.Taxa;

public class Administração {
     
    Scanner inn = new Scanner (System.in);

    Taxa adm_Taxa = new Taxa();

    Mensalidade adm_Mensalidade = new Mensalidade();


    public Administração() {
    }

    public void userAdm(){
        int menu;
        boolean on = true;
        System.out.println("\n-----------------------------------");
        System.out.println("              ADMINISTRAÇÃO          ");
        System.out.println("-----------------------------------\n");
        
        while (on){
            System.out.println("\n************************************");
            System.out.println("|                MENU              |");
            System.out.println("************************************");
            System.out.println("|                                  |");
            System.out.println("| [1] EDITAR CADASTRO              |");
            System.out.println("|                                  |");
            System.out.println("| [2] REMOVER CADASTRO             |");
            System.out.println("|                                  |");
            System.out.println("| [3] ALTERAR FORMA DE COBRANÇA    |");
            System.out.println("|                                  |");
            System.out.println("| [4] ALTERAR TAXA DA FORMA        |");
            System.out.println("|                                  |");
            System.out.println("| [5] ALTERAR TAXA DE COBRANÇA     |");
            System.out.println("|                                  |");
            System.out.println("| [6] ALTERAR VALOR DO DIA         |");
            System.out.println("|                                  |");
            System.out.println("| [7] VOLTAR AO MENU INICIAL       |");
            System.out.println("|                                  |");
            System.out.println("************************************\n");
            menu = inn.nextInt(); inn.nextLine();
            switch (menu) {
                case 1:
                    // EDITAR CADASTRO
                    
                    break;
            
                case 2:
                    // REMOVER CADASTRO
    
                    break;
                
                case 3:
                    // ALTERAR FORMA DE PAGAMENTO
                    adm_Taxa.alteraForma();                    
                    break;
                
                case 4:
                    // ALTERAR TAXA DA FORMA DE COBRANÇA
                    adm_Taxa.alteraTaxaDaForma();    
                    break;
                
                case 5:
                    // ALTERAR TAXA DE COBRANÇA
                    adm_Taxa.alteraTaxa();
                    break;
                
                case 6:
                    // ALTERAR O VALOR DO DIA DOS PACOTES
                    adm_Mensalidade.alteraValorDia();
                    break;

                case 7:
                    // ENCERRAR
                    on = false;
                    break;
            }
        }
    }
    
    


}
