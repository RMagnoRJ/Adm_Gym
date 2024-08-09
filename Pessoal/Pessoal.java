package Programas.Adm_Gym.Pessoal;

import java.util.Scanner;

public class Pessoal {

    Scanner inn = new Scanner(System.in);
    
    
    String nome;

    String cpf;

    String ddd;

    String telefone;

    String email;

    String endereco_rua;

    String endereco_numero;

    String endereco_complemento;

    String endereco_bairro;

    String endereco_cidade;

    String endereco_cep;

    


    public Pessoal() {
    }

   


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco_rua() {
        return endereco_rua;
    }

    public String getEndereco_numero() {
        return endereco_numero;
    }

    public String getEndereco_complemento() {
        return endereco_complemento;
    }

    public String getEndereco_bairro() {
        return endereco_bairro;
    }

    public String getEndereco_cidade() {
        return endereco_cidade;
    }

    public String getEndereco_cep() {
        return endereco_cep;
    }

    public String getEmail() {
        return email;
    }
    


    
    public void addPessoal(
        String nome,
        String cpf, 
        String ddd, 
        String telefone, 
        String email, 
        String endereco_rua, 
        String endereco_numero, 
        String endereco_complemento, 
        String endereco_bairro, 
        String endereco_cep, 
        String endereco_cidade
    ) {
        this.nome = nome; 
        this.cpf = cpf; 
        this.ddd = ddd; 
        this.telefone = telefone; 
        this.email = email; 
        this.endereco_rua = endereco_rua; 
        this.endereco_numero = endereco_numero; 
        this.endereco_complemento = endereco_complemento; 
        this.endereco_bairro = endereco_bairro; 
        this.endereco_cep = endereco_cep; 
        this.endereco_cidade = endereco_cidade;
    }
    

    public void showPessoal(){
        System.out.println("\n-----------------------------------");
        System.out.println("              PESSOAL              ");
        System.out.println("-----------------------------------");
        System.out.println("\nNOME: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("TELEFONE: (" + this.ddd + ") " + this.telefone);
        System.out.println("E-MAIL: " + this.email);
        System.out.println("\n>> ENDEREÇO <<");
        System.out.println("\nLOGRADOURO: " + this.endereco_rua);
        System.out.println("NÚMERO: " + this.endereco_numero);
        System.out.println("COMPLEMENTO: " + this.endereco_complemento);
        System.out.println("BAIRRO: " + this.endereco_bairro);
        System.out.println("CEP: " + this.endereco_cep);
        System.out.println("CIDADE: " + this.endereco_cidade);
        System.out.println("\n-----------------------------------");
    }







}
