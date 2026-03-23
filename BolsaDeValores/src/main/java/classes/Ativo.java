
package classes;

import java.util.Scanner;

public class Ativo {
    private String nome_empresa;
    private double preco_acao;
    private double quant_acoes;
    private double variacao_diaria;
    
    public void Ativo(){
        this.nome_empresa = "";
        this.preco_acao = 0.0;
        this.quant_acoes = 0.0;
        this.variacao_diaria = 0.0;
    }
    
    public void Ativo(String nome_empresa, double preco_acao, double quant_acoes, double variacao_diaria){
        this.nome_empresa = nome_empresa;
        this.preco_acao = preco_acao;
        this.quant_acoes = preco_acao;
        this.variacao_diaria = variacao_diaria;
    }
    
    public void copia(Ativo outro){
        this.nome_empresa = outro.getNomeEmpresa();
        this.preco_acao = outro.getPrecoAcao();
        this.quant_acoes = outro.getQuantAcoes();
        this.variacao_diaria = outro.getVariacaoDiaria();
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome da empresa: ");
        this.nome_empresa = ler.nextLine();
        System.out.println("Informe o preço da ação: ");
        this.preco_acao = ler.nextDouble();
        System.out.println("Informe a quantidade de ações: ");
        this.quant_acoes = ler.nextDouble();
        System.out.println("Informe a variação diária: ");
        this.variacao_diaria = ler.nextDouble();
    }
    
    @Override
    public String toString(){
        String texto = "_____Dados do Ativo_____";
        texto += "Nome da Empresa: " + this.nome_empresa;
        texto += "Preço da Ação: " + this.preco_acao;
        texto += "Quantidade de Ações: " + this.quant_acoes;
        texto += "Variação diária da ação: " + this.variacao_diaria;
        texto += "_____________________________";
        return texto;
    }
    
    public double calcularPosicaoDoAtivo(){
        return this.preco_acao * this.quant_acoes;
    }
    
    public void exibirResumo(){
        System.out.print(this.nome_empresa + " | ");
        System.out.print("R$ " + this.preco_acao + " | ");
        System.out.print(this.quant_acoes + " ações | ");
        System.out.print(this.variacao_diaria + " de variação | ");
        System.out.println(calcularPosicaoDoAtivo() + "é o valor total investido neste ativo.");
    }
    
    //Getters e Setters
    public void setNomeEmpresa(String nome_empresa){
        this.nome_empresa = nome_empresa;
    }
    
    public String getNomeEmpresa(){
        return this.nome_empresa;
    }
    
    public void setPrecoAcao(double preco_acao){
        this.preco_acao = preco_acao;
    }
    
    public double getPrecoAcao(){
        return this.preco_acao;
    }
    
    public void setQuantAcoes(double quanto_acoes){
        this.quant_acoes = quanto_acoes;
    }
    
    public double getQuantAcoes(){
        return this.quant_acoes;
    }
    
    public void setVariacaoDiaria(double variacao_diaria){
        this.variacao_diaria = variacao_diaria;
    }
    
    public double getVariacaoDiaria(){
        return this.variacao_diaria;
    }
}
