package Programas.Adm_Gym.Adm;

import java.util.Scanner;

public class Administrador {
    
    private String user = "admin";

    private String password;

    @SuppressWarnings("unused")
    private boolean usuarioClass = false;

    Scanner inn = new Scanner (System.in);

    Administração adm = new Administração();

    public Administrador() {
    }


    public void checkId (boolean usuario, String user){
        @SuppressWarnings("unused")
        String cont;
        if (usuario == false){
            if (this.user.matches(user)){
                int menu;
                System.out.print("Não há USUÁRIO cadastrado para este\n"+
                                "administrador. Selecione: \n"+
                                "\n[1] Cadastrar usuário/senha"+
                                "\n[2] SAIR"+
                                "\n\n> ");
                menu = inn.nextInt(); inn.nextLine();
                if (menu == 1) {
                    System.out.println("\n-----------------------------------");
                    System.out.println("               USUÁRIO             ");
                    System.out.println("-----------------------------------");
                    boolean valida = true;
                    while (valida){
                        System.out.print("\nDigite o USUÁRIO, podendo conter LETRAS\n"+
                                    "e/ou NÚMEROS com até 25 caracteres:\n"+
                                    "> ");
                        this.user = inn.nextLine();
                        while (this.user.length() > 25){
                            System.out.println("\n\n### ERROR ###\n\n" + 
                                            "O USUÁRIO excedeu o LIMITE de caracteres!");
                            System.out.print(  "\nDigite NOVAMENTE o USUÁRIO, podendo conter\n" +
                                            "LETRAS e/ou NÚMEROS com até 25 caracteres:\n" +
                                            "> ");
                            this.user = inn.nextLine();
                        }
                        System.out.println("\n************************");
                        System.out.println(  " USUÁRIO: " + this.user);
                        System.out.println("************************\n");
                        System.out.print("Você confirma o usuário?\n"+
                        "\n[1] SIM \n"+
                        "[2] NÃO\n"+
                        "\n> ");
                        int op = inn.nextInt();inn.nextLine();
                        if (op == 1){
                            valida = false;
                        }
                    }
                
                    System.out.println("\nUsuário cadastrado com sucesso!");
                    valida = true;
                    System.out.println("\n\n-----------------------------------");
                    System.out.println("               SENHA               ");
                    System.out.println("-----------------------------------");

                    while (valida){
                        System.out.print("\nDigite uma SENHA de até 6 DÍGITOS,\n" +
                                        "podendo conter LETRAS e/ou NÚMEROS: \n"+
                                        "> ");
                        this.password = inn.nextLine();
                        while (this.password.length() > 6) {
                            System.out.println("\n\n### ERROR ###\n\n" + 
                                            "A SENHA excedeu o LIMITE de caracteres!");
                            System.out.print(  "\nDigite NOVAMENTE a SENHA de até 6\n" +
                                            "caracteres, podendo conter LETRAS/NÚMEROS:\n"+
                                            "> ");
                            this.password = inn.nextLine();
                        }
                        System.out.println("\n************************");
                        System.out.println(  " SENHA: " + this.password);
                        System.out.println("************************\n");
                        System.out.print("Você confirma a senha?\n"+
                        "\n[1] SIM \n"+
                        "[2] NÃO\n"+
                        "\n> ");
                        int op = inn.nextInt();inn.nextLine();
                        if (op == 1){
                            valida = false;
                        }
                    }
                    System.out.println("\nSenha cadastrada com sucesso!");
                    usuarioClass = true;
                } else if (menu == 2) {
                    System.out.println("Encerrando...");
                    System.out.print("\nPressione qualquer tecla para continuar >>>                                                    ");
                    cont = inn.nextLine();
                } else {
                    System.out.println("### ERROR ###\n" +
                                       "OPÇÃO INVÁLIDA!");
                    System.out.println("\nEncerrando...");
                    System.out.print("\nPressione qualquer tecla para continuar >>>                                                    ");
                    cont = inn.nextLine();
                }
                System.out.println("\n-----------------------------------");
            } else if ( this.user.matches(user) == false ) {
                System.out.println("\n### ERROR ###\n" + 
                                "\nNÃO EXISTE USUÁRIO CADASTRADO\nPARA ESTE ADMINISTRADOR!");
            } else {
                System.out.println("\n### ERROR ###\n" + 
                                "\nEXISTE USUÁRIO CADASTRADO\nPARA ESTE ADMINISTRADOR!");
            }
            
        } else {

            if (this.user.matches(user)){

                
                System.out.println("\n************************");
                System.out.print(  " SENHA: ");
                String senha = inn.nextLine();
                System.out.println("\n************************\n");
                
                int tentativa = 3;

                if (this.password.matches(senha)){
                    System.out.println("\nUsuário VALIDADO com sucesso!");
                    adm.userAdm();
                } else {

                    while (tentativa > 0){

                        if (password.matches(senha)){
                            System.out.println("Usuário VALIDADO com sucesso!");
                            adm.userAdm();
                            break;
                        } else {
                            System.out.println("\n\n### ERROR ###\n\n" + 
                                                "SENHA INVÁLIDA!");
                            System.out.print("Digite NOVAMENTE a SENHA:\n" +
                                            "Tentativa = " + tentativa +
                                            "\n> ");
                            senha = inn.nextLine();
                            tentativa -= 1;
                        }
                    }
                    System.out.println("\n\n### ERROR ###\n\n" + 
                                    "Você excedeu o limite de tentativas!");
                                    // RETORNA PARA O MENU
                    System.out.println("\n-----------------------------------");
                }
            } else {
                if (this.user == "admin"){
                    System.out.println("\n\n### ERROR ###\n\n" + 
                                    "NÃO HÁ USUÁRIO CADASTRADO!");
                    System.out.println("\nEncerrando...");
                    System.out.print("\nPressione qualquer tecla para continuar >>>                                                    ");
                    cont = inn.nextLine();
                                    // RETORNA PARA O MENU
                    System.out.println("\n-----------------------------------");
                } else {
                    System.out.println("\n### ERROR ###\n" + 
                                "USUÁRIO INVÁLIDO!");
                    System.out.println("Digite novamente o usuário:");
                    System.out.print("> ");
                    String valida_usuario = inn.nextLine();
                    int tentativa;
                    if (this.user.matches(valida_usuario)){
                        System.out.println("\n************************");
                        System.out.println(  " USUÁRIO: " + this.user);
                        System.out.println("************************\n");
                        System.out.print("\nSENHA: ");
                            String senha = inn.nextLine();
                            tentativa = 3;

                            if (this.password.matches(senha)){
                                System.out.println("Usuário VALIDADO com sucesso!");
                                adm.userAdm();
                            } else {
                
                                while (tentativa > 0){
                
                                    if (password.matches(senha)){
                                        System.out.println("Usuário VALIDADO com sucesso!");
                                        break;
                                    } else {
                                        System.out.println("\n### ERROR ###\n" + 
                                                            "SENHA INVÁLIDA!");
                                        System.out.print("Digite NOVAMENTE a SENHA:\n" +
                                                        "Tentativa = " + tentativa +
                                                        "\n> ");
                                        senha = inn.nextLine();
                                        tentativa -= 1;
                                    } 
                                }
                            }
                    } else {
                        tentativa = 3;
                        while (tentativa > 0){

                            if (this.user.matches(valida_usuario)){
                                System.out.println("\n************************");
                                System.out.println(  " USUÁRIO: " + this.user);
                                System.out.println("************************\n");
                                System.out.print("\nSENHA: ");
                                    String senha = inn.nextLine();
                                    tentativa = 3;

                                    if (this.password.matches(senha)){
                                        System.out.println("Usuário VALIDADO com sucesso!");
                                        adm.userAdm();
                                    } else {
                        
                                        while (tentativa > 0){
                        
                                            if (password.matches(senha)){
                                                System.out.println("Usuário VALIDADO com sucesso!");
                                                adm.userAdm();
                                                break;
                                            } else {
                                                System.out.println("\n### ERROR ###\n" + 
                                                                    "SENHA INVÁLIDA!");
                                                System.out.print("Digite NOVAMENTE a SENHA:\n" +
                                                                "Tentativa = " + tentativa +
                                                                "\n> ");
                                                senha = inn.nextLine();
                                                tentativa -= 1;
                                            } 
                                        }
                                    }       
                                break;
                                
                            } else {
                                System.out.println("\n### ERROR ###\n" + 
                                                "USUÁRIO INVÁLIDO!");
                                System.out.print("Digite novamente o usuário:\n" +
                                                "Tentativa = " + tentativa +
                                                "\n> ");
                                valida_usuario = inn.nextLine();
                                tentativa -= 1;
                            }
                        }
                    }
                    System.out.println("\n\n### ERROR ###\n\n" + 
                                    "Você excedeu o limite de tentativas!");
                                    // RETORNA PARA O MENU INICIAL
                    System.out.println("\n-----------------------------------");
                }
            }
        }
    }
}
