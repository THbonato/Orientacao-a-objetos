
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    
    public void adicionarMusica(String nomeAlbum, Musica musica){
        for(Album album_i : listaAlbuns){
            if(album_i.getNome().equalsIgnoreCase(nomeAlbum)){
                album_i.adicionarMusica(musica);
                return;
            }
        }
        System.out.println("Álbum: " + nomeAlbum + " não encontrado.");
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + Objects.hashCode(this.listaAlbuns);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Artista other = (Artista) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.listaAlbuns, other.listaAlbuns);
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
