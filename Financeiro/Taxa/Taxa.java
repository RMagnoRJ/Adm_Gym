package Programas.Adm_Gym.Financeiro.Taxa;

import java.util.Scanner;

public class Taxa {
    
    private double boleto;

    private String forma_1 = "PIX";

    private String forma_2 = "BOLETO BANCÁRIO";

    private String forma_3 = "CARTÃO DE CRÉDITO";

    private boolean desconto_1 = true;

    private boolean desconto_2 = false;

    private boolean desconto_3 = false;

    private String taxa_da_forma;

    private Double taxa_1 = 3.5; // PIX, desconto

    private Double taxa_2 = 1.8; // BOLETO, acréscimo

    private Double taxa_3 = 2.88; // CARTÃO DE CRÉDITO, acréscimo

    Scanner inn = new Scanner(System.in);


    public Taxa() {
        
    }


    public double addBoleto (double mensalidade) {
        int opcao_de_pagamento;
        System.out.println("\n-----------------------------------");
        System.out.println("         FORMA DE PAGAMENTO        ");
        System.out.println("-----------------------------------\n");
        System.out.print("Escolha a forma de pagamento: \n\n"+
        "[1] " + forma_1 + "\n" + 
        "[2] " + forma_2 + "\n" +
        "[3] " + forma_3 + "\n" +
        "\n> ");
        opcao_de_pagamento = inn.nextInt(); inn.nextLine();
        switch (opcao_de_pagamento) {
            case 1:
                if (desconto_1){
                    taxa_da_forma = "desconto";
                } else {
                    taxa_da_forma = "acréscimo";
                }
                System.out.println( forma_1 + " = " + taxa_da_forma + " de " + this.taxa_1 + " % na mensalidade\n");
                break;
            
            case 2:
                if (desconto_2){
                    taxa_da_forma = "desconto";
                } else {
                    taxa_da_forma = "acréscimo";
                }
                System.out.println( forma_2 + " = " + taxa_da_forma + " de " + this.taxa_2 + " % na mensalidade\n");
                break;

            case 3:
                if (desconto_3){
                    taxa_da_forma = "desconto";
                } else {
                    taxa_da_forma = "acréscimo";
                }
                System.out.println( forma_2 + " = " + taxa_da_forma + " de " + this.taxa_3 + " % na mensalidade\n");
                break;
        }

        System.out.println();
        Double total = 0.0;
        Double taxa = taxa_1;
        Double percem = taxa / 100;

        if (opcao_de_pagamento == 1){
            total = mensalidade - (mensalidade * percem);

        } else if (opcao_de_pagamento == 2){
            taxa = taxa_2;
            total = mensalidade + (mensalidade * percem);

        } else{
            taxa = taxa_3;
            total = mensalidade + (mensalidade * percem);
        }

        this.boleto = total;
        return this.boleto;
    }

 
    public void alteraForma (){
        int op;
        String forma;
        System.out.println("\n-----------------------------------");
        System.out.println("         FORMA DE PAGAMENTO        ");
        System.out.println("-----------------------------------\n");
        System.out.print("Selecione a opção desejada: \n"+
        "\n[1] " + getForma_1() +
        "\n[2] " + getForma_2() +
        "\n[3] " + getForma_3() +
        "\n\n> ");
        op = inn.nextInt(); inn.nextLine();
        if (op == 1){
            System.out.print("\n[1] = " + getForma_1() + 
                               "\nDigite a NOVA forma de pagamento: " +
                               "\n> ");
            forma = inn.nextLine();
            this.forma_1 = forma;
        } else if (op == 2){
            System.out.print("\n[2] = " + getForma_2() + 
                               "\nDigite a NOVA forma de pagamento: " +
                               "\n> ");
            forma = inn.nextLine();
            this.forma_2 = forma;
        } else if (op == 3){
            System.out.print("\n[3] = " + getForma_3() + 
                               "\nDigite a NOVA forma de pagamento: " +
                               "\n> ");
            forma = inn.nextLine();
            this.forma_3 = forma;
        }
        System.out.println("Dados alterados com sucesso!");
    }

