package Programas.Adm_Gym.Financeiro.Mensalidade;

import java.util.Scanner;

import Programas.Adm_Gym.Enum.Pacote_Enum;

public class Mensalidade {

    private int frequencia;

    private double mensalidade;
    
    private double valorDia_1 = 2.96; // GINASTICA = 88,60
 
    private double valorDia_2 = 3.30; // CARDIO = 98,99

    private double valorDia_3 = 3.67; // IRON = 109,90
 
    private double valorDia_4 = 4.33; // MASTER = 129,90

    private double valorDia_5 = 5.33; // TOTAL = 159,90

    Scanner inn = new Scanner (System.in);
    
    

    public Mensalidade() {
        
    }

    

    public double addMensalidade(int frequencia, int pacote) {
        this.frequencia = frequencia;
        double val = 0.0;
        double mes = this.frequencia * 4.3;
        if(pacote == 1){
            val = mes * valorDia_1;
        } else if (pacote == 2){
            val = mes * valorDia_2;
        } else if (pacote == 3){
            val = mes * valorDia_3;
        } else if (pacote == 4){
            val = mes * valorDia_4;
        } else if (pacote == 5){
            val = mes * valorDia_5;
        }
        this.mensalidade = val;
        return mensalidade;
    }

   
    public void alteraValorDia (){
        int op;
        double valor;
        System.out.println("\n-----------------------------------");
        System.out.println("       PACOTES: VALOR DO DIA      ");
        System.out.println("-----------------------------------\n");
        System.out.print("Selecione a opção desejada: \n"+
        "\n[1] " + Pacote_Enum.GINASTICA + " = " + getValorDia_1() +
        "\n[2] " + Pacote_Enum.CARDIO + " = " + getValorDia_2() +
        "\n[3] " + Pacote_Enum.IRON + " = " + getValorDia_3() +
        "\n[4] " + Pacote_Enum.MASTER + " = " + getValorDia_4() +
        "\n[5] " + Pacote_Enum.TOTAL + " = " + getValorDia_5() +
        "\n\n> ");
        op = inn.nextInt(); inn.nextLine();

        if (op == 1){
            System.out.print("\n[1] " + Pacote_Enum.GINASTICA +
                             "\nVALOR ATUAL: R$ " + getValorDia_1() + 
                             "\nMENSALIDADE: R$" + (getValorDia_1()*30) +
                             "\n\nNovo valor (R$):" +
                             "\n> ");
            valor = inn.nextDouble(); inn.nextLine();
            this.valorDia_1 = valor;
            System.out.println("\nNOVA MENSALIDADE = R$ " + (getValorDia_1()*30));
        } else if (op == 2){
            System.out.print("\n[2] " + Pacote_Enum.CARDIO +
            "\nVALOR ATUAL: R$ " + getValorDia_2() +
            "\nMENSALIDADE: R$" + (getValorDia_2()*30) + 
            "\n\nNovo valor (R$):" +
            "\n> ");
            valor = inn.nextDouble(); inn.nextLine();
            this.valorDia_2 = valor;
            System.out.println("\nNOVA MENSALIDADE = R$ " + (getValorDia_2()*30));
        } else if (op == 3){
            System.out.print("\n[3] " + Pacote_Enum.IRON +
            "\nVALOR ATUAL: R$ " + getValorDia_3() + 
            "\nMENSALIDADE: R$" + (getValorDia_3()*30) +
            "\n\nNovo valor (R$):" +
            "\n> ");
            valor = inn.nextDouble(); inn.nextLine();
            this.valorDia_3 = valor;
            System.out.println("\nNOVA MENSALIDADE = R$ " + (getValorDia_3()*30));
        } else if (op == 4){
            System.out.print("\n[4] " + Pacote_Enum.MASTER +
            "\nVALOR ATUAL: R$ " + getValorDia_4() + 
            "\nMENSALIDADE: R$" + (getValorDia_4()*30) +
            "\n\nNovo valor (R$):" +
            "\n> ");
            valor = inn.nextDouble(); inn.nextLine();
            this.valorDia_4 = valor;
            System.out.println("\nNOVA MENSALIDADE = R$ " + (getValorDia_4()*30));
        } else if (op == 5){
            System.out.print("\n[5] " + Pacote_Enum.TOTAL +
            "\nVALOR ATUAL: R$ " + getValorDia_5() + 
            "\nMENSALIDADE: R$" + (getValorDia_5()*30) +
            "\n\nNovo valor (R$):" +
            "\n> ");
            valor = inn.nextDouble(); inn.nextLine();
            this.valorDia_5 = valor;
            System.out.println("\nNOVA MENSALIDADE = R$ " + (getValorDia_5()*30));
        } 
        System.out.println("Dados alterados com sucesso!");
    }



    public double getMensalidade() {
        return mensalidade;
    }

    public double getValorDia_1() {
        return valorDia_1;
    }

    public double getValorDia_2() {
        return valorDia_2;
    }

    public double getValorDia_3() {
        return valorDia_3;
    }

    public double getValorDia_4() {
        return valorDia_4;
    }

    public double getValorDia_5() {
        return valorDia_5;
    }


    
}
