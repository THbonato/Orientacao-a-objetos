
package classes;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nome;
    private List<Album> listaAlbuns;

    public Artista(String nome) {
        this.nome = nome;
        this.listaAlbuns = new ArrayList<>();
    }
    
    public Artista(){
        this.nome = "";
        this.listaAlbuns = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("_________________________");
        sb.append("Nome: ").append(this.nome).append("\n");
        sb.append("_________________________");
        for(Album album_i : this.listaAlbuns){
            sb.append(album_i.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    public void adicionarAlbum(Album album){
        this.listaAlbuns.add(album);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Album> getListaAlbuns() {
        return listaAlbuns;
    }

    public void setListaAlbuns(List<Album> listaAlbuns) {
        this.listaAlbuns = listaAlbuns;
    }
    
    
}
