/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author EEOlinto Almada
 */
public class Animal {
    
    private String especie;
    private String raca;
    private int idade;
    private double peso;
    
    public void Animal(){
        this.especie = "";
        this.raca = "";
        this.idade = 0;
        this.peso = 0.0;
    }
    
    public void Animal(String especie, String raca, int idade, double peso){
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }
    
    public void copia(Animal outro){
        this.especie = outro.getEspecie();
        this.raca = outro.getRaca();
        this.idade = outro.getIdade();
        this.peso = outro.getPeso();
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a Espécie do Animal: ");
        this.especie = ler.next();
        System.out.println("Informe a Raça do Animal: ");
        this.raca = ler.next();
        System.out.println("Informe a Idade do Animal: ");
        this.idade = ler.nextInt();
        System.out.println("Informe o Peso do Animal: ");
        this.peso = ler.nextDouble();
    }
    
    @Override
    public String toString(){
        return "Animal: " + this.especie
                + " | Raça: " + this.raca
                + " | Idade: " + this.idade
                + " | Peso: " + this.peso;
    }
    
    public void fazerSom(){
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Veja qual som seu Animal faz: ");
        opcao = ler.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("O Cachorro faz: Au! Au1");
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.especie);
        hash = 89 * hash + Objects.hashCode(this.raca);
        hash = 89 * hash + this.idade;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.especie, other.especie)) {
            return false;
        }
        return Objects.equals(this.raca, other.raca);
    }
    
    
    
    public int calcularIdadeHumana(){
        return this.idade * 7;
    }
    
    //Getters e Setters
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public String getEspecie(){
        return this.especie;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public String getRaca(){
        return this.raca;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return this.peso;
    }
}
