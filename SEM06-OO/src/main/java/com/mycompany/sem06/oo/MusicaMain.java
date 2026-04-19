/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem06.oo;

import classes.Album;
import classes.Artista;
import classes.Gerenciador;
import classes.Musica;

/**
 *
 * @author EEOlinto Almada
 */
public class MusicaMain {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Artista 1");
        Album album1 = new Album("Álbum 1", 2020);
        Album album2 = new Album("Álbum 2", 2021);

        artista1.artistaComMaisAlbuns(album1);
        artista1.artistaComMaisAlbuns(album2);

        Musica musica1 = new Musica("Música 1", 3.30);
        Musica musica2 = new Musica("Música 2", 4.00);

        artista1.adicionarMusica(album1.getNome(), musica1);
        artista1.adicionarMusica(album1.getNome(), musica2); // Adicionando duas músicas ao Álbum 1

        // Supondo a existência de um gerenciador para facilitar as consultas
        Gerenciador gerenciador = new Gerenciador();
        gerenciador.adicionarArtista(artista1);

        Artista artistaComMaisAlbuns = gerenciador.artistaComMaisAlbuns();
        System.out.println("Artista com mais álbuns: " + artistaComMaisAlbuns.getNome());

        Album albumComMaisMusicas = gerenciador.álbumComMaisMusicas();
        System.out.println("Álbum com mais músicas: " + albumComMaisMusicas.getNome());
    }
}
