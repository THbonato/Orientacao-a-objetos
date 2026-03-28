/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author EEOlinto Almada
 */
public class Reserva {
    
    private String nomeReserva;
    private int numPessoas;
    private String dataHora; 
    
    public void Reserva(){
        this.nomeReserva = "";
        this.numPessoas = 0;
        this.dataHora = "";
    }

    public Reserva(String nomeReserva, int numPessoas, String dataHora) {
        this.nomeReserva = nomeReserva;
        this.numPessoas = numPessoas;
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Reserva{" + "Nome da Reserva: " + nomeReserva 
                + " | Número de Pessoas: " + numPessoas 
                + " | Data e Hora: " + dataHora + '}';
    }

    public void fill(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o nome que estará na reserva: ");
        this.nomeReserva = ler.nextLine();
        System.out.print("Informe o Número de Pessoas: ");
        this.numPessoas = ler.nextInt();
        System.out.print("Informe a Data e Hora (dd/MM/yyyy - HH:mm)");
        this.dataHora = ler.nextLine();
    }
    
    //Getters e Setters
    public String getNomeReserva() {
        return nomeReserva;
    }

    public void setNomeReserva(String nomeReserva) {
        this.nomeReserva = nomeReserva;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}


