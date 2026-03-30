/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tbona
 */
public class GerenciadorReserva {
    
    private List<Reserva> reservas;
    
    public GerenciadorReserva(){
        this.reservas = new ArrayList<>();
    }
    
    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
        System.out.println("Reserva Feita!");
    }
    
    public void cancelarReserva(String nomeReserva){
        reservas.remove(nomeReserva);
        System.out.println("Reserva Removida!");
    }
    
    public void listarReserva(){
        for (Reserva reserva : reservas) {
            reserva.toString();
        }
    }
    
    public void buscarReserva(String nomeReserva){
        for (int i = 0; i < reservas.size(); i++) {
            Reserva r1 = reservas.get(i);
            if(nomeReserva.equals(r1.getNomeReserva())){
                System.out.println("Reserva Encontrada!");
                System.out.println(r1.toString());
            }
        }
    }
}
