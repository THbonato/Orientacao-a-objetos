package com.mycompany.filme;

import classes.Filme;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFilme {
    
    public static int imprimirMenu(){
        Scanner ler = new Scanner(System.in);
        System.out.println("_____Escolha sua opção_____");
        System.out.println("Press 1: Adicionar Filme");
        System.out.println("Press 2: Remover Filme");
        System.out.println("Press 3: Pesquisar Filme pelo Titulo");
        System.out.println("Press 4: Pesquisar Filme pelo Diretor");
        System.out.println("Press 0: Sair");
        System.out.println("___________________________");
        
        return ler.nextInt();
    }

    public static void main(String[] args) {
        List<Filme> listaFilme;
        listaFilme = new ArrayList<Filme>();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        
        do {            
            opcao = imprimirMenu();
            if (opcao == 1){
                Filme f1 = new Filme();
                f1.preencher();
                listaFilme.add(f1);
            }else if(opcao == 2){
                System.out.println("Informe o Titulo do Filme: ");
                String title = ler.nextLine();
                
                for(int i = 0; i <= listaFilme.size() - 1; i++){
                    Filme f1 = listaFilme.get(i);
                    if(title.equals(f1.getTitulo())){
                        System.out.println("Filme encontrado");
                        listaFilme.remove(f1);
                    }else{
                        System.out.println("Filme não encontrado");
                    }
                }
            }else if(opcao == 3){
                System.out.println("informe o Titulo do Filme: ");
                String title = ler.nextLine();
                
                for(int i = 0; i <= listaFilme.size() - 1; i++){
                    Filme f1 = listaFilme.get(i);
                    if(title.equals(f1.getTitulo())){
                        System.out.println("Filme encontrada");
                        f1.imprimir();
                    }
                    else{
                        System.out.println("Filme não encontrado");
                    }
                }
            }else if(opcao == 4){
                System.out.println("Informe o Diretor do Filme: ");
                String diretor = ler.nextLine();
                
                for(int i = 0; i <= listaFilme.size() - 1; i++){
                    Filme f1 = listaFilme.get(i);
                    if(diretor.equals(f1.getDiretor())){
                        System.out.println("Diretor encontrado");
                        f1.imprimir();
                    }else{
                        System.out.println("Diretor não encontrado");
                    }
                }
            }
        } while (opcao != 0);
    }
}
