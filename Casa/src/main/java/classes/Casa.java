package classes;

import java.util.Scanner;

public class Casa {
    private String endereco;
    private double area;
    private int quartos;
    private double preco;
    
    public Casa(){
        this.endereco = "";
        this.area = 0.0;
        this.quartos = 0;
        this.preco = 0.0;
    }
    
    public Casa(String endereco, double area, int quartos, double preco){
        this.endereco = endereco;
        this.area = area;
        this.quartos = quartos;
        this.preco = preco;
    }
    
    public void copia(Casa outro){
        this.endereco = outro.getEdereco();
        this.area = outro.getArea();
        this.quartos = outro.getQuartos();
        this.preco = outro.getPreco();
    }
    
    @Override
    public String toString(){
        String texto = "_____Dados da Casa_____";
        texto += "Endereço" + this.endereco;
        texto += "Area: " + this.area;
        texto += "Quantidade de Quartos: " + this.quartos;
        texto += "Preço: " + this.preco;
        texto += "_____________________________";
        return texto;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o Endereço da Casa: ");
        this.endereco = ler.nextLine();
        System.out.println("Informe a Area da Casa: ");
        this.area = ler.nextDouble();
        System.out.println("Informe a Quantidade de Quartos: ");
        this.quartos = ler.nextInt();
        System.out.println("Informe o Preço da Casa: ");
        this.preco = ler.nextDouble();
    }
    
    public double calcularPrecoPorM2(){
        return this.preco / this.area;
    }
    
    public void exibirResumo(){
        System.out.print(this.endereco + " | ");
        System.out.print(this.area + "m² | ");
        System.out.print(this.quartos + " quartos | ");
        System.out.print("R$ " + this.preco + " | ");
        System.out.println("R$" + calcularPrecoPorM2() + "/m²");
    }
    
    //Getters e Setters
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEdereco(){
        return this.endereco;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public double getArea(){
        return this.area;
    }
    
    public void setQuartos(int quartos){
        this.quartos = quartos;
    }
    
    public int getQuartos(){
        return this.quartos;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
}
