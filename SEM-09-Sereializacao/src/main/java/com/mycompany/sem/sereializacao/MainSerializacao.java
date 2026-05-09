/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sem.sereializacao;

import classes.Musica;
import gerenciadores.GerenciadorMusica;

/**
 *
 * @author tbona
 */
public class MainSerializacao {

    public static void main(String[] args) {
        testeSerializacaoCSVMusica();
    }
    
    public static void testeSerializacaoCSVMusica() {
        // Criando o gerenciador de músicas
        GerenciadorMusica gerenciadorMusica = new GerenciadorMusica();

        // Criando músicas
        Musica musica1 = new Musica("Menino da porteira", "Sergio Reis", 245, 1.15);
        Musica musica2 = new Musica("Amigo", "Milton Nascimento", 270, 0.99);

        // Adicionando músicas ao gerenciador
        gerenciadorMusica.adicionarMusica(musica1);
        gerenciadorMusica.adicionarMusica(musica2);

        // Salvando a lista de músicas no arquivo .csv através do gerenciador
        String caminhoDoArquivo = "musicas.csv";
        gerenciadorMusica.salvarNoArquivo(caminhoDoArquivo);

        // Carregando a lista de músicas do arquivo .csv através do gerenciador
        gerenciadorMusica.loadDoArquivo(caminhoDoArquivo);

        // Supondo que o método toString do GerenciadorMusica esteja implementado para mostrar as músicas
        System.out.println(gerenciadorMusica.toString());
    }
}
