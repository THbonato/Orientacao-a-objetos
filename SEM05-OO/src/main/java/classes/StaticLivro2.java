/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author tbona
 */
public class StaticLivro2 {
    
    private String titulo;
    private String autor;
    private int paginas;
    public static String NomeDaBiblioteca;

    public StaticLivro2(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        NomeDaBiblioteca = "Havard";
    }
    
    public StaticLivro2(){
        this.titulo = "";
        this.autor = "";
        this.paginas = 0;
        NomeDaBiblioteca = "BukesOmDeTeibou";
    }

    @Override
    public String toString() {
        return "Livro: " + "Título: " + titulo 
                + " | Autor: " + autor 
                + " | Páginas: " + paginas 
                + " | Biblioteca: " + NomeDaBiblioteca;
    } 
}