    public void alteraTaxaDaForma () {
        int op;
        int taxa;
        System.out.println("\n-----------------------------------");
        System.out.println("     TAXA DA FORMA DE PAGAMENTO    ");
        System.out.println("-----------------------------------\n");
        System.out.print("Selecione a opção desejada: \n"+
        "\n[1] " + getForma_1() +
        "\n[2] " + getForma_2() +
        "\n[3] " + getForma_3() +
        "\n\n> ");
        op = inn.nextInt(); inn.nextLine();
        if (op == 1){
            System.out.print("\nFORMA: " + getForma_1() + 
                             "\n\nEscolha a taxa da forma de pagamento:" +
                             "\n[1] Desconto" +
                             "\n[2] Acréscimo" +
                             "\n> ");
            taxa = inn.nextInt();  inn.nextLine();
            if (taxa == 1){
                this.desconto_1 = true;
            } else {
                this.desconto_1 = false;
            }
        } else if (op == 2){
            System.out.print("\nFORMA: " + getForma_2() + 
                             "\n\nEscolha a taxa da forma de pagamento:" +
                             "\n[1] Desconto" +
                             "\n[2] Acréscimo" +
                             "\n> ");
            taxa = inn.nextInt();  inn.nextLine();
            if (taxa == 1){
                this.desconto_2 = true;
            } else {
                this.desconto_2 = false;
            }
        } else if (op == 3){
            System.out.print("\nFORMA: " + getForma_2() + 
                             "\n\nEscolha a taxa da forma de pagamento:" +
                             "\n[1] Desconto" +
                             "\n[2] Acréscimo" +
                             "\n> ");
            taxa = inn.nextInt();  inn.nextLine();
            if (taxa == 1){
                this.desconto_3 = true;
            } else {
                this.desconto_3 = false;
            }
        }
        System.out.println("Dados alterados com sucesso!");
    }


    public void alteraTaxa (){
        int op;
        Double taxa;
        System.out.println("\n-----------------------------------");
        System.out.println("          TAXA DE PAGAMENTO        ");
        System.out.println("-----------------------------------\n");
        System.out.print("Selecione a opção desejada: \n"+
        "\n[1] " + getForma_1() + " | TAXA = " + getTaxa_1() + 
        "\n[2] " + getForma_2() + " | TAXA = " + getTaxa_2() +
        "\n[3] " + getForma_3() + " | TAXA = " + getTaxa_3() +
        "\n\n> ");
        op = inn.nextInt(); inn.nextLine();
        if (op == 1){
            System.out.print("\n[1] = " + getForma_1() + 
                               "\nDigite a NOVA TAXA de pagamento: " +
                               "\n> ");
            taxa = inn.nextDouble(); inn.nextLine();
            this.taxa_1 = taxa;
        } else if (op == 2){
            System.out.print("\n[2] = " + getForma_2() + 
                               "\nDigite a NOVA TAXA de pagamento: " +
                               "\n> ");
            taxa = inn.nextDouble(); inn.nextLine();
            this.taxa_2 = taxa;
        } else if (op == 3){
            System.out.print("\n[3] = " + getForma_1() + 
                               "\nDigite a NOVA TAXA de pagamento: " +
                               "\n> ");
            taxa = inn.nextDouble(); inn.nextLine();
            this.taxa_3 = taxa;
        }
        op = 0;
        System.out.println("Dados alterados com sucesso!");
        System.out.print("\nDeseja alterar a taxa da forma de pagamento?\n"+
        "\n[1] SIM" +
        "\n[2] NÃO" +
        "\n\n> ");
        if (op == 1){
            alteraTaxaDaForma();
        }
    }


    public double getBoleto() {
        return boleto;
    }


    public String getForma_1() {
        return forma_1;
    }


    public String getForma_2() {
        return forma_2;
    }


    public String getForma_3() {
        return forma_3;
    }


    public boolean isDesconto_1() {
        return desconto_1;
    }


    public boolean isDesconto_2() {
        return desconto_2;
    }


    public boolean isDesconto_3() {
        return desconto_3;
    }


    public String getTaxa_da_forma() {
        return taxa_da_forma;
    }


    public Double getTaxa_1() {
        return taxa_1;
    }


    public Double getTaxa_2() {
        return taxa_2;
    }


    public Double getTaxa_3() {
        return taxa_3;
    }

    
}
