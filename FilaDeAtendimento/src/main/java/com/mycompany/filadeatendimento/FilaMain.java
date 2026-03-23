
package com.mycompany.filadeatendimento;

import java.util.LinkedList;
import java.util.Queue;

public class FilaMain {

    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        
        System.out.println("Atendendo: " + fila.poll());
        System.out.println("Próximo: " + fila.peek());
        
        //Simula um processo de atendimento completo
        //- Ele verifica se a fila ainda tem elementos
        //- Enquanto tiver, ele remove o primeiro item (poll()) e imprime quem está sendo atendido
        //- A cada volta do while, um novo "cliente" sai da fila
        while (!fila.isEmpty()){
            String pessoa = fila.poll();
            System.out.println("Atendendo: " + pessoa);
        }
    }
}
