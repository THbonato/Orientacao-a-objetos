
package classes;

import java.util.Scanner;

public class Computador {
    
    private String processador;
    private double ram;
    private double hd;
    private boolean ssd;
    
    //Construtor
    public Computador(){
        this.processador = "";
        this.ram = 0;
        this.hd = 0;
        this.ssd = false;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);        
        System.out.print("Informe o processador: ");
        this.processador = ler.next();        
        System.out.print("Informe a memória ram: ");
        this.ram = ler.nextDouble();        
        System.out.print("Informe o tamanho de hd: ");
        this.hd = ler.nextDouble();        
        System.out.print("O hd é ss?: ");
        this.ssd = ler.nextBoolean();
    }
    
    public void imprimir(){
        System.out.println("------------Dados do Computador -------------");
        System.out.println("Processador: " + this.processador);
        System.out.println("Memória RAM: " + this.ram);
        System.out.println("Tamanho do HD: " + this.hd);
        System.out.println("É SSD? " + this.ssd);
        System.out.println("---------------------------------------------");
    }
    
    public void copiar(Computador outro){
    
        this.processador = outro.getProcessador();
        this.ram = outro.getRam();
        this.hd = outro.getHd();
        this.ssd = outro.isSsd();
    }
    
    //getters e setters
    public void setProcessador(String processador){
        this.processador = processador;
    }
    
    public String getProcessador(){
        return this.processador;
    }
    
    public void setRam(double ram){
        this.ram = ram;
    }
    
    public double getRam(){
        return this.ram;
    }
    
    public void setHd(double hd){
    this.processador = processador;
    }
    
    public double getHd(){
        return this.hd;
    }
    
    public void setSsd(boolean ssd){
    this.ssd = ssd;
    }
    
    public boolean isSsd(){
        return ssd;
    }
}
