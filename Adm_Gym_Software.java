package Programas.Adm_Gym;
import java.util.Scanner;

import Programas.Adm_Gym.Adm.Administrador;
import Programas.Adm_Gym.Cadastro.Cadastra_Classes.Cadastra_Classes;
import Programas.Adm_Gym.Cadastro.Cadastro_Geral.Cadastro_Geral;
import Programas.Adm_Gym.Clinico.Clinico;
import Programas.Adm_Gym.Clinico.Alergias.Alergias;
import Programas.Adm_Gym.Clinico.Doenças.Doenças;
import Programas.Adm_Gym.Comercial.Comercial;
import Programas.Adm_Gym.Financeiro.Financeiro;
import Programas.Adm_Gym.Pacote.Pacote;
import Programas.Adm_Gym.Pessoal.Pessoal;
import Programas.Adm_Gym.Registro.Registro;

public class Adm_Gym_Software {

      
    public static void main(String[] args) {
        Scanner inn = new Scanner (System.in);
        Administrador adm = new Administrador();
        Cadastro_Geral cad_geral = new Cadastro_Geral();
        int pacote=0;
        int menu;
        boolean cadastro = true;
        boolean programa = true;                           
        System.out.println("\n\n");
        System.out.println("======================================================");
        System.out.println("                Adm_GYM Software v 1.0                ");
        System.out.println("======================================================\n");
        menu = 0;
        while (programa){
            System.out.println("\n******************************************************");
            System.out.println("|                        MENU                        |");
            System.out.println("******************************************************");
            System.out.println("|                                                    |");
            System.out.println("| [ 1 ] CADASTRAR ALUNO                              |");
            System.out.println("|                                                    |");
            System.out.println("| [ 2 ] BUSCAR CADASTRO                              |");
            System.out.println("|                                                    |");
            System.out.println("| [ 3 ] ADMINISTRAÇÃO                                |");
            System.out.println("|                                                    |");
            System.out.println("| [ 4 ] ENCERRAR PROGRAMA                            |");
            System.out.println("|                                                    |");
            System.out.println("******************************************************\n\n");
            System.out.print("Digite uma OPÇÃO para prosseguir >>> ");
            menu = inn.nextInt(); inn.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n******************************************************");
                    System.out.println("|                   CADASTRO GERAL                   |");
                    System.out.println("******************************************************\n");
                    
                    while (cadastro) {
            
                        // ADMINISTRAÇÃO
                        Cadastra_Classes cad_Individual = new Cadastra_Classes();
                        
            
                        // CLASSE REGISTRO
                        Registro registro = new Registro();
                        registro.addRegistro();
                        registro.addStatus(1);
                        cad_Individual.addRegistro(registro);
            
                        // CLASSE PESSOAL
                        Pessoal cad_Pessoal = new Pessoal();
            
                        System.out.println("\n\n******************************************************");
                        System.out.println("                       PESSOAL                           ");
                        System.out.println("******************************************************\n\n");
                        System.out.print("\nNome: ");
                        String nome = inn.nextLine();
                        System.out.print("\nCPF: ");
                        String cpf = inn.nextLine();
                        System.out.print("\nDDD: ");
                        String ddd = inn.nextLine();
                        System.out.print("\nTelefone: ");
                        String telefone = inn.nextLine();
                        System.out.print("\nE-mail: ");
                        String email = inn.nextLine();
                        System.out.print("\n>> Endereço <<\n");
                        System.out.print("\nLogradouro: ");
                        String endereco_rua = inn.nextLine();
                        System.out.print("\nNúmero: ");
                        String endereco_numero = inn.nextLine();
                        System.out.print("\nComplemento: ");
                        String endereco_complemento = inn.nextLine();
                        System.out.print("\nBairro: ");
                        String endereco_bairro = inn.nextLine();
                        System.out.print("\nCidade: ");
                        String endereco_cidade = inn.nextLine();
                        System.out.print("\nCEP: ");
                        String endereco_cep = inn.nextLine();
                        cad_Pessoal.addPessoal(nome, cpf, ddd, telefone, 
                        email, endereco_rua, endereco_numero, endereco_complemento, 
                        endereco_bairro, endereco_cep, endereco_cidade);
                        
                        // CADASTRA_CLASSES : Pessoal
                        cad_Individual.addPessoal(cad_Pessoal);
            
            
                        System.out.println("\n\n******************************************************");
                        System.out.println("                       COMERCIAL                           ");
                        System.out.println("******************************************************\n\n");
            
                        // CLASSE COMERCIAL
                        
                        menu = 0;
                        System.out.print("Selecione uma opção:\n "+
                        "\n[1] CADASTRO EMPRESA\n" +
                        "[2] CADASTRO ESTUDANTE/AUTÔNOMO\n"+
                        "\n> ");
                        menu = inn.nextInt(); inn.nextLine();
            
                        if (menu == 2){
                            
                            String empresa = null;
                            System.out.print("\nProfissão/Status: ");
                            String profissao_cargo = inn.nextLine();
                            String ddd_comm = null;
                            String telefone_comm = null;
                            String ramal_comm = null;
                            String end_com_rua = null;
                            String end_com_numero = null;
                            String end_com_complemento = null;
                            String end_com_bairro = null;
                            String end_com_cidade = null;
                            String recado = null;
                            String ddd_recado = null;
                            String telefone_recado = null;
                            String ramal_recado = null;
                                
                            Comercial cad_Comercial = new Comercial();
            
                            cad_Comercial.addComercial(
                                empresa, profissao_cargo, ddd_comm, 
                                telefone_comm, ramal_comm, end_com_rua,
                                end_com_numero, end_com_complemento, end_com_bairro,
                                end_com_cidade, recado, ddd_recado, telefone_recado, 
                                ramal_recado);
            
                            // ADMINISTRAÇÃO : Comercial ( UNIVERSITARIO ) 
                            cad_Individual.addComercial(cad_Comercial);
                                
                        } else {
                            System.out.print("\nEmpresa: ");
                            String empresa = inn.nextLine();
                            if (empresa == ""){
                                empresa = null;
                            }
            
                            System.out.print("\nCargo: ");
                            String profissao_cargo = inn.nextLine();
            
                            System.out.print("\nDDD: ");
                            String ddd_comm = inn.nextLine();
                            if (ddd_comm == ""){
                                ddd_comm = null;
                            }
            
                            System.out.print("\nTelefone: ");
                            String telefone_comm = inn.nextLine();
                            if (telefone_comm == ""){
                                telefone_comm = null;
                            }
            
                            System.out.print("\nRamal: ");
                            String ramal_comm = inn.nextLine();
                            if (ramal_comm == ""){
                                ramal_comm = null;
                            }
            
                            System.out.print("\n>> Endereço << \n");
            
                            System.out.print("\nLogradouro: ");
                            String end_com_rua = inn.nextLine();
                            if (end_com_rua == ""){
                                end_com_rua = null;
                            }
                            System.out.print("\nNúmero: ");
                            String end_com_numero = inn.nextLine();
            
                            System.out.print("\nComplemento: ");
                            String end_com_complemento = inn.nextLine();
                            if (end_com_complemento == ""){
                                end_com_complemento = null;
                            }
            
                            System.out.print("\nBairro: ");
                            String end_com_bairro = inn.nextLine();
            
                            System.out.print("\nCidade: ");
                            String end_com_cidade = inn.nextLine();
            
                            menu = 0;
                            System.out.print("\nDeseja cadastrar informação para RECADO?\n"+
                            "[1] SIM\n"+
                            "[2] NÃO\n"+
                            "> ");
                            menu = inn.nextInt(); inn.nextLine();
            
                            if (menu == 1){
            
                                System.out.print("\nRecado/Contato: ");
                                String recado = inn.nextLine();
            
                                System.out.print("\nDDD: ");
                                String ddd_recado = inn.nextLine();
            
                                System.out.print("\nTelefone: ");
                                String telefone_recado = inn.nextLine();
            
                                System.out.print("\nRamal: ");
                                String ramal_recado = inn.nextLine();
                                if (ramal_recado == ""){
                                    ramal_recado = null;
                                }
            
                                Comercial cad_Comercial = new Comercial();
            
                                cad_Comercial.addComercial(
                                empresa, profissao_cargo, ddd_comm, 
                                telefone_comm, ramal_comm, end_com_rua,
                                end_com_numero, end_com_complemento, end_com_bairro,
                                end_com_cidade, recado, ddd_recado, telefone_recado, 
                                ramal_recado);
            
                                // ADMINISTRAÇÃO : Comercial ( COM RECADO ) 
                                cad_Individual.addComercial(cad_Comercial);
            
                            } else {
            
                                String recado = null;
                                String ddd_recado = null;
                                String telefone_recado = null;
                                String ramal_recado = null;
            
                                Comercial cad_Comercial = new Comercial();
            
                                cad_Comercial.addComercial(
                                empresa, profissao_cargo, ddd_comm, 
                                telefone_comm, ramal_comm, end_com_rua,
                                end_com_numero, end_com_complemento, end_com_bairro,
                                end_com_cidade, recado, ddd_recado, telefone_recado, 
                                ramal_recado);
            
                                // ADMINISTRAÇÃO : Comercial ( SEM RECADO ) 
                                cad_Individual.addComercial(cad_Comercial);
                            }
                        }
            
                        System.out.println("\n\n******************************************************");
                        System.out.println("                        CLINICO                           ");
                        System.out.println("******************************************************\n\n");
                        menu = 0;
                        Clinico cad_Clinico = new Clinico();
                        boolean clinico = true;
            
                        while (clinico){
                            System.out.print("\nSELECIONE: \n" +
                            "\n[1] CADASTRAR DOENÇA\n" +
                            "[2] CADASTRAR ALERGIA\n" +
                            "[3] CADASTRAR CONTATO PARA URGÊNCIAS\n" +
                            "[4] NÃO CADASTRAR DADOS CLÍNICOS\n" +
                            "[5] SAIR DO MENU\n" +
                            "\n> ");
                            menu = inn.nextInt(); inn.nextLine();
            
                            switch (menu){
            
                                case 1:
                                    System.out.println("\n-----------------------------------");
                                    System.out.println("                DOENÇA             ");
                                    System.out.println("-----------------------------------");
                                    System.out.print("\nDoença: ");
                                    String doenca = inn.nextLine();
                                    System.out.print("\nMedicação: ");
                                    String medicacao = inn.nextLine();
                                    System.out.print("\nDosagem: ");
                                    String dosagem = inn.nextLine();
                                    System.out.print("\nPosologia: ");
                                    String posologia = inn.nextLine();
                                    Doenças doc = new Doenças(doenca, medicacao, dosagem, posologia);
                                    cad_Clinico.addDoenca(doc);
                                    System.out.println("\n-----------------------------------\n");
                                    break;
                                
                                case 2:
                                    System.out.println("\n-----------------------------------");
                                    System.out.println("               ALERGIA             ");
                                    System.out.println("-----------------------------------");
                                    System.out.print("\nAlergia: ");
                                    String alergia = inn.nextLine();
                                    System.out.print("\nMedicação: ");
                                    String mediccacao = inn.nextLine();
                                    System.out.print("\nObservação: ");
                                    String observacao = inn.nextLine();
                                    Alergias ale = new Alergias(alergia, mediccacao, observacao);
                                    cad_Clinico.addAlergia(ale);
                                    System.out.println("\n-----------------------------------\n");
                                    break;
                                
                                case 3:
                                    System.out.println("\n-----------------------------------");
                                    System.out.println("              URGÊNCIAS            ");
                                    System.out.println("-----------------------------------");
                                    System.out.print("\nNome: ");
                                    String sos_nome = inn.nextLine();
                                    System.out.print("\nDDD: ");
                                    String sos_ddd = inn.nextLine();
                                    System.out.print("\nTelefone: ");
                                    String sos_telefone = inn.nextLine();
                                    cad_Clinico.addSocorro(sos_nome, sos_ddd, sos_telefone);
                                    System.out.println("\n-----------------------------------\n");
                                    break;
                                
                                case 4:
                                    Doenças docc = new Doenças(null, null, null, null);
                                    cad_Clinico.addDoenca(docc);
                                    Alergias alle = new Alergias(null, null, null);
                                    cad_Clinico.addAlergia(alle);
                                    cad_Clinico.addSocorro(null, null, null);
                                    clinico = false;
                                    break;
                                
                                case 5:
                                    clinico = false;
                                    break;
                            }
                        }
                        
                        System.out.println("\n\n******************************************************");
                        System.out.println("                       FINANCEIRO                         ");
                        System.out.println("******************************************************\n\n");
                        menu = 0;
                        boolean escolhe_pacote = true;
                        Pacote cad_Plano_e_Pacote = new Pacote();
                        System.out.println("**************");
                        System.out.println("    PACOTE    ");
                        System.out.println("**************");
                        while (escolhe_pacote){
                            System.out.println("\nPLANOS/PACOTES DISPONÍVES:\n");
                            cad_Plano_e_Pacote.showPlanos_e_Pacotes();
                            System.out.print("\n> ");
                            pacote = inn.nextInt(); inn.nextLine();
                            cad_Plano_e_Pacote.addPacote(pacote);
                            System.out.println("Pacote escolhido = " + cad_Plano_e_Pacote.getPlano_e_pacote());
                            System.out.println("Descritivo = " + cad_Plano_e_Pacote.getDescritivo());
                            System.out.println("\n[1] SIM | [2] NÃO");
                            System.out.print("> ");
                            menu = inn.nextInt(); inn.nextLine();
                            if (menu == 1){
                                escolhe_pacote = false;
                                // CADASTRA_CLASSES : Pacote
                                cad_Individual.addPacote(cad_Plano_e_Pacote);
                            } 
                        }
            
                        Financeiro cad_Financeiro = new Financeiro();
                        cad_Financeiro.geraMensalidade(pacote);
                        cad_Financeiro.geraBoleto();
            
                        System.out.println("\n***********************************");
                        System.out.println("  Cadastro EFETIVADO com SUCESSO!  ");
                        System.out.println("***********************************\n");
            
                        
            
                        // CADASTRA_CLASSES : Comercial
                        // dentro do código ( IF : RECADO)
            
                        // CADASTRA_CLASSES : Clinico
                        cad_Individual.addClinico(cad_Clinico);
                        
                        // CADASTRA_CLASSES : Pacote
                        // dentro do código ( WHILE : escolhe_pacote)
            
                        // CADASTRA_CLASSES : Financeiro
                        cad_Individual.addFinanceiro(cad_Financeiro);
            
                        // CADASTRADO_GERAL
                        cad_geral.addCadastro(cad_Individual);
            
                        menu = 0;
                        System.out.print("Deseja CADASTRAR NOVO aluno?\n"+
                        "[1] SIM\n"+
                        "[2] NÃO\n"+
                        "> " );
                        menu = inn.nextInt(); inn.nextLine();
                        if (menu == 2){
                            cadastro = false;
                        }
                    }
                    break;
            
                case 2:
                    // BUSCAR CADASTRO
                    break;

                case 3:
                
                    String user;
                    System.out.println("\n-----------------------------------");
                    System.out.println("           ADMINISTRADOR           ");
                    System.out.println("-----------------------------------\n");
                    System.out.print("\nDigite o USUÁRIO, ou, PRESSIONE [ ENTER ]\npara primeiro acesso\n");
                    System.out.println("\n************************");
                    System.out.print(  " USUÁRIO: ");
                    user = inn.nextLine();
                    System.out.println("************************\n");
                    
                    if (user == "" || user.isEmpty()){
                        boolean usuario = false;
                        adm.checkId(usuario, user);
                    } else {
                        boolean usuario = true;
                        adm.checkId(usuario, user);
                    }
                    
                    break;
                
                case 4:
                    programa = false;
                    break;
            }
        }
        
        cad_geral.showCadastros();
        
        inn.close();
    }
}
