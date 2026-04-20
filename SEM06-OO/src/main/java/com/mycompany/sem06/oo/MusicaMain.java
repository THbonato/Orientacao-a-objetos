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
        Artista artista1 = new Artista("Queen");
        Album album1 = new Album("A Night at the Opera", 1975);
        Album album2 = new Album("Jazz", 1978);

        artista1.adicionarAlbum(album1);
        artista1.adicionarAlbum(album2);

        Musica musica1 = new Musica("Bohemian Rhapsody", 5.55);
        Musica musica2 = new Musica("Princes of the Universe", 3.31);

        artista1.adicionarMusica("FKAY", musica1);
        artista1.adicionarMusica("FKAY", musica2);

        Gerenciador gerenciador = new Gerenciador();
        gerenciador.adicionarArtista(artista1);

        Artista artistaComMaisAlbuns = gerenciador.artistaComMaisAlbuns();
        System.out.println("Artista com mais álbuns: " + artistaComMaisAlbuns.getNome());

        Album albumComMaisMusicas = gerenciador.albumComMaisMusicas();
        System.out.println("Álbum com mais músicas: " + albumComMaisMusicas.getNome());

        System.out.println("------------------------------");
        System.out.println("Detalhes");
        System.out.println(artista1);
    }
}
