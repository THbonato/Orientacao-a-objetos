
package classes;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private List<Artista> ListaArtistas;
    
    public Gerenciador(){
        this.ListaArtistas = new ArrayList<>();
    }
    
    public void adicionarArtista(Artista artista){
        this.ListaArtistas.add(artista);
    }
    
    public Artista artistaComMaisAlbuns(){
        Artista maior = null;
        for(Artista artista_i : ListaArtistas){
            if(maior == null || artista_i.getListaAlbuns().size() > maior.getListaAlbuns().size()){
                maior = artista_i;
            }
        }
        return maior;
    }
    
    public Album albumComMaisMusicas(){
        Album maior = null;
        
        for(Artista artista_i : ListaArtistas){
            for(Album artista_j : artista_i.getListaAlbuns()){
                if(maior == null || artista_j.getListaMusicas().size() > maior.getListaMusicas().size()){
                    maior = artista_j;
                }
            }
        }
        return maior;
    }
}
