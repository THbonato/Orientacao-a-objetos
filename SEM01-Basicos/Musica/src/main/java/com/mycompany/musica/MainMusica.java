package com.mycompany.musica;

import classes_musicas.Musica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainMusica {
    
    public static int imprimirMenu(){
        Scanner ler = new Scanner(System.in);
        System.out.println("_____Escolha sua opção_____");
        System.out.println("Press 1: Adicionar Música");
        System.out.println("Press 2: Remover Música");
        System.out.println("Press 3: Pesquisar Música pelo Titulo");
        System.out.println("Press 4: Pesquisar Música pelo Autor");
        System.out.println("Press 0: Sair");
        System.out.println("___________________________");
        
        return ler.nextInt();
    }

    public static void main(String[] args) {
       /* Musica a = new Musica();
        a.preencher();
        a.imprimir();
        
        Musica b = new Musica();
        b.copiar(a);
        */
        List<Musica> listaMusica;
        listaMusica = new ArrayList<Musica>();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        
        do {            
            opcao = imprimirMenu();
            if (opcao == 1){
                Musica m1 = new Musica();
                m1.preencher();
                listaMusica.add(m1);
            }else if(opcao == 2){
                System.out.println("Informe o Titulo da Musica: ");
                String title = ler.nextLine();
                
                for(int i = 0; i <= listaMusica.size() - 1; i++){
                    Musica m1 = listaMusica.get(i);
                    if(title.equals(m1.getTitulo())){
                        System.out.println("Música encontrada");
                        listaMusica.remove(m1);
                    }else{
                        System.out.println("Música não encontrada");
                    }
                }
            }else if(opcao == 3){
                System.out.println("informe o Titulo da Música: ");
                String title = ler.nextLine();
                
                for(int i = 0; i <= listaMusica.size() - 1; i++){
                    Musica m1 = listaMusica.get(i);
                    if(title.equals(m1.getTitulo())){
                        System.out.println("Música encontrada");
                        m1.imprimir();
                    }else{
                        System.out.println("Música não encontrada");
                    }
                }
            }else if(opcao == 4){
                System.out.println("Informe o Artista da Musica: ");
                String artista = ler.nextLine();
                
                for(int i = 0; i <= listaMusica.size() - 1; i++){
                    Musica m1 = listaMusica.get(i);
                    if(artista.equals(m1.getArtista())){
                        System.out.println("Artista encontrado");
                        m1.imprimir();
                    }else{
                        System.out.println("Artista não encontrado");
                    }
                }
            }
        } while (opcao != 0);
        
    }
}
